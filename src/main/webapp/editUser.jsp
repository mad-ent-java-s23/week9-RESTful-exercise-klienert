<%--
  Created by IntelliJ IDEA.
  User: keithlienert
  Date: 2/25/23
  Time: 9:46 AM
  To change this template use File | Settings | File Templates.
--%>

<%@include file="taglib.jsp"%>
<c:set var="title" value="Add/Edit User" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@include file="head.jsp"%>

<body>
    <div class="container-fluid">
        <h2>Add/Edit User</h2><br />
        <form id="editUserForm" role="form" data-toggle="validator"
              class="form-horizontal"
              action="editUser"
              method="POST">

            <input type="hidden" id="id"
                   name="id"
                   value = ${user.id}>

            <div class="form-group">
                <label class="control-label col-sm-2" for="firstName">First Name</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="firstName"
                           name="firstName"
                           value = "${user.firstName}"
                           data-error="Please enter the user's first name." required>
                </div>
                <div class="help-block with-errors"></div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="lastName">Last Name</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="lastName"
                           name="lastName"
                           value = "${user.lastName}"
                           data-error="Please enter the user's last name."
                           required>
                </div>
                <div class="help-block with-errors"></div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="userName">Username</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="userName"
                           name="userName"
                           value = "${user.userName}"
                           data-error="Please enter the username."
                           required>
                </div>
                <div class="help-block with-errors"></div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="dateOfBirth">Date Of Birth</label>
                <div class="col-sm-4">
                    <div class="input-group date" data-provide="datepicker">
                        <input type="text" class="form-control" id="dateOfBirth" name="dateOfBirth"
                               value = "${user.dateOfBirthForDisplay}" data-error="Please enter the user's date of birth"
                               required>
                        <div class="input-group-addon">
                            <span class="glyphicon glyphicon-th"></span>
                        </div>
                    </div>
                    <div class="help-block with-errors"></div>
                </div>
            </div>

            <button type="submit" class="btn btn-default col-sm-offset-3"
                    data-disable="true">Add
            </button>
            <button type="reset" class="btn btn-default">Clear</button>
            <a href ="searchUser?searchTerm=&submit=viewAll"><button type="button" class="btn btn-default">Cancel</button></a>
        </form>

    </div>
</body>
</html>
