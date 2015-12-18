package Servlets.draenor;

import hibernate.HibernateUtil;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import petInfo.ManagePets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
/**
 * set this up to try and get the servlets to look cleaner the whole DRY thing.
 * Created by benjaminhowland on 12/17/15.
 */
public class PetSearch extends HttpServlet {

    Session session = HibernateUtil.getSessionFactory().openSession();
    static Logger log = Logger.getLogger(ManagePets.class.getName());

    int petOne;

    PetSearch(int petOne) {
        this.petOne = petOne;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        response.setContentType("text/html");

        String hql = "select name FROM petInfo.PetsGeneral where creatureId=" + petOne + "";
        String allHql = "FROM petInfo.PetsGeneral where creatureId=" + petOne + "";

        Query allQuery = session.createQuery(allHql);
        Query query = session.createQuery(hql);

        List results = query.list();
        List allResults = allQuery.list();

        log.info(this.getServletName() + results);

        request.setAttribute("petOne", results);
        request.setAttribute("petOneInfo", allResults);
        String url = "/draenor/ashlei.jsp";

        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
