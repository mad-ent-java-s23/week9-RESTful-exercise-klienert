<%@include file="taglib.jsp"%>
<c:set var="title" value="Week 9 - RESTful Activity" />
<%@include file="head.jsp"%>

<html>
<body>

<div class="container-fluid m-3">
    <h2 class="text-center text-primary"> Week 9 - First RESTful Service Activity</h2>
    <div class="row justify-content-center">
        <div class="col-4">
            <p>Web Service (Hello Exercise)<br />
            <a href="http://localhost:8088/week_9_RESTful_exercise_klienert_war/greetings/hello/Keith">Test</a></p>
        </div>
        <div class="col-4">
            <p>Get all users (JSON):
            <br/>
            <a href="http://localhost:8088/week_9_RESTful_exercise_klienert_war/getUsers/UserService/users">All Users</a>
            </p>
        </div>
    </div>
    <div class="row justify-content-center">
        <div class="col-6 mx-auto">
            <form action="http://localhost:8088/week_9_RESTful_exercise_klienert_war/getUsers/UserService/query" class="form-inline">
                <div class="form-group m-2">
                    <label for="userid" class="m-1">Search by User ID</label>
                    <input type="number" class="form-control m-1 p-1" id="userid" name="userid" aria-describedby="SearchIDhelp">
                </div>
                <button type="submit" class="btn btn-primary">Search</button>
            </form>
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
