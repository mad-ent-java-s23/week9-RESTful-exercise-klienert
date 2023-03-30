<%@include file="head.jsp"%>
<c:set var="title" value="Search" />
<%@include file="head.jsp"%>
<html>
<body>

    <h3 class="text-primary text-center">User Display Exercise</h3>
    <div class="row justify-content-center">
        <form action="searchUser" class="form-inline">
            <div class="form-group m-2">
                <label for="searchTerm" class="m-1">Search</label>
                <input type="text" class="form-control m-1 p-1" id="searchTerm" name="searchTerm" aria-describedby="searchTermHelp" placeholder="Enter last name">
            </div>
            <button type="submit" name="submit" value="search" class="btn btn-primary m-1">Search</button>
            <button type="submit" name="submit" value="viewAll" class="btn btn-primary m-1">View all users</button>
        </form>
    </div>
</body>
</html>