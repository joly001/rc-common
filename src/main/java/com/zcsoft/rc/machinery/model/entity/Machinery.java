package com.zcsoft.rc.machinery.model.entity;


import com.sharingif.cube.components.monitor.IObjectDateOperationHistory;
import com.sharingif.cube.components.sequence.Sequence;

import java.util.Date;

public class Machinery implements java.io.Serializable, IObjectDateOperationHistory {
	
	//columns START
    /**
     * id			db_column: ID 
     */
	@Sequence(ref="uuidSequenceGenerator")
	private String id;
    /**
     * 车牌号			db_column: PLATE_NUMBER 
     */	
	private String plateNumber;
    /**
     * 机械名称			db_column: MACHINERY_NAME 
     */	
	private String machineryName;
    /**
     * 机械类型(SMALL:小型、MEDIUM:中型、LARGE:大型)			db_column: MACHINERY_TYPE 
     */	
	private String machineryType;
    /**
     * 用户id			db_column: USER_ID 
     */	
	private String userId;
    /**
     * 司机			db_column: NICK 
     */	
	private String nick;
    /**
     * 手机			db_column: MOBILE 
     */	
	private String mobile;
    /**
     * 作业半径			db_column: WORK_RADIUS 
     */	
	private Integer workRadius;
    /**
     * 手环编码			db_column: WRIST_STRAP_CODE 
     */	
	private String wristStrapCode;
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
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public String getPlateNumber() {
		return this.plateNumber;
	}
	public void setMachineryName(String machineryName) {
		this.machineryName = machineryName;
	}
	public String getMachineryName() {
		return this.machineryName;
	}
	public void setMachineryType(String machineryType) {
		this.machineryType = machineryType;
	}
	public String getMachineryType() {
		return this.machineryType;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return this.userId;
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
	public void setWorkRadius(Integer workRadius) {
		this.workRadius = workRadius;
	}
	public Integer getWorkRadius() {
		return this.workRadius;
	}
	public void setWristStrapCode(String wristStrapCode) {
		this.wristStrapCode = wristStrapCode;
	}
	public String getWristStrapCode() {
		return this.wristStrapCode;
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
		return new StringBuilder("Machinery [")
			.append("Id=").append(getId()).append(", ")
					.append("PlateNumber=").append(getPlateNumber()).append(", ")
					.append("MachineryName=").append(getMachineryName()).append(", ")
					.append("MachineryType=").append(getMachineryType()).append(", ")
					.append("UserId=").append(getUserId()).append(", ")
					.append("Nick=").append(getNick()).append(", ")
					.append("Mobile=").append(getMobile()).append(", ")
					.append("WorkRadius=").append(getWorkRadius()).append(", ")
					.append("WristStrapCode=").append(getWristStrapCode()).append(", ")
					.append("CreateTime=").append(getCreateTime()).append(", ")
					.append("ModifyTime=").append(getModifyTime())
		.append("]").toString();
	}
	
}

