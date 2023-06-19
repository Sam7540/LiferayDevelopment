<%@ include file="/init.jsp" %>


<style>


.error {
  color: #F00;
}

input.error,select.error {
    color: black;
}

</style>
<%-- <%@ include file="/init.jsp" %> --%>
<%-- <%@page import="javax.portlet.RenderRequest"%> --%>
<!-- <p> -->
<!-- 	<b><liferay-ui:message key="maincontroller.caption"/></b> -->
<!-- </p> -->
 <portlet:actionURL name="saveRegister" var="saveRegisterUrl" /> 


<!-- <link rel="stylesheet" href="personaldetails.css"> -->
<!-- <script src="C:\Users\Sharad\Desktop\Safesail\view.js"/> -->



<%-- 
<%
String sailIds =  renderRequest.getParameter("sailIds");
long sailId= Long.parseLong(sailIds);
String dob = rrequest.getParameter("dob");

String fullname = rrequest.getParameter("fullname");

String gender = rrequest.getParameter("gender");

String phoneNos = rrequest.getParameter("phoneNos");
Long phoneNo = Long.parseLong(phoneNos);
String emailAddress = rrequest.getParameter("emailAddress");

String panNumber = rrequest.getParameter("panNumber");

String annualIncomes = rrequest.getParameter("annualIncomes");
Long annualIncome = Long.parseLong(annualIncomes);


%> --%>
<section class="personal-detail">
    <form  action="${saveRegisterUrl}" method="post" id="Personaldetails">
        <div class="personal-detail-heading">
            <h1>Personal Details</h1>
        </div>
    <div class="row">
        <div class="col-lg-6">

                <div class="form-group">
                  <label for="name">Full Name</label>
                  <input type="text" name="<portlet:namespace/>fullName" value="${form.fullname}" class="form-control" id="name" aria-describedby="emailHelp" placeholder="Name">
                </div>
                <div class="form-group">
                  <label for="Gender">Select Gender</label>
                    <div class="gender-wrapper">    
                        <div class="custom-control custom-radio">
                            <label for="image-check">
                                <input type="radio" id="image-check" name="<portlet:namespace/>Gender" value="Male">
                                <div class="gender-inner-wrapper">
                                    <img src="/documents/d/safe_sail/icon-awesome-male" alt="Male">
                                    <p>Male</p>
                                </div>
                            </label>
                        </div>
                        <div class="custom-control custom-radio">
                            <label for="image-check1">
                                <input type="radio" id="image-check1"  name="<portlet:namespace/>Gender" value="Female" >
                                <div class="gender-inner-wrapper">
                                    <img src="/documents/d/safe_sail/icon-awesome-female" alt="female">
                                    <p>Female</p>
                                </div>
                            </label>
                        </div>
                        <div class="custom-control custom-radio">
                            <label for="image-check2">
                                <input type="radio" id="image-check2" name="<portlet:namespace/>Gender" value="other">
                                <div class="gender-inner-wrapper">
                                    <img src="/documents/d/safe_sail/icon-awesome-genderless" alt="genderless">
                                    <p>Other</p>
                                </div>
                            </label>
                        </div>
                </div>
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail1">Email</label>
                    <input type="email" class="form-control" id="exampleInputEmail1" name="<portlet:namespace/>email" aria-describedby="emailHelp" placeholder="Enter Email">
                </div>
              
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <label for="Date">Date of birth</label>
                <input type="date" class="form-control" id="Date" min="1947-01-01" name="<portlet:namespace/>dob" aria-describedby="Date" placeholder="Select your birth date">
            </div>
            <div class="form-group">
                <label for="mobile number" class="form-label">Mobile Number</label>
                <input type="text" name="<portlet:namespace/>number"  class="form-control" id="number" placeholder="Enter 10 digit valid mobile no" maxlength="10">
            </div>
             <div class="form-group">
                <label for="pan number" class="form-label">Pan Number</label>
                <input type="text" name="<portlet:namespace/>panNumber" class="form-control" id="panNumber" placeholder="Enter Pan Number">
            </div>
            <div class="form-group">
                <label for="Income" class="form-label">Annual Income*</label>
                <div class="annual-wrapper">
                       <select class="form-control" name="<portlet:namespace/>annualIncome" >
                        <option value="">Select Annual Income*</option>
                        <option value="3"> < 3 lac</option>
                        <option value="5"> < 5 lac</option>
                        <option value="7"> < 7 lac</option>
                        <option value="10"> > 10 lac</option>
                    </select>
                </div>
              
            </div>
           
        </div>
    </div>
    <div class="agree-terms-wrapper">
        <div class="form-group">
            <input type="checkbox" id="javascript" value="true" name="<portlet:namespace/>condition"  >
            <label for="javascript">I agree to the terms and conditions.</label>
        </div>
        <a href="#">Terms and Conditions.</a>
    </div>
        <div class="form-btn-wrapper">
            <button type="submit" class="btn btn-primary proceed">Submit</button>
            <div class="product-download">
                <a href="">
                    <img src="/documents/d/safe_sail/icon-ionic-md-download" alt="">
                    Product brochure
                </a>
            </div>
        </div>
   
</form>
    </section>




 <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"> </script>

<script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.29.1/moment.min.js"></script>


<script>


$(document).ready(function() {
    $('#Personaldetails').validate({
        onfocusout: function(element) {
            this.element(element);
        },
        rules: {
        	"<portlet:namespace />fullName":{
                required: true
            },
            "<portlet:namespace />Gender": {
                required: true
            },
            "<portlet:namespace />email": {
                required: true,
                email: true
            },           
            "<portlet:namespace />dob": {
                required: true                
            },
            "<portlet:namespace />number":{
                required: true,
                minlength: 10,
                maxlength:10
            },
            "<portlet:namespace />panNumber":{
                required: true,
                minlength: 10,
                maxlength:10
            },
            "<portlet:namespace />annualIncome": {
                required: true
            },
            "<portlet:namespace />condition": {
                required: true
            }
        },
        messages: {
        	"<portlet:namespace />fullName":{
                required: "Full name Required"

            },
            "<portlet:namespace />email":{
            	email: "Enter a valid email"
            }, 
            "<portlet:namespace />dob": {
                required: "birth date is required",
                date: "Please enter a valid date format."
            },
            "<portlet:namespace />number": {
                minlength: 'enter atleast 10 digit',
                maxlength: 'enter atleast 10 digit',
                required: 'mobile number is required'
            },
            
            "<portlet:namespace />panNumber" : {
                minlength: 'enter atleast 10 digit',
                maxlength: 'enter atleast 10 digit',
                required: 'pannumber is required'
            },
            "<portlet:namespace />annualIncome":{
            	required: 'please select anual income'
            }, 
             
            "<portlet:namespace />condition": {
                required: "tearm and condition are required"
            }
        },
        submitHandler: function (form) {
            form.submit();
        }
    });
});


//for mobile number
$("#number").on("keydown", function(e) {
    var invalidChars = ["-", "+", "e","."]; //include "." if you only want integers
    if (invalidChars.includes(e.key)) {
        e.preventDefault();
    }
});

$('#Date').click(function() {
	var todayDate = new Date();
	var month = todayDate.getMonth() + 1; //04 - current month
	var year = todayDate.getUTCFullYear(); //2023 - current year
	var day = todayDate.getDate(); // 27 - current date 
	if (month < 10) {
		month = "0" + month.toString() //'0' + 4 = 04
	}

	if (day < 10) {
		day = "0" + day.toString();
	}
	var maxDate = year + "-" + month + "-" + day;

	$('#Date').attr('max', maxDate);
});
</script>



 