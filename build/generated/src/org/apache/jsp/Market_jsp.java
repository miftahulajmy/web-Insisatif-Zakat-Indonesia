package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Market_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Header2.html");
  }

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
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Fashion</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\n");
      out.write("              \"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Navigation Bar</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:300\">\n");
      out.write("        <style>\n");
      out.write("            #menu-nav {\n");
      out.write("                background-color: white;\n");
      out.write("                box-shadow: 0 2px 5px rgba(0, 0, 0, 0.3);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #navigation-bar ul {\n");
      out.write("                border-radius: 4px;\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("            #navigation-bar li {\n");
      out.write("                float: left;\n");
      out.write("                width: 15%;\n");
      out.write("            }\n");
      out.write("            #navigation-bar li:hover a::before {\n");
      out.write("                right: 0;\n");
      out.write("                left: 0;\n");
      out.write("            }\n");
      out.write("            #navigation-bar a {\n");
      out.write("                color: #848484;\n");
      out.write("                font-size: 20px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 20px 0;\n");
      out.write("                display: block;\n");
      out.write("                position: relative;\n");
      out.write("                transition: all 0.3s ease;\n");
      out.write("            }\n");
      out.write("            #navigation-bar a:hover {\n");
      out.write("                color: #188B22;\n");
      out.write("            }\n");
      out.write("            #navigation-bar a::before {\n");
      out.write("                content: \"\";\n");
      out.write("                transition: all 0.4s ease-in-out;\n");
      out.write("                position: absolute;\n");
      out.write("                bottom: 0;\n");
      out.write("                height: 2px;\n");
      out.write("                background-color: white;\n");
      out.write("            }\n");
      out.write("            #navigation-bar a:hover::before {\n");
      out.write("                right: 0;\n");
      out.write("                left: 0;\n");
      out.write("            }\n");
      out.write("            li {\n");
      out.write("                list-style: none;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div id=\"menu-nav\">\n");
      out.write("            <div id=\"navigation-bar\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><img src=\"lh.png\"></li>\n");
      out.write("                    <li><a href=\"Beranda.jsp\"><span>Beranda</span></a></li>\n");
      out.write("                    <li><a href=\"Pendaftar.jsp\"><span>Pendaftaran</span></a></li>\n");
      out.write("                    <li><a href=\"Market.jsp\"><span>Market</span></a></li>\n");
      out.write("                    <li><a href=\"ContactUs.jsp\"><span>Contact</span></a></li>\n");
      out.write("                    <li><a href=\"LogoutSession\"><span>Logout</span></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div class=\"sample-section-wrap\">\n");
      out.write("            <div class=\"sample-section\">\n");
      out.write("\n");
      out.write("                <form action=\"checkout.jsp\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <th width=\"300px\"></th>\n");
      out.write("                            <th width=\"200px\"></th>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <img src=\"baju1.jpg\" width=\"200\" height=\"250\" >\n");
      out.write("                            </td> \n");
      out.write("                            <td>\n");
      out.write("                                <h4>Ruffle</h4>\n");
      out.write("                                <div class=\"rating\">\n");
      out.write("                                    <i class=\"fa fa-star\"></i>\n");
      out.write("                                    <i class=\"fa fa-star\"></i>\n");
      out.write("                                    <i class=\"fa fa-star\"></i>\n");
      out.write("                                    <i class=\"fa fa-star\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <p>Harga: Rp.350.000;</p>\n");
      out.write("                                <button><a href=\"checkout.jsp\">Buy</a></button>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("                <form action=\"checkout.jsp\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <img src=\"baju2.jpg\" width=\"200\" height=\"250\"> \n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <h4>Bell Bottom Pants (Flare Pants)</h4>\n");
      out.write("                                <div class=\"rating\">\n");
      out.write("                                    <i class=\"fa fa-star\"></i>\n");
      out.write("                                    <i class=\"fa fa-star\"></i>\n");
      out.write("                                    <i class=\"fa fa-star\"></i>\n");
      out.write("                                    <i class=\"fa fa-star\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <p>Harga: Rp.410.000;</p>\n");
      out.write("                                <button>Buy</button>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("                <form action=\"checkout.jsp\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <img src=\"baju3.jpg\" width=\"200\" height=\"250\"> \n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <h4>Dominatrix Style</h4>\n");
      out.write("                                <div class=\"rating\">\n");
      out.write("                                    <i class=\"fa fa-star\"></i>\n");
      out.write("                                    <i class=\"fa fa-star\"></i>\n");
      out.write("                                    <i class=\"fa fa-star\"></i>\n");
      out.write("                                    <i class=\"fa fa-star\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <p>Harga: Rp.370.000;</p> \n");
      out.write("                                <button>Buy</button>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>        \n");
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
