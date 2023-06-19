<%@page import="javax.portlet.RenderRequest"%>
<%@ include file="/init.jsp"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>


<portlet:actionURL name="updateRegister" var="saveRegisterUrl" />


<link rel="stylesheet" href="personaldetails.css">



<section class="personal-detail">
	<form action="${saveRegisterUrl}" method="post">
	            <input type="hidden" name= "<portlet:namespace/>sailId" class="form-control " value="${form.sailId}">
	
		<div class="personal-detail-heading">
			<h1>Personal Details</h1>
		</div>
		<div class="row">
			<div class="col-lg-6">

				<div class="form-group">
					<label for="name">Full Name</label> <input type="Name"
						name="<portlet:namespace/>fullName" value="${form.fullname}"
						class="form-control" id="name" aria-describedby="emailHelp"
						placeholder="Name">
				</div>
				<div class="form-group">
					<label for="Gender">Select Gender</label>
					<div class="gender-wrapper">
						<div class="custom-control custom-radio">
							<label for="image-check"> <input type="radio"
								id="image-check" name="<portlet:namespace/>Gender" value="Male"
								<c:if test="${form.gender.contains('Male')}">checked</c:if>>
								<div class="gender-inner-wrapper">
									<img src="images/Icon awesome-male.svg" alt="Male">
									<p>Male</p>
								</div>
							</label>
						</div>
						<div class="custom-control custom-radio">
							<label for="image-check1"> <input type="radio"
								id="image-check1" name="<portlet:namespace/>Gender"
								value="Female"
								<c:if test="${form.gender.contains('Female')}">checked</c:if>>
								<div class="gender-inner-wrapper">
									<img src="images/Icon awesome-female.svg" alt="female">
									<p>Female</p>
								</div>
							</label>
						</div>
						<div class="custom-control custom-radio">
							<label for="image-check2"> <input type="radio"
								id="image-check2" name="<portlet:namespace/>Gender"
								value="other"
								<c:if test="${form.gender.contains('other')}">checked</c:if>>
								<div class="gender-inner-wrapper">
									<img src="images/Icon awesome-genderless.svg" alt="genderless">
									<p>Other</p>
								</div>
							</label>
						</div>
					</div>
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">Email</label> <input type="email"
						class="form-control" id="exampleInputEmail1"
						name="<portlet:namespace/>email" value="${form.emailAddress}"
						aria-describedby="emailHelp" placeholder="Enter Email">
				</div>

			</div>
			<div class="col-lg-6">
				<div class="form-group">
					<label for="Date">Date of birth</label> 
					<p id="${form.dob}" class="myDate"></p> 
					<input type="Date"
						class="form-control" id="Date" name="<portlet:namespace/>dob"
						value="${form.dob}" aria-describedby="Date"
						placeholder="Select your birth date">
				</div>
				<div class="form-group">
					<label for="mobile number" class="form-label">Mobile Number</label>
					<input type="number" name="<portlet:namespace/>number"
						class="form-control" id="number" value="${form.phoneNo}"
						placeholder="Enter 10 digit valid mobile no">
				</div>
				<div class="form-group">
					<label for="pan number" class="form-label">Pan Number</label> <input
						type="text" name="<portlet:namespace/>panNumber"
						class="form-control" id="panNumber" value="${form.panNumber}"
						placeholder="Enter Pan Number">
				</div>
				<div class="form-group">
					<label for="Income" class="form-label">Annual Income*</label>
					<div class="annual-wrapper">
						<select class="form-control"
							name="<portlet:namespace/>annualIncome">
							<option value="">Select Annual Income*</option>
							<option value="3"
								<c:if test = "${(form.annualIncome) == 3}">selected</c:if>> < 3 lac</option>



							<option value="5"
								<c:if test = "${(form.annualIncome) == 5}">selected</c:if>> < 5 lac</option>
							<option value="7"
								<c:if test = "${(form.annualIncome) == 7}">selected</c:if>> < 7 lac</option>
							<option value="10"
								<c:if test = "${(form.annualIncome) == 10}">selected</c:if>> > 10 lac</option>





						</select>
					</div>
				</div>
			</div>
		</div>
		<div class="agree-terms-wrapper">
			<div class="form-group">
				<input type="checkbox" id="javascript" value="true"
					name="condition<portlet:namespace/>"> <label
					for="javascript">I agree to the terms and conditions.</label>
			</div>
			<a href="#">Terms and Conditions.</a>
		</div>
		<div class="form-btn-wrapper">
			<button type="submit" class="btn btn-primary proceed">Submit</button>
			<div class="product-download">
				<a href=""> <img src="images/Icon ionic-md-download.svg" alt="">
					Product brochure
				</a>
			</div>
		</div>

	</form>
</section>

<script>

$(document).ready(function() {
	var myDate = $('.myDate').attr('id');
  	const myArray = myDate.split(" ");
  	var months1=myArray[1].toLowerCase();
  	var months = ["jan", "feb", "mar", "apr", "may", 
  "jun", "jul", "aug", "sep", "oct", "nov", "dec"];
  	var month1 = months.indexOf(months1)+1;
  	month1=month1.toString();
  	if(month1.length == 1){
  		month1="0"+month1
  	}
  	date=myArray[5] +"-"+month1+"-"+myArray[2];
  	$("#Date").val(date) ;
  }); 
</script>