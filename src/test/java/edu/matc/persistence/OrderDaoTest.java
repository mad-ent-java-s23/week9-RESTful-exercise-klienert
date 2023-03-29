package edu.matc.persistence;

import edu.matc.entity.Order;
import edu.matc.entity.User;
import edu.matc.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Order dao test.
 */
class OrderDaoTest {

    /**
     * The Dao.
     */
    OrderDao dao;

    /**
     * The Generic dao.
     */
    GenericDao genericDao;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        dao = new OrderDao();
        genericDao = new GenericDao(Order.class); // pass in the Order class as the type
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Verify Gets all orders success.
     */
    @Test
    void getAllOrdersSuccess() {
//        List<Order> orders = dao.getAll();
        List<Order> orders = genericDao.getAll();
        assertEquals(7, orders.size());
    }

    /**
     * Verify a order is returned correctly, based on id search
     */
    @Test
    void getByIdSuccess() {
        Order retrieveOrder = (Order)genericDao.getById(2); // need to recast when using GenericDao
        assertNotNull(retrieveOrder);
        assertEquals("Books", retrieveOrder.getDescription());
    }

    /**
     * Verify an order is returned correctly (id search)
     */
    @Test
    void getByIdVerifyUserSuccess() {
        Order retrievedOrder = (Order)genericDao.getById(2);
        assertNotNull(retrievedOrder);
        assertEquals("Books", retrievedOrder.getDescription());
        assertEquals("Fred", retrievedOrder.getUser().getFirstName());
    }

    /**
     * Verify a successful delete request.
     */
    @Test
    void deleteSuccess() {
        genericDao.deleteEntity(genericDao.getById(2));
        assertNull(genericDao.getById(2));
    }

    /**
     * Verify a successful update.
     */
    @Test
    void updateSuccess() {
        String newDescription = "Laptops";
        Order orderToUpdate = (Order)genericDao.getById(3);
        orderToUpdate.setDescription(newDescription);
        genericDao.saveOrUpdate(orderToUpdate);
        Order retrievedOrder = (Order)genericDao.getById(3);
        assertEquals(newDescription, retrievedOrder.getDescription());
    }

    /**
     * Verify a successful insertion.
     */
    @Test
    void insertSuccess() {
        UserDao userDao = new UserDao();
        User user = userDao.getById(1);
        String orderDescription = "SSD and New Cable";
        Order newOrder = new Order(orderDescription, user);
        user.addOrder(newOrder);
        int id = genericDao.insert(newOrder);
//        int id = dao.insert(newOrder);
        assertNotEquals(0, id);
//        Order insertedOrder = dao.getById(id);
        Order insertedOrder = (Order)genericDao.getById(id);
        assertNotNull(insertedOrder);
//        assertEquals(orderDescription, insertedOrder.getDescription());
        assertNotNull(insertedOrder.getUser());
        assertEquals("Joe", insertedOrder.getUser().getFirstName());
    }

    /**
     * Verify successful getByProperty (equal match).
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<Order> orders = genericDao.getByPropertyEqual("description", "Books");
        assertEquals(1, orders.size());
        assertEquals(2, orders.get(0).getId());
    }

    /**
     * Verify a successful getByProperty (like match).
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<Order> orders = genericDao.getByPropertyLike("description", "b");
        assertEquals(3, orders.size());
    }
}