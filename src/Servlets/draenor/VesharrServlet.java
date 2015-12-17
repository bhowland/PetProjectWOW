package Servlets.draenor;

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
 * Created by benjaminhowland on 12/14/15.
 */
@WebServlet(name = "VesharrServlet")
public class VesharrServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    Session session = HibernateUtil.getSessionFactory().openSession();
    static Logger log = Logger.getLogger(ManagePets.class.getName());

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        String hql = "select name FROM petInfo.PetsGeneral where creatureId=68662";
        String hql2 = "select name FROM petInfo.PetsGeneral where creatureId=64899";
        Query query = session.createQuery(hql);
        Query query2 = session.createQuery(hql2);
        List results = query.list();
        List results2 = query2.list();
        log.info("vesharr servlet: " + results);

        request.setAttribute("petOne", results);
        request.setAttribute("petTwo", results2);

        String url = "/draenor/vesharr.jsp";

        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
