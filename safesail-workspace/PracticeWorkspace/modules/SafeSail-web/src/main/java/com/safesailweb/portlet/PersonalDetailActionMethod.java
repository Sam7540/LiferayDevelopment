package com.safesailweb.portlet;

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
		"mvc.command.name=saveRegister" }, service = MVCActionCommand.class)
public class PersonalDetailActionMethod extends BaseMVCActionCommand {
		
	public int num=0;
	@Override
	@SuppressWarnings("unused")
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

		int sailId = (int) CounterLocalServiceUtil.increment(Form1.class.getName());
		long i = 0;
//		String prevId = "#01TBPSY";	// why prevId is kept static & why manually id generation is required
//		String data = prevId.replace("TBPSY", "");
//		String data1 = data.replace("#", "");
//		int num = Integer.parseInt(data1);
		num++;
		String quoteId = getNumberingFormat(num);

		/* String QuoteId = */
		// insertion of data to db
		;

		Form1 lastData = Form1LocalServiceUtil.addReg(sailId, quoteId, fullname, email, phoneNumber, AnnualIncome,
				panNumber, dob, gender, true,AnnualIncomes);
		String sailIds = "" + sailId;
		/*
		 * String AnnualIncom = "" + AnnualIncome; String phoneNumbers = "" +
		 * phoneNumber;
		 */

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String strDate = dateFormat.format(date);

		
		/*
		 * actionResponse.setRenderParameter("fullname", fullname);
		 * actionResponse.setRenderParameter("email", email);
		 * actionResponse.setRenderParameter("gender", gender);
		 * actionResponse.setRenderParameter("AnnualIncomes", AnnualIncomes);
		 * actionResponse.setRenderParameter("panNumber", panNumber);
		 * actionResponse.setRenderParameter("fullname", fullname);
		 * actionResponse.setRenderParameter("phoneNumbers", phoneNumbers);
		 * actionResponse.setRenderParameter("dob", dob);
		 */
		//actionResponse.setRenderParameter("sailId", sailIds);

		actionResponse.getRenderParameters().setValue("sailId", sailIds);
		
		actionRequest.setAttribute("forms", lastData);

		//actionResponse.setRenderParameter("mvcRenderCommandName", "/incomeDetail");
		
		actionResponse.getRenderParameters().setValue("mvcRenderCommandName", "/incomeDetail");

	}

	public String getNumberingFormat(int number) {

		String numberData = "#";
		String numberData1 = "0";
		String numberData2 = alpha();
		if (number >= 1 && number < 9) {
			numberData = numberData + numberData1 + number + numberData2;

		} else if (number >= 10 && number <= 99) {

			numberData = numberData + number + numberData2;
		}

		return numberData;
	}

	public String alpha() {

		// create a string of all characters
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		// create random string builder
		StringBuilder sb = new StringBuilder();

		// create an object of Random class
		Random random = new Random();

		// specify length of random string
		int length = 5;

		for (int i = 0; i < length; i++) {

			// generate random index number
			int index = random.nextInt(alphabet.length());

			// get character specified by index
			// from the string
			char randomChar = alphabet.charAt(index);

			// append the character to string builder
			sb.append(randomChar);
		}

		String randomString = sb.toString();
		return randomString;
	}

}
