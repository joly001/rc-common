package com.zcsoft.rc.user.model.entity;


import com.sharingif.cube.components.monitor.IObjectDateOperationHistory;

import java.util.Date;

public class Organization implements java.io.Serializable, IObjectDateOperationHistory {
	
	//columns START
    /**
     * id			db_column: ID 
     */	
	private java.lang.String id;
    /**
     * 组织名称			db_column: ORG_NAME 
     */	
	private java.lang.String orgName;
    /**
     * 组织描述			db_column: ORG_DESC 
     */	
	private java.lang.String orgDesc;
    /**
     * 排序号			db_column: SEQUENCE_NUMBER 
     */	
	private java.lang.Integer sequenceNumber;
    /**
     * 上级id			db_column: PARENT_ID 
     */	
	private java.lang.String parentId;
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
	public void setOrgName(java.lang.String orgName) {
		this.orgName = orgName;
	}
	public java.lang.String getOrgName() {
		return this.orgName;
	}
	public void setOrgDesc(java.lang.String orgDesc) {
		this.orgDesc = orgDesc;
	}
	public java.lang.String getOrgDesc() {
		return this.orgDesc;
	}
	public void setSequenceNumber(java.lang.Integer sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	public java.lang.Integer getSequenceNumber() {
		return this.sequenceNumber;
	}
	public void setParentId(java.lang.String parentId) {
		this.parentId = parentId;
	}
	public java.lang.String getParentId() {
		return this.parentId;
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
		return new StringBuilder("Organization [")
			.append("Id=").append(getId()).append(", ")
					.append("OrgName=").append(getOrgName()).append(", ")
					.append("OrgDesc=").append(getOrgDesc()).append(", ")
					.append("SequenceNumber=").append(getSequenceNumber()).append(", ")
					.append("ParentId=").append(getParentId()).append(", ")
					.append("CreateTime=").append(getCreateTime()).append(", ")
					.append("ModifyTime=").append(getModifyTime())
		.append("]").toString();
	}
	
}

