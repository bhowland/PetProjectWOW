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

//@WebServlet(
//        name = "AshlieServlet",
//        urlPatterns = { "/draenor/ashlie.jsp" }
//)

@Controller
@RequestMapping("/draenor/ashlie.jsp")

public class AshlieServlet extends HttpServlet {

//    @RequestMapping(value = "/pet", method = RequestMethod.GET)
    Session session = HibernateUtil.getSessionFactory().openSession();
    static Logger log = Logger.getLogger(ManagePets.class.getName());


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");


            String hql = "select '*' FROM petInfo.PetsGeneral where ID=27";
            Query query = session.createQuery(hql);
            List results = query.list();
            log.info("ashlie: " + results);

        request.setAttribute("petOne", "claw");


        String url = "/draenor/ashlie.jsp";

        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
//        response.sendRedirect( "ashlie.jsp?petOne=" +  results);
    }
}
