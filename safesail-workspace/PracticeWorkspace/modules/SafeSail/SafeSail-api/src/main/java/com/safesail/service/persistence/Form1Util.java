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

package com.safesail.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.safesail.model.Form1;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the form1 service. This utility wraps <code>com.safesail.service.persistence.impl.Form1PersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Form1Persistence
 * @generated
 */
public class Form1Util {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Form1 form1) {
		getPersistence().clearCache(form1);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Form1> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Form1> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Form1> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Form1> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Form1> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Form1 update(Form1 form1) {
		return getPersistence().update(form1);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Form1 update(Form1 form1, ServiceContext serviceContext) {
		return getPersistence().update(form1, serviceContext);
	}

	/**
	 * Returns all the form1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching form1s
	 */
	public static List<Form1> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the form1s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Form1ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of form1s
	 * @param end the upper bound of the range of form1s (not inclusive)
	 * @return the range of matching form1s
	 */
	public static List<Form1> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the form1s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Form1ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of form1s
	 * @param end the upper bound of the range of form1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching form1s
	 */
	public static List<Form1> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Form1> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the form1s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Form1ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of form1s
	 * @param end the upper bound of the range of form1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching form1s
	 */
	public static List<Form1> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Form1> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first form1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form1
	 * @throws NoSuchForm1Exception if a matching form1 could not be found
	 */
	public static Form1 findByUuid_First(
			String uuid, OrderByComparator<Form1> orderByComparator)
		throws com.safesail.exception.NoSuchForm1Exception {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first form1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form1, or <code>null</code> if a matching form1 could not be found
	 */
	public static Form1 fetchByUuid_First(
		String uuid, OrderByComparator<Form1> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last form1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form1
	 * @throws NoSuchForm1Exception if a matching form1 could not be found
	 */
	public static Form1 findByUuid_Last(
			String uuid, OrderByComparator<Form1> orderByComparator)
		throws com.safesail.exception.NoSuchForm1Exception {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last form1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form1, or <code>null</code> if a matching form1 could not be found
	 */
	public static Form1 fetchByUuid_Last(
		String uuid, OrderByComparator<Form1> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the form1s before and after the current form1 in the ordered set where uuid = &#63;.
	 *
	 * @param form1PK the primary key of the current form1
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next form1
	 * @throws NoSuchForm1Exception if a form1 with the primary key could not be found
	 */
	public static Form1[] findByUuid_PrevAndNext(
			Form1PK form1PK, String uuid,
			OrderByComparator<Form1> orderByComparator)
		throws com.safesail.exception.NoSuchForm1Exception {

		return getPersistence().findByUuid_PrevAndNext(
			form1PK, uuid, orderByComparator);
	}

	/**
	 * Removes all the form1s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of form1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching form1s
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the form1 where sailId = &#63; or throws a <code>NoSuchForm1Exception</code> if it could not be found.
	 *
	 * @param sailId the sail ID
	 * @return the matching form1
	 * @throws NoSuchForm1Exception if a matching form1 could not be found
	 */
	public static Form1 findBysailId(long sailId)
		throws com.safesail.exception.NoSuchForm1Exception {

		return getPersistence().findBysailId(sailId);
	}

	/**
	 * Returns the form1 where sailId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sailId the sail ID
	 * @return the matching form1, or <code>null</code> if a matching form1 could not be found
	 */
	public static Form1 fetchBysailId(long sailId) {
		return getPersistence().fetchBysailId(sailId);
	}

	/**
	 * Returns the form1 where sailId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sailId the sail ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching form1, or <code>null</code> if a matching form1 could not be found
	 */
	public static Form1 fetchBysailId(long sailId, boolean useFinderCache) {
		return getPersistence().fetchBysailId(sailId, useFinderCache);
	}

	/**
	 * Removes the form1 where sailId = &#63; from the database.
	 *
	 * @param sailId the sail ID
	 * @return the form1 that was removed
	 */
	public static Form1 removeBysailId(long sailId)
		throws com.safesail.exception.NoSuchForm1Exception {

		return getPersistence().removeBysailId(sailId);
	}

	/**
	 * Returns the number of form1s where sailId = &#63;.
	 *
	 * @param sailId the sail ID
	 * @return the number of matching form1s
	 */
	public static int countBysailId(long sailId) {
		return getPersistence().countBysailId(sailId);
	}

	/**
	 * Caches the form1 in the entity cache if it is enabled.
	 *
	 * @param form1 the form1
	 */
	public static void cacheResult(Form1 form1) {
		getPersistence().cacheResult(form1);
	}

	/**
	 * Caches the form1s in the entity cache if it is enabled.
	 *
	 * @param form1s the form1s
	 */
	public static void cacheResult(List<Form1> form1s) {
		getPersistence().cacheResult(form1s);
	}

	/**
	 * Creates a new form1 with the primary key. Does not add the form1 to the database.
	 *
	 * @param form1PK the primary key for the new form1
	 * @return the new form1
	 */
	public static Form1 create(Form1PK form1PK) {
		return getPersistence().create(form1PK);
	}

	/**
	 * Removes the form1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param form1PK the primary key of the form1
	 * @return the form1 that was removed
	 * @throws NoSuchForm1Exception if a form1 with the primary key could not be found
	 */
	public static Form1 remove(Form1PK form1PK)
		throws com.safesail.exception.NoSuchForm1Exception {

		return getPersistence().remove(form1PK);
	}

	public static Form1 updateImpl(Form1 form1) {
		return getPersistence().updateImpl(form1);
	}

	/**
	 * Returns the form1 with the primary key or throws a <code>NoSuchForm1Exception</code> if it could not be found.
	 *
	 * @param form1PK the primary key of the form1
	 * @return the form1
	 * @throws NoSuchForm1Exception if a form1 with the primary key could not be found
	 */
	public static Form1 findByPrimaryKey(Form1PK form1PK)
		throws com.safesail.exception.NoSuchForm1Exception {

		return getPersistence().findByPrimaryKey(form1PK);
	}

	/**
	 * Returns the form1 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param form1PK the primary key of the form1
	 * @return the form1, or <code>null</code> if a form1 with the primary key could not be found
	 */
	public static Form1 fetchByPrimaryKey(Form1PK form1PK) {
		return getPersistence().fetchByPrimaryKey(form1PK);
	}

	/**
	 * Returns all the form1s.
	 *
	 * @return the form1s
	 */
	public static List<Form1> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the form1s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Form1ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of form1s
	 * @param end the upper bound of the range of form1s (not inclusive)
	 * @return the range of form1s
	 */
	public static List<Form1> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the form1s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Form1ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of form1s
	 * @param end the upper bound of the range of form1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of form1s
	 */
	public static List<Form1> findAll(
		int start, int end, OrderByComparator<Form1> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the form1s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Form1ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of form1s
	 * @param end the upper bound of the range of form1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of form1s
	 */
	public static List<Form1> findAll(
		int start, int end, OrderByComparator<Form1> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the form1s from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of form1s.
	 *
	 * @return the number of form1s
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getCompoundPKColumnNames() {
		return getPersistence().getCompoundPKColumnNames();
	}

	public static Form1Persistence getPersistence() {
		return _persistence;
	}

	private static volatile Form1Persistence _persistence;

}