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

package com.safesail.model.impl;

import com.safesail.model.Form1;
import com.safesail.service.Form1LocalServiceUtil;

/**
 * The extended model base implementation for the Form1 service. Represents a row in the &quot;Safe_Sail_Form1&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Form1Impl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Form1Impl
 * @see Form1
 * @generated
 */
public abstract class Form1BaseImpl extends Form1ModelImpl implements Form1 {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a form1 model instance should use the <code>Form1</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			Form1LocalServiceUtil.addForm1(this);
		}
		else {
			Form1LocalServiceUtil.updateForm1(this);
		}
	}

}