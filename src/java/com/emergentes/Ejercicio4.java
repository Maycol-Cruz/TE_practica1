package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio4", urlPatterns = {"/Ejercicio4"})
public class Ejercicio4 extends HttpServlet {

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
            out.println("<title>Ejercicio 4 </title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Ejercicio 4 </h2>");
            out.println("<h4>Juego de Dados</h4>");
            out.println("<br><br>");
            out.println("<form action='' method='get'>");
            out.println("<input type='submit'  value='Lanzar los Dados'>");
            out.println("</form>");
            out.println("<br><br>");
            int valor1 = 0;
            int valor2 = 0;
            int resultado;
            valor1 = (int) (Math.random()*6 + 1);
            valor2 = (int) (Math.random()*6 + 1); 
            resultado = valor1 + valor2;
            if(resultado == 7 || resultado == 11)
            {
             out.println("Valor del 1er dado es:"+valor1+"<br>");
             out.println("Valor del 2do dado es:"+valor2+"<br>");
             out.println("La suma de los 2 dados es:"+resultado+"<br>");
             out.println("Por ser "+resultado+" gana el juego");
            }else
            {
             out.println("Valor del 1er dado es:"+valor1+"<br>");
             out.println("Valor del 2do dado es:"+valor2+"<br>");
             out.println("La suma de los 2 dados es:"+resultado+"<br>");
             out.println("Por ser "+resultado+" pierde el juego");       
            }
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