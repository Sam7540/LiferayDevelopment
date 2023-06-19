package com.safesailweb.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.safesail.model.Form1;
import com.safesail.service.Form1LocalServiceUtil;
import com.safesailweb.constants.MainControllerPortletKeys;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property= {
				"javax.portlet.name=" + MainControllerPortletKeys.MAINCONTROLLER,
				"mvc.command.name=/personalDetail"
		}
		)

public class PersonalDetails2MVCRenderCommand implements MVCRenderCommand{

	@Override
	public String render(RenderRequest arg0, RenderResponse arg1) throws PortletException {
		// TODO Auto-generated method stub
		/*
		 * String sailIds = ParamUtil.get(arg0, "sailId", "");
		 * 
		 * Long sailId = Long.parseLong(sailIds); DateFormat df = new
		 * SimpleDateFormat("yyyy-MM-dd"); String fullname = ParamUtil.get(arg0,
		 * "fullName", ""); long phoneNumber = ParamUtil.getLong(arg0, "number", 0);
		 * String email = ParamUtil.get(arg0, "email", ""); Date dob = (Date)
		 * ParamUtil.getDate(arg0, "dob", df); String gender = ParamUtil.get(arg0,
		 * "Gender", ""); String panNumber = ParamUtil.get(arg0,"panNumber",""); long
		 * AnnualIncome = ParamUtil.getLong(arg0, "AnnualIncome", 0);
		 * System.out.println(sailId);
		 */

		String sailIds = ParamUtil.get(arg0, "sailId", "");
		 Long sailId = Long.parseLong(sailIds); 
		Form1 registerReg=Form1LocalServiceUtil.getSailId(sailId);
		System.out.println(registerReg);
		/*
		 * if (registerReg != null) { // fill update information
		 * 
		 * registerReg.setFullname(fullname);; registerReg.setDob(dob);
		 * 
		 * registerReg.setEmailAddress(email); registerReg.setGender(gender);
		 * registerReg.setAnnualIncome(AnnualIncome);
		 * registerReg.setPanNumber(panNumber); registerReg.setPhoneNo(phoneNumber);
		 * 
		 * 
		 * }
		 * 
		 */		

		
		arg0.setAttribute("form", registerReg);
		
		
		return "/view1.jsp";
	}

	
	
	
	
}
