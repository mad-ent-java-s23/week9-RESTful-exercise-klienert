<%@include file="taglib.jsp"%>
<c:set var="title" value="Search Results" />
<%@include file="head.jsp"%>

<html>
<body>
<div class="container">
    <div class="col-sm-8 mx-auto">
        <h2>Weather Results</h2>
        <table id="weatherTable" class="table table-borderless w-75">
            <tr>
                <td>${location.getName}</td>
                <td>${location.getRegion}</td>
            </tr>
        </table>
        <hr>
        <a href="index.jsp">Try again?</a>
    </div>
</div>
</body>
</html>
