package petInfo;

/**
 * Created by benjaminhowland on 12/13/15.
 */
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@Controller


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
