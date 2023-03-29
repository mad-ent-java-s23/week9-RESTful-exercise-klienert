<%@include file="taglib.jsp"%>
<c:set var="title" value="Week 9 - RESTful Activity" />
<%@include file="head.jsp"%>

<html>
<body>
<%--<%response.sendRedirect("searchUser?searchTerm=&submit=viewAll");%>--%>

<div class="container-fluid m-3">
    <h2 class="text-center text-primary"> Week 9 - First RESTful Service Activity</h2>
    <div class="row justify-content-center">
        <p>Web Service (Hello Program)</p>
        <p><a href="http://localhost:8088/week_9_RESTful_exercise_klienert_war/services/greetings/Keith">Test</a></p>
    </div>
    <hr>
    <div class="row">
        <div class="col-md-8">
<%--            <%response.sendRedirect("searchUser?searchTerm=&submit=viewAll");%>--%>
            <a href="search.jsp">Search page</a>
            <br />
        </div>
    </div>


</div>
</body>
</html>
