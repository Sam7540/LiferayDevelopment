<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="/init.jsp" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>  
    
    
    
    
<portlet:actionURL name="saveIncome" var="saveIncomeUrl" />



    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="incomedetails.css">

</head>
<body>


<%--
 <portlet:renderURL var="BackButtonURl">
	           
			<portlet:param name="sailIds" value="${sailId}"/>
            
            <portlet:param name="fullname" value="${forms.fullname}"/>
            <portlet:param name="dob" value="${forms.dob}"/>
            <portlet:param name="gender" value="${forms.gender}"/>
            <portlet:param name="phoneNos" value="${forms.phoneNo}"/>
            <portlet:param name="emailAddress" value="${forms.emailAddress}"/>
            <portlet:param name="panNumber" value="${forms.panNumber}"/>
            <portlet:param name="annualIncomes" value="${forms.annualIncome}"/>
             <portlet:param name="mvcRenderCommandName" value="/personalDetail"/>
        </portlet:renderURL> --%>
        
         <portlet:renderURL var="BackButtonURl">
                     <portlet:param name="mvcRenderCommandName" value="/personalDetail"/>
       
			<portlet:param name="sailId" value="${sailId}"/>
       
       
        </portlet:renderURL> 
        
        
        
        
        
 <section class="income-details-wrappr">
        <div class="main-wrapper">
            <form action="${saveIncomeUrl}" method="post" id="IncomeDetail" >
            <input type="hidden" name= "<portlet:namespace/>sailId" class="form-control " value="${sailId}">
            
                <div class="income-detail-header">
                    <h2>Income Details</h2>
                    <ul>
                        <li>${form.fullname}</li>
                        <li>
                        <fmt:formatDate value="${form.dob}" pattern="dd-MM-yyyy" /></li>
                        <li>${form.gender}</li>
                        <li><a href="${BackButtonURl}"><img src="./image/icon-feather-edit-2.svg" alt="">Edit</a></li>
                    </ul>
                </div>

                <div class="row">
                    <div class="col-lg-6 income-details">
                        <div class="form-group">
                            <label for="sumAssured">Sum Assured</label>
                            <input type="number" name= "<portlet:namespace/>sumAssured" disabled class="form-control" value="${form.sumAssured}" id="sumAssured" placeholder="50,00,000">
                        </div>
                        <div class="form-group">
                            <label for="premiumPayingTerm">Premium paying term(Years)</label>
                            <input type="number" name="<portlet:namespace/>premiumPaying"  class="form-control" value="${form.PPTerm }" id="premiumPayingTerm" placeholder="27">
                        </div>
                        <div class="form-group">
                           <%--  <label for="payoutOption">Payout option</label>
                            <select id="payoutOption" name="<portlet:namespace/>payout" class="form-control">
                            <option value="Immediate Payout"
								<c:if test= "${(form.payoutOption).equalsIgnoreCase('Immediate Payout')}">selected</c:if>>Immediate Payout</option>
								<option value="Immediate Payout2"
								<c:if test= "${(form.payoutOption).equalsIgnoreCase('Immediate Payout2')}">selected</c:if>>Immediate Payout2</option>
                                 
                            </select> --%>
                            
                            
                            
                            <label for="payoutOption">Payout option</label>
                            <select id="payoutOption" name="<portlet:namespace/>payout" class="form-control">
                             <option value="">Select Payout Option</option>
                            <option value="Immediate Payout"
								<c:if test= "${(form.payoutOption).equalsIgnoreCase('Immediate Payout')}">selected</c:if>>Immediate Payout</option>
								<option value="Level Recurring Payout"
								<c:if test= "${(form.payoutOption).equalsIgnoreCase('Level Recurring Payout')}">selected</c:if>>Level Recurring Payout</option>
                                <option value="Increasing Recurring Payout"
								<c:if test= "${(form.payoutOption).equalsIgnoreCase('Increasing Recurring Payout')}">selected</c:if>>Increasing Recurring Payout</option> 
                            </select>
                        </div>

                        <div class="download-icon">
                            <a href=""><img src="/documents/d/guest/icon-ionic-md-download" alt="">Product brochure</a>
                        </div>
                        <div class="terms-conditions">
                            <a href="">Terms and Conditions.</a>
                        </div>
                    </div>

                    <div class="col-lg-6 income-details income-details-second">

                        <div class="form-group">
                            <%-- <label for="policyTerm">Policy term</label>
                            <select id="policyTerm" name="<portlet:namespace/>policyTerm" class="form-control ">
                            <option value="27"
								<c:if test = "${(form.policyTerm) == 27}">selected</c:if>>27</option>
                                <option value="30"
								<c:if test = "${(form.policyTerm) == 30}">selected</c:if>>30</option>
								</select> --%>
                                
                                
                                <label for="policyTerm">Policy term</label>
                            <select id="policyTerm" name="<portlet:namespace/>policyTerm" class="form-control ">
                            <option value="">Select Policy Term</option>
                            <option value="10"
								<c:if test = "${(form.policyTerm) == 10}">selected</c:if>>5-10</option>
                                <option value="20"
								<c:if test = "${(form.policyTerm) == 15}">selected</c:if>>10-20</option>
                                <option value="30"
								<c:if test = "${(form.policyTerm) == 10}">selected</c:if>>20-30</option>
                                <option value="40"
								<c:if test = "${(form.policyTerm) == 10}">selected</c:if>>30-40</option>
                                <option value="50"
								<c:if test = "${(form.policyTerm) == 10}">selected</c:if>>40-50</option>
                            
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="paymentFrequency">Payment frequency</label>
                            <select id="paymentFrequency" name="<portlet:namespace/>paymentFreq" class="form-control">
                            <option value="">Select Payment frequency</option>
                            <option value="Annually"
								<c:if test= "${(form.paymentFrequency).equalsIgnoreCase('Annually')}">selected</c:if>>Annually</option>
                              <option value="Monthly"
								<c:if test= "${(form.paymentFrequency).equalsIgnoreCase('Monthly')}">selected</c:if>>Monthly</option> 
                               
                            </select>
                        </div>

                        <div class="existing-customer">
                            <h3>Existing Customer?<span>(Get Discount)</span></h3>
                        </div>
                        <div class="discount">
                            <h5>Online Discount(8%)</h5>
                            <div class="discount-price">
                                <h6 id="cancelPrice">${form.totalValues * 0.8 }</h6 ><span id="discountPrice">${totalValues}</span><span id="RemoveddiscountPrice">${totalValues}</span>
                                <p>(saved 2116)</p>
                            </div>
                        </div>
                        <div class="total-premium">
                            <h5>Total Premium</h5>
                            <div class="discount-price">
<%--                             <input type="number" name="<portlet:namespace/>TotalPayment"  value="" id="totalPayment" placeholder="27">
--%>   
                             <input type="hidden" name="<portlet:namespace/>TotalPayment"  value="" id="totalPayment" >
                        	 	<h3 id="Removeprice">${totalValues}</h3>   
  								 <h3 id="price">${totalValues}</h3>   
                                <p>(incl of taxes)</p>
                            </div>
                        </div>
                        <div class="buttons">
                            <button class="button-same button-blue" type="submit">Proceed</button>
                              <a class="button-same button-white" href="${BackButtonURl}">Back </a>
                        </div>
                    </div>
                </div>
            </form>
<!--             <button class="button-same button-white" type="submit">Back </button>
 -->        </div>
    </section>
</body>
</html>







<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/jquery.validate.min.js"
		integrity="sha512-rstIgDs0xPgmG6RX1Aba4KV5cWJbAMcvRCVmglpam9SoHZiUCyQVDdH2LPlxoHtrv17XWblE/V/PP+Tr04hbtA=="
		crossorigin="anonymous" referrerpolicy="no-referrer">
</script>


<script>

$('#policyTerm').blur(function(){

    var policyTerm=$("#policyTerm").val();
    $("#premiumPayingTerm").val(policyTerm);

	});	 
 



$("#paymentFrequency").blur(function(){

     var sumAssured = $("#sumAssured").val();
     var premiumPayingTerm=$("#policyTerm").val();
     var paymentFrequency = $("#paymentFrequency").val(); 
    var premium = sumAssured*0.1;
      var premiumAfterFreq=0;
     if(paymentFrequency == "Monthly"){
         premiumAfterFreq = premium/12;
     }
     else{
          premiumAfterFreq = premium;
        }
        
        var totalPremium = Math.ceil(premiumAfterFreq/premiumPayingTerm);
        $("#cancelPrice").text(totalPremium);
        
       var  premiumAfterDiscount =Math.ceil(totalPremium -(0.08*totalPremium));
       $("#RemoveddiscountPrice").remove();  
       $("#Removeprice").remove();  
       $("#discountPrice").text(premiumAfterDiscount);
       $("#price").text(premiumAfterDiscount);

       $("#totalPayment").val(premiumAfterDiscount);

	
});


</script>


<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"> </script>
<script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.29.1/moment.min.js"></script>
   

<script>
    
  
    $("#IncomeDetail").validate({
    	onfocusout: function(element) {
            this.element(element);
        },
        rules:{
           
            "<portlet:namespace/>payout":{
                required: true,
            },
            "<portlet:namespace/>policyTerm":{
                required: true,
            },
            "<portlet:namespace/>paymentFreq":{
                required: true,
            },
           
        },
      
        submitHandler: function(form){
            form.submit();
        }
 
  });
    
    
    $(".preventE").on("keydown", function(e) {
        var invalidChars = ["-", "+", "e","."]; //include "." if you only want integers
        if (invalidChars.includes(e.key)) {
            e.preventDefault();
        }
    });
    </script>