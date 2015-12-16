package Servlets.draenor;

/**
 * Created by benjaminhowland on 12/13/15.
 */
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



@WebServlet(name = "AshlieServlet")
public class AshlieServlet extends HttpServlet {

    Session session = HibernateUtil.getSessionFactory().openSession();
    static Logger log = Logger.getLogger(ManagePets.class.getName());

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

            String hql = "select name FROM petInfo.PetsGeneral where ID=27";
            Query query = session.createQuery(hql);
            List results = query.list();
            log.info("ashlie servlet: " + results);

        request.setAttribute("petOne", results);

        String url = "/draenor/ashlei.jsp";

        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
