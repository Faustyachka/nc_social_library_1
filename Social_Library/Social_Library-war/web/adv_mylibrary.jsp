<%--
    Document   : nocommand
    Created on : 07.01.2014, 0:27:40
    Author     : Pavel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/ourstyle.css">
        <title>TEMPLATE Page</title>
    </head>
    <body>

        <div id="main">
            <div id="header">

                <div id="menu">
                    <ul>
                        <li><a href="Controller?command=dashboard" >
                                <span class="refLabelText">Dashboard</span>
                            </a></li>
                        <li><a href="Controller?command=nocommand">
                                <span class="refLabelText">Add</span>
                            </a></li>
                        <li><a href="Controller?command=nocommand">
                                <span class="refLabelText">Search</span>
                            </a></li>
                        <li><a href="Controller?command=nocommand" >
                                <span class="refLabelText">My library</span>
                            </a></li>
                        <li><a href="index.jsp" >
                                <span class="refLabelText">Sign out</span>
                            </a></li>
                    </ul>

                </div>



            </div>

            <div id="center">

                <p1>MY LIBRARY!!!</p1>
            </div>

            <div id="footer">
                <hr>
                <p id="footerText">[ footer text ]</p>
            </div>
        </div>

    </body>
</html>
