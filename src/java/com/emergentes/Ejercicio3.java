package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio3", urlPatterns = {"/Ejercicio3"})
public class Ejercicio3 extends HttpServlet {

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
            out.println("<title>Ejercicio 3 </title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Ejercicio 3 </h2>");
            out.println("<h4>Calculadora</h4>");
            out.println("<br><br>");
            out.println("<form action='' method='get'>");
            out.println("Ingrese el primer número:");
            out.println("<br>");
            out.println("<input type='text' name='numeroA' required >");
            out.println("<br>");
            out.println("Ingrese el segundo número:");
            out.println("<br>");
            out.println("<input type='text' name='numeroB' required >");
            out.println("<br>");
            out.println("Seleccion el operador que nesecita"); 
	    out.println("<select name='tipo'>");
			out.println("<option value='1'>Suma");
		            out.println("<option value='2'>Resta");
		                out.println("<option value='3'>Producto");
                                    out.println("<option value='4'>Division");
	    out.println("</select>");
	    out.println("<br><br>");
            out.println("<input type='submit'  value='Procesar'>");
            out.println("</form>");
            out.println("<br><br>");
            int valor1 = Integer.parseInt(request.getParameter("numeroA"));
            int valor2 = Integer.parseInt(request.getParameter("numeroB"));
            int proceso = Integer.parseInt(request.getParameter("tipo"));
            float resultado;
            if(proceso == 1)
            {
             out.println("Valor A:"+valor1+"<br>");
             out.println("Valor B:"+valor2+"<br>");
             resultado = valor1 + valor2 ;
             out.println("La suma de los dos valores es:"+resultado);
            }else
            {
             if(proceso == 2)
             {
             out.println("Valor A:"+valor1+"<br>");
             out.println("Valor B:"+valor2+"<br>");
              resultado = valor1 - valor2 ;
             out.println("La resta de los dos valores es:"+resultado);   
             }else
             {
              if(proceso == 3)
              {
              out.println("Valor A:"+valor1+"<br>");
             out.println("Valor B:"+valor2+"<br>");
                  resultado = valor1 * valor2 ;
             out.println("El producto de los dos valores es:"+resultado);
              }else
              {
              out.println("Valor A:"+valor1+"<br>");
             out.println("Valor B:"+valor2+"<br>");
                resultado = valor1 / valor2 ;
             out.println("La division de los dos valores es:"+resultado);  
              }
             }
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