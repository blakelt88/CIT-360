<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <title>Which Disney Character Would You Be?</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="DisneySurvey.jsp" method="post">
            <h1>Answer the questions below honestly.</h1>
            <table>               
                    <tr><td>Which Disney character would you be?</td><td><input type="text" name="character"/></tr>
                    <tr><td>Who is your favorite Disney Princess?</td><td><input type="text" name="princess"/></tr>
                    <tr><td>What is your favorite Disney movie?</td><td><input type="text" name="movie"/></tr>
                    <tr><td>What is your favorite Disney song?</td><td><input type="text" name="song"/></tr>
                   <tr> <td>Which Disney theme park do you like best?</td><td><input type="text" name="park"/></tr>
            </table>
            <input type="submit" value="Submit Choices"/>
        </form>
    </body>
</html>
