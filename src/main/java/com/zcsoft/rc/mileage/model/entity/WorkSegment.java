package com.zcsoft.rc.mileage.model.entity;


import com.sharingif.cube.components.monitor.IObjectDateOperationHistory;
import com.sharingif.cube.components.sequence.Sequence;

import java.util.Date;

public class WorkSegment implements java.io.Serializable, IObjectDateOperationHistory {
	
	//columns START
    /**
     * id			db_column: ID 
     */
	@Sequence(ref="uuidSequenceGenerator")
	private String id;
    /**
     * 作业面名称			db_column: WORK_SEGMENT_NAME 
     */	
	private String workSegmentName;
    /**
     * 里程区间id			db_column: MILEAGE_SEGMENT_ID 
     */	
	private String mileageSegmentId;
    /**
     * 里程区间名称			db_column: MILEAGE_SEGMENT_NAME 
     */	
	private String mileageSegmentName;
    /**
     * 开始里程点id			db_column: START_MILEAGE_ID 
     */	
	private String startMileageId;
    /**
     * 开始里程点			db_column: START_MILEAGE_NAME 
     */	
	private String startMileageName;
    /**
     * 结束里程点id			db_column: END_MILEAGE_ID 
     */	
	private String endMileageId;
    /**
     * 结束里程点			db_column: END_MILEAGE_NAME 
     */	
	private String endMileageName;
    /**
     * 开始位置经度			db_column: START_LONGITUDE 
     */	
	private Double startLongitude;
    /**
     * 开始位置纬度			db_column: START_LATITUDE 
     */	
	private Double startLatitude;
    /**
     * 结束位置经度			db_column: END_LONGITUDE 
     */	
	private Double endLongitude;
    /**
     * 结束位置纬度			db_column: END_LATITUDE 
     */	
	private Double endLatitude;
    /**
     * 作业类型(00:上行、01:下行)			db_column: WORK_TYPE 
     */	
	private String workType;
    /**
     * 作业时间			db_column: WORK_DATE 
     */	
	private Date workDate;
    /**
     * 安全防护人员数			db_column: SAFETY_PROTECTION_PERSONNEL 
     */	
	private Integer safetyProtectionPersonnel;
    /**
     * 现场人员数			db_column: WORK_PERSONNEL 
     */	
	private Integer workPersonnel;
    /**
     * 提交人员id			db_column: SUBMIT_USER_ID 
     */	
	private String submitUserId;
    /**
     * 提交人员名称			db_column: SUBMIT_USER_NAME 
     */	
	private String submitUserName;
    /**
     * 提交时间			db_column: SUBMIT_TIME 
     */	
	private Date submitTime;
    /**
     * 创建时间			db_column: CREATE_TIME 
     */	
	private Date createTime;
    /**
     * 修改时间			db_column: MODIFY_TIME 
     */	
	private Date modifyTime;
	//columns END

	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setWorkSegmentName(String workSegmentName) {
		this.workSegmentName = workSegmentName;
	}
	public String getWorkSegmentName() {
		return this.workSegmentName;
	}
	public void setMileageSegmentId(String mileageSegmentId) {
		this.mileageSegmentId = mileageSegmentId;
	}
	public String getMileageSegmentId() {
		return this.mileageSegmentId;
	}
	public void setMileageSegmentName(String mileageSegmentName) {
		this.mileageSegmentName = mileageSegmentName;
	}
	public String getMileageSegmentName() {
		return this.mileageSegmentName;
	}
	public void setStartMileageId(String startMileageId) {
		this.startMileageId = startMileageId;
	}
	public String getStartMileageId() {
		return this.startMileageId;
	}
	public void setStartMileageName(String startMileageName) {
		this.startMileageName = startMileageName;
	}
	public String getStartMileageName() {
		return this.startMileageName;
	}
	public void setEndMileageId(String endMileageId) {
		this.endMileageId = endMileageId;
	}
	public String getEndMileageId() {
		return this.endMileageId;
	}
	public void setEndMileageName(String endMileageName) {
		this.endMileageName = endMileageName;
	}
	public String getEndMileageName() {
		return this.endMileageName;
	}
	public void setStartLongitude(Double startLongitude) {
		this.startLongitude = startLongitude;
	}
	public Double getStartLongitude() {
		return this.startLongitude;
	}
	public void setStartLatitude(Double startLatitude) {
		this.startLatitude = startLatitude;
	}
	public Double getStartLatitude() {
		return this.startLatitude;
	}
	public void setEndLongitude(Double endLongitude) {
		this.endLongitude = endLongitude;
	}
	public Double getEndLongitude() {
		return this.endLongitude;
	}
	public void setEndLatitude(Double endLatitude) {
		this.endLatitude = endLatitude;
	}
	public Double getEndLatitude() {
		return this.endLatitude;
	}
	public void setWorkType(String workType) {
		this.workType = workType;
	}
	public String getWorkType() {
		return this.workType;
	}
	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
	}
	public Date getWorkDate() {
		return this.workDate;
	}
	public void setSafetyProtectionPersonnel(Integer safetyProtectionPersonnel) {
		this.safetyProtectionPersonnel = safetyProtectionPersonnel;
	}
	public Integer getSafetyProtectionPersonnel() {
		return this.safetyProtectionPersonnel;
	}
	public void setWorkPersonnel(Integer workPersonnel) {
		this.workPersonnel = workPersonnel;
	}
	public Integer getWorkPersonnel() {
		return this.workPersonnel;
	}
	public void setSubmitUserId(String submitUserId) {
		this.submitUserId = submitUserId;
	}
	public String getSubmitUserId() {
		return this.submitUserId;
	}
	public void setSubmitUserName(String submitUserName) {
		this.submitUserName = submitUserName;
	}
	public String getSubmitUserName() {
		return this.submitUserName;
	}
	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}
	public Date getSubmitTime() {
		return this.submitTime;
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
		return new StringBuilder("WorkSegment [")
			.append("Id=").append(getId()).append(", ")
					.append("WorkSegmentName=").append(getWorkSegmentName()).append(", ")
					.append("MileageSegmentId=").append(getMileageSegmentId()).append(", ")
					.append("MileageSegmentName=").append(getMileageSegmentName()).append(", ")
					.append("StartMileageId=").append(getStartMileageId()).append(", ")
					.append("StartMileageName=").append(getStartMileageName()).append(", ")
					.append("EndMileageId=").append(getEndMileageId()).append(", ")
					.append("EndMileageName=").append(getEndMileageName()).append(", ")
					.append("StartLongitude=").append(getStartLongitude()).append(", ")
					.append("StartLatitude=").append(getStartLatitude()).append(", ")
					.append("EndLongitude=").append(getEndLongitude()).append(", ")
					.append("EndLatitude=").append(getEndLatitude()).append(", ")
					.append("WorkType=").append(getWorkType()).append(", ")
					.append("WorkDate=").append(getWorkDate()).append(", ")
					.append("SafetyProtectionPersonnel=").append(getSafetyProtectionPersonnel()).append(", ")
					.append("WorkPersonnel=").append(getWorkPersonnel()).append(", ")
					.append("SubmitUserId=").append(getSubmitUserId()).append(", ")
					.append("SubmitUserName=").append(getSubmitUserName()).append(", ")
					.append("SubmitTime=").append(getSubmitTime()).append(", ")
					.append("CreateTime=").append(getCreateTime()).append(", ")
					.append("ModifyTime=").append(getModifyTime())
		.append("]").toString();
	}
	
}

