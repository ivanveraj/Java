<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.mycompany.pinterest.*" %>
<%@page import="com.mongodb.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pinterest</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="https://unpkg.com/material-components-web@latest/dist/material-components-web.min.css" rel="stylesheet">
        <script src="https://unpkg.com/material-components-web@latest/dist/material-components-web.min.js"></script>
    </head>
    <body>
        <div class="row">
            <div class="col-12">
                <nav class="navbar navbar-expand-lg navbar-light bg-light">
                    <div class="container-fluid">
                        <a class="navbar-brand" href="index.jsp">
                            <img src="https://h2m8x3y5.rocketcdn.me/wp-content/uploads/2020/03/pinterest.png" alt="" width="40" height="40" class="d-inline-block align-text-top">
                        </a>
                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                                <li class="nav-item ">
                                    <a class="nav-link text-light bg-dark" href="index.jsp">Inicio</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#">Hoy</a>
                                </li>
                            </ul>
                            <form class="col-8 align-center">
                                <input class="form-control" type="search" placeholder="Search" aria-label="Search">
                            </form>
                        </div>
                        <a class="navbar-brand" href="AgregarImagen.jsp">
                            <img src="https://h2m8x3y5.rocketcdn.me/wp-content/uploads/2020/03/pinterest.png" alt="" width="40" height="40" class="d-inline-block align-text-top">
                        </a>
                        <a class="navbar-brand" href="#">
                            <img src="https://h2m8x3y5.rocketcdn.me/wp-content/uploads/2020/03/pinterest.png" alt="" width="40" height="40" class="d-inline-block align-text-top">
                        </a>
                        <a class="navbar-brand" href="#">
                            <img src="https://h2m8x3y5.rocketcdn.me/wp-content/uploads/2020/03/pinterest.png" alt="" width="40" height="40" class="d-inline-block align-text-top">
                        </a>
                    </div>
                </nav>
            </div>
        </div>
        <% Conexion C=new Conexion();
        MongoClient M=C.getM();
        if(M!=null){
            DB db=M.getDB("Pruebas");
            DBCollection Col=db.getCollection("Imagen");
            DBCursor i=Col.find();
        %>
        <ul class="mdc-image-list my-image-list">
            <%
                C.InsertarImagen(db,"Imagen",1005, "Yesid Madrid", "Ruta", "Red social pinterest","Excelente red de imagenes");
                      while(i.hasNext()){
                          i.next().get("Id");
            %>
            <div class="card border-light mb-4" style="width: 20rem;">
                <img src="<% out.println(i.curr().get("Img").toString()); %>" class="card-img-top" alt="<% out.println(i.curr().get("Autor").toString()); %>">
                <div class="card-header"><% out.println(i.curr().get("Titulo")); %></div>
                <div class="card-body">
                    <h5 class="card-title"><% out.println(i.curr().get("Autor").toString()); %></h5>
                    <p class="card-text"><% out.println(i.curr().get("Descripcion").toString()); %></p>
                </div>
            </div>
            <% 
            }%>
        </ul><%
                        }else{
        %>
        <h1 class="text-center display-4 my-4">Error de conexion</h1>
        <% } %>
    </body>
</html>
