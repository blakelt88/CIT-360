<%-- 
    Document   : RegisterCharacters
    Created on : May 19, 2017, 11:11:21 PM
    Author     : Blake
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DISNEY!</title>
    </head>
    <body>
        <h1>The Moment Of Truth</h1>
        <% // Declare the input variables
            String InputCharacter="",InputPrincess="",InputMovie="",InputSong="",InputPark="";
            
            // Conditional logic to determine parameters
            if(request.getParameter("character")!=null) {
                InputCharacter=request.getParameter("character");
            }
            if(request.getParameter("princess")!=null) {
                InputPrincess=request.getParameter("princess");
            }
            if(request.getParameter("movie")!=null) {
                InputMovie=request.getParameter("movie");
            }
            if(request.getParameter("song")!=null) {
                InputSong=request.getParameter("song");
            }
            if(request.getParameter("park")!=null) {
                InputPark=request.getParameter("park");
            }
        %>
        <jsp:useBean id="DisneySession" class="disneybeans.DisneySession" scope="session"/>
        <jsp:setProperty name="DisneySession" property="character" value="<%=InputCharacter%>"/>
        <jsp:setProperty name="DisneySession" property="princess" value="<%=InputPrincess%>"/>
        <jsp:setProperty name="DisneySession" property="movie" value="<%=InputMovie%>"/>
        <jsp:setProperty name="DisneySession" property="song" value="<%=InputSong%>"/>
        <jsp:setProperty name="DisneySession" property="park" value="<%=InputPark%>"/>
        
        <table>               
            <tr><td>Which Disney character would you be?</td><td><b><jsp:getProperty name="DisneySession" property="character"/></b></td></tr>
                <tr><td>Who is your favorite Disney Princess?</td><td><b><jsp:getProperty name="DisneySession" property="princess"/></b></td></tr>
                <tr><td>What is your favorite Disney movie?</td><td><b><jsp:getProperty name="DisneySession" property="movie"/></b></td></tr>
                <tr><td>What is your favorite Disney song?</td><td><b><jsp:getProperty name="DisneySession" property="song"/></b></td></tr>
                <tr><td>Which Disney theme park do you like best?</td><td><b><jsp:getProperty name="DisneySession" property="park"/></b></td></tr>
        </table>
        
        <p></p>
    </body>
</html>
