package com.safesailweb.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.safesail.model.Form1;
import com.safesail.service.Form1LocalServiceUtil;
import com.safesailweb.constants.MainControllerPortletKeys;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

@Component(
	    immediate = true,
	    property = {
	    		"javax.portlet.name=" + MainControllerPortletKeys.MAINCONTROLLER,
	        "mvc.command.name=saveInsurance"
	    },
	    service = MVCActionCommand.class
	)

public class TermInsuranceActionMethod extends BaseMVCActionCommand{
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		long sailId= ParamUtil.get(actionRequest, "sailId", 0);
		String lifeSecure = ParamUtil.get(actionRequest, "lifeSecure", "");
		String lifePlus = ParamUtil.get(actionRequest,"lifePlus","");
		String criticalBenefit = ParamUtil.get(actionRequest, "criticalBenefit","");
		long totalAddon = ParamUtil.getInteger(actionRequest, "TotalAddon");

		System.out.println(lifeSecure);
		System.out.println(lifePlus);
		System.out.println(criticalBenefit);
		
		int lifeSecure1 =708;
		int criticalBenefit1 = 5340;
		int lifePlus1 =2950;
		
		
		
		Form1 registerReg=Form1LocalServiceUtil.getSailId(sailId);
		System.out.println(registerReg);
		if (registerReg != null) {
		// fill update information
			if(lifeSecure.length() != 0) {
		registerReg.setLifeSecure(lifeSecure1);}
			if(lifePlus.length() != 0) {
		registerReg.setLifePlus(lifePlus1);}
			if((criticalBenefit.length() != 0)) {
		registerReg.setCIPBenefit(criticalBenefit1);}
			registerReg.setTotalAddon(totalAddon);
		registerReg = Form1LocalServiceUtil.updateForm1(registerReg);
		}
		String sailIds = ""+sailId;
	 	actionResponse.setRenderParameter("sailId", sailIds);
	 	actionResponse.setRenderParameter("mvcRenderCommandName", "/SomeDetails");	
	


		
	}
	
}
