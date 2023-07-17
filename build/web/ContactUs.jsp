<%-- 
    Document   : ContactUs
    Created on : Feb 3, 2022, 7:31:31 PM
    Author     : Computer Store
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="CSS.css">
    </head>
    <body>
        <%@include file="Header2.html" %>
        <div class="ner">
            <h1>Contact us</h1>
            <div class="contact-box">
                <div class="contact-left">
                    <h2>Kotak Saran</h2>
                    <form>
                        <div class="input-row">
                            <div class="input-group">
                                <label>Name</label>
                                <input type="text" placeholder="name" name="nama">
                            </div>
                            <div class="input-group">
                                <label>phone</label>
                                <input type="text" placeholder="number" name="telfon">
                            </div>
                        </div>
                        <div class="input-row">
                            <div class="input-group">
                                <label>Email</label>
                                <input type="text" placeholder="Email" name="email">
                            </div>
                        </div>

                        <label>Message</label>
                        <textarea rows="5" placeholder="Your Message" name="pesan"></textarea>
                        <button type="submit">SEND</button>
                    </form>
                </div>
                <div class="contact-right">
                    <h2>Reach us</h2>
                    <table>
                        <tr>
                            <td>Email</td>
                            <td>IZI@gmail.com</td>
                        </tr>
                        <tr><br></tr>

                        <tr>
                            <td>Phone</td>
                            <td>+6285342908109</td>
                        </tr>
                        <tr><br></tr>
                        <tr>
                            <td>Address</td>
                            <td></td>
                        </tr>
                    </table>
                </div>
            </div>	
        </div>
    </body>
</html>
