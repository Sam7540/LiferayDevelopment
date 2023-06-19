package com.safesailweb.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.safesail.model.Form1;
import com.safesail.service.Form1LocalServiceUtil;
import com.safesail.service.Form1ServiceUtil;
import com.safesailweb.constants.MainControllerPortletKeys;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	    immediate = true,
	    property = {
	    		"javax.portlet.name=" + MainControllerPortletKeys.MAINCONTROLLER,
	        "mvc.command.name=saveIncome"
	    },
	    service = MVCActionCommand.class
	)
public class IncomeDetailsActionMethod extends BaseMVCActionCommand{
	
	

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		long sailId= ParamUtil.get(actionRequest, "sailId", 0);
		int premiumPaying = ParamUtil.getInteger(actionRequest, "premiumPaying", 0);
		String payout = ParamUtil.get(actionRequest, "payout", "");
		int policyTerm = ParamUtil.get(actionRequest, "policyTerm", 0);
		String paymentFreq = ParamUtil.get(actionRequest,"paymentFreq","");
		long totalValues = ParamUtil.getLong(actionRequest, "TotalPayment");
		

		
		/*String QuoteId = */
		// insertion of data to db
		
		Form1 registerReg=Form1LocalServiceUtil.getSailId(sailId);
			System.out.println(registerReg);
		if (registerReg != null) {
			// fill update information
			
			registerReg.setPPTerm(premiumPaying);
			registerReg.setPayoutOption(payout);
			registerReg.setPolicyTerm(policyTerm);
			registerReg.setPaymentFrequency(paymentFreq);	
			registerReg.setTotalValues(totalValues);
			registerReg=Form1LocalServiceUtil.updateForm1(registerReg);

		
		}
		
System.out.println(registerReg);
		String sailIds = ""+sailId;



		 	actionResponse.setRenderParameter("sailId", sailIds);
		 	actionResponse.setRenderParameter("mvcRenderCommandName", "/termInsurance");	
		
		

		
	}
	
}
