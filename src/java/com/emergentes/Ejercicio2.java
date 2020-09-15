package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio2", urlPatterns = {"/Ejercicio2"})
public class Ejercicio2 extends HttpServlet {
    

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter(); 
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<center>");
            out.println("<head>");
            out.println("<title>Ejercicio 2 </title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Ejercicio 2 </h2>");
            out.println("<h4>Cambio de Moneda</h4>");
            out.println("<br><br>");
            out.println("<form action='' method='post'>");
             out.println("Ingrese el monto que realizara el cambio:");
            out.println("<br>");
            out.println("<input type='text' name='monto' required >");
            out.println("<br>");
            out.println("Tipo de cambio que quiere realizar:"); 
	    out.println("<br>");
	    out.println("<input type='radio' name='cambio' value='2'>Bolivianos a dolar");
            out.println("<br>");
	    out.println("<input type='radio' name='cambio' value='1'>Dolar a Bolivianos");
	    out.println("<br><br>");
            out.println("<input type='submit'  value='Realizar Cambio'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</center>");
            out.println("</html>");
        }finally{
            out.close();
        }
    }
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int monto = Integer.parseInt(request.getParameter("monto"));
        int tipo = Integer.parseInt(request.getParameter("cambio"));
        double valor;
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<center>");
            out.println("<head>");
            out.println("<title>Ejercicio 2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Ejercicio 2</h2>");
            out.println("<h4>Cambio de Moneda</h4>");
            if( tipo == 1)
            {
            out.println("<h3>El tipo de cambio que eligio es de Dolar a Bolivianos</h3>");
            valor = monto * 6.91;
            out.println("El cambio de "+monto+" $ a Bolivianos es:"+valor+" Bs");
            }else
            {
            out.println("<h3>El tipo de cambio que eligio es de Bolivianos a Dolar</h3>");
            valor = monto / 6.91;
            out.println("El cambio de "+monto+" Bs a Dolar  es:"+valor+" $");        
            }
            out.println("</body>");
            out.println("<br><br>");
            out.println("<a href='index.jsp'>Volver al Inicio</a>");
            out.println("</center>");
            out.println("</html>");
        } finally{
            out.close();
        }
    } }