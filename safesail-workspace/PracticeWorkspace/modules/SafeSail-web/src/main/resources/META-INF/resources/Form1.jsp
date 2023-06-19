<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/init.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<section class="personal-detail">
    <form>
        <div class="personal-detail-heading">
            <h1>Personal Details</h1>
        </div>
    <div class="row">
        <div class="col-lg-6">

                <div class="form-group">
                  <label for="name">Full Name</label>
                  <input type="Name" class="form-control" id="name" aria-describedby="emailHelp" placeholder="Name">
                </div>
                <div class="form-group">
                  <label for="Gender">Select Gender</label>
                    <div class="gender-wrapper">    
                        <div class="custom-control custom-radio">
                            <label for="image-check">
                                <input type="radio" id="image-check" name="Gender">
                                <div class="gender-inner-wrapper">
                                    <img src="images/Icon awesome-male.svg" alt="Male">
                                    <p>Male</p>
                                </div>
                            </label>
                        </div>
                        <div class="custom-control custom-radio">
                            <label for="image-check1">
                                <input type="radio" id="image-check1"  name="Gender">
                                <div class="gender-inner-wrapper">
                                    <img src="images/Icon awesome-female.svg" alt="female">
                                    <p>Female</p>
                                </div>
                            </label>
                        </div>
                        <div class="custom-control custom-radio">
                            <label for="image-check2">
                                <input type="radio" id="image-check2" name="Gender">
                                <div class="gender-inner-wrapper">
                                    <img src="images/Icon awesome-genderless.svg" alt="genderless">
                                    <p>Other</p>
                                </div>
                            </label>
                        </div>
                </div>
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail1">Email</label>
                    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Email">
                </div>
              
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <label for="Date">Date of birth</label>
                <input type="Date" class="form-control" id="Date" aria-describedby="Date" placeholder="Select your birth date">
            </div>
            <div class="form-group">
                <label for="mobile number" class="form-label">Mobile Number</label>
                <input type="number" class="form-control" id="number" placeholder="Enter 10 digit valid mobile no">
            </div>
            <div class="form-group">
                <label for="Income" class="form-label">Annual Income*</label>
                <div class="annual-wrapper">
                    <select class="form-control">
                        <option value="">Select Annual Income*</option>
                        <option value="0">Default select2</option>
                        <option value="1">Default select3</option>
                        <option value="2">Default select4</option>
                        <option value="3">Default select5</option>
                    </select>
                </div>
              
            </div>
           
        </div>
    </div>
    <div class="agree-terms-wrapper">
        <div class="form-group">
            <input type="checkbox" id="javascript">
            <label for="javascript">I agree to the terms and conditions.</label>
        </div>
        <a href="#">Terms and Conditions.</a>
    </div>
        <div class="form-btn-wrapper">
            <button type="submit" class="btn btn-primary proceed">Submit</button>
            <div class="product-download">
                <a href="">
                    <img src="images/Icon ionic-md-download.svg" alt="">
                    Product brochure
                </a>
            </div>
        </div>
   
</form>
    </section>
</body>
</html>