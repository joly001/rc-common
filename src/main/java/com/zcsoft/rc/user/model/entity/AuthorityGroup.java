package com.zcsoft.rc.user.model.entity;


import com.sharingif.cube.components.monitor.IObjectDateOperationHistory;
import com.zcsoft.rc.bms.api.user.entity.AuthoritiesAllRsp;

import java.util.ArrayList;
import java.util.Date;

public class AuthorityGroup implements java.io.Serializable, IObjectDateOperationHistory {
	
	//columns START
    /**
     * id			db_column: ID 
     */	
	private java.lang.String id;
    /**
     * 权限组名称			db_column: AUTHORITY_GROUP_NAME 
     */	
	private java.lang.String authorityGroupName;
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
	public void setAuthorityGroupName(java.lang.String authorityGroupName) {
		this.authorityGroupName = authorityGroupName;
	}
	public java.lang.String getAuthorityGroupName() {
		return this.authorityGroupName;
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

	public AuthoritiesAllRsp convertToAuthoritiesAllRsp() {
		AuthoritiesAllRsp authoritiesAllRsp = new AuthoritiesAllRsp();
		authoritiesAllRsp.setId(getId());
		authoritiesAllRsp.setName(getAuthorityGroupName());
		authoritiesAllRsp.setSequenceNumber(getSequenceNumber());
		authoritiesAllRsp.setAuthorities(new ArrayList<>());

		return authoritiesAllRsp;
	}

	public String toString() {
		return new StringBuilder("AuthorityGroup [")
			.append("Id=").append(getId()).append(", ")
					.append("AuthorityGroupName=").append(getAuthorityGroupName()).append(", ")
					.append("SequenceNumber=").append(getSequenceNumber()).append(", ")
					.append("ParentId=").append(getParentId()).append(", ")
					.append("CreateTime=").append(getCreateTime()).append(", ")
					.append("ModifyTime=").append(getModifyTime())
		.append("]").toString();
	}
	
}

