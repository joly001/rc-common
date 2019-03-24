package com.zcsoft.rc.user.model.entity;


import com.sharingif.cube.components.monitor.IObjectDateOperationHistory;
import com.sharingif.cube.security.authentication.authority.ICoreAuthority;

import java.util.Date;

public class Authority implements java.io.Serializable, IObjectDateOperationHistory, ICoreAuthority {
	
	//columns START
    /**
     * 权限代码			db_column: AUTHORITY_CODE 
     */	
	private String authorityCode;
    /**
     * 权限名称			db_column: AUTHORITY_NAME 
     */	
	private String authorityName;
    /**
     * 权限组ID			db_column: AUTHORITY_GROUP_ID 
     */	
	private String authorityGroupId;
    /**
     * 创建时间			db_column: CREATE_TIME 
     */	
	private Date createTime;
    /**
     * 修改时间			db_column: MODIFY_TIME 
     */	
	private Date modifyTime;
	//columns END

	public void setAuthorityCode(String authorityCode) {
		this.authorityCode = authorityCode;
	}
	public String getAuthorityCode() {
		return this.authorityCode;
	}
	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}
	public String getAuthorityName() {
		return this.authorityName;
	}
	public void setAuthorityGroupId(String authorityGroupId) {
		this.authorityGroupId = authorityGroupId;
	}
	public String getAuthorityGroupId() {
		return this.authorityGroupId;
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
		return new StringBuilder("Authority [")
			.append("AuthorityCode=").append(getAuthorityCode()).append(", ")
					.append("AuthorityName=").append(getAuthorityName()).append(", ")
					.append("AuthorityGroupId=").append(getAuthorityGroupId()).append(", ")
					.append("CreateTime=").append(getCreateTime()).append(", ")
					.append("ModifyTime=").append(getModifyTime())
		.append("]").toString();
	}
	
}

