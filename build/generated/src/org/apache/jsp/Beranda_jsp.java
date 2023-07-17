package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Beranda_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS.css\">\n");
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
      out.write("    <link rel=\"stylesheet\" href=\"CSS.css\">\n");
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
      out.write("        <img src=\"Inisiatif Zakat Indonesia.png\" width=100%/>\n");
      out.write("        <div class=\"sample-section-wrap\">\n");
      out.write("            <div class=\"sample-section\">\n");
      out.write("                <hr>\n");
      out.write("                <center><h1>Profil IZI</h1></center>\n");
      out.write("\n");
      out.write("                <p>     Yayasan Inisiatif Zakat Indonesia - IZI - dilahirkan oleh sebuah lembaga sosial yang \n");
      out.write("                    sebelumnya telah dikenal cukup luas dan memiliki reputasi yang baik selama lebih dari 16 tahun dalam \n");
      out.write("                    memelopori era baru gerakan filantropi Islam modern di Indonesia yaitu Yayasan Pos Keadilan Peduli Ummat \n");
      out.write("                    (PKPU). IZI fokus dalam pengelolaan zakat serta donasi keagamaan lainnya diharapkan IZI dapat\n");
      out.write("                    lebih sungguh-sungguh mendorong potensi besar zakat menjadi kekuatan real dan pilar kokoh penopang kemuliaan \n");
      out.write("                    dan kesejahteraan ummat melalui positioning lembaga yang jelas, pelayanan yang prima, efektifitas program yang\n");
      out.write("                    tinggi, proses bisnis yang efisien dan modern, serta 100% shariah compliance \n");
      out.write("                    sesuai sasaran ashnaf dan maqashid(tujuan) syariah.\n");
      out.write("                    <br><br>\n");
      out.write("                        Inisiatif Zakat Indonesia (IZI) Perwakilan Riau bekerja sama dengan Laznas Pertamina Hulu Rokan (PHR) \n");
      out.write("                    memberikan pelatihan keterampilan menjahit bagi kaum perempuan Milanial di Kota Pekanbaru.\n");
      out.write("                    membentuk sebuah wadah yang menampung para dhuafa tadi untuk ikut dalam program kelas menjahit \n");
      out.write("                    yang kami adakan selama 3 bulan kedepan secara gratis tanpa dipungut biaya apapun.\n");
      out.write("                </p>\n");
      out.write("                <br>\n");
      out.write("                <hr>\n");
      out.write("                <h1><center>Dokumentasi kegiatan menjahit</center></h1>\n");
      out.write("\n");
      out.write("                <img src=\"1.jpeg\" width=\"300\" height=\"200\">\n");
      out.write("                <img src=\"2.jpg\" width=\"300\" height=\"200\">\n");
      out.write("                <img src=\"3.jpg\" width=\"300\" height=\"200\">\n");
      out.write("                <img src=\"4.jpg\" width=\"300\" height=\"200\">\n");
      out.write("                <img src=\"5.jpeg\" width=\"300\" height=\"200\">\n");
      out.write("                <img src=\"6.jpeg\" width=\"300\" height=\"200\">\n");
      out.write("            </div>\n");
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
