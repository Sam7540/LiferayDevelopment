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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Form1}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Form1
 * @generated
 */
public class Form1Wrapper
	extends BaseModelWrapper<Form1> implements Form1, ModelWrapper<Form1> {

	public Form1Wrapper(Form1 form1) {
		super(form1);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("sailId", getSailId());
		attributes.put("quoteId", getQuoteId());
		attributes.put("fullname", getFullname());
		attributes.put("dob", getDob());
		attributes.put("gender", getGender());
		attributes.put("phoneNo", getPhoneNo());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("panNumber", getPanNumber());
		attributes.put("annualIncome", getAnnualIncome());
		attributes.put("sumAssured", getSumAssured());
		attributes.put("policyTerm", getPolicyTerm());
		attributes.put("PPTerm", getPPTerm());
		attributes.put("paymentFrequency", getPaymentFrequency());
		attributes.put("PayoutOption", getPayoutOption());
		attributes.put("lifeSecure", getLifeSecure());
		attributes.put("lifePlus", getLifePlus());
		attributes.put("CIPBenefit", getCIPBenefit());
		attributes.put("totalValues", getTotalValues());
		attributes.put("totalAddon", getTotalAddon());
		attributes.put("agreement", getAgreement());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long sailId = (Long)attributes.get("sailId");

		if (sailId != null) {
			setSailId(sailId);
		}

		String quoteId = (String)attributes.get("quoteId");

		if (quoteId != null) {
			setQuoteId(quoteId);
		}

		String fullname = (String)attributes.get("fullname");

		if (fullname != null) {
			setFullname(fullname);
		}

		Date dob = (Date)attributes.get("dob");

		if (dob != null) {
			setDob(dob);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		Long phoneNo = (Long)attributes.get("phoneNo");

		if (phoneNo != null) {
			setPhoneNo(phoneNo);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		String panNumber = (String)attributes.get("panNumber");

		if (panNumber != null) {
			setPanNumber(panNumber);
		}

		Long annualIncome = (Long)attributes.get("annualIncome");

		if (annualIncome != null) {
			setAnnualIncome(annualIncome);
		}

		Long sumAssured = (Long)attributes.get("sumAssured");

		if (sumAssured != null) {
			setSumAssured(sumAssured);
		}

		Integer policyTerm = (Integer)attributes.get("policyTerm");

		if (policyTerm != null) {
			setPolicyTerm(policyTerm);
		}

		Integer PPTerm = (Integer)attributes.get("PPTerm");

		if (PPTerm != null) {
			setPPTerm(PPTerm);
		}

		String paymentFrequency = (String)attributes.get("paymentFrequency");

		if (paymentFrequency != null) {
			setPaymentFrequency(paymentFrequency);
		}

		String PayoutOption = (String)attributes.get("PayoutOption");

		if (PayoutOption != null) {
			setPayoutOption(PayoutOption);
		}

		Integer lifeSecure = (Integer)attributes.get("lifeSecure");

		if (lifeSecure != null) {
			setLifeSecure(lifeSecure);
		}

		Integer lifePlus = (Integer)attributes.get("lifePlus");

		if (lifePlus != null) {
			setLifePlus(lifePlus);
		}

		Integer CIPBenefit = (Integer)attributes.get("CIPBenefit");

		if (CIPBenefit != null) {
			setCIPBenefit(CIPBenefit);
		}

		Long totalValues = (Long)attributes.get("totalValues");

		if (totalValues != null) {
			setTotalValues(totalValues);
		}

		Long totalAddon = (Long)attributes.get("totalAddon");

		if (totalAddon != null) {
			setTotalAddon(totalAddon);
		}

		Boolean agreement = (Boolean)attributes.get("agreement");

		if (agreement != null) {
			setAgreement(agreement);
		}
	}

	@Override
	public Form1 cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the agreement of this form1.
	 *
	 * @return the agreement of this form1
	 */
	@Override
	public Boolean getAgreement() {
		return model.getAgreement();
	}

	/**
	 * Returns the annual income of this form1.
	 *
	 * @return the annual income of this form1
	 */
	@Override
	public long getAnnualIncome() {
		return model.getAnnualIncome();
	}

	/**
	 * Returns the cip benefit of this form1.
	 *
	 * @return the cip benefit of this form1
	 */
	@Override
	public int getCIPBenefit() {
		return model.getCIPBenefit();
	}

	/**
	 * Returns the dob of this form1.
	 *
	 * @return the dob of this form1
	 */
	@Override
	public Date getDob() {
		return model.getDob();
	}

	/**
	 * Returns the email address of this form1.
	 *
	 * @return the email address of this form1
	 */
	@Override
	public String getEmailAddress() {
		return model.getEmailAddress();
	}

	/**
	 * Returns the fullname of this form1.
	 *
	 * @return the fullname of this form1
	 */
	@Override
	public String getFullname() {
		return model.getFullname();
	}

	/**
	 * Returns the gender of this form1.
	 *
	 * @return the gender of this form1
	 */
	@Override
	public String getGender() {
		return model.getGender();
	}

	/**
	 * Returns the life plus of this form1.
	 *
	 * @return the life plus of this form1
	 */
	@Override
	public int getLifePlus() {
		return model.getLifePlus();
	}

	/**
	 * Returns the life secure of this form1.
	 *
	 * @return the life secure of this form1
	 */
	@Override
	public int getLifeSecure() {
		return model.getLifeSecure();
	}

	/**
	 * Returns the pan number of this form1.
	 *
	 * @return the pan number of this form1
	 */
	@Override
	public String getPanNumber() {
		return model.getPanNumber();
	}

	/**
	 * Returns the payment frequency of this form1.
	 *
	 * @return the payment frequency of this form1
	 */
	@Override
	public String getPaymentFrequency() {
		return model.getPaymentFrequency();
	}

	/**
	 * Returns the payout option of this form1.
	 *
	 * @return the payout option of this form1
	 */
	@Override
	public String getPayoutOption() {
		return model.getPayoutOption();
	}

	/**
	 * Returns the phone no of this form1.
	 *
	 * @return the phone no of this form1
	 */
	@Override
	public long getPhoneNo() {
		return model.getPhoneNo();
	}

	/**
	 * Returns the policy term of this form1.
	 *
	 * @return the policy term of this form1
	 */
	@Override
	public int getPolicyTerm() {
		return model.getPolicyTerm();
	}

	/**
	 * Returns the pp term of this form1.
	 *
	 * @return the pp term of this form1
	 */
	@Override
	public int getPPTerm() {
		return model.getPPTerm();
	}

	/**
	 * Returns the primary key of this form1.
	 *
	 * @return the primary key of this form1
	 */
	@Override
	public com.safesail.service.persistence.Form1PK getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the quote ID of this form1.
	 *
	 * @return the quote ID of this form1
	 */
	@Override
	public String getQuoteId() {
		return model.getQuoteId();
	}

	/**
	 * Returns the sail ID of this form1.
	 *
	 * @return the sail ID of this form1
	 */
	@Override
	public long getSailId() {
		return model.getSailId();
	}

	/**
	 * Returns the sum assured of this form1.
	 *
	 * @return the sum assured of this form1
	 */
	@Override
	public long getSumAssured() {
		return model.getSumAssured();
	}

	/**
	 * Returns the total addon of this form1.
	 *
	 * @return the total addon of this form1
	 */
	@Override
	public long getTotalAddon() {
		return model.getTotalAddon();
	}

	/**
	 * Returns the total values of this form1.
	 *
	 * @return the total values of this form1
	 */
	@Override
	public long getTotalValues() {
		return model.getTotalValues();
	}

	/**
	 * Returns the uuid of this form1.
	 *
	 * @return the uuid of this form1
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the agreement of this form1.
	 *
	 * @param agreement the agreement of this form1
	 */
	@Override
	public void setAgreement(Boolean agreement) {
		model.setAgreement(agreement);
	}

	/**
	 * Sets the annual income of this form1.
	 *
	 * @param annualIncome the annual income of this form1
	 */
	@Override
	public void setAnnualIncome(long annualIncome) {
		model.setAnnualIncome(annualIncome);
	}

	/**
	 * Sets the cip benefit of this form1.
	 *
	 * @param CIPBenefit the cip benefit of this form1
	 */
	@Override
	public void setCIPBenefit(int CIPBenefit) {
		model.setCIPBenefit(CIPBenefit);
	}

	/**
	 * Sets the dob of this form1.
	 *
	 * @param dob the dob of this form1
	 */
	@Override
	public void setDob(Date dob) {
		model.setDob(dob);
	}

	/**
	 * Sets the email address of this form1.
	 *
	 * @param emailAddress the email address of this form1
	 */
	@Override
	public void setEmailAddress(String emailAddress) {
		model.setEmailAddress(emailAddress);
	}

	/**
	 * Sets the fullname of this form1.
	 *
	 * @param fullname the fullname of this form1
	 */
	@Override
	public void setFullname(String fullname) {
		model.setFullname(fullname);
	}

	/**
	 * Sets the gender of this form1.
	 *
	 * @param gender the gender of this form1
	 */
	@Override
	public void setGender(String gender) {
		model.setGender(gender);
	}

	/**
	 * Sets the life plus of this form1.
	 *
	 * @param lifePlus the life plus of this form1
	 */
	@Override
	public void setLifePlus(int lifePlus) {
		model.setLifePlus(lifePlus);
	}

	/**
	 * Sets the life secure of this form1.
	 *
	 * @param lifeSecure the life secure of this form1
	 */
	@Override
	public void setLifeSecure(int lifeSecure) {
		model.setLifeSecure(lifeSecure);
	}

	/**
	 * Sets the pan number of this form1.
	 *
	 * @param panNumber the pan number of this form1
	 */
	@Override
	public void setPanNumber(String panNumber) {
		model.setPanNumber(panNumber);
	}

	/**
	 * Sets the payment frequency of this form1.
	 *
	 * @param paymentFrequency the payment frequency of this form1
	 */
	@Override
	public void setPaymentFrequency(String paymentFrequency) {
		model.setPaymentFrequency(paymentFrequency);
	}

	/**
	 * Sets the payout option of this form1.
	 *
	 * @param PayoutOption the payout option of this form1
	 */
	@Override
	public void setPayoutOption(String PayoutOption) {
		model.setPayoutOption(PayoutOption);
	}

	/**
	 * Sets the phone no of this form1.
	 *
	 * @param phoneNo the phone no of this form1
	 */
	@Override
	public void setPhoneNo(long phoneNo) {
		model.setPhoneNo(phoneNo);
	}

	/**
	 * Sets the policy term of this form1.
	 *
	 * @param policyTerm the policy term of this form1
	 */
	@Override
	public void setPolicyTerm(int policyTerm) {
		model.setPolicyTerm(policyTerm);
	}

	/**
	 * Sets the pp term of this form1.
	 *
	 * @param PPTerm the pp term of this form1
	 */
	@Override
	public void setPPTerm(int PPTerm) {
		model.setPPTerm(PPTerm);
	}

	/**
	 * Sets the primary key of this form1.
	 *
	 * @param primaryKey the primary key of this form1
	 */
	@Override
	public void setPrimaryKey(
		com.safesail.service.persistence.Form1PK primaryKey) {

		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the quote ID of this form1.
	 *
	 * @param quoteId the quote ID of this form1
	 */
	@Override
	public void setQuoteId(String quoteId) {
		model.setQuoteId(quoteId);
	}

	/**
	 * Sets the sail ID of this form1.
	 *
	 * @param sailId the sail ID of this form1
	 */
	@Override
	public void setSailId(long sailId) {
		model.setSailId(sailId);
	}

	/**
	 * Sets the sum assured of this form1.
	 *
	 * @param sumAssured the sum assured of this form1
	 */
	@Override
	public void setSumAssured(long sumAssured) {
		model.setSumAssured(sumAssured);
	}

	/**
	 * Sets the total addon of this form1.
	 *
	 * @param totalAddon the total addon of this form1
	 */
	@Override
	public void setTotalAddon(long totalAddon) {
		model.setTotalAddon(totalAddon);
	}

	/**
	 * Sets the total values of this form1.
	 *
	 * @param totalValues the total values of this form1
	 */
	@Override
	public void setTotalValues(long totalValues) {
		model.setTotalValues(totalValues);
	}

	/**
	 * Sets the uuid of this form1.
	 *
	 * @param uuid the uuid of this form1
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected Form1Wrapper wrap(Form1 form1) {
		return new Form1Wrapper(form1);
	}

}