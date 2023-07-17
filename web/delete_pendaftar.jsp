<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="CSS.css">
<html>
    <body>
        <%
            String NIK = request.getParameter("NIK");
            String host = "jdbc:mysql://localhost:3306/uas";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(host, "root", "");
                if (conn != null) {
                    if (NIK != null) {
                        Statement st = conn.createStatement();
                        st.executeUpdate("DELETE FROM pendaftar WHERE NIK = '" + NIK + "'");
                        response.sendRedirect("data_pendaftar.jsp");
                    }
                } else {
                    response.sendRedirect("GagalSimpanPendaftar.jsp");
                }
            } catch (SQLException ex) {
                out.print("Gagal Koneksi");
            } catch (Exception ex) {
                out.print(ex.getMessage());
            }
        %>
    </body>
</html>
