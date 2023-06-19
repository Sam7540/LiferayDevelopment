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

package com.safesail.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Form1Service}.
 *
 * @author Brian Wing Shun Chan
 * @see Form1Service
 * @generated
 */
public class Form1ServiceWrapper
	implements Form1Service, ServiceWrapper<Form1Service> {

	public Form1ServiceWrapper() {
		this(null);
	}

	public Form1ServiceWrapper(Form1Service form1Service) {
		_form1Service = form1Service;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _form1Service.getOSGiServiceIdentifier();
	}

	@Override
	public Form1Service getWrappedService() {
		return _form1Service;
	}

	@Override
	public void setWrappedService(Form1Service form1Service) {
		_form1Service = form1Service;
	}

	private Form1Service _form1Service;

}