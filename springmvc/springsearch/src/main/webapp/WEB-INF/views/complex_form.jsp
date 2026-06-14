<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>

<meta charset="UTF-8">
<meta name="viewport"
content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Complex Form</title>
<link rel="stylesheet"
href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

</head>

<body style="background:#e2e2e2;">

<div class="container mt-4">

    <div class="row">

        <div class="col-md-6 offset-md-2">

            <div class="card">

                <div class="card-body">

                    <h3 class="text-center">
                        Complex Form
                    </h3>
<div class="alert alert-danger" role="alert">
  <form:errors path="student.*"/>
</div>
                    <form action="handleform" method="post">

                        <!-- Name -->

                        <div class="form-group">

                            <label for="name">
                                Your name
                            </label>

                            <input
                            name="name"
                            type="text"
                            class="form-control"
                            id="name"
                            placeholder="Enter Name">

                            <small class="form-text text-muted">
                                We'll never share your name with anyone else.
                            </small>

                        </div>

                        <!-- ID -->

                        <div class="form-group">

                            <label for="id">
                                Your id
                            </label>

                            <input
                            name="id"
                            type="text"
                            class="form-control"
                            id="id"
                            placeholder="Enter ID">

                        </div>

                        <!-- DOB -->

                        <div class="form-group">

                            <label for="dob">
                                Your DOB
                            </label>

                            <input
                            name="dob"
                            type="date"
                            class="form-control"
                            id="dob"
                            placeholder="dd/mm/yy">

                        </div>

                        <!-- Courses -->

                        <div class="form-group">

                            <label for="courses">
                                Example Course
                            </label>

                            <select
                            multiple
                            class="form-control"
                            id="exampleFormControlSelect1"
                            name="courses" multiple>

                                <option>Java</option>
                                <option>Python</option>
                                <option>C++</option>
                                <option>Django</option>
                                <option>Spring Framework</option>

                            </select>

                        </div>

                        <!-- Gender -->

                        <div class="form-group">

                            <span class="mr-3">
                                Select Gender
                            </span>

                            <div class="form-check form-check-inline">

                                <input
                                class="form-check-input"
                                type="radio"
                                name="gender"
                                value="male"
                                id="male">

                                <label
                                class="form-check-label"
                                for="male">

                                    Male

                                </label>

                            </div>

                            <div class="form-check form-check-inline">

                                <input
                                class="form-check-input"
                                type="radio"
                                name="gender"
                                value="female"
                                id="female">

                                <label
                                class="form-check-label"
                                for="female">

                                    Female

                                </label>

                            </div>

                        </div>

                        <!-- Student Type -->

                        <div class="form-group">

                            <label for="type">
                                Select Type
                            </label>

                            <select
                            class="form-control"
                            name="type"
                            id="type">

                                <option value="oldstudent">
                                    Old Student
                                </option>

                                <option value="normalstudent">
                                    Normal Student
                                </option>

                            </select>

                        </div>

                        <div class="card">
                        <div class="card-body"></div>
                        <p style="text-align:center"> Your Address</p>
                        <input name="address.street" type ="text" class="form-control" placeholder="Enter street">
                        <input name="address.city" type ="text" class="form-control" placeholder="Enter city">
                        </div>
                        <!-- Submit -->

                        <div class="container text-center">

                            <button class="btn btn-primary">
                                Submit
                            </button>

                        </div>

                    </form>

                </div>

            </div>

        </div>

    </div>

</div>

</body>
</html>