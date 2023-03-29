package edu.matc.test.util;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;
import java.sql.*;
import java.util.Properties;

/**
 * Class to run sql statements as part of set up or tear down in the unit tests.
 */
public class Database {

    private final Logger logger = LogManager.getLogger(this.getClass());

    // create an object of the class Database
    private static Database instance = new Database();
    private Properties properties;
    private Connection connection;

    // private constructor prevents instantiating this class anywhere else
    // also loads properties
    private Database() {
        loadProperties();
    }

    private void loadProperties() {
        properties = new Properties();
        try {
            properties.load (this.getClass().getResourceAsStream("/database.properties"));
        } catch (IOException ioe) {
            System.out.println("DB.loadProperties()... Cannot load the properties file");
            ioe.printStackTrace();
        } catch (Exception e) {
            System.out.println("DB.loadProperties()... " + e);
            e.printStackTrace();
        }
    }

    //    get the only DB object available
    public static Database getInstance() {
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public void connect() throws Exception {
        if (connection != null)
            return;
        try {
            Class.forName(properties.getProperty("driver"));
        } catch (ClassNotFoundException e) {
            throw new Exception("Database.connect()... ERROR: MySQL Driver not found");
        }

        String url = properties.getProperty("url");
        String user = properties.getProperty("username");
        String pass = properties.getProperty("password");
        connection = DriverManager.getConnection(url, user, pass);
    }

    public void disconnect() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Cannot close connection " + e);
            }
        }
        connection = null;
    }


    /**
     * Run the sql.
     * @param sqlFile the sql file to be read and executed line by line
     */
    public void runSQL(String sqlFile) {

        Statement stmt = null;
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classloader.getResourceAsStream(sqlFile);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {

            Class.forName(properties.getProperty("driver"));
            connect();
            stmt = connection.createStatement();

            while (true) {
                String sql = br.readLine();
                if (sql == null) {
                    break;
                }
                stmt.executeUpdate(sql);
            }
            disconnect();
        } catch (SQLException se) {
            logger.error(se);
        } catch (Exception e) {
            logger.error(e);
        }
    }
}