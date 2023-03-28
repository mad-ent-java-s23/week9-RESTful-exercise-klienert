package com.persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * generic DAO somewhat inspired by
 * https://rodrigouchoa.wordpress.com/2014/09/26/generic-dao-example/
 */

public class GenericDao<T> {
    private Class<T> type;
    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * Instantiates a new Generic dao.
     *
     * @param type the type
     */
    public GenericDao(Class<T> type) {
        this.type = type;
    }

    /**
     * Returns an open session from the SessionFactory
     * @return  session
     */
    private Session getSession() {
        return SessionFactoryProvider.getSessionFactory().openSession();
    }

    /**
     * Gets an entity by id.
     *
     * @param <T> the type parameter
     * @param id  the id
     * @return the by id
     */
    public <T>T getById(int id) {
        Session session = getSession(); // opens session (need to close)
        T entity = (T)session.get(type, id);
        session.close();
        return entity;
    }

    /**
     * Deletes an entity.
     *
     * @param entity the entity
     */
    public void deleteEntity(T entity) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entity);
        transaction.commit();
        session.close();
    }


    /**
     * Gets all entities.
     * @return  a list of all entities
     */
    public List<T> getAll() {
        Session session = getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery( type );
        Root<T> root = query.from( type );
        List<T> list = session.createQuery( query ).getResultList();
        logger.debug("The list of entities " + list);
        session.close();
        return list;
    }

    /**
     * Save or update the entity.
     * @param entity the entity
     */
    public void saveOrUpdate(T entity) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(entity);
        transaction.commit();
        session.close();
    }

    /**
     * Insert entity
     * @param entity the entity
     * @return the int (for the ID of DB of the new entity)
     */
    public int insert(T entity) {
        int id = 0;
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(entity);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Get order by property (exact match)
     * sample usage: getByPropertyEqual("lastname", "Curry")
     */
    public List<T> getByPropertyEqual(String propertyName, String value) {
        Session session = getSession();
        logger.debug("Searching for order with " + propertyName + " = " + value);
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery( type );
        Root<T> root = query.from( type );
        query.select(root).where(builder.equal(root.get(propertyName), value));
        List<T> list = session.createQuery( query ).getResultList();
        logger.debug("The list of entities " + list);
        session.close();
        return list;
    }

    /**
     * Get order by property (like)
     * sample usage: getByPropertyLike("lastname", "C")
     */
    public List<T> getByPropertyLike(String propertyName, String value) {
        Session session = getSession();
        logger.debug("Searching for order with {} = {}",  propertyName, value);
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery( type );
        Root<T> root = query.from( type );
        Expression<String> propertyPath = root.get(propertyName);
        query.where(builder.like(propertyPath, "%" + value + "%"));
        List<T> list = session.createQuery( query ).getResultList();
        logger.debug("The list of entities " + list);
        session.close();
        return list;
    }


}
