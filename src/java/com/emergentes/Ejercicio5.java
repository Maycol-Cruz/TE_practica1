package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio5", urlPatterns = {"/Ejercicio5"})
public class Ejercicio5 extends HttpServlet {

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
            out.println("<title>Ejercicio 5 </title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Ejercicio 5 </h2>");
            out.println("<h4>Matriz Caracol</h4>");
            out.println("<br><br>");
            out.println("<form action='' method='get'>");
            out.println("Ingrese el tamaño de la matriz:");
            out.println("<br>");
            out.println("<input type='text' name='tamaño' required >");
            out.println("<br>");
            out.println("<input type='submit'  value='Procesar'>");
            out.println("</form>");
            out.println("<br><br>");
            int n = Integer.parseInt(request.getParameter("tamaño"));
            int m[][] = new int[n][n];
            int c = 1;
            int nl = n;
            for (int k = 0; k < nl; k++) {
                for (int j = k; j < n; j++) {
                    m[k][j] = c;
                    c++;
                }
                for (int i = k + 1; i < n; i++) {
                    m[i][n - 1] = c;
                    c++;
                }
                for (int j = n - 2; j >= k; j--) {
                    m[n - 1][j] = c;
                    c++;
                }
                for (int i = n - 2; i > k; i--) {
                    m[i][k] = c;
                    c++;
                }
                n--;
            }
            for (int i = 0; i < nl; i++) {
                for (int j = 0; j < nl; j++) {
                    out.print(" "+ m[i][j]);
                }
                out.println();
            }
            out.println("</body>");
            out.println("<br><br>");
            out.println("<a href='index.jsp'>Volver al Inicio</a>");
            out.println("</center>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
}
