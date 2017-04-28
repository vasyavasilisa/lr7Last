package by.bsuir.dao.impl;

import by.bsuir.dao.CustomerDao;
import by.bsuir.dao.exception.DAOException;
import by.bsuir.dao.exception.NoSuchEntityException;
import by.bsuir.domain.Customer;
import by.bsuir.utils.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

@Stateless
public class MysqlCustomerDaoImpl implements CustomerDao {
    private final SessionFactory factory = new Configuration().configure().buildSessionFactory();

    @Override
    public Customer selectById(int id) throws DAOException {
       /* Session session = null;
        Customer entity = new Customer();
        try {
            session = HibernateSessionFactory.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            entity = (Customer)session.createQuery("select pl from Customer pl where pl.id=:id")
                    .setParameter("id",id)
                    .uniqueResult();
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }


        return entity;*/

        try(Session session = factory.openSession()){
            Customer customer = session.get(Customer.class, id);
            if(customer == null){
                throw new NoSuchEntityException();
            } else {
                return customer;
            }
        }
    }


    @PreDestroy
    private void destroy(){
        factory.close();
    }
}
