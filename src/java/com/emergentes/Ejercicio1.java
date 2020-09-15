package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio1", urlPatterns = {"/Ejercicio1"})
public class Ejercicio1 extends HttpServlet {
    
 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{    
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<center>");
            out.println("<head>");
            out.println("<title>Ejercicio 1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Ejercicio 1</h2>");
            out.println("<h4>Cálculo de Edad</h4>");
            out.println("<br><br>");
            out.println("<form action='' method='get'");
            out.println("<br>");
            out.println("Nombre:");
            out.println("<br>");
            out.println("<input type='text' name='nombre' required >");
            out.println("<br>");
            out.println("Año de Nacimiento:");
            out.println("<br>");
            out.println("<input type='text' name='nacimiento' required >");
            out.println("<br><br>");
            out.println("<input type='submit' value='Calcular ' >");
            out.println("</fomr>");
            out.println("<br><br>");
            String nombre = request.getParameter("nombre");
            int nac = Integer.parseInt(request.getParameter("nacimiento"));
            int edad;
                edad = 2020 - nac;
                out.println("Actualmente "+nombre+" tiene la edad de:"+edad+" años");        
            out.println("</form>");

            out.println("</body>");
            out.println("<br><br>");
            out.println("<a href='index.jsp'>Volver al Inicio</a>");
            out.println("</center>");
            out.println("</html>");
        }finally{
            out.close();
        }
    }
    
}
 