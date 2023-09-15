package com.test1;

public class RTGSInternational {
	private Integer code;
	private String countryId;
	private String mappingBranch;
	private Integer mappingAreaCode;
	private String managerName;
	private String lastWorkingDay;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public RTGSInternational() {

	}

	public RTGSInternational(Integer code, String countryId, String mappingBranch, Integer mappingAreaCode,
			String managerName, String lastWorkingDay, String creationDate, String modifiedDate, String entityState) {
		super();
		this.code = code;
		this.countryId = countryId;
		this.mappingBranch = mappingBranch;
		this.mappingAreaCode = mappingAreaCode;
		this.managerName = managerName;
		this.lastWorkingDay = lastWorkingDay;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getMappingBranch() {
		return mappingBranch;
	}

	public void setMappingBranch(String mappingBranch) {
		this.mappingBranch = mappingBranch;
	}

	public Integer getMappingAreaCode() {
		return mappingAreaCode;
	}

	public void setMappingAreaCode(Integer mappingAreaCode) {
		this.mappingAreaCode = mappingAreaCode;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getLastWorkingDay() {
		return lastWorkingDay;
	}

	public void setLastWorkingDay(String lastWorkingDay) {
		this.lastWorkingDay = lastWorkingDay;
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

}
