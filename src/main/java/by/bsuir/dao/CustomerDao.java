package by.bsuir.dao;

import by.bsuir.dao.exception.DAOException;
import by.bsuir.domain.Customer;

import javax.ejb.Local;

@Local
public interface CustomerDao {
    Customer selectById(int id) throws DAOException;
}
