package com.zcsoft.rc.warning.model.entity;


import com.sharingif.cube.components.monitor.IObjectDateOperationHistory;
import com.sharingif.cube.components.sequence.Sequence;

import java.util.Date;

public class TrainWarning implements java.io.Serializable, IObjectDateOperationHistory {

	/**
	 * 类型(00:列车临站)
	 */
	public static final String TYPE_TEMPORARY_STATION = "00";
	/**
	 * 类型(01:列车接近)
	 */
	public static final String TYPE_TRAIN_APPROACHING = "01";

	//columns START
    /**
     * id			db_column: ID 
     */
	@Sequence(ref="uuidSequenceGenerator")
	private String id;
    /**
     * 昵称			db_column: NICK 
     */	
	private String nick;
    /**
     * 手机			db_column: MOBILE 
     */	
	private String mobile;
    /**
     * 用户id			db_column: USER_ID 
     */	
	private String userId;
    /**
     * 上/下行(0:上行、1:下行)			db_column: DIRECTION 
     */	
	private String direction;
    /**
     * 状态(CREATE:创建、FINISH:结束)			db_column: STATUS 
     */	
	private String status;
    /**
     * 类型(00:列车临站、01:列车接近)			db_column: TYPE 
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
     * 作业面id			db_column: WORK_SEGMENT_ID 
     */	
	private String workSegmentId;
    /**
     * 作业面名称			db_column: WORK_SEGMENT_NAME 
     */	
	private String workSegmentName;
    /**
     * 站点id			db_column: RAILWAY_LINES_ID 
     */	
	private String railwayLinesId;
    /**
     * 站点名称			db_column: RAILWAY_LINES_NAME 
     */	
	private String railwayLinesName;
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
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return this.userId;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getDirection() {
		return this.direction;
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
	public void setRailwayLinesId(String railwayLinesId) {
		this.railwayLinesId = railwayLinesId;
	}
	public String getRailwayLinesId() {
		return this.railwayLinesId;
	}
	public void setRailwayLinesName(String railwayLinesName) {
		this.railwayLinesName = railwayLinesName;
	}
	public String getRailwayLinesName() {
		return this.railwayLinesName;
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
		return new StringBuilder("TrainWarning [")
			.append("Id=").append(getId()).append(", ")
					.append("Nick=").append(getNick()).append(", ")
					.append("Mobile=").append(getMobile()).append(", ")
					.append("UserId=").append(getUserId()).append(", ")
					.append("Direction=").append(getDirection()).append(", ")
					.append("Status=").append(getStatus()).append(", ")
					.append("Type=").append(getType()).append(", ")
					.append("Longitude=").append(getLongitude()).append(", ")
					.append("Latitude=").append(getLatitude()).append(", ")
					.append("WorkSegmentId=").append(getWorkSegmentId()).append(", ")
					.append("WorkSegmentName=").append(getWorkSegmentName()).append(", ")
					.append("RailwayLinesId=").append(getRailwayLinesId()).append(", ")
					.append("RailwayLinesName=").append(getRailwayLinesName()).append(", ")
					.append("CreateTime=").append(getCreateTime()).append(", ")
					.append("ModifyTime=").append(getModifyTime())
		.append("]").toString();
	}
	
}

