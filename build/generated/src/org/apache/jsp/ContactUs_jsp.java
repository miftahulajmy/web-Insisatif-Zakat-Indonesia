package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ContactUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"ner\">\n");
      out.write("            <h1>Contact us</h1>\n");
      out.write("            <div class=\"contact-box\">\n");
      out.write("                <div class=\"contact-left\">\n");
      out.write("                    <h3>Sent your request</h3>\n");
      out.write("                    <form>\n");
      out.write("                        <div class=\"input-row\">\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <label>Name</label>\n");
      out.write("                                <input type=\"text\" placeholder=\"name\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <label>phone</label>\n");
      out.write("                                <input type=\"text\" placeholder=\"number\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <label>Email</label>\n");
      out.write("                            <input type=\"Email\" placeholder=\"Email\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <label>subject</label>\n");
      out.write("                            <input type=\"text\" placeholder=\"product\">\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <label>Message</label>\n");
      out.write("                <textarea rows=\"5\" placeholder=\"Your Message\"></textarea>\n");
      out.write("                <button type=\"submit\">SEND</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"contact-right\">\n");
      out.write("                <h3>Reach us</h3>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Email</td>\n");
      out.write("                        <td>IZI@gmail.com</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <br>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Phone</td>\n");
      out.write("                        <td>+6285342908109</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <br>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Address</td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\t\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
