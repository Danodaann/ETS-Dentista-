package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class EditarCitas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
 
         //Conexion 
         Connection con; 
         String url = "jdbc:mysql://localhost:3306/loginjsp";
         String Driver = "com.mysql.jdbc.Driver";
         String usuario = "root";
         String clave = "";
         Class.forName(Driver);
         con=DriverManager.getConnection(url, usuario, clave);

        //Litado de la tabla citas pero de la fila seleccionada
        
        PreparedStatement ps;
        ResultSet rs;
        int id = Integer.parseInt(request.getParameter("id"));
        ps=con.prepareStatement("select * from citas where id="+id);
        rs= ps.executeQuery();
        while(rs.next()){            
        }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"contenedor\">\n");
      out.write("            <h1>Modificar</h1>\n");
      out.write("            <hr>\n");
      out.write("            <form action=\"\" method=\"post\" class=\"form-control\" style=\"width: 500px; height: 400px\">\n");
      out.write("                ID: \n");
      out.write("                <input type=\"text\" readonly=\"\" class=\"form-control\" value=\"");
      out.print( rs.getInt("id"));
      out.write("\"/>\n");
      out.write("                DIA:\n");
      out.write("                <input type=\"text\" name=\"txtDia\" class=\"form-control\"/>\n");
      out.write("                MES:\n");
      out.write("                <input type=\"text\" name=\"txtMes\" class=\"form-control\"/>\n");
      out.write("                AÑO:\n");
      out.write("                <input type=\"text\" name=\"txtAño\" class=\"form-control\"/>\n");
      out.write("                TRATAMIENTO:\n");
      out.write("                <input type=\"text\" name=\"txtTra\" class=\"form-control\"/>\n");
      out.write("                NOMBRE:\n");
      out.write("                <input type=\"text\" name=\"txtNom\" class=\"form-control\"/>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
