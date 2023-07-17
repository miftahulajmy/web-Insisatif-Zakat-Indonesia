<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="CSS.css">
<html>
    <body>
        <%
            String no_telfon = request.getParameter("no_telfon");
            String host = "jdbc:mysql://localhost:3306/uas";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(host, "root", "");
                if (conn != null) {
                    if (no_telfon != null) {
                        Statement st = conn.createStatement();
                        st.executeUpdate("DELETE FROM checkout WHERE no_telfon = '" + no_telfon + "'");
                        response.sendRedirect("data_co.jsp");
                    }
                } else {
                    response.sendRedirect("GagalSimpan.jsp");
                }
            } catch (SQLException ex) {
                out.print("Gagal Koneksi");
            } catch (Exception ex) {
                out.print(ex.getMessage());
            }
        %>
    </body>
</html>
