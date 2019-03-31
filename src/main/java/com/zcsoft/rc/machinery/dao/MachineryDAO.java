package com.zcsoft.rc.machinery.dao;


import com.zcsoft.rc.machinery.model.entity.Machinery;
import com.zcsoft.rc.common.dao.BaseDAO;

import java.util.List;


public interface MachineryDAO extends BaseDAO<Machinery,java.lang.String> {

    /**
     * 查询机械列表，包含用户关注标志
     * @param userId
     * @param followType
     * @return
     */
    List<Machinery> queryUserFollowList(String userId, String followType);

}
