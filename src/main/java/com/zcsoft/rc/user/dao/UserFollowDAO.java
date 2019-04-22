package com.zcsoft.rc.user.dao;


import com.zcsoft.rc.user.model.entity.UserFollow;
import com.zcsoft.rc.common.dao.BaseDAO;

import java.util.List;


public interface UserFollowDAO extends BaseDAO<UserFollow,java.lang.String> {

    /**
     * 根据用户、组织id删除关注
     * @param userId
     * @param organizationId
     * @param followType
     * @return
     */
    int deleteByUserIdOrganizationId(String userId, String organizationId, String followType);

    /**
     * 根据组织机构查询用户列表
     * @param organizationId
     * @param userId
     * @return
     */
    List<UserFollow> queryListByUserIdOrganizationId(String userId, String organizationId);

}
