<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.mongodb.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pinterest</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="https://unpkg.com/material-components-web@latest/dist/material-components-web.min.css" rel="stylesheet">
        <script src="https://unpkg.com/material-components-web@latest/dist/material-components-web.min.js"></script>
        <link rel="stylesheet" type="text/css" href="src/main/java/CSS/Style.css">
    </head>
    <body>
        <div class="container">
            <form>
                <div class="row">
                    <div class="col-lg">
                        <img src="http://quimicaactiva.com/wp-content/uploads/2017/08/no-disponible.png" width="200px" height="400px">
                        <input type="file" name="file">
                    </div>
                    <div class="col-lg">
                        Titulo:
                    </div>
                </div>
            </form>
        </div>
        <input type="file" name="file">
    </body>
</html>
