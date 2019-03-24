package com.zcsoft.rc.user.model.entity;


import com.sharingif.cube.components.monitor.IObjectDateOperationHistory;

import java.util.Date;

public class Role implements java.io.Serializable, IObjectDateOperationHistory {
	
	//columns START
    /**
     * id			db_column: ID 
     */	
	private java.lang.String id;
    /**
     * 角色名称			db_column: ROLE_NAME 
     */	
	private java.lang.String roleName;
    /**
     * 角色名称			db_column: ROLE_DESC 
     */	
	private java.lang.String roleDesc;
    /**
     * 00:默认、01:自定义			db_column: ROLE_TYPE 
     */	
	private java.lang.String roleType;
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
	public void setRoleName(java.lang.String roleName) {
		this.roleName = roleName;
	}
	public java.lang.String getRoleName() {
		return this.roleName;
	}
	public void setRoleDesc(java.lang.String roleDesc) {
		this.roleDesc = roleDesc;
	}
	public java.lang.String getRoleDesc() {
		return this.roleDesc;
	}
	public void setRoleType(java.lang.String roleType) {
		this.roleType = roleType;
	}
	public java.lang.String getRoleType() {
		return this.roleType;
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
		return new StringBuilder("Role [")
			.append("Id=").append(getId()).append(", ")
					.append("RoleName=").append(getRoleName()).append(", ")
					.append("RoleDesc=").append(getRoleDesc()).append(", ")
					.append("RoleType=").append(getRoleType()).append(", ")
					.append("CreateTime=").append(getCreateTime()).append(", ")
					.append("ModifyTime=").append(getModifyTime())
		.append("]").toString();
	}
	
}

