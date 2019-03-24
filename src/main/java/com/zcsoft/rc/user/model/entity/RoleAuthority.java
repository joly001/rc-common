package com.zcsoft.rc.user.model.entity;


public class RoleAuthority implements java.io.Serializable {
	
	//columns START
    /**
     * 角色代码			db_column: ROLE_CODE 
     */	
	private java.lang.String roleCode;
    /**
     * 权限代码			db_column: AUTHORITY_CODE 
     */	
	private java.lang.String authorityCode;
	//columns END

	public void setRoleCode(java.lang.String roleCode) {
		this.roleCode = roleCode;
	}
	public java.lang.String getRoleCode() {
		return this.roleCode;
	}
	public void setAuthorityCode(java.lang.String authorityCode) {
		this.authorityCode = authorityCode;
	}
	public java.lang.String getAuthorityCode() {
		return this.authorityCode;
	}

	public String toString() {
		return new StringBuilder("RoleAuthority [")
			.append("RoleCode=").append(getRoleCode()).append(", ")
					.append("AuthorityCode=").append(getAuthorityCode())
		.append("]").toString();
	}
	
}

