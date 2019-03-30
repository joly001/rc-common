package com.zcsoft.rc.user.dao.impl;


import org.springframework.stereotype.Repository;


import com.zcsoft.rc.user.model.entity.UserFollow;
import com.zcsoft.rc.user.dao.UserFollowDAO;
import com.zcsoft.rc.common.dao.impl.BaseDAOImpl;

import java.util.HashMap;
import java.util.Map;


@Repository
public class UserFollowDAOImpl extends BaseDAOImpl<UserFollow,java.lang.String> implements UserFollowDAO {

    @Override
    public int deleteByUserIdOrganizationId(String userId, String organizationId) {
        Map<String, String> parameter = new HashMap<>();
        parameter.put("userId", userId);
        parameter.put("organizationId", organizationId);

        return delete("deleteByUserIdOrganizationId", parameter);
    }
}
