package com.zcsoft.rc.sys.model.entity;


import com.sharingif.cube.components.monitor.IObjectDateOperationHistory;
import com.sharingif.cube.components.sequence.Sequence;

import java.util.Date;

public class SysParameter implements java.io.Serializable, IObjectDateOperationHistory {

	/**
	 * 安全红线
	 */
	public static final String KEY_CORDON = "CORDON";
	/**
	 * 火车接近作业面人员报警距离
	 */
	public static final String KEY_TRAIN_APPROACHING_DISTANCE = "TRAIN_APPROACHING_DISTANCE";
	
	//columns START
    /**
     * id			db_column: ID 
     */
	@Sequence(ref="uuidSequenceGenerator")
	private String id;
    /**
     * 渠道(00:所有平台、01:APP、02:管理平台)			db_column: CHANNEL 
     */	
	private String channel;
    /**
     * 版本(ALL:所有版本)			db_column: VERSION 
     */	
	private String version;
    /**
     * 参数名称			db_column: PARAMETER_NAME 
     */	
	private String parameterName;
    /**
     * 参数值			db_column: PARAMETER_VALUE 
     */	
	private String parameterValue;
    /**
     * 参数说明			db_column: PARAMETER_DESC 
     */	
	private String parameterDesc;
    /**
     * 类型(000:通知、001:安全红线、002:线缆、003:列车、004:GPS)			db_column: TYPE 
     */	
	private String type;
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
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getChannel() {
		return this.channel;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getVersion() {
		return this.version;
	}
	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}
	public String getParameterName() {
		return this.parameterName;
	}
	public void setParameterValue(String parameterValue) {
		this.parameterValue = parameterValue;
	}
	public String getParameterValue() {
		return this.parameterValue;
	}
	public void setParameterDesc(String parameterDesc) {
		this.parameterDesc = parameterDesc;
	}
	public String getParameterDesc() {
		return this.parameterDesc;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return this.type;
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
		return new StringBuilder("SysParameter [")
			.append("Id=").append(getId()).append(", ")
					.append("Channel=").append(getChannel()).append(", ")
					.append("Version=").append(getVersion()).append(", ")
					.append("ParameterName=").append(getParameterName()).append(", ")
					.append("ParameterValue=").append(getParameterValue()).append(", ")
					.append("ParameterDesc=").append(getParameterDesc()).append(", ")
					.append("Type=").append(getType()).append(", ")
					.append("CreateTime=").append(getCreateTime()).append(", ")
					.append("ModifyTime=").append(getModifyTime())
		.append("]").toString();
	}
	
}

