package com.zcsoft.rc.warning.model.entity;


import com.sharingif.cube.components.monitor.IObjectDateOperationHistory;
import com.sharingif.cube.components.sequence.Sequence;

import java.util.Date;

public class WorkWarning implements java.io.Serializable, IObjectDateOperationHistory {

	/**
	 * 状态(CREATE:创建)
	 */
	public static final String STATUS_CREATE = "CREATE";
	/**
	 * 状态(FINISH:结束)
	 */
	public static final String STATUS_FINISH = "FINISH";

	/**
	 * 类型(00:接近警告线)
	 */
	public static final String TYPE_APPROACHING_THE_WARNING_LINE = "00";
	/**
	 * 类型(01:碾压光缆)
	 */
	public static final String TYPE_ROLLING_CABLE = "01";

	//columns START
    /**
     * id			db_column: ID 
     */
	@Sequence(ref="uuidSequenceGenerator")
	private String id;
    /**
     * 警告id			db_column: WORK_WARNING_ID 
     */	
	private String workWarningId;
    /**
     * 里程区间id			db_column: MILEAGE_SEGMENT_ID 
     */	
	private String mileageSegmentId;
    /**
     * 里程区间名称			db_column: MILEAGE_SEGMENT_NAME 
     */	
	private String mileageSegmentName;
    /**
     * 作业面id			db_column: WORK_SEGMENT_ID 
     */	
	private String workSegmentId;
    /**
     * 作业面名称			db_column: WORK_SEGMENT_NAME 
     */	
	private String workSegmentName;
    /**
     * 作业面开始位置经度			db_column: WORK_SEGMENT_START_LONGITUDE 
     */	
	private Double workSegmentStartLongitude;
    /**
     * 作业面开始位置纬度			db_column: WORK_SEGMENT_START_LATITUDE 
     */	
	private Double workSegmentStartLatitude;
    /**
     * 作业面结束位置经度			db_column: WORK_SEGMENT_END_LONGITUDE 
     */	
	private Double workSegmentEndLongitude;
    /**
     * 作业面结束位置纬度			db_column: WORK_SEGMENT_END_LATITUDE 
     */	
	private Double workSegmentEndLatitude;
    /**
     * 用户id			db_column: USER_ID 
     */	
	private String userId;
    /**
     * 施工人员类型(00:机车、01:列车、02:作业人员、03:作业负责人、04:安全员、05:防护员、06:监理、07:其它人员)			db_column: BUILDER_USER_TYPE 
     */	
	private String builderUserType;
    /**
     * 部门id			db_column: DEP_ID 
     */	
	private String depId;
    /**
     * 部门名称			db_column: DEP_NAME 
     */	
	private String depName;
    /**
     * 组织id			db_column: ORG_ID 
     */	
	private String orgId;
    /**
     * 组织名称			db_column: ORG_NAME 
     */	
	private String orgName;
    /**
     * 昵称			db_column: NICK 
     */	
	private String nick;
    /**
     * 手机			db_column: MOBILE 
     */	
	private String mobile;
    /**
     * 状态(CREATE:创建、FINISH:结束)			db_column: STATUS 
     */	
	private String status;
    /**
     * 类型(00:接近警告线)			db_column: TYPE 
     */	
	private String type;
    /**
     * 警告位置经度			db_column: LONGITUDE 
     */	
	private Double longitude;
    /**
     * 警告位置纬度			db_column: LATITUDE 
     */	
	private Double latitude;
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
	public void setWorkWarningId(String workWarningId) {
		this.workWarningId = workWarningId;
	}
	public String getWorkWarningId() {
		return this.workWarningId;
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
	public void setWorkSegmentId(String workSegmentId) {
		this.workSegmentId = workSegmentId;
	}
	public String getWorkSegmentId() {
		return this.workSegmentId;
	}
	public void setWorkSegmentName(String workSegmentName) {
		this.workSegmentName = workSegmentName;
	}
	public String getWorkSegmentName() {
		return this.workSegmentName;
	}
	public void setWorkSegmentStartLongitude(Double workSegmentStartLongitude) {
		this.workSegmentStartLongitude = workSegmentStartLongitude;
	}
	public Double getWorkSegmentStartLongitude() {
		return this.workSegmentStartLongitude;
	}
	public void setWorkSegmentStartLatitude(Double workSegmentStartLatitude) {
		this.workSegmentStartLatitude = workSegmentStartLatitude;
	}
	public Double getWorkSegmentStartLatitude() {
		return this.workSegmentStartLatitude;
	}
	public void setWorkSegmentEndLongitude(Double workSegmentEndLongitude) {
		this.workSegmentEndLongitude = workSegmentEndLongitude;
	}
	public Double getWorkSegmentEndLongitude() {
		return this.workSegmentEndLongitude;
	}
	public void setWorkSegmentEndLatitude(Double workSegmentEndLatitude) {
		this.workSegmentEndLatitude = workSegmentEndLatitude;
	}
	public Double getWorkSegmentEndLatitude() {
		return this.workSegmentEndLatitude;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return this.userId;
	}
	public void setBuilderUserType(String builderUserType) {
		this.builderUserType = builderUserType;
	}
	public String getBuilderUserType() {
		return this.builderUserType;
	}
	public void setDepId(String depId) {
		this.depId = depId;
	}
	public String getDepId() {
		return this.depId;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public String getDepName() {
		return this.depName;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getOrgName() {
		return this.orgName;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick() {
		return this.nick;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile() {
		return this.mobile;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return this.type;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLongitude() {
		return this.longitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLatitude() {
		return this.latitude;
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
		return new StringBuilder("WorkWarning [")
			.append("Id=").append(getId()).append(", ")
					.append("WorkWarningId=").append(getWorkWarningId()).append(", ")
					.append("MileageSegmentId=").append(getMileageSegmentId()).append(", ")
					.append("MileageSegmentName=").append(getMileageSegmentName()).append(", ")
					.append("WorkSegmentId=").append(getWorkSegmentId()).append(", ")
					.append("WorkSegmentName=").append(getWorkSegmentName()).append(", ")
					.append("WorkSegmentStartLongitude=").append(getWorkSegmentStartLongitude()).append(", ")
					.append("WorkSegmentStartLatitude=").append(getWorkSegmentStartLatitude()).append(", ")
					.append("WorkSegmentEndLongitude=").append(getWorkSegmentEndLongitude()).append(", ")
					.append("WorkSegmentEndLatitude=").append(getWorkSegmentEndLatitude()).append(", ")
					.append("UserId=").append(getUserId()).append(", ")
					.append("BuilderUserType=").append(getBuilderUserType()).append(", ")
					.append("DepId=").append(getDepId()).append(", ")
					.append("DepName=").append(getDepName()).append(", ")
					.append("OrgId=").append(getOrgId()).append(", ")
					.append("OrgName=").append(getOrgName()).append(", ")
					.append("Nick=").append(getNick()).append(", ")
					.append("Mobile=").append(getMobile()).append(", ")
					.append("Status=").append(getStatus()).append(", ")
					.append("Type=").append(getType()).append(", ")
					.append("Longitude=").append(getLongitude()).append(", ")
					.append("Latitude=").append(getLatitude()).append(", ")
					.append("CreateTime=").append(getCreateTime()).append(", ")
					.append("ModifyTime=").append(getModifyTime())
		.append("]").toString();
	}
	
}

