<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	      <%@ include file="/init.jsp" %>
	
	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="somedetails.css">
</head>
<body>




	<section class="some-details-about">
		<div class="main-wrapper">
			<form action="">
			<input type="hidden" name= "<portlet:namespace/>sailId" class="form-control " value="${sailId}">
				<div class="page-heading">
					<h2>Some details about you</h2>
				</div>
				<div class="row">
					<div class="col-lg-6">
						<div class="form-group">
							<label for="name">Name</label> <input type="text"
								class="form-control " id="name" value="${form.fullname}"
								placeholder="Sameer Jain">
						</div>
						<div class="form-group">
							<label for="email">Email</label> <input type="email"
								class="form-control " id="email" value="${form.emailAddress}"
								placeholder="test@test.com">
						</div>

					</div>
					<div class="col-lg-6">
						<div class="form-group">
							<label for="panNumber">PAN number</label> <input type="text"
								class="form-control " value="${form.panNumber }" id="panNumber"
								placeholder="ABCPA4848Q">
						</div>
						<div class="form-group">
							<label for="mobileNumber">Mobile Number</label> <input type="tel"
								class="form-control " id="mobileNumber" value="${form.phoneNo}"
								placeholder="9898989898">
						</div>
					</div>

				</div>
				<div class="agree-lines">
					<div class="instructions">
						<p>*You will not be able to edit mobile number and email after
							this page</p>
					</div>
					<div class="agree-terms-wrapper">
						<div class="form-group">
							<input type="checkbox" id="javascript"> <label
								for="javascript">I agree to the terms and conditions.</label>
						</div>
					</div>
					<div class="total-and-year">
						<h2>
							${form.totalAddon}<span>(incl of taxes)</span>
						</h2>
					</div>
				</div>
				<div class="buttons-row">
					<div class="buttons">
						<button class="button-same button-blue" type="submit">Make
							Payment</button>
							
	<portlet:renderURL var="BackFinalButtonURl">
		<portlet:param name="mvcRenderCommandName" value="/termInsurances" />

		<portlet:param name="sailId" value="${sailId}" />
	</portlet:renderURL>
						<a class="button-same button-white" href="${BackFinalButtonURl}">Back
						</a>
					</div>
					<div class="procced-form">
						<a href="">PROCEED TO FORM</a>
					</div>
				</div>
			</form>
		</div>
	</section>
</body>
</html>