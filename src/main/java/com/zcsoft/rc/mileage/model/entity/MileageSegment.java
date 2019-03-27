package com.zcsoft.rc.mileage.model.entity;


import com.sharingif.cube.components.monitor.IObjectDateOperationHistory;

public class MileageSegment implements java.io.Serializable, IObjectDateOperationHistory {
	
	//columns START
    /**
     * id			db_column: ID 
     */	
	private java.lang.String id;
    /**
     * 里程区间名称			db_column: MILEAGE_SEGMENT_NAME 
     */	
	private java.lang.String mileageSegmentName;
    /**
     * 开始里程点id			db_column: START_MILEAGE_ID 
     */	
	private java.lang.String startMileageId;
    /**
     * 开始里程点			db_column: START_MILEAGE_NAME 
     */	
	private java.lang.String startMileageName;
    /**
     * 结束里程点id			db_column: END_MILEAGE_ID 
     */	
	private java.lang.String endMileageId;
    /**
     * 结束里程点			db_column: END_MILEAGE_NAME 
     */	
	private java.lang.String endMileageName;
    /**
     * 开始位置经度			db_column: START_LONGITUDE 
     */	
	private BigDecimal startLongitude;
    /**
     * 开始位置纬度			db_column: START_LATITUDE 
     */	
	private BigDecimal startLatitude;
    /**
     * 结束位置经度			db_column: END_LONGITUDE 
     */	
	private BigDecimal endLongitude;
    /**
     * 结束位置纬度			db_column: END_LATITUDE 
     */	
	private BigDecimal endLatitude;
    /**
     * 作业周期			db_column: WORKING_CYCLE 
     */	
	private java.lang.Integer workingCycle;
    /**
     * 创建时间			db_column: CREATE_TIME 
     */	
	private Date createTime;
    /**
     * 修改时间			db_column: MODIFY_TIME 
     */	
	private Date modifyTime;
	//columns END

	public void setId(java.lang.String id) {
		this.id = id;
	}
	public java.lang.String getId() {
		return this.id;
	}
	public void setMileageSegmentName(java.lang.String mileageSegmentName) {
		this.mileageSegmentName = mileageSegmentName;
	}
	public java.lang.String getMileageSegmentName() {
		return this.mileageSegmentName;
	}
	public void setStartMileageId(java.lang.String startMileageId) {
		this.startMileageId = startMileageId;
	}
	public java.lang.String getStartMileageId() {
		return this.startMileageId;
	}
	public void setStartMileageName(java.lang.String startMileageName) {
		this.startMileageName = startMileageName;
	}
	public java.lang.String getStartMileageName() {
		return this.startMileageName;
	}
	public void setEndMileageId(java.lang.String endMileageId) {
		this.endMileageId = endMileageId;
	}
	public java.lang.String getEndMileageId() {
		return this.endMileageId;
	}
	public void setEndMileageName(java.lang.String endMileageName) {
		this.endMileageName = endMileageName;
	}
	public java.lang.String getEndMileageName() {
		return this.endMileageName;
	}
	public void setStartLongitude(BigDecimal startLongitude) {
		this.startLongitude = startLongitude;
	}
	public BigDecimal getStartLongitude() {
		return this.startLongitude;
	}
	public void setStartLatitude(BigDecimal startLatitude) {
		this.startLatitude = startLatitude;
	}
	public BigDecimal getStartLatitude() {
		return this.startLatitude;
	}
	public void setEndLongitude(BigDecimal endLongitude) {
		this.endLongitude = endLongitude;
	}
	public BigDecimal getEndLongitude() {
		return this.endLongitude;
	}
	public void setEndLatitude(BigDecimal endLatitude) {
		this.endLatitude = endLatitude;
	}
	public BigDecimal getEndLatitude() {
		return this.endLatitude;
	}
	public void setWorkingCycle(java.lang.Integer workingCycle) {
		this.workingCycle = workingCycle;
	}
	public java.lang.Integer getWorkingCycle() {
		return this.workingCycle;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime() {
		return this.createTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public Date getModifyTime() {
		return this.modifyTime;
	}

	public String toString() {
		return new StringBuilder("MileageSegment [")
			.append("Id=").append(getId()).append(", ")
					.append("MileageSegmentName=").append(getMileageSegmentName()).append(", ")
					.append("StartMileageId=").append(getStartMileageId()).append(", ")
					.append("StartMileageName=").append(getStartMileageName()).append(", ")
					.append("EndMileageId=").append(getEndMileageId()).append(", ")
					.append("EndMileageName=").append(getEndMileageName()).append(", ")
					.append("StartLongitude=").append(getStartLongitude()).append(", ")
					.append("StartLatitude=").append(getStartLatitude()).append(", ")
					.append("EndLongitude=").append(getEndLongitude()).append(", ")
					.append("EndLatitude=").append(getEndLatitude()).append(", ")
					.append("WorkingCycle=").append(getWorkingCycle()).append(", ")
					.append("CreateTime=").append(getCreateTime()).append(", ")
					.append("ModifyTime=").append(getModifyTime())
		.append("]").toString();
	}
	
}

