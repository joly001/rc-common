package com.zcsoft.rc.user.model.entity;


public class UserFollow implements java.io.Serializable {

	/**
	 * 关注类型(00:用户)
	 */
	public static final String FOLLOW_TYPE_USER = "00";
	/**
	 * 关注类型(01:机械)
	 */
	public static final String FOLLOW_TYPE_MACHINERY = "01";

	//columns START
    /**
     * 用户id			db_column: USER_ID 
     */	
	private java.lang.String userId;
    /**
     * 用户关注id			db_column: USER_FOLLOW_ID 
     */	
	private java.lang.String userFollowId;
    /**
     * 关注类型(00:用户、01:机械)			db_column: FOLLOW_TYPE 
     */	
	private java.lang.String followType;
	//columns END

	public void setUserId(java.lang.String userId) {
		this.userId = userId;
	}
	public java.lang.String getUserId() {
		return this.userId;
	}
	public void setUserFollowId(java.lang.String userFollowId) {
		this.userFollowId = userFollowId;
	}
	public java.lang.String getUserFollowId() {
		return this.userFollowId;
	}
	public void setFollowType(java.lang.String followType) {
		this.followType = followType;
	}
	public java.lang.String getFollowType() {
		return this.followType;
	}

	public String toString() {
		return new StringBuilder("UserFollow [")
			.append("UserId=").append(getUserId()).append(", ")
					.append("UserFollowId=").append(getUserFollowId()).append(", ")
					.append("FollowType=").append(getFollowType())
		.append("]").toString();
	}
	
}

