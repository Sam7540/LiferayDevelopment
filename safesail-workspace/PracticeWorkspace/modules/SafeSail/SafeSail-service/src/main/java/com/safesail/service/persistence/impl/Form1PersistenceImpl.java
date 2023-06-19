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

package com.safesail.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUID;

import com.safesail.exception.NoSuchForm1Exception;
import com.safesail.model.Form1;
import com.safesail.model.Form1Table;
import com.safesail.model.impl.Form1Impl;
import com.safesail.model.impl.Form1ModelImpl;
import com.safesail.service.persistence.Form1PK;
import com.safesail.service.persistence.Form1Persistence;
import com.safesail.service.persistence.Form1Util;
import com.safesail.service.persistence.impl.constants.Safe_SailPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the form1 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {Form1Persistence.class, BasePersistence.class})
public class Form1PersistenceImpl
	extends BasePersistenceImpl<Form1> implements Form1Persistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>Form1Util</code> to access the form1 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		Form1Impl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the form1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching form1s
	 */
	@Override
	public List<Form1> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Form1> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Form1> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Form1> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Form1> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Form1> orderByComparator, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<Form1> list = null;

		if (useFinderCache) {
			list = (List<Form1>)finderCache.getResult(finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (Form1 form1 : list) {
					if (!uuid.equals(form1.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_FORM1_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(Form1ModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<Form1>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first form1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form1
	 * @throws NoSuchForm1Exception if a matching form1 could not be found
	 */
	@Override
	public Form1 findByUuid_First(
			String uuid, OrderByComparator<Form1> orderByComparator)
		throws NoSuchForm1Exception {

		Form1 form1 = fetchByUuid_First(uuid, orderByComparator);

		if (form1 != null) {
			return form1;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchForm1Exception(sb.toString());
	}

	/**
	 * Returns the first form1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form1, or <code>null</code> if a matching form1 could not be found
	 */
	@Override
	public Form1 fetchByUuid_First(
		String uuid, OrderByComparator<Form1> orderByComparator) {

		List<Form1> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last form1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form1
	 * @throws NoSuchForm1Exception if a matching form1 could not be found
	 */
	@Override
	public Form1 findByUuid_Last(
			String uuid, OrderByComparator<Form1> orderByComparator)
		throws NoSuchForm1Exception {

		Form1 form1 = fetchByUuid_Last(uuid, orderByComparator);

		if (form1 != null) {
			return form1;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchForm1Exception(sb.toString());
	}

	/**
	 * Returns the last form1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form1, or <code>null</code> if a matching form1 could not be found
	 */
	@Override
	public Form1 fetchByUuid_Last(
		String uuid, OrderByComparator<Form1> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Form1> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Form1[] findByUuid_PrevAndNext(
			Form1PK form1PK, String uuid,
			OrderByComparator<Form1> orderByComparator)
		throws NoSuchForm1Exception {

		uuid = Objects.toString(uuid, "");

		Form1 form1 = findByPrimaryKey(form1PK);

		Session session = null;

		try {
			session = openSession();

			Form1[] array = new Form1Impl[3];

			array[0] = getByUuid_PrevAndNext(
				session, form1, uuid, orderByComparator, true);

			array[1] = form1;

			array[2] = getByUuid_PrevAndNext(
				session, form1, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Form1 getByUuid_PrevAndNext(
		Session session, Form1 form1, String uuid,
		OrderByComparator<Form1> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_FORM1_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(Form1ModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(form1)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Form1> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the form1s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Form1 form1 :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(form1);
		}
	}

	/**
	 * Returns the number of form1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching form1s
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FORM1_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 = "form1.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(form1.uuid IS NULL OR form1.uuid = '')";

	private FinderPath _finderPathFetchBysailId;
	private FinderPath _finderPathCountBysailId;

	/**
	 * Returns the form1 where sailId = &#63; or throws a <code>NoSuchForm1Exception</code> if it could not be found.
	 *
	 * @param sailId the sail ID
	 * @return the matching form1
	 * @throws NoSuchForm1Exception if a matching form1 could not be found
	 */
	@Override
	public Form1 findBysailId(long sailId) throws NoSuchForm1Exception {
		Form1 form1 = fetchBysailId(sailId);

		if (form1 == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sailId=");
			sb.append(sailId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchForm1Exception(sb.toString());
		}

		return form1;
	}

	/**
	 * Returns the form1 where sailId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sailId the sail ID
	 * @return the matching form1, or <code>null</code> if a matching form1 could not be found
	 */
	@Override
	public Form1 fetchBysailId(long sailId) {
		return fetchBysailId(sailId, true);
	}

	/**
	 * Returns the form1 where sailId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sailId the sail ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching form1, or <code>null</code> if a matching form1 could not be found
	 */
	@Override
	public Form1 fetchBysailId(long sailId, boolean useFinderCache) {
		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {sailId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBysailId, finderArgs);
		}

		if (result instanceof Form1) {
			Form1 form1 = (Form1)result;

			if (sailId != form1.getSailId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FORM1_WHERE);

			sb.append(_FINDER_COLUMN_SAILID_SAILID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sailId);

				List<Form1> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBysailId, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {sailId};
							}

							_log.warn(
								"Form1PersistenceImpl.fetchBysailId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					Form1 form1 = list.get(0);

					result = form1;

					cacheResult(form1);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Form1)result;
		}
	}

	/**
	 * Removes the form1 where sailId = &#63; from the database.
	 *
	 * @param sailId the sail ID
	 * @return the form1 that was removed
	 */
	@Override
	public Form1 removeBysailId(long sailId) throws NoSuchForm1Exception {
		Form1 form1 = findBysailId(sailId);

		return remove(form1);
	}

	/**
	 * Returns the number of form1s where sailId = &#63;.
	 *
	 * @param sailId the sail ID
	 * @return the number of matching form1s
	 */
	@Override
	public int countBysailId(long sailId) {
		FinderPath finderPath = _finderPathCountBysailId;

		Object[] finderArgs = new Object[] {sailId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FORM1_WHERE);

			sb.append(_FINDER_COLUMN_SAILID_SAILID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sailId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_SAILID_SAILID_2 =
		"form1.id.sailId = ?";

	public Form1PersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Form1.class);

		setModelImplClass(Form1Impl.class);
		setModelPKClass(Form1PK.class);

		setTable(Form1Table.INSTANCE);
	}

	/**
	 * Caches the form1 in the entity cache if it is enabled.
	 *
	 * @param form1 the form1
	 */
	@Override
	public void cacheResult(Form1 form1) {
		entityCache.putResult(Form1Impl.class, form1.getPrimaryKey(), form1);

		finderCache.putResult(
			_finderPathFetchBysailId, new Object[] {form1.getSailId()}, form1);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the form1s in the entity cache if it is enabled.
	 *
	 * @param form1s the form1s
	 */
	@Override
	public void cacheResult(List<Form1> form1s) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (form1s.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Form1 form1 : form1s) {
			if (entityCache.getResult(Form1Impl.class, form1.getPrimaryKey()) ==
					null) {

				cacheResult(form1);
			}
		}
	}

	/**
	 * Clears the cache for all form1s.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(Form1Impl.class);

		finderCache.clearCache(Form1Impl.class);
	}

	/**
	 * Clears the cache for the form1.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Form1 form1) {
		entityCache.removeResult(Form1Impl.class, form1);
	}

	@Override
	public void clearCache(List<Form1> form1s) {
		for (Form1 form1 : form1s) {
			entityCache.removeResult(Form1Impl.class, form1);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(Form1Impl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(Form1Impl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(Form1ModelImpl form1ModelImpl) {
		Object[] args = new Object[] {form1ModelImpl.getSailId()};

		finderCache.putResult(_finderPathCountBysailId, args, Long.valueOf(1));
		finderCache.putResult(_finderPathFetchBysailId, args, form1ModelImpl);
	}

	/**
	 * Creates a new form1 with the primary key. Does not add the form1 to the database.
	 *
	 * @param form1PK the primary key for the new form1
	 * @return the new form1
	 */
	@Override
	public Form1 create(Form1PK form1PK) {
		Form1 form1 = new Form1Impl();

		form1.setNew(true);
		form1.setPrimaryKey(form1PK);

		String uuid = _portalUUID.generate();

		form1.setUuid(uuid);

		return form1;
	}

	/**
	 * Removes the form1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param form1PK the primary key of the form1
	 * @return the form1 that was removed
	 * @throws NoSuchForm1Exception if a form1 with the primary key could not be found
	 */
	@Override
	public Form1 remove(Form1PK form1PK) throws NoSuchForm1Exception {
		return remove((Serializable)form1PK);
	}

	/**
	 * Removes the form1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the form1
	 * @return the form1 that was removed
	 * @throws NoSuchForm1Exception if a form1 with the primary key could not be found
	 */
	@Override
	public Form1 remove(Serializable primaryKey) throws NoSuchForm1Exception {
		Session session = null;

		try {
			session = openSession();

			Form1 form1 = (Form1)session.get(Form1Impl.class, primaryKey);

			if (form1 == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchForm1Exception(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(form1);
		}
		catch (NoSuchForm1Exception noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Form1 removeImpl(Form1 form1) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(form1)) {
				form1 = (Form1)session.get(
					Form1Impl.class, form1.getPrimaryKeyObj());
			}

			if (form1 != null) {
				session.delete(form1);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (form1 != null) {
			clearCache(form1);
		}

		return form1;
	}

	@Override
	public Form1 updateImpl(Form1 form1) {
		boolean isNew = form1.isNew();

		if (!(form1 instanceof Form1ModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(form1.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(form1);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in form1 proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Form1 implementation " +
					form1.getClass());
		}

		Form1ModelImpl form1ModelImpl = (Form1ModelImpl)form1;

		if (Validator.isNull(form1.getUuid())) {
			String uuid = _portalUUID.generate();

			form1.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(form1);
			}
			else {
				form1 = (Form1)session.merge(form1);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(Form1Impl.class, form1ModelImpl, false, true);

		cacheUniqueFindersCache(form1ModelImpl);

		if (isNew) {
			form1.setNew(false);
		}

		form1.resetOriginalValues();

		return form1;
	}

	/**
	 * Returns the form1 with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the form1
	 * @return the form1
	 * @throws NoSuchForm1Exception if a form1 with the primary key could not be found
	 */
	@Override
	public Form1 findByPrimaryKey(Serializable primaryKey)
		throws NoSuchForm1Exception {

		Form1 form1 = fetchByPrimaryKey(primaryKey);

		if (form1 == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchForm1Exception(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return form1;
	}

	/**
	 * Returns the form1 with the primary key or throws a <code>NoSuchForm1Exception</code> if it could not be found.
	 *
	 * @param form1PK the primary key of the form1
	 * @return the form1
	 * @throws NoSuchForm1Exception if a form1 with the primary key could not be found
	 */
	@Override
	public Form1 findByPrimaryKey(Form1PK form1PK) throws NoSuchForm1Exception {
		return findByPrimaryKey((Serializable)form1PK);
	}

	/**
	 * Returns the form1 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param form1PK the primary key of the form1
	 * @return the form1, or <code>null</code> if a form1 with the primary key could not be found
	 */
	@Override
	public Form1 fetchByPrimaryKey(Form1PK form1PK) {
		return fetchByPrimaryKey((Serializable)form1PK);
	}

	/**
	 * Returns all the form1s.
	 *
	 * @return the form1s
	 */
	@Override
	public List<Form1> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Form1> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Form1> findAll(
		int start, int end, OrderByComparator<Form1> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Form1> findAll(
		int start, int end, OrderByComparator<Form1> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Form1> list = null;

		if (useFinderCache) {
			list = (List<Form1>)finderCache.getResult(finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FORM1);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FORM1;

				sql = sql.concat(Form1ModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Form1>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the form1s from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Form1 form1 : findAll()) {
			remove(form1);
		}
	}

	/**
	 * Returns the number of form1s.
	 *
	 * @return the number of form1s
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_FORM1);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	public Set<String> getCompoundPKColumnNames() {
		return _compoundPKColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "form1PK";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FORM1;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return Form1ModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the form1 persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathFetchBysailId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBysailId",
			new String[] {Long.class.getName()}, new String[] {"sailId"}, true);

		_finderPathCountBysailId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBysailId",
			new String[] {Long.class.getName()}, new String[] {"sailId"},
			false);

		_setForm1UtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setForm1UtilPersistence(null);

		entityCache.removeCache(Form1Impl.class.getName());
	}

	private void _setForm1UtilPersistence(Form1Persistence form1Persistence) {
		try {
			Field field = Form1Util.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, form1Persistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = Safe_SailPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = Safe_SailPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = Safe_SailPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FORM1 =
		"SELECT form1 FROM Form1 form1";

	private static final String _SQL_SELECT_FORM1_WHERE =
		"SELECT form1 FROM Form1 form1 WHERE ";

	private static final String _SQL_COUNT_FORM1 =
		"SELECT COUNT(form1) FROM Form1 form1";

	private static final String _SQL_COUNT_FORM1_WHERE =
		"SELECT COUNT(form1) FROM Form1 form1 WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "form1.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Form1 exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Form1 exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		Form1PersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});
	private static final Set<String> _compoundPKColumnNames = SetUtil.fromArray(
		new String[] {"sailId", "quoteId"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private PortalUUID _portalUUID;

	@Reference
	private Form1ModelArgumentsResolver _form1ModelArgumentsResolver;

}