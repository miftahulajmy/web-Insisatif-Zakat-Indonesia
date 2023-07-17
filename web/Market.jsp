<%-- 
    Document   : Market
    Created on : Feb 3, 2022, 6:28:11 PM
    Author     : Computer Store
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Fashion</title>
        <link rel="stylesheet" type="text/css" href="CSS.css">
        <link rel="stylesheet" type="text/css" href=
              "https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <%@include file="Header2.html" %>
        <div class="sample-section-wrap">
            <div class="sample-section">

                <form action="checkout.jsp">
                    <table>
                        <tr>
                            <th width="300px"></th>
                            <th width="200px"></th>
                        </tr>
                        <tr>
                            <td>
                                <img src="baju1.jpg" width="200" height="250" >
                            </td> 
                            <td>
                                <h4>Ruffle</h4>
                                <div class="rating">
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                </div>
                                <p>Harga: Rp.350.000;</p>
                                <button>Buy</button>
                            </td>
                        </tr>
                    </table>
                </form>
                <form action="checkout.jsp">
                    <table>
                        <tr>
                            <th width="300px"></th>
                            <th width="200px"></th>
                        </tr>
                        <tr>
                            <td>
                                <img src="baju2.jpg" width="200" height="250"> 
                            </td>
                            <td>
                                <h4>Bell Bottom Pants (Flare Pants)</h4>
                                <div class="rating">
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                </div>
                                <p>Harga: Rp.410.000;</p>
                                <button>Buy</button>
                            </td>
                        </tr>
                    </table>
                </form>
                <form action="checkout.jsp">
                    <table>
                        <tr>
                            <th width="300px"></th>
                            <th width="200px"></th>
                        </tr>
                        <tr>
                            <td>
                                <img src="baju3.jpg" width="200" height="250"> 
                            </td>
                            <td>
                                <h4>Dominatrix Style</h4>
                                <div class="rating">
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                </div>
                                <p>Harga: Rp.370.000;</p> 
                                <button>Buy</button>
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>        
    </body>
</html>
