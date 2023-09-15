package com.test1;

public class RTGSMapping {
	private Integer code;
	private String areaName;
	private String allotmentNum;
	private String branchName;
	private String city;
	private String country;
	private String creationDate;
	private String modifiedDate;
	private String entityState;
	private String effectiveStatus;

	public RTGSMapping() {

	}

	public RTGSMapping(Integer code, String areaName, String allotmentNum, String branchName, String city,
			String country, String creationDate, String modifiedDate, String entityState, String effectiveStatus) {
		super();
		this.code = code;
		this.areaName = areaName;
		this.allotmentNum = allotmentNum;
		this.branchName = branchName;
		this.city = city;
		this.country = country;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
		this.effectiveStatus = effectiveStatus;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getAllotmentNum() {
		return allotmentNum;
	}

	public void setAllotmentNum(String allotmentNum) {
		this.allotmentNum = allotmentNum;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

	public String getEffectiveStatus() {
		return effectiveStatus;
	}

	public void setEffectiveStatus(String effectiveStatus) {
		this.effectiveStatus = effectiveStatus;
	}

}
