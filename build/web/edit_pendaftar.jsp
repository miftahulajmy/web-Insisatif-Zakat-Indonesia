<%@page import="java.io.*"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String NIK = request.getParameter("NIK");
    String host = "jdbc:mysql://localhost:3306/uas";
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(host, "root", "");
        String query ="select * from pendaftar where NIK='"+NIK+"'";
        Statement stmt = conn.createStatement();
        ResultSet rs = null;
        rs = stmt.executeQuery(query);
        while (rs.next()) {
%>
<link rel="stylesheet" href="CSS.css">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kelas Menjahit</title>
    </head>
    <body>
        <h1>Form Edit</h1>
        <form action="olahedit_pendaftar.jsp" method="post">
            <table>
                <tr>
                    <td>NIK</td>
                    <td>:</td>
                    <td><input type="text" name="NIK" value="<%=rs.getString("NIK")%>"/></td>
                </tr>
                <tr>
                    <td>Nama</td>
                    <td>:</td>
                    <td><input type="text" name="nama" value="<%=rs.getString("nama")%>"/></td>
                </tr>
                <tr>
                    <td>Alamat</td>
                    <td>:</td>
                    <td><input type="text" name="alamat" value="<%=rs.getString("alamat")%>"/></td>
                </tr>
                <tr>
                    <td>No Telfon</td>
                    <td>:</td>
                    <td><input type="text" name="no_telfon" value="<%=rs.getString("no_telfon")%>"/></td>
                </tr>
                <tr>
                    <td>Usia</td>
                    <td>:</td>
                    <td><input type="text" name="usia" value="<%=rs.getInt("usia")%>"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Update"></td>
                </tr>
            </table>
        </form>
        <%}
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException ex) {
                out.print("Gagal Koneksi");
            } catch (Exception ex) {
                out.print(ex.getMessage());
            }
        %>
    </body>
</html>