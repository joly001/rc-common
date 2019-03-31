package com.zcsoft.rc.user.dao;


import com.zcsoft.rc.user.model.entity.UserFollow;
import com.zcsoft.rc.common.dao.BaseDAO;


public interface UserFollowDAO extends BaseDAO<UserFollow,java.lang.String> {

    /**
     * 根据用户、组织id删除关注
     * @param userId
     * @param organizationId
     * @param followType
     * @return
     */
    int deleteByUserIdOrganizationId(String userId, String organizationId, String followType);

}
