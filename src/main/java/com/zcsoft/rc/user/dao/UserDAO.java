package com.zcsoft.rc.user.dao;


import com.zcsoft.rc.common.dao.BaseDAO;
import com.zcsoft.rc.user.model.entity.User;

import java.util.List;


public interface UserDAO extends BaseDAO<User,java.lang.String> {

    /**
     * 根据用户id查询用户关注列表
     * @param userId
     * @return
     */
    List<User> queryUserFollowListByUserId(String userId);

    /**
     * 根据组织id查询用户关注列表
     * @param userId
     * @param organizationId
     * @return
     */
    List<User> queryUserFollowListByOrganizationId(String userId, String organizationId);

}
