package com.safesailweb.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.safesail.service.Form1LocalServiceUtil;
import com.safesailweb.constants.MainControllerPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + MainControllerPortletKeys.MAINCONTROLLER,
		"mvc.command.name=/SomeDetails" })

public class SomeDetailsMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest arg0, RenderResponse arg1) throws PortletException {
		// TODO Auto-generated method stub

		String sailIds = ParamUtil.get(arg0, "sailId", "");

		long sailId = Long.parseLong(sailIds);

		System.out.println("This is the somebody page" + "     " + Form1LocalServiceUtil.getSailId(sailId));
		arg0.setAttribute("form", Form1LocalServiceUtil.getSailId(sailId));
		arg0.setAttribute("sailId", sailId);

		System.out.println("This is the somebody page" + "    " + sailId);

		return "/SomeDetailsAboutYou.jsp";
	}

}
