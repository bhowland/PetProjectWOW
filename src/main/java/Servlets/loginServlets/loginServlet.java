package Servlets.loginServlets;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import hibernate.HibernateUtil;
import petInfo.ManagePets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by benjaminhowland on 12/15/15.
 */
@WebServlet(name = "loginServlet")
public class loginServlet extends HttpServlet {

    Session session = HibernateUtil.getSessionFactory().openSession();
    static Logger log = Logger.getLogger(ManagePets.class.getName());

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");



        String url = "/login/admin.jsp";

        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
