package by.bsuir.controller;

import by.bsuir.dao.CustomerDao;
import by.bsuir.dao.exception.DAOException;
import by.bsuir.dao.exception.NoSuchEntityException;
import by.bsuir.domain.Customer;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Search", urlPatterns = {"/Search"})
public class Controller extends HttpServlet {
    @EJB
    private CustomerDao customerDao;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            Customer customer = customerDao.selectById(id);
            request.setAttribute("customer", customer);
        } catch(NumberFormatException e){
            request.setAttribute("error", "Пожалуйста, проверьте введённые данные");
        } catch(NoSuchEntityException e){
            request.setAttribute("error", "По данному запросу ничего не найдено");
        } catch(DAOException e){
            request.setAttribute("error", "Fatal error");
        }

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
