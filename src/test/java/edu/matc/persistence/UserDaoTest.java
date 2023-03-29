package edu.matc.persistence;

import edu.matc.entity.Order;
import edu.matc.entity.User;
import edu.matc.test.util.Database;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type User dao test.
 */
class UserDaoTest {
    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * The Dao.
     */
    UserDao dao;
    /**
     * The Generic dao.
     */
    GenericDao genericDao;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        dao = new UserDao();
        genericDao = new GenericDao(User.class);
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Verify Gets all users success.
     */
    @Test
    void getAllUsersSuccess() {
//        List<User> users = dao.getAll();
        List<User> users = genericDao.getAll();
        logger.debug("    **** User [0]: " + users.get(0));
        assertEquals(6, users.size());
    }

    /**
     * Verify Gets all users by last name success.
     */
    @Test
    void getAllByLastNameSuccess() {
//        List<User> users = dao.getAllByLastName("c");
        List<User> users = genericDao.getByPropertyLike("lastName", "c");
        assertEquals(3, users.size());
    }

    /**
     * Verify a user is returned correctly, based on id search
     */
    @Test
    void getByIdSuccess() {
//        User retrieveUser = dao.getById(3);
        User retrieveUser = (User)genericDao.getById(3);
        assertNotNull(retrieveUser);
        assertEquals("Barney", retrieveUser.getFirstName());

    }

    /**
     * Verify an insert of new user success.
     */
    @Test
    void insertSuccess() {
//        User newUser = new User("Fred", "Flinstone", "fflintstone", LocalDate.parse("1168-01-01"));
        User newUser = new User("Fred", "Flinstone", "fflintstone", "1168-01-01");
//        int id = dao.insert(newUser);
        int id = genericDao.insert(newUser);
        assertNotEquals(0, id);
        User insertedUser = (User)genericDao.getById(id);
        assertEquals(newUser, insertedUser);
    }

    /**
     * Verify a successful update to a current user
     */
    @Test
    void updateSuccess() {
        String newLastName = "Davis";
        User userToUpdate = (User)genericDao.getById(3);
        userToUpdate.setLastName(newLastName);
        genericDao.saveOrUpdate(userToUpdate);
        User retrievedUser = dao.getById(3);
        assertEquals(userToUpdate, retrievedUser);
    }


    /**
     * Verify an insert using an order is a success.
     */
    @Test
    void insertWithOrderSuccess() {
        String orderName = "Order 1";
//        User newUser = new User("Fred", "Flinstone", "fflintstone", LocalDate.parse("1168-01-01"));
        User newUser = new User("Fred", "Flinstone", "fflintstone", "1168-01-01");
        Order order = new Order(orderName, newUser);
        newUser.addOrder(order);
        int id = genericDao.insert(newUser);
        assertNotEquals(0, id);
        User insertedUser = (User)genericDao.getById(id); // this is the id of Fred Flinstone
        assertEquals(newUser, insertedUser);
    }
}