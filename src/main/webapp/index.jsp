<%@include file="taglib.jsp"%>
<c:set var="title" value="Week 9 - RESTful Activity" />
<%@include file="head.jsp"%>

<html>
<body>

<div class="container-fluid m-3">
    <h2 class="text-center text-primary"> Week 9 - First RESTful Service Activity</h2>
    <div class="row justify-content-center">
        <div class="col-6">
            <p>Web Service (Hello Exercise)</p>
            <p><a href="http://localhost:8088/week_9_RESTful_exercise_klienert_war/services/greetings/Keith">Test</a></p>
        </div>
        <div class="col-6">
            <p>Get all users (JSON):
                <br/>
                <a href="http://localhost:8088/week_9_RESTful_exercise_klienert_war/UserService/users">All Users</a>
            </p>
        </div>
    </div>
    <hr>
    <div class="row justify-content-center">
        <div class="col-md-8">
            <%@include file="search.jsp"%>
        </div>
    </div>


</div>
</body>
</html>
