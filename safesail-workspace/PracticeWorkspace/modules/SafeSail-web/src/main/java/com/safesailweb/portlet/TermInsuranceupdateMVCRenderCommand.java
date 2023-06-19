package com.safesailweb.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.safesail.model.Form1;
import com.safesail.service.Form1LocalServiceUtil;
import com.safesailweb.constants.MainControllerPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property= {
				"javax.portlet.name=" + MainControllerPortletKeys.MAINCONTROLLER,
				"mvc.command.name=/termInsurances"
		}
		)

public class TermInsuranceupdateMVCRenderCommand implements MVCRenderCommand{

	@Override
	public String render(RenderRequest arg0, RenderResponse arg1) throws PortletException {
		// TODO Auto-generated method stub
		
		/*
		 * String sailIds = ParamUtil.get(arg0, "sailId", ""); Long sailId =
		 * Long.parseLong(sailIds); Form1
		 * registerReg=Form1LocalServiceUtil.getSailId(sailId);
		 * System.out.println(registerReg); arg0.setAttribute("sailId", sailId);
		 * arg0.setAttribute("form", registerReg);
		 */

		Long sailId = ParamUtil.getLong(arg0, "sailId");
		System.out.println(sailId);
		Form1 registerReg=Form1LocalServiceUtil.getSailId(sailId);
				arg0.setAttribute("sailId", sailId);
				arg0.setAttribute("form", registerReg);
		return "/TermInsurance.jsp";
	}

	
	
	
	
}
