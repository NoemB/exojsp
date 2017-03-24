<%@page pageEncoding="UTF-8" contentType="text/html" %>
<!-- info pour serveur -->
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <!-- info pour navigateur -->
    <title>Test JSP</title>
  </head>
  <body>
    <p>Bienvenue sur <strong>${header["Host"]}</strong> !</p>
    
    <p>Vous accédez actuellement à la page <strong>${pageContext.request.requestURI}</strong></p>
    <p>Votre navigateur Web est : <strong>${header["user-agent"]}</strong>.</p>
    <p>${empty param ? "Vous n'avez pas envoyé de paramètre au serveur" 
                        : "Vous avez envoyé des paramètres au serveur"}</p>
    <p>${empty cookie ? "Vous n'avez pas envoyé de cookie au serveur" 
                        : "Vous avez envoyé des cookies au serveur"}</p>
    ${user.nom}
  </body>
</html>