<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/init.jsp"%>

<portlet:actionURL name="saveInsurance" var="saveInsuranceUrl" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="terminsurance.css">
</head>
<body>
	<section class="term-insutance">
		<portlet:renderURL var="BackButtonsURl">
			<portlet:param name="mvcRenderCommandName" value="/incomeDetail" />

			<portlet:param name="sailId" value="${sailId}" />
		</portlet:renderURL>
		<form action="${saveInsuranceUrl}" method="post">
			<input type="hidden" name="<portlet:namespace/>sailId"
				class="form-control " value="${sailId}"> <input
				type="hidden" name="<portlet:namespace/>totalValues"
				id="totalValues" class="form-control " value="${form.totalValues}">
			<div class="term-insutance__benefits">
				<div class="term-insurance__heading">
					<h2>Enhance your term insurance cover with add-on benefits</h2>
				</div>
				<div class="term-insurance__card__wrapper">
					<div class="term-insurance__body">
						<div class="term-insurance__img__wrapper">
							<div class="term-insurance__img__inner__wrapper">
								<div class="term-insurance__img">
									<img src="/documents/d/safe_sail/icon-metro-user-md" alt="">
								</div>
								<div class="term-insurance__name__wrapper">
									<h3>Life Secure</h3>
									<p>708/Year</p>
								</div>
							</div>
							<div class="term-insurance__toggle-btn">
								<label class="switch switch200"> <input type="checkbox"
									value="708" id="lifeSecure"
									name="<portlet:namespace/>lifeSecure"
									<c:if test="${(form.lifeSecure) gt 0}">checked</c:if>>
									<span class="slider slider200"></span>
								</label>
							</div>
						</div>
						<div class="term-insurance__quote">
							<p>Get future premiums waived off in case of total and
								permanent disability</p>
						</div>
					</div>
					<div class="term-insurance__body">
						<div class="term-insurance__img__wrapper">
							<div class="term-insurance__img__inner__wrapper">
								<div class="term-insurance__img">
											<img src="/documents/d/safe_sail/icon-metro-user-md" alt="">

								</div>
								<div class="term-insurance__name__wrapper">
									<h3>Life Plus</h3>
									<p>2,950/Year</p>
								</div>
							</div>
							<div class="term-insurance__toggle-btn">
								<label class="switch switch200"> <input type="checkbox"
									value="2950" id="lifeplus" name="<portlet:namespace/>lifePlus"
									<c:if test="${(form.lifePlus) gt 0}">checked</c:if>> <span
									class="slider slider200"></span>
								</label>
							</div>
						</div>
						<div class="term-insurance__quote">
							<p>Receive an additional cover up to 1 Cr in case of
								accidental death.</p>
						</div>
					</div>
					<div class="term-insurance__body">
						<div class="term-insurance__img__wrapper">
							<div class="term-insurance__img__inner__wrapper">
								<div class="term-insurance__img">
											<img src="/documents/d/safe_sail/icon-metro-user-md" alt="">

								</div>
								<div class="term-insurance__name__wrapper">
									<h3>Critical Illness Plus Benefit</h3>
									<p>5,340/Year</p>
								</div>
							</div>
							<div class="term-insurance__toggle-btn">
								<label class="switch switch200"> <input type="checkbox"
									value="5340" id="CIPBenefit"
									name="<portlet:namespace/>criticalBenefit"
									<c:if test="${(form.CIPBenefit) gt 0}">checked</c:if>>
									<span class="slider slider200"></span>
								</label>
							</div>
						</div>
						<div class="term-insurance__quote">
							<p>Safeguard yourself against 37 critical illnesses</p>
						</div>
					</div>
				</div>
				<div class="term-insurance__premium">
					<div class="term-insurance__premium__wrapper">
						<h2>Total Premium</h2>
						<div class="term-insurance__amount">
							<p style="display:inline;" id="totalAddonValue">${form.totalValues}</p>
							<p style="display:inline;" id="totalAddonValues">${form.totalAddon}</p>
							<c:choose>
								<c:when test="${form.getPaymentFrequency().contains('Annually') }">
									<p style="display:inline;">/Year</p>
								</c:when>
								<c:otherwise>
									<p style="display:inline;">/Month</p>
								</c:otherwise>
							</c:choose>
							<input type="hidden" name="<portlet:namespace/>TotalAddon"
								value="" id="totalAddon"> <span>(incl of taxes)</span>
						</div>
					</div>

				</div>
				<div class="term-insurance__btn__group__wrapper">
					<div class="buttons">
						<!--   <div class="primary-btn-wrapper">
                        <a href="#">Proceed</a>
                    </div> -->
						<%-- <div class="primary-btn-wrapper">
							<button class="button-same button-blue" type="submit">Proceed</button>

						</div>

						<div class="secondary-btn-wrapper">
							<a href="${BackButtonsURl}">Back</a>
						</div> --%>
						<button class="button-same button-blue" type="submit">Proceed</button>
						<a class="button-same button-white" href="${BackButtonsURl}">Back</a>
					</div>
					<div class="term-insurance__donwload__brochure">
						<div class="product-download">
							<a href=""> <img src="images/Icon ionic-md-download.svg"
								alt=""> Product brochure
							</a>
						</div>
						<a href="#">Terms and Conditions.</a>

					</div>
				</div>
			</div>
		</form>
	</section>
</body>
</html>



<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/jquery.validate.min.js"
	integrity="sha512-rstIgDs0xPgmG6RX1Aba4KV5cWJbAMcvRCVmglpam9SoHZiUCyQVDdH2LPlxoHtrv17XWblE/V/PP+Tr04hbtA=="
	crossorigin="anonymous" referrerpolicy="no-referrer">
	
</script>

<script>

	var AllPrices = $("#totalValues").val();
var price= parseInt(AllPrices);

$(document).ready(function(){
	$("#totalAddonValues").attr("hidden", true);

});

$("#CIPBenefit").click(function() {
	$("#totalAddonValues").attr("hidden", false);
		var CIPBenefit = $("#CIPBenefit").val();
		CIPBenefit = parseInt(CIPBenefit);

		/*  var lifeplus=$("#lifeplus").val();
		 var lifeSecure = $("#lifeSecure").val();
		 */

		if(AllPrices.length == 4){
			CIPBenefit=CIPBenefit /12;
			
			}
		var totalAddonValues = CIPBenefit + price;
		 if (!$(this).is(':checked')) {
			 totalAddonValues =   price- CIPBenefit;
			 if(AllPrices.length == 4){
					price=price /12;
					}
				
			
		    }else{
		    	$("#totalAddonValue").remove();
		    }
		 

		price = totalAddonValues;

		$("#totalAddon").val(totalAddonValues);

		$("#totalAddonValues").text(totalAddonValues);

	});



	$("#lifeplus").click(function() {
		$("#totalAddonValues").attr("hidden", false);
		$("#totalAddon").val(0);
		$("#totalAddonValues").text(0);

		var lifeplus = $("#lifeplus").val();

		lifeplus = parseInt(lifeplus);

		/*  
		 */

		if(AllPrices.length == 4){
			lifeplus=Math.ceil(lifeplus /12);
			
			}
		 var totalAddonValues = lifeplus  + price;
		 if (!$(this).is(':checked')) {
			 totalAddonValues =  price- lifeplus;
			 if(AllPrices.length == 4){
					price=price /12;
					}
				
			
		    }
		 else{
			 $("#totalAddonValue").remove();
		 }
		price = totalAddonValues;

		
		$("#totalAddon").val(totalAddonValues);

		$("#totalAddonValues").text(totalAddonValues);

	});

	$("#lifeSecure").click(function() {
		$("#totalAddonValues").attr("hidden", false);
		$("#totalAddon").val(0);
		$("#totalAddonValues").text(0);

		var lifeSecure = $("#lifeSecure").val();

		lifeSecure = parseInt(lifeSecure);
		
		/*  var lifeplus=$("#lifeplus").val();
		 var lifeSecure = $("#lifeSecure").val();
		 */
		 
		 
		if(AllPrices.length == 4){
			lifeSecure=lifeSecure /12;
			
			}
		 var totalAddonValues = lifeSecure  + price;
		 if (!$(this).is(':checked')) {
			 totalAddonValues = price- lifeSecure;
			 if(AllPrices.length == 4){
					price=price /12;
					}
				
			 
		    }	
		 
		 else{
			 $("#totalAddonValue").remove();
		 }
		 price = totalAddonValues;

		$("#totalAddon").val(totalAddonValues);

		$("#totalAddonValues").text(totalAddonValues);

	});
</script>