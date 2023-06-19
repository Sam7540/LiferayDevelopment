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

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.safesail.model.Form1;
import com.safesail.service.persistence.Form1PK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Form1 in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class Form1CacheModel implements CacheModel<Form1>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Form1CacheModel)) {
			return false;
		}

		Form1CacheModel form1CacheModel = (Form1CacheModel)object;

		if (form1PK.equals(form1CacheModel.form1PK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, form1PK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", sailId=");
		sb.append(sailId);
		sb.append(", quoteId=");
		sb.append(quoteId);
		sb.append(", fullname=");
		sb.append(fullname);
		sb.append(", dob=");
		sb.append(dob);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", phoneNo=");
		sb.append(phoneNo);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", panNumber=");
		sb.append(panNumber);
		sb.append(", annualIncome=");
		sb.append(annualIncome);
		sb.append(", sumAssured=");
		sb.append(sumAssured);
		sb.append(", policyTerm=");
		sb.append(policyTerm);
		sb.append(", PPTerm=");
		sb.append(PPTerm);
		sb.append(", paymentFrequency=");
		sb.append(paymentFrequency);
		sb.append(", PayoutOption=");
		sb.append(PayoutOption);
		sb.append(", lifeSecure=");
		sb.append(lifeSecure);
		sb.append(", lifePlus=");
		sb.append(lifePlus);
		sb.append(", CIPBenefit=");
		sb.append(CIPBenefit);
		sb.append(", totalValues=");
		sb.append(totalValues);
		sb.append(", totalAddon=");
		sb.append(totalAddon);
		sb.append(", agreement=");
		sb.append(agreement);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Form1 toEntityModel() {
		Form1Impl form1Impl = new Form1Impl();

		if (uuid == null) {
			form1Impl.setUuid("");
		}
		else {
			form1Impl.setUuid(uuid);
		}

		form1Impl.setSailId(sailId);

		if (quoteId == null) {
			form1Impl.setQuoteId("");
		}
		else {
			form1Impl.setQuoteId(quoteId);
		}

		if (fullname == null) {
			form1Impl.setFullname("");
		}
		else {
			form1Impl.setFullname(fullname);
		}

		if (dob == Long.MIN_VALUE) {
			form1Impl.setDob(null);
		}
		else {
			form1Impl.setDob(new Date(dob));
		}

		if (gender == null) {
			form1Impl.setGender("");
		}
		else {
			form1Impl.setGender(gender);
		}

		form1Impl.setPhoneNo(phoneNo);

		if (emailAddress == null) {
			form1Impl.setEmailAddress("");
		}
		else {
			form1Impl.setEmailAddress(emailAddress);
		}

		if (panNumber == null) {
			form1Impl.setPanNumber("");
		}
		else {
			form1Impl.setPanNumber(panNumber);
		}

		form1Impl.setAnnualIncome(annualIncome);
		form1Impl.setSumAssured(sumAssured);
		form1Impl.setPolicyTerm(policyTerm);
		form1Impl.setPPTerm(PPTerm);

		if (paymentFrequency == null) {
			form1Impl.setPaymentFrequency("");
		}
		else {
			form1Impl.setPaymentFrequency(paymentFrequency);
		}

		if (PayoutOption == null) {
			form1Impl.setPayoutOption("");
		}
		else {
			form1Impl.setPayoutOption(PayoutOption);
		}

		form1Impl.setLifeSecure(lifeSecure);
		form1Impl.setLifePlus(lifePlus);
		form1Impl.setCIPBenefit(CIPBenefit);
		form1Impl.setTotalValues(totalValues);
		form1Impl.setTotalAddon(totalAddon);
		form1Impl.setAgreement(agreement);

		form1Impl.resetOriginalValues();

		return form1Impl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		sailId = objectInput.readLong();
		quoteId = objectInput.readUTF();
		fullname = objectInput.readUTF();
		dob = objectInput.readLong();
		gender = objectInput.readUTF();

		phoneNo = objectInput.readLong();
		emailAddress = objectInput.readUTF();
		panNumber = objectInput.readUTF();

		annualIncome = objectInput.readLong();

		sumAssured = objectInput.readLong();

		policyTerm = objectInput.readInt();

		PPTerm = objectInput.readInt();
		paymentFrequency = objectInput.readUTF();
		PayoutOption = objectInput.readUTF();

		lifeSecure = objectInput.readInt();

		lifePlus = objectInput.readInt();

		CIPBenefit = objectInput.readInt();

		totalValues = objectInput.readLong();

		totalAddon = objectInput.readLong();

		agreement = objectInput.readBoolean();

		form1PK = new Form1PK(sailId, quoteId);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(sailId);

		if (quoteId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(quoteId);
		}

		if (fullname == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fullname);
		}

		objectOutput.writeLong(dob);

		if (gender == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(gender);
		}

		objectOutput.writeLong(phoneNo);

		if (emailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		if (panNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(panNumber);
		}

		objectOutput.writeLong(annualIncome);

		objectOutput.writeLong(sumAssured);

		objectOutput.writeInt(policyTerm);

		objectOutput.writeInt(PPTerm);

		if (paymentFrequency == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(paymentFrequency);
		}

		if (PayoutOption == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(PayoutOption);
		}

		objectOutput.writeInt(lifeSecure);

		objectOutput.writeInt(lifePlus);

		objectOutput.writeInt(CIPBenefit);

		objectOutput.writeLong(totalValues);

		objectOutput.writeLong(totalAddon);

		objectOutput.writeBoolean(agreement);
	}

	public String uuid;
	public long sailId;
	public String quoteId;
	public String fullname;
	public long dob;
	public String gender;
	public long phoneNo;
	public String emailAddress;
	public String panNumber;
	public long annualIncome;
	public long sumAssured;
	public int policyTerm;
	public int PPTerm;
	public String paymentFrequency;
	public String PayoutOption;
	public int lifeSecure;
	public int lifePlus;
	public int CIPBenefit;
	public long totalValues;
	public long totalAddon;
	public boolean agreement;
	public transient Form1PK form1PK;

}