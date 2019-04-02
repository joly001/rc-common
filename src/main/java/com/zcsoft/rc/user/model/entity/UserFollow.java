package com.zcsoft.rc.user.model.entity;


import com.sharingif.cube.components.monitor.IObjectDateOperationHistory;

import java.util.Date;

public class UserFollow implements java.io.Serializable, IObjectDateOperationHistory {

	/**
	 * 关注类型(00:用户)
	 */
	public static final String FOLLOW_TYPE_USER = "00";
	/**
	 * 关注类型(01:机械)
	 */
	public static final String FOLLOW_TYPE_MACHINERY = "01";
	/**
	 * 关注类型(02:组织)
	 */
	public static final String FOLLOW_TYPE_ORGANIZATION = "02";

	//columns START
    /**
     * 用户id			db_column: USER_ID 
     */	
	private String userId;
    /**
     * 用户关注id			db_column: USER_FOLLOW_ID 
     */	
	private String userFollowId;
    /**
     * 关注类型(00:用户、01:机械)			db_column: FOLLOW_TYPE 
     */	
	private String followType;
    /**
     * 创建时间			db_column: CREATE_TIME 
     */	
	private Date createTime;
    /**
     * 修改时间			db_column: MODIFY_TIME 
     */	
	private Date modifyTime;
	//columns END

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return this.userId;
	}
	public void setUserFollowId(String userFollowId) {
		this.userFollowId = userFollowId;
	}
	public String getUserFollowId() {
		return this.userFollowId;
	}
	public void setFollowType(String followType) {
		this.followType = followType;
	}
	public String getFollowType() {
		return this.followType;
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
		return new StringBuilder("UserFollow [")
			.append("UserId=").append(getUserId()).append(", ")
					.append("UserFollowId=").append(getUserFollowId()).append(", ")
					.append("FollowType=").append(getFollowType()).append(", ")
					.append("CreateTime=").append(getCreateTime()).append(", ")
					.append("ModifyTime=").append(getModifyTime())
		.append("]").toString();
	}
	
}

