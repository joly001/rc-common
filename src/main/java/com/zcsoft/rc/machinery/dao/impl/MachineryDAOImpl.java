package com.zcsoft.rc.machinery.dao.impl;


import org.springframework.stereotype.Repository;


import com.zcsoft.rc.machinery.model.entity.Machinery;
import com.zcsoft.rc.machinery.dao.MachineryDAO;
import com.zcsoft.rc.common.dao.impl.BaseDAOImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class MachineryDAOImpl extends BaseDAOImpl<Machinery,java.lang.String> implements MachineryDAO {

    @Override
    public List<Machinery> queryUserFollowList(String userId, String followType, String nick) {
        Map<String, String> parameter = new HashMap<>();
        parameter.put("userId", userId);
        parameter.put("followType", followType);
        parameter.put("nick", nick);

        return selectList("queryUserFollowList", parameter);
    }

    @Override
    public List<Machinery> queryUserMachineryList(String userId, String followType) {
        Map<String, String> parameter = new HashMap<>();
        parameter.put("userId", userId);
        parameter.put("followType", followType);

        return selectList("queryUserMachineryList", parameter);
    }
}
