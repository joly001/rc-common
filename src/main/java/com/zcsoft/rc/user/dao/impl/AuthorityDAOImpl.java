package com.zcsoft.rc.user.dao.impl;


import org.springframework.stereotype.Repository;


import com.zcsoft.rc.user.model.entity.Authority;
import com.zcsoft.rc.user.dao.AuthorityDAO;
import com.zcsoft.rc.common.dao.impl.BaseDAOImpl;

import java.util.List;


@Repository
public class AuthorityDAOImpl extends BaseDAOImpl<Authority,java.lang.String> implements AuthorityDAO {

    @Override
    public List<Authority> queryListByUserId(String userId) {
        return selectList("queryListByUserId", userId);
    }
}
