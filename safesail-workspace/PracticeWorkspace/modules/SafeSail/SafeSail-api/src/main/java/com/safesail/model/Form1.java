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

package com.safesail.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the Form1 service. Represents a row in the &quot;Safe_Sail_Form1&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see Form1Model
 * @generated
 */
@ImplementationClassName("com.safesail.model.impl.Form1Impl")
@ProviderType
public interface Form1 extends Form1Model, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.safesail.model.impl.Form1Impl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Form1, Long> SAIL_ID_ACCESSOR =
		new Accessor<Form1, Long>() {

			@Override
			public Long get(Form1 form1) {
				return form1.getSailId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Form1> getTypeClass() {
				return Form1.class;
			}

		};
	public static final Accessor<Form1, String> QUOTE_ID_ACCESSOR =
		new Accessor<Form1, String>() {

			@Override
			public String get(Form1 form1) {
				return form1.getQuoteId();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<Form1> getTypeClass() {
				return Form1.class;
			}

		};

}