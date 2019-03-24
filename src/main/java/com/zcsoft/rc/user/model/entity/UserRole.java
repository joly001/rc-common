package com.zcsoft.rc.user.model.entity;


public class UserRole implements java.io.Serializable {
	
	//columns START
    /**
     * 用户编号			db_column: USER_ID 
     */	
	private java.lang.String userId;
    /**
     * 角色代码			db_column: ROLE_CODE 
     */	
	private java.lang.String roleCode;
	//columns END

	public void setUserId(java.lang.String userId) {
		this.userId = userId;
	}
	public java.lang.String getUserId() {
		return this.userId;
	}
	public void setRoleCode(java.lang.String roleCode) {
		this.roleCode = roleCode;
	}
	public java.lang.String getRoleCode() {
		return this.roleCode;
	}

	public String toString() {
		return new StringBuilder("UserRole [")
			.append("UserId=").append(getUserId()).append(", ")
					.append("RoleCode=").append(getRoleCode())
		.append("]").toString();
	}
	
}

