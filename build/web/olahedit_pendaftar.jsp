<%-- 
    Document   : olahedit_pendaftar
    Created on : Feb 2, 2022, 7:39:09 PM
    Author     : Computer Store
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<%
    String NIK = request.getParameter("NIK");
    String nama = request.getParameter("nama");
    String alamat = request.getParameter("alamat");
    String no_telfon = request.getParameter("no_telfon");
    int usia = Integer.parseInt(request.getParameter("usia"));
    String host = "jdbc:mysql://localhost:3306/uas";
    
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(host,"root","");
        if(conn != null){
            if(NIK != null){
                PreparedStatement pst = conn.prepareStatement("update pendaftar set NIK=?,nama=?,alamat=?,no_telfon=?,usia=? where NIK= "+NIK);
                pst.setString(1, NIK);
                pst.setString(2, nama);
                pst.setString(3, alamat);
                pst.setString(4, no_telfon);
                pst.setInt(5, usia);
                pst.executeUpdate();
                
                response.sendRedirect("data_pendaftar.jsp");
            }
        }
        else{
            response.sendRedirect("GagalSimpanPendaftar.jsp");
        }
    }catch(SQLException ex){
        out.print("Gagal Koneksi");
    }
    catch(Exception ex){
        out.print(ex.getMessage());
    }
%>
