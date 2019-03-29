package com.zcsoft.rc.user.model.entity;


import com.sharingif.cube.components.monitor.IObjectDateOperationHistory;
import com.sharingif.cube.components.sequence.Sequence;

import java.util.Date;

public class Role implements java.io.Serializable, IObjectDateOperationHistory {

	/**
	 * 角色类型(00:默认)
	 */
	public static final String ROLE_TYPE_DEFAULT = "00";
	/**
	 * 角色类型(01:自定义)
	 */
	public static final String ROLE_TYPE_CUSTOM = "01";

	//columns START
    /**
     * id			db_column: ID 
     */
	@Sequence(ref="uuidSequenceGenerator")
	private String id;
    /**
     * 角色名称			db_column: ROLE_NAME 
     */	
	private String roleName;
    /**
     * 角色描述			db_column: ROLE_DESC
     */	
	private String roleDesc;
    /**
     * 00:默认、01:自定义			db_column: ROLE_TYPE 
     */	
	private String roleType;
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
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleName() {
		return this.roleName;
	}
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}
	public String getRoleDesc() {
		return this.roleDesc;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	public String getRoleType() {
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

