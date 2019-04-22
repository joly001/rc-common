package com.zcsoft.rc.user.dao.impl;


import org.springframework.stereotype.Repository;


import com.zcsoft.rc.user.model.entity.User;
import com.zcsoft.rc.user.dao.UserDAO;
import com.zcsoft.rc.common.dao.impl.BaseDAOImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class UserDAOImpl extends BaseDAOImpl<User,java.lang.String> implements UserDAO {

    @Override
    public List<User> queryUserFollowListByUserId(String userId) {

        return selectList("queryUserFollowListByUserId", userId);
    }

    @Override
    public List<User> queryUserFollowListByOrganizationId(String userId, String organizationId, String followType, String nick) {
        Map<String, String> parameter = new HashMap<>();
        parameter.put("userId", userId);
        parameter.put("organizationId", organizationId);
        parameter.put("followType", followType);
        parameter.put("nick", nick);

        return selectList("queryUserFollowListByOrganizationId", parameter);
    }
}
