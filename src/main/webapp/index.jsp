<%@include file="head.jsp"%>

<html>
<body>
<div class="container">
<%--    <h2 class="text-center"> Simple Java Weather App</h2>--%>
<%--    <form action="searchZip" class="form-inline">--%>
<%--        <div class="form-group p-2">--%>
<%--            <label for="zipcode" class="m-1 p-1">Get Weather!</label>--%>
<%--            <input type="text" class="form-control" id="zipcode" name="zipcode"--%>
<%--                    aria-describedby="searchZipcodeHelp" placeholder="Enter Zipcode">--%>
<%--        </div>--%>
<%--        <button type="submit" name="submit" value="search" class="btn btn-primary m-2">Get Weather</button>--%>
<%--    </form>--%>
<%--    <hr>--%>
    <h2 class="text-center">SWAPI Planets</h2>

    <form action="searchPlanet" class="form-inline">
        <div class="form-group p-2">
            <label for="planetSearch" class="m-1 p-1">Find a Planet</label>
            <input type="text" class="form-control" id="planetSearch" name="planetSearch"
                    aria-describedby="searchSWPlanetsHelp" placeholder="Enter an ID number">
        </div>
        <button type="submit" name="submit" value="search" class="btn btn-primary m-2">Get Planets!</button>
    </form>

</div>

</body>
</html>
