package com.zcsoft.rc.railway.model.entity;


import com.sharingif.cube.components.monitor.IObjectDateOperationHistory;
import com.sharingif.cube.components.sequence.Sequence;

import java.util.Date;

public class RailwayLines implements java.io.Serializable, IObjectDateOperationHistory {

	/**
	 * 类型(00:站点)
	 */
	public static final String TYPE_STATION = "00";

	//columns START
    /**
     * id			db_column: ID 
     */
	@Sequence(ref="uuidSequenceGenerator")
	private String id;
    /**
     * 站点名称			db_column: RAILWAY_LINES_NAME 
     */	
	private String railwayLinesName;
    /**
     * 类型(00:站点)			db_column: TYPE 
     */	
	private String type;
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
     * 上一站站点id			db_column: PREVIOUS_STATION_ID 
     */	
	private String previousStationId;
    /**
     * 上一站站点名称			db_column: PREVIOUS_STATION_NAME 
     */	
	private String previousStationName;
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
	public void setRailwayLinesName(String railwayLinesName) {
		this.railwayLinesName = railwayLinesName;
	}
	public String getRailwayLinesName() {
		return this.railwayLinesName;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return this.type;
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
	public void setPreviousStationId(String previousStationId) {
		this.previousStationId = previousStationId;
	}
	public String getPreviousStationId() {
		return this.previousStationId;
	}
	public void setPreviousStationName(String previousStationName) {
		this.previousStationName = previousStationName;
	}
	public String getPreviousStationName() {
		return this.previousStationName;
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
		return new StringBuilder("RailwayLines [")
			.append("Id=").append(getId()).append(", ")
					.append("RailwayLinesName=").append(getRailwayLinesName()).append(", ")
					.append("Type=").append(getType()).append(", ")
					.append("StartMileageId=").append(getStartMileageId()).append(", ")
					.append("StartMileageName=").append(getStartMileageName()).append(", ")
					.append("EndMileageId=").append(getEndMileageId()).append(", ")
					.append("EndMileageName=").append(getEndMileageName()).append(", ")
					.append("StartLongitude=").append(getStartLongitude()).append(", ")
					.append("StartLatitude=").append(getStartLatitude()).append(", ")
					.append("EndLongitude=").append(getEndLongitude()).append(", ")
					.append("EndLatitude=").append(getEndLatitude()).append(", ")
					.append("PreviousStationId=").append(getPreviousStationId()).append(", ")
					.append("PreviousStationName=").append(getPreviousStationName()).append(", ")
					.append("CreateTime=").append(getCreateTime()).append(", ")
					.append("ModifyTime=").append(getModifyTime())
		.append("]").toString();
	}
	
}

