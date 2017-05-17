package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("<title>Prism Search</title><link rel=\"stylesheet\" type=\"text/css\" href=\"css1.css\" />\n");
      out.write("    </h:head>\n");
      out.write("    <h:body>\n");
      out.write("       <div>\n");
      out.write("            <f:view>\n");
      out.write("                <h:form id=\"form\">\n");
      out.write("                <img src=\"logo.png\" align=\"middle\" alt=\"Prism Search\" />\n");
      out.write("                <h:inputText style=\"height:25px;width: 300px; \"/>\n");
      out.write("                <select name=\"options\" style=\"height: 31px\">\n");
      out.write("            <option selected=\"true\">Web</option>\n");
      out.write("            <option>Images</option>\n");
      out.write("            <option>Books</option>\n");
      out.write("            <option>News</option>\n");
      out.write("        </select>\n");
      out.write("        <div2>\n");
      out.write("            <h:commandButton id=\"btn\" value=\"Search\" action=\"home\" style=\"width: 140px;height: 31px; font-size: 20px;\"/>\n");
      out.write("           </div2></h:form>\n");
      out.write("        </f:view>\n");
      out.write("        </div> \n");
      out.write("      \n");
      out.write("            </h:body>    \n");
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
