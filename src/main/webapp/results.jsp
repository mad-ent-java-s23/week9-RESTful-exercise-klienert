<%@include file="taglib.jsp"%>
<c:set var="title" value="Your Weather" />
<%@include file="head.jsp"%>

<html>
<body>
<div class="container">
    <div class="col-sm-8 mx-auto">
        <h2 class="text-center">Weather Results</h2>
        <table id="weatherTable" class="table table-borderless w-100">
            <tbody>
                <tr>
                    <td><h2 class="text-primary">${loc.name}, ${loc.region}</h2></td>
                </tr>
                <tr>
                    <td><h4>${loc.localtime}</h4></td>
                </tr>
                <tr>
                    <td><h2>${curr.tempF} &#8457;</h2>
                    <br />
                        <span class="text-small">Feels Like ${curr.feelslike_f} &#8457;</span>
                    </td>
                </tr>
                <tr>
                    <td><image src="${cond.icon}" alt="weather icon"></image> ${cond.text}</td>
                </tr>

                <tr>
                    <td>Humidity: ${curr.humidity}%</td>
                </tr>
                <tr>
                    <td>Wind: ${curr.windMph} mph ${curr.windDir}</td>
                </tr>
            </tbody>
        </table>

        <hr>
        <a href="index.jsp">Try again?</a>
    </div>
</div>
</body>
</html>
