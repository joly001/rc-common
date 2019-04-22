package com.zcsoft.rc.user.dao.impl;


import com.zcsoft.rc.common.dao.impl.BaseDAOImpl;
import com.zcsoft.rc.user.dao.UserFollowDAO;
import com.zcsoft.rc.user.model.entity.UserFollow;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class UserFollowDAOImpl extends BaseDAOImpl<UserFollow,java.lang.String> implements UserFollowDAO {

    @Override
    public int deleteByUserIdOrganizationId(String userId, String organizationId, String followType) {
        Map<String, String> parameter = new HashMap<>();
        parameter.put("userId", userId);
        parameter.put("organizationId", organizationId);
        parameter.put("followType", followType);

        return delete("deleteByUserIdOrganizationId", parameter);
    }

    @Override
    public List<UserFollow> queryListByUserIdOrganizationId(String userId, String organizationId) {
        Map<String, String> parameter = new HashMap<>();
        parameter.put("userId", userId);
        parameter.put("organizationId", organizationId);

        return selectList("queryListByUserIdOrganizationId", parameter);
    }
}
