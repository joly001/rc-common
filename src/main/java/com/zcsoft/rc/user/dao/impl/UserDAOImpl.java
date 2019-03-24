package com.zcsoft.rc.user.dao.impl;


import org.springframework.stereotype.Repository;


import com.zcsoft.rc.user.model.entity.User;
import com.zcsoft.rc.user.dao.UserDAO;
import com.zcsoft.rc.common.dao.impl.BaseDAOImpl;


@Repository
public class UserDAOImpl extends BaseDAOImpl<User,java.lang.String> implements UserDAO {
	
}
