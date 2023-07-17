<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String host = "jdbc:mysql://localhost:3306/uas";
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(host, "root", "");
        String query = "select*from pendaftar";
        Statement stmt = conn.createStatement();
        ResultSet rs = null;
        rs = stmt.executeQuery(query);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PCR</title>
        <link rel="stylesheet" href="CSS.css">
    </head>
    <body>
        <%@include file="Header.html" %>
        <div class="sample-section-wrap">
            <div class="sample-section">
                <h1>Pendaftar Kelas Menjahit</h1>
                <a href="input_pendaftar.jsp">Add Data</a>
                <table id="pendaftar">
                    <tr>
                        <td>NIK</td>
                        <td>Nama</td>
                        <td>Alamat</td>
                        <td>No Telfon</td>
                        <td>Usia</td>
                    </tr>
                    <% while (rs.next()) {%>
                    <tr>
                        <td><%=rs.getString("NIK")%></td>
                        <td><%=rs.getString("nama")%></td>
                        <td><%=rs.getString("alamat")%></td>
                        <td><%=rs.getString("no_telfon")%></td>
                        <td><%=rs.getInt("usia")%></td>
                        <td><a href="edit_pendaftar.jsp?NIK=<%=rs.getString("NIK")%>"
                               >Edit</a> | <a href="delete_pendaftar.jsp?NIK=<%=rs.getString("NIK")%>"
                               >Delete</a>
                        </td>
                    </tr>
                    <%}%>
                </table>
                <%
                        rs.close();
                        stmt.close();
                        conn.close();
                    } catch (SQLException ex) {
                        out.print("Gagal Koneksi");
                    } catch (Exception ex) {
                        out.print(ex.getMessage());
                    }
                %>
            </div>
    </body>
</html>
