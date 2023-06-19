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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;Safe_Sail_Form1&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Form1
 * @generated
 */
public class Form1Table extends BaseTable<Form1Table> {

	public static final Form1Table INSTANCE = new Form1Table();

	public final Column<Form1Table, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Form1Table, Long> sailId = createColumn(
		"sailId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<Form1Table, String> quoteId = createColumn(
		"quoteId", String.class, Types.VARCHAR, Column.FLAG_PRIMARY);
	public final Column<Form1Table, String> fullname = createColumn(
		"fullname", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Form1Table, Date> dob = createColumn(
		"dob", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<Form1Table, String> gender = createColumn(
		"gender", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Form1Table, Long> phoneNo = createColumn(
		"phoneNo", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<Form1Table, String> emailAddress = createColumn(
		"emailAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Form1Table, String> panNumber = createColumn(
		"panNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Form1Table, Long> annualIncome = createColumn(
		"annualIncome", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<Form1Table, Long> sumAssured = createColumn(
		"sumAssured", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<Form1Table, Integer> policyTerm = createColumn(
		"policyTerm", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<Form1Table, Integer> PPTerm = createColumn(
		"PPTerm", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<Form1Table, String> paymentFrequency = createColumn(
		"paymentFrequency", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Form1Table, String> PayoutOption = createColumn(
		"PayoutOption", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Form1Table, Integer> lifeSecure = createColumn(
		"lifeSecure", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<Form1Table, Integer> lifePlus = createColumn(
		"lifePlus", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<Form1Table, Integer> CIPBenefit = createColumn(
		"CIPBenefit", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<Form1Table, Long> totalValues = createColumn(
		"totalValues", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<Form1Table, Long> totalAddon = createColumn(
		"totalAddon", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<Form1Table, Boolean> agreement = createColumn(
		"agreement", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);

	private Form1Table() {
		super("Safe_Sail_Form1", Form1Table::new);
	}

}