package com.safesailweb.portlet;

import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.Param;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.safesail.model.Form1;
import com.safesail.service.Form1LocalServiceUtil;
import com.safesailweb.constants.MainControllerPortletKeys;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + MainControllerPortletKeys.MAINCONTROLLER,
		"mvc.command.name=updateRegister" }, service = MVCActionCommand.class)
public class PersonalDetailUpdateActionMethod extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String fullname = ParamUtil.get(actionRequest, "fullName", "");
		long phoneNumber = ParamUtil.getLong(actionRequest, "number", 0);
		String email = ParamUtil.get(actionRequest, "email", "");
		SimpleDateFormat datehere = new SimpleDateFormat("yyyy-MM-dd");
		Date dob = (Date) ParamUtil.getDate(actionRequest, "dob", datehere);
		String gender = ParamUtil.get(actionRequest, "Gender", "");
		String panNumber = ParamUtil.get(actionRequest, "panNumber", "");
		int AnnualIncome = ParamUtil.getInteger(actionRequest, "annualIncome");
		System.out.println(AnnualIncome);
		long AnnualIncomes= 0;
		if(AnnualIncome == 3) {
			AnnualIncomes = 5000000l;
		}else if(AnnualIncome == 5) {
			AnnualIncomes =8000000l;
			
		}else if(AnnualIncome == 7) {
			
		AnnualIncomes = 10000000l;

		}else if(AnnualIncome == 10) {
			AnnualIncomes = 12000000l;

		}

		
		String[] check = ParamUtil.getParameterValues(actionRequest, "condition");
		Boolean condition = true;
		if (check.length == 0) {
			condition = false;
		}

		System.out.println(check.length);

		long sailId = ParamUtil.getLong(actionRequest, "sailId");
		


		Form1 registerReg=Form1LocalServiceUtil.getSailId(sailId);
	if (registerReg != null) {
		// fill update information
		
		registerReg.setFullname(fullname);
		registerReg.setDob(dob);
		registerReg.setAnnualIncome(AnnualIncome);
		registerReg.setGender(gender);
		registerReg.setPanNumber(panNumber);
		registerReg.setPhoneNo(phoneNumber);
		registerReg.setEmailAddress(email);
		registerReg.setSumAssured(AnnualIncomes);
		registerReg=Form1LocalServiceUtil.updateForm1(registerReg);

	
	}
		String sailIds = "" + sailId;
		
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String strDate = dateFormat.format(date);

		actionResponse.setRenderParameter("sailId", sailIds);

		actionRequest.setAttribute("forms", registerReg);

		actionResponse.setRenderParameter("mvcRenderCommandName", "/incomeDetail");

	}

}
