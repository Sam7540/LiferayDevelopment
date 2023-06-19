package com.safesailweb.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.safesail.model.Form1;
import com.safesail.service.Form1LocalServiceUtil;
import com.safesailweb.constants.MainControllerPortletKeys;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + MainControllerPortletKeys.MAINCONTROLLER,
		"mvc.command.name=/incomeDetail" })

public class IncomeDetailsMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest arg0, RenderResponse arg1) throws PortletException {
		// TODO Auto-generated method stub

		String sailIds = ParamUtil.get(arg0, "sailId", "");
		Long sailId = Long.parseLong(sailIds);
		Form1 registerReg = Form1LocalServiceUtil.getSailId(sailId);
		Form1 lastData = (Form1) arg0.getAttribute("forms");
		arg0.setAttribute("sailId", sailId);
		arg0.setAttribute("forms", lastData);
		arg0.setAttribute("form", registerReg);

		return "/IncomeDetail.jsp";
	}

}
