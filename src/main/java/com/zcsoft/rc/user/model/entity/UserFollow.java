package com.zcsoft.rc.user.model.entity;


public class UserFollow implements java.io.Serializable {
	
	//columns START
    /**
     * 用户id			db_column: USER_ID 
     */	
	private String userId;
    /**
     * 用户关注id			db_column: USER_FOLLOW_ID 
     */	
	private String userFollowId;
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

	public String toString() {
		return new StringBuilder("UserFollow [")
			.append("UserId=").append(getUserId()).append(", ")
					.append("UserFollowId=").append(getUserFollowId())
		.append("]").toString();
	}
	
}

