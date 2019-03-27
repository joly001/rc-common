package com.zcsoft.rc.mileage.model.entity;


import com.sharingif.cube.components.monitor.IObjectDateOperationHistory;
import com.sharingif.cube.components.sequence.Sequence;

import java.util.Date;

public class Mileage implements java.io.Serializable, IObjectDateOperationHistory {
	
	//columns START
    /**
     * id			db_column: ID 
     */
	@Sequence(ref="uuidSequenceGenerator")
	private String id;
    /**
     * 里程点			db_column: MILEAGE_NAME 
     */	
	private String mileageName;
    /**
     * 00:百米标、01:公里标			db_column: MILEAGE_TYPE 
     */	
	private String mileageType;
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
	public void setMileageName(String mileageName) {
		this.mileageName = mileageName;
	}
	public String getMileageName() {
		return this.mileageName;
	}
	public void setMileageType(String mileageType) {
		this.mileageType = mileageType;
	}
	public String getMileageType() {
		return this.mileageType;
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
		return new StringBuilder("Mileage [")
			.append("Id=").append(getId()).append(", ")
					.append("MileageName=").append(getMileageName()).append(", ")
					.append("MileageType=").append(getMileageType()).append(", ")
					.append("StartLongitude=").append(getStartLongitude()).append(", ")
					.append("StartLatitude=").append(getStartLatitude()).append(", ")
					.append("EndLongitude=").append(getEndLongitude()).append(", ")
					.append("EndLatitude=").append(getEndLatitude()).append(", ")
					.append("CreateTime=").append(getCreateTime()).append(", ")
					.append("ModifyTime=").append(getModifyTime())
		.append("]").toString();
	}
	
}

