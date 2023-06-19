/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.safesail.service.impl;

import com.liferay.portal.aop.AopService;
import com.safesail.exception.NoSuchForm1Exception;
import com.safesail.model.Form1;
import com.safesail.model.impl.Form1Impl;
import com.safesail.service.base.Form1LocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.safesail.model.Form1",
	service = AopService.class
)
public class Form1LocalServiceImpl extends Form1LocalServiceBaseImpl {

	public Form1 addReg(long sailId , String quoteId,String fullname, String email, long phoneNumber,long AnnualIncome,String panNumber, Date dob, String gender, Boolean condition,long sumAssured) {
		
		Form1 registerReg = new Form1Impl();
		registerReg.setQuoteId(quoteId);
		registerReg.setSailId(sailId);
		registerReg.setFullname(fullname);
		registerReg.setPhoneNo(phoneNumber);
		registerReg.setEmailAddress(email);
		registerReg.setDob(dob);
		registerReg.setGender(gender);
		registerReg.setPanNumber(panNumber);
		registerReg.setAnnualIncome(AnnualIncome);
		registerReg.setAgreement(condition);
		registerReg.setSumAssured(sumAssured);
		form1LocalService.addForm1(registerReg);
		
		return registerReg;
    }

	
	public Form1 getSailId(long sailId) {
		Form1 form = null;
				try {
					form = form1Persistence.findBysailId(sailId);
				} catch (NoSuchForm1Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return form;
		
	}
	




}