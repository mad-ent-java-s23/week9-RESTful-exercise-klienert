<%@include file="head.jsp"%>
<c:set var="title" value="Search" />
<%@include file="head.jsp"%>
<html>
<body>
<div class="container-fluid">
  <h2>User Display Exercise</h2>
  <form action="searchUser" class="form-inline">
    <div class="form-group m-2">
      <label for="searchTerm">Search</label>
      <input type="text" class="form-control p-1" id="searchTerm" name="searchTerm" aria-describedby="searchTermHelp" placeholder="Enter last name">
    </div>
    <button type="submit" name="submit" value="search" class="btn btn-primary">Search</button>
    <button type="submit" name="submit" value="viewAll" class="btn btn-primary">View all users</button>
  </form>
</div>
</body>
</html>