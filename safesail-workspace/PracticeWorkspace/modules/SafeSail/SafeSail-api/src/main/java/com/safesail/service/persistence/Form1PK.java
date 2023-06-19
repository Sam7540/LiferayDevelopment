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

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class Form1PK implements Comparable<Form1PK>, Serializable {

	public long sailId;
	public String quoteId;

	public Form1PK() {
	}

	public Form1PK(long sailId, String quoteId) {
		this.sailId = sailId;
		this.quoteId = quoteId;
	}

	public long getSailId() {
		return sailId;
	}

	public void setSailId(long sailId) {
		this.sailId = sailId;
	}

	public String getQuoteId() {
		return quoteId;
	}

	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}

	@Override
	public int compareTo(Form1PK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (sailId < pk.sailId) {
			value = -1;
		}
		else if (sailId > pk.sailId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		value = quoteId.compareTo(pk.quoteId);

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Form1PK)) {
			return false;
		}

		Form1PK pk = (Form1PK)object;

		if ((sailId == pk.sailId) && quoteId.equals(pk.quoteId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, sailId);
		hashCode = HashUtil.hash(hashCode, quoteId);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(6);

		sb.append("{");

		sb.append("sailId=");

		sb.append(sailId);
		sb.append(", quoteId=");

		sb.append(quoteId);

		sb.append("}");

		return sb.toString();
	}

}