<%@page import="com.liferay.portal.kernel.model.Contact"%>
<%@page import="com.liferay.portal.kernel.service.ContactLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Phone"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ include file="/init.jsp" %>

<!-- <p>
	<b><liferay-ui:message key="profile.caption"/></b>
</p>
 -->
 <%
 	//ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
 	User currentUser = themeDisplay.getUser();
 	List<Phone> userMobiles = currentUser.getPhones();
 	//Contact contact = ContactLocalServiceUtil.getContact(currentUser.getContactId());
 
 %>
 
<section class="user-profile">
        <form>
            <div class="user-profile__detail-wrapper">
                <div class="user-profile__Img__wrapper">
                    
										<%-- <img src="${themeDisplay.getPathThemeImages()}/user-img.png" alt=""> --%>
										<img id="profile" src="<%=themeDisplay.getUser().getPortraitURL(themeDisplay)%>" alt="">
                    <div class="user-profile__name__wrapper">
                        <h1><%=currentUser.getFullName()%></h1>
                        <div class="user-profile__completion">
                            <p>Profile completion :</p>
                            <span> 60%</span>
                        </div>
                    </div>
                </div>
            </div>
            <div class="user-profile__tab__wrapper">
                <ul class="nav nav-pills mb-3" id="pills-tab" role="tablist">
                    <li class="nav-item">
                      <a class="nav-link active" id="pills-home-tab" data-toggle="pill" href="#pills-home" role="tab" aria-controls="pills-home" aria-selected="true">Personal Details</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" id="pills-profile-tab" data-toggle="pill" href="#pills-profile" role="tab" aria-controls="pills-profile" aria-selected="false">Contact Details</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" id="pills-contact-tab" data-toggle="pill" href="#pills-contact" role="tab" aria-controls="pills-contact" aria-selected="false">Family Details</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" id="pills-contact-tab" data-toggle="pill" href="#pills-Assets" role="tab" aria-controls="pills-contact" aria-selected="false">Assets</a>
                      </li>
                  </ul>
                  <div class="tab-content" id="pills-tabContent">
                    <div class="tab-pane fade show active" id="pills-home" role="tabpanel" aria-labelledby="pills-home-tab">

                        <div class="personal-detail-wrapper">
                            <div class="row">
                                <div class="col-lg-6">
                                    <div class="form-group">
                                        <label for="fname">Full Name</label>
                                        <input value="<%=currentUser.getFullName()%>" type="fname" class="form-control" id="fname" aria-describedby="name" placeholder="Sameer Jain">
                                      </div>
                                      <div class="form-group">
                                        <label for="Email">Email</label>
                                        <input value="<%=currentUser.getEmailAddress() %>" type="Name" class="form-control" id="Email" aria-describedby="Email" placeholder="test@test.com">
                                      </div>
                                      <div class="form-group">
                                        <label for="PAN">PAN Number</label>
                                        <input  type="text" class="form-control" id="PAN" aria-describedby="PAN">
                                      </div>
                                      <div class="form-group">
                                        <label for="Income" class="form-label">Annual Income</label>
                                        <div class="annual-wrapper">
                                            <select class="form-control">
                                                <option value="">Select Annual Income</option>
                                                <option value="0">1-3 lacs</option>
                                                <option value="1">3-5 lacs</option>
                                                <option value="2">5-7 lacs</option>
                                                <option value="3">7-10 lacs</option>
                                                <option value="4">>10 lacs</option>
                                            </select>
                                        </div>
                                        
                                      
                                    </div>
                                    <div class="form-group">
                                        <label for="city" class="form-label">City</label>
                                        <div class="city-wrapper">
                                            <select class="form-control">
                                                <option value="">Ahmedabad</option>
                                                <option value="0">Vadodra</option>
                                                <option value="1">Surat</option>
                                                <!-- <option value="2">Default select4</option>
                                                <option value="3">Default select5</option> -->
                                            </select>
                                        </div>
                                      
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="form-group">
                                        <label for="mobile number" class="form-label">Mobile Number</label>
                                        <input value="<%=userMobiles.get(0).getNumber() %>" type="number" class="form-control" id="number" placeholder="Enter 10 digit valid mobile no">
                                    </div>
                                    <div class="form-group">
                                        <label for="DateBirth">Date of birth</label>
                                        <input  type="Date" class="form-control" id="DateBirth" aria-describedby="Date" placeholder="Select your birth date" value="<fmt:formatDate value="<%=contact.getBirthday()%>"  pattern="yyyy-MM-dd" />" >
                                    </div>
                                    <div class="form-group">
                                        <label for="Marital-status" class="form-label">Marital Status</label>
                                        <div class="Marital-status-wrapper">
                                            <select class="form-control">
                                                <option value="">Single</option>
                                                <option value="0">Married</option>
                                                <!-- <option value="1">Default select3</option>
                                                <option value="2">Default select4</option>
                                                <option value="3">Default select5</option> -->
                                            </select>
                                        </div>
                                      
                                    </div>
                                    <div class="form-group">
                                        <label for="Gender">Select Gender</label>
                                          <div class="gender-wrapper">    
                                              <div class="custom-control custom-radio">
                                                  <label for="image-check3">
                                                      <input type="radio" id="image-check3" name="Gender">
                                                      <div class="gender-inner-wrapper">
                                                          <img src="${themeDisplay.getPathThemeImages()}/Icon awesome-male.svg" alt="Male">
                                                          <p>Male</p>
                                                      </div>
                                                  </label>
                                              </div>
                                              <div class="custom-control custom-radio">
                                                  <label for="image-check4">
                                                      <input type="radio" id="image-check4" name="Gender">
                                                      <div class="gender-inner-wrapper">
                                                          <img src="${themeDisplay.getPathThemeImages()}/Icon awesome-female.svg" alt="female">
                                                          <p>Female</p>
                                                      </div>
                                                  </label>
                                              </div>
                                              <div class="custom-control custom-radio">
                                                  <label for="image-check5">
                                                      <input type="radio" id="image-check5" name="Gender">
                                                      <div class="gender-inner-wrapper">
                                                          <img src="${themeDisplay.getPathThemeImages()}/Icon awesome-genderless.svg" alt="genderless">
                                                          <p>Other</p>
                                                      </div>
                                                  </label>
                                              </div>
                                      </div>
                                      </div>
                                </div>
                            </div>
                            <div class="buttons">
                                <!-- <div class="">
                                    
                                </div> -->
                                <a class="button-same button-blue" href="#">Save Details</a>
                            </div>
                        </div>
                        
                    </div>
                    <div class="tab-pane fade" id="pills-profile" role="tabpanel" aria-labelledby="pills-profile-tab">
                    	<div class="form-group"> <label for="Address">Address</label> 
			               <textarea class="form-control" id="Address" aria-describedby="Address" style="height: 150px;width: 400px;">${address}</textarea> 
			            </div>
                    </div>
                    <div class="tab-pane fade" id="pills-contact" role="tabpanel" aria-labelledby="pills-contact-tab">Family Details</div>
                    <div class="tab-pane fade" id="pills-Assets" role="tabpanel" aria-labelledby="pills-Assets-tab">Assets</div>
                    
                </div>
            </div>
        </form>
    </section>

<style>
 #profile{
 	width: 60px;
    height: 60px;
    border-radius: 50%;
 }
    .user-profile {
    padding: 0 100px;
}
input::-webkit-outer-spin-button,
input::-webkit-inner-spin-button {
  -webkit-appearance: none;
  margin: 0;
}
input[type=number] {
  -moz-appearance: textfield;
}
input[type="date"]::-webkit-inner-spin-button,
input[type="date"]::-webkit-calendar-picker-indicator {
    display: none;
    -webkit-appearance: none;
}
.user-profile form {
    background: #FFFFFF 0% 0% no-repeat padding-box;
    box-shadow: 0px 3px 6px #00000029;
    padding: 70px;
    margin: 70px 0px;
}
.user-profile__Img__wrapper {
    display: flex;
    align-items: center;
    gap: 30px;
    flex-wrap: wrap;
}
.user-profile__name__wrapper h1 {
    letter-spacing: 0px;
    color: #15658D;
    font-size: 20px;
    font-weight: bold;
    margin-bottom: 5px;
}
.user-profile__completion {
    display: flex;
    align-items: center;
}
.user-profile__completion p {
    font-size: 16px;
    letter-spacing: 0px;
    color: #368BBA;
    margin-bottom: 0;
}
.user-profile__completion span {
    letter-spacing: 0px;
    color: #368BBA;
    font-size: 16px;
    font-weight: bold;
    margin-left: 4px;
}
.user-profile__tab__wrapper {
    margin-top: 40px;
}
.user-profile__tab__wrapper ul li a {
    padding: 0;
    background: transparent;
    letter-spacing: 0px;
    color: #368BBA;
    font-size: 16px;
}
.user-profile__tab__wrapper ul li .nav-link.active{
    background: transparent;
    letter-spacing: 0px;
    color: #15658D;
    font-size: 16px;
    font-weight: bold;
    border-bottom: 2px solid #15658D;
    border-radius: 0;
}
.user-profile__tab__wrapper ul {
    gap: 70px;
}
.personal-detail-wrapper {
    margin-top: 40px;
}   
.personal-detail-wrapper label {
    letter-spacing: 0px;
    color: #15658D;
    font-size: 18px;
    margin-bottom: 15px;
}
.personal-detail-wrapper .form-control {
    height: 62px;
    border: 1px solid #EFEFEF;
	  color: #368BBA;
}
.city-wrapper select {
    appearance: none;
    background: transparent;
    background-image: url(./images/Icon\ material-keyboard-arrow-down.svg);
    background-repeat: no-repeat;
    background-position: center right 20px;
}
.Marital-status-wrapper select{
    appearance: none;
    background: transparent;
    background-image: url(./images/Icon\ material-keyboard-arrow-down.svg);
    background-repeat: no-repeat;
    background-position: center right 20px;
}
.personal-detail-wrapper .form-control:focus {
    box-shadow: none;
    border: 1px solid #EFEFEF;
}
.gender-wrapper {
    display: grid;
    grid-template-columns: 1fr 1fr 1fr;
    column-gap: 10px;
}
.gender-wrapper label {
    width: 100%;
}
.gender-wrapper label:before {
    display: none;
}
.gender-inner-wrapper {
    display: flex;
    gap: 10px;
    align-items: center;
    border: 1px solid #EFEFEF;
    border-radius: 10px;
    height: 62px;
    padding: 10px;
    cursor: pointer;
}
.gender-wrapper label:after {
    display: none;
}
.gender-inner-wrapper p {
    margin-bottom: 0;
}

.gender-wrapper .custom-radio {
    padding-left: 0;
}
@media only screen and (max-width: 991px){
   section.user-profile{
        padding: 0 40px;
    }
   section.user-profile form{
        padding: 50px;
    }
}
@media only screen and (max-width: 767px){
    section.user-profile{
        padding: 0 15px;
    }
    section.user-profile form{
        padding: 15px;
    }
   .user-profile .gender-wrapper{
        grid-template-columns: 1fr;
    }
    .user-profile__tab__wrapper ul {
    gap: 20px;
    }   
}

</style>

