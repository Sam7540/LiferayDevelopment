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
 * Provides a wrapper for {@link Form1LocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see Form1LocalService
 * @generated
 */
public class Form1LocalServiceWrapper
	implements Form1LocalService, ServiceWrapper<Form1LocalService> {

	public Form1LocalServiceWrapper() {
		this(null);
	}

	public Form1LocalServiceWrapper(Form1LocalService form1LocalService) {
		_form1LocalService = form1LocalService;
	}

	/**
	 * Adds the form1 to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Form1LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param form1 the form1
	 * @return the form1 that was added
	 */
	@Override
	public com.safesail.model.Form1 addForm1(com.safesail.model.Form1 form1) {
		return _form1LocalService.addForm1(form1);
	}

	@Override
	public com.safesail.model.Form1 addReg(
		long sailId, String quoteId, String fullname, String email,
		long phoneNumber, long AnnualIncome, String panNumber,
		java.util.Date dob, String gender, Boolean condition, long sumAssured) {

		return _form1LocalService.addReg(
			sailId, quoteId, fullname, email, phoneNumber, AnnualIncome,
			panNumber, dob, gender, condition, sumAssured);
	}

	/**
	 * Creates a new form1 with the primary key. Does not add the form1 to the database.
	 *
	 * @param form1PK the primary key for the new form1
	 * @return the new form1
	 */
	@Override
	public com.safesail.model.Form1 createForm1(
		com.safesail.service.persistence.Form1PK form1PK) {

		return _form1LocalService.createForm1(form1PK);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _form1LocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the form1 from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Form1LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param form1 the form1
	 * @return the form1 that was removed
	 */
	@Override
	public com.safesail.model.Form1 deleteForm1(
		com.safesail.model.Form1 form1) {

		return _form1LocalService.deleteForm1(form1);
	}

	/**
	 * Deletes the form1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Form1LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param form1PK the primary key of the form1
	 * @return the form1 that was removed
	 * @throws PortalException if a form1 with the primary key could not be found
	 */
	@Override
	public com.safesail.model.Form1 deleteForm1(
			com.safesail.service.persistence.Form1PK form1PK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _form1LocalService.deleteForm1(form1PK);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _form1LocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _form1LocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _form1LocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _form1LocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _form1LocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.safesail.model.impl.Form1ModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _form1LocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.safesail.model.impl.Form1ModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _form1LocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _form1LocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _form1LocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.safesail.model.Form1 fetchForm1(
		com.safesail.service.persistence.Form1PK form1PK) {

		return _form1LocalService.fetchForm1(form1PK);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _form1LocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the form1 with the primary key.
	 *
	 * @param form1PK the primary key of the form1
	 * @return the form1
	 * @throws PortalException if a form1 with the primary key could not be found
	 */
	@Override
	public com.safesail.model.Form1 getForm1(
			com.safesail.service.persistence.Form1PK form1PK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _form1LocalService.getForm1(form1PK);
	}

	/**
	 * Returns a range of all the form1s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.safesail.model.impl.Form1ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of form1s
	 * @param end the upper bound of the range of form1s (not inclusive)
	 * @return the range of form1s
	 */
	@Override
	public java.util.List<com.safesail.model.Form1> getForm1s(
		int start, int end) {

		return _form1LocalService.getForm1s(start, end);
	}

	/**
	 * Returns the number of form1s.
	 *
	 * @return the number of form1s
	 */
	@Override
	public int getForm1sCount() {
		return _form1LocalService.getForm1sCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _form1LocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _form1LocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _form1LocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.safesail.model.Form1 getSailId(long sailId) {
		return _form1LocalService.getSailId(sailId);
	}

	/**
	 * Updates the form1 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Form1LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param form1 the form1
	 * @return the form1 that was updated
	 */
	@Override
	public com.safesail.model.Form1 updateForm1(
		com.safesail.model.Form1 form1) {

		return _form1LocalService.updateForm1(form1);
	}

	@Override
	public Form1LocalService getWrappedService() {
		return _form1LocalService;
	}

	@Override
	public void setWrappedService(Form1LocalService form1LocalService) {
		_form1LocalService = form1LocalService;
	}

	private Form1LocalService _form1LocalService;

}