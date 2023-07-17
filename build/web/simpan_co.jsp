<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String nama = request.getParameter("nama");
    String alamat = request.getParameter("alamat");
    String no_telfon =request.getParameter("no_telfon");
    String nama_barang = request.getParameter("nama_barang");
    String host = "jdbc:mysql://localhost:3306/uas";
    
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(host,"root","");
        if(conn != null){
            if(no_telfon != null){
                PreparedStatement pst = conn.prepareStatement("INSERT INTO checkout VALUES(?,?,?,?)");
                pst.setString(1, nama);
                pst.setString(2, alamat);
                pst.setString(3, no_telfon);
                pst.setString(4, nama_barang);
                pst.executeUpdate();
                
                response.sendRedirect("terimakasih.jsp");
            }
        }
        else{
            response.sendRedirect("GagalSimpan.jsp");
        }
    }catch(SQLException ex){
        out.print("Gagal Koneksi");
    }
    catch(Exception ex){
        out.print(ex.getMessage());
    }
    %>

