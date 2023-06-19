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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.safesail.exception.NoSuchForm1Exception;
import com.safesail.model.Form1;

import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the form1 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Form1Util
 * @generated
 */
@ProviderType
public interface Form1Persistence extends BasePersistence<Form1> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Form1Util} to access the form1 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the form1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching form1s
	 */
	public java.util.List<Form1> findByUuid(String uuid);

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
	public java.util.List<Form1> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Form1> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Form1>
			orderByComparator);

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
	public java.util.List<Form1> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Form1>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first form1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form1
	 * @throws NoSuchForm1Exception if a matching form1 could not be found
	 */
	public Form1 findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Form1>
				orderByComparator)
		throws NoSuchForm1Exception;

	/**
	 * Returns the first form1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form1, or <code>null</code> if a matching form1 could not be found
	 */
	public Form1 fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Form1>
			orderByComparator);

	/**
	 * Returns the last form1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form1
	 * @throws NoSuchForm1Exception if a matching form1 could not be found
	 */
	public Form1 findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Form1>
				orderByComparator)
		throws NoSuchForm1Exception;

	/**
	 * Returns the last form1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form1, or <code>null</code> if a matching form1 could not be found
	 */
	public Form1 fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Form1>
			orderByComparator);

	/**
	 * Returns the form1s before and after the current form1 in the ordered set where uuid = &#63;.
	 *
	 * @param form1PK the primary key of the current form1
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next form1
	 * @throws NoSuchForm1Exception if a form1 with the primary key could not be found
	 */
	public Form1[] findByUuid_PrevAndNext(
			Form1PK form1PK, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Form1>
				orderByComparator)
		throws NoSuchForm1Exception;

	/**
	 * Removes all the form1s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of form1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching form1s
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the form1 where sailId = &#63; or throws a <code>NoSuchForm1Exception</code> if it could not be found.
	 *
	 * @param sailId the sail ID
	 * @return the matching form1
	 * @throws NoSuchForm1Exception if a matching form1 could not be found
	 */
	public Form1 findBysailId(long sailId) throws NoSuchForm1Exception;

	/**
	 * Returns the form1 where sailId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sailId the sail ID
	 * @return the matching form1, or <code>null</code> if a matching form1 could not be found
	 */
	public Form1 fetchBysailId(long sailId);

	/**
	 * Returns the form1 where sailId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sailId the sail ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching form1, or <code>null</code> if a matching form1 could not be found
	 */
	public Form1 fetchBysailId(long sailId, boolean useFinderCache);

	/**
	 * Removes the form1 where sailId = &#63; from the database.
	 *
	 * @param sailId the sail ID
	 * @return the form1 that was removed
	 */
	public Form1 removeBysailId(long sailId) throws NoSuchForm1Exception;

	/**
	 * Returns the number of form1s where sailId = &#63;.
	 *
	 * @param sailId the sail ID
	 * @return the number of matching form1s
	 */
	public int countBysailId(long sailId);

	/**
	 * Caches the form1 in the entity cache if it is enabled.
	 *
	 * @param form1 the form1
	 */
	public void cacheResult(Form1 form1);

	/**
	 * Caches the form1s in the entity cache if it is enabled.
	 *
	 * @param form1s the form1s
	 */
	public void cacheResult(java.util.List<Form1> form1s);

	/**
	 * Creates a new form1 with the primary key. Does not add the form1 to the database.
	 *
	 * @param form1PK the primary key for the new form1
	 * @return the new form1
	 */
	public Form1 create(Form1PK form1PK);

	/**
	 * Removes the form1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param form1PK the primary key of the form1
	 * @return the form1 that was removed
	 * @throws NoSuchForm1Exception if a form1 with the primary key could not be found
	 */
	public Form1 remove(Form1PK form1PK) throws NoSuchForm1Exception;

	public Form1 updateImpl(Form1 form1);

	/**
	 * Returns the form1 with the primary key or throws a <code>NoSuchForm1Exception</code> if it could not be found.
	 *
	 * @param form1PK the primary key of the form1
	 * @return the form1
	 * @throws NoSuchForm1Exception if a form1 with the primary key could not be found
	 */
	public Form1 findByPrimaryKey(Form1PK form1PK) throws NoSuchForm1Exception;

	/**
	 * Returns the form1 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param form1PK the primary key of the form1
	 * @return the form1, or <code>null</code> if a form1 with the primary key could not be found
	 */
	public Form1 fetchByPrimaryKey(Form1PK form1PK);

	/**
	 * Returns all the form1s.
	 *
	 * @return the form1s
	 */
	public java.util.List<Form1> findAll();

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
	public java.util.List<Form1> findAll(int start, int end);

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
	public java.util.List<Form1> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Form1>
			orderByComparator);

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
	public java.util.List<Form1> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Form1>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the form1s from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of form1s.
	 *
	 * @return the number of form1s
	 */
	public int countAll();

	public Set<String> getCompoundPKColumnNames();

}