<%-- 
    Document   : globallib
    Created on : 25/12/2013, 11:04:44
    Author     : Антон
--%>

<%--<%@page contentType="text/html" pageEncoding="UTF-8" import="search.*"%>--%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="ActionsInterfaces.*"%>
<%@page import="ActionsImpl.*"%>
<%@page import="TransferObject.*"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean class="ActionsImpl.LibraryActionsImpl" id="book" scope="application"/>
		<table cellspacing="5"><tr><td><font size="20">Global library</font></td></tr>
                    <tr><td><a href="locallib.jsp"> Local library </a></td></tr></table>
		<br/>
		<form name="form1" method="post" action="SearchInGloballib"><br />
			<input type="text" name="text" width="40"></text>
			<input name="search" type="submit" value="Search"/>
		</form>
		<table border=1>
                    <%
                    long i=0;
                    try{
                        i = Long.parseLong(request.getParameter("i"));
                    }catch(Exception e){i=0;}
                        LibraryActions lib = new LibraryActionsImpl();
                        List<Library> books = lib.getBooksByIdInInterval(10*i, 10*(i+1));
                        out.println(books.size());

                        for(Library bookEntity : books){
                    %>
                    <tr>
			<td>
			<center>
			<%=bookEntity.getCover()%>
			<form name="form2" method="post" action="RateBookServlet"><br />
                		<input type="text" name="rate" style="width:25px;" value="
                                       <%
                                       long sum = 0;
                                       for(TransferObject.Rating rate : bookEntity.getRatingCollection())
                                           sum+=rate.getRate();
                                       sum = sum/bookEntity.getRatingCollection().size();
                                       %><%=sum%>"><br/>
				<input type="submit" name="search" value="Change rating"/>
                                <input type="hidden" name="book_id" value="<%=bookEntity.getId()%>"/>
			</form>
			</center>
			</td>
			<td>
			<%for(BookAuthor ba : bookEntity.getBookAuthorCollection()){%>
                            <%= ba.getAuthor()%><%}%><br/>
			<%=bookEntity.getTitle()%><br/>
			<%=bookEntity.getDescription()%><br/>
			<br/>
			<form name="form3" method="post" action="AddToLocalLibraryServlet"><br />
				<input type="submit" name="addlocal" value="Add to Local Library"/>
                                <input type="hidden" name="book_id" value="<%=bookEntity.getId()%>"/>
			</form>
			</td>
                    </tr>
                    <%
                        }
                    %>
		</table>
                <center>
                <%for(long k = i; k<i+10; k++){%>
                <a href="?i=<%=k%>"><%=k%></a>
                <%}%>
                </center>
	</body>
</html>
