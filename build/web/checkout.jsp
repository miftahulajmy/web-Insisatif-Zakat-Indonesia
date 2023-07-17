<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" media="screen" href="CSS.css"/>
    </head>
    <body>
        <%@include file="Header2.html" %>
        <div class="sample-section-wrap">
            <div class="sample-section">
                <h2>Pembelian Baju</h2>
                <div class="container">
                    <form action="simpan_co.jsp" method="post">
                        <div class="row">
                            <div class="col-25">
                                <label for="name">Nama</label>
                            </div>
                            <div class="col-75">
                                <input type="text" id="name" name="nama">
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-25">
                                <label for="country">Alamat</label>
                            </div>
                            <div class="col-75">
                                <input type="text" id="name" name="alamat">
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-25">
                                <label for="no telfon">No Telfon</label>
                            </div>
                            <div class="col-75">
                                <input type="text" id="name" name="no_telfon">
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-25">
                                <label for="nama_barang">Nama Barang</label>
                            </div>
                            <div class="col-75">
                                <input type="text" id="name" name="nama_barang">
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <input type="submit" value="Submit">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
