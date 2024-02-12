package com.deilify.userservice.dto;

import java.time.LocalDate;

public class UserAddressCreateDTO {

	private String customerUserId;

	private String customerAddressLine1;

	private String customerAddressLine2;

	private String customerPin;

	private String customerCountry;

	private String customerState;

	private String customerDistrict;

	private String customerLandmark;

	private LocalDate createdTimestamp;

	private LocalDate updatedTimestamp;

	private String modifiedBy;

	/**
	 * @return the customerUserId
	 */
	public String getCustomerUserId() {
		return customerUserId;
	}

	/**
	 * @param customerUserId the customerUserId to set
	 */
	public void setCustomerUserId(String customerUserId) {
		this.customerUserId = customerUserId;
	}

	/**
	 * @return the customerAddressLine1
	 */
	public String getCustomerAddressLine1() {
		return customerAddressLine1;
	}

	/**
	 * @param customerAddressLine1 the customerAddressLine1 to set
	 */
	public void setCustomerAddressLine1(String customerAddressLine1) {
		this.customerAddressLine1 = customerAddressLine1;
	}

	/**
	 * @return the customerAddressLine2
	 */
	public String getCustomerAddressLine2() {
		return customerAddressLine2;
	}

	/**
	 * @param customerAddressLine2 the customerAddressLine2 to set
	 */
	public void setCustomerAddressLine2(String customerAddressLine2) {
		this.customerAddressLine2 = customerAddressLine2;
	}

	/**
	 * @return the customerPin
	 */
	public String getCustomerPin() {
		return customerPin;
	}

	/**
	 * @param customerPin the customerPin to set
	 */
	public void setCustomerPin(String customerPin) {
		this.customerPin = customerPin;
	}

	/**
	 * @return the customerCountry
	 */
	public String getCustomerCountry() {
		return customerCountry;
	}

	/**
	 * @param customerCountry the customerCountry to set
	 */
	public void setCustomerCountry(String customerCountry) {
		this.customerCountry = customerCountry;
	}

	/**
	 * @return the customerState
	 */
	public String getCustomerState() {
		return customerState;
	}

	/**
	 * @param customerState the customerState to set
	 */
	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}

	/**
	 * @return the customerDistrict
	 */
	public String getCustomerDistrict() {
		return customerDistrict;
	}

	/**
	 * @param customerDistrict the customerDistrict to set
	 */
	public void setCustomerDistrict(String customerDistrict) {
		this.customerDistrict = customerDistrict;
	}

	/**
	 * @return the customerLandmark
	 */
	public String getCustomerLandmark() {
		return customerLandmark;
	}

	/**
	 * @param customerLandmark the customerLandmark to set
	 */
	public void setCustomerLandmark(String customerLandmark) {
		this.customerLandmark = customerLandmark;
	}

	/**
	 * @return the createdTimestamp
	 */
	public LocalDate getCreatedTimestamp() {
		return createdTimestamp;
	}

	/**
	 * @param createdTimestamp the createdTimestamp to set
	 */
	public void setCreatedTimestamp(LocalDate createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	/**
	 * @return the updatedTimestamp
	 */
	public LocalDate getUpdatedTimestamp() {
		return updatedTimestamp;
	}

	/**
	 * @param updatedTimestamp the updatedTimestamp to set
	 */
	public void setUpdatedTimestamp(LocalDate updatedTimestamp) {
		this.updatedTimestamp = updatedTimestamp;
	}

	/**
	 * @return the modifiedBy
	 */
	public String getModifiedBy() {
		return modifiedBy;
	}

	/**
	 * @param modifiedBy the modifiedBy to set
	 */
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/**
	 * @param customerUserId
	 * @param customerAddressLine1
	 * @param customerAddressLine2
	 * @param customerPin
	 * @param customerCountry
	 * @param customerState
	 * @param customerDistrict
	 * @param customerLandmark
	 * @param createdTimestamp
	 * @param updatedTimestamp
	 * @param modifiedBy
	 */
	public UserAddressCreateDTO(String customerUserId, String customerAddressLine1, String customerAddressLine2,
			String customerPin, String customerCountry, String customerState, String customerDistrict,
			String customerLandmark, LocalDate createdTimestamp, LocalDate updatedTimestamp, String modifiedBy) {
		super();
		this.customerUserId = customerUserId;
		this.customerAddressLine1 = customerAddressLine1;
		this.customerAddressLine2 = customerAddressLine2;
		this.customerPin = customerPin;
		this.customerCountry = customerCountry;
		this.customerState = customerState;
		this.customerDistrict = customerDistrict;
		this.customerLandmark = customerLandmark;
		this.createdTimestamp = createdTimestamp;
		this.updatedTimestamp = updatedTimestamp;
		this.modifiedBy = modifiedBy;
	}

	/**
	 * 
	 */
	public UserAddressCreateDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserAddressCreateDTO [customerUserId=" + customerUserId + ", customerAddressLine1="
				+ customerAddressLine1 + ", customerAddressLine2=" + customerAddressLine2 + ", customerPin="
				+ customerPin + ", customerCountry=" + customerCountry + ", customerState=" + customerState
				+ ", customerDistrict=" + customerDistrict + ", customerLandmark=" + customerLandmark
				+ ", createdTimestamp=" + createdTimestamp + ", updatedTimestamp=" + updatedTimestamp + ", modifiedBy="
				+ modifiedBy + "]";
	}

}
