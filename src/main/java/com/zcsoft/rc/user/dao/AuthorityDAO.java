package com.zcsoft.rc.user.dao;


import com.zcsoft.rc.user.model.entity.Authority;
import com.zcsoft.rc.common.dao.BaseDAO;

import java.util.List;


public interface AuthorityDAO extends BaseDAO<Authority,java.lang.String> {

    /**
     * 根据用户id查询权限
     * @param userId
     * @return
     */
    List<Authority> queryListByUserId(String userId);

}
