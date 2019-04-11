package com.zcsoft.rc.notice.dao.impl;


import org.springframework.stereotype.Repository;


import com.zcsoft.rc.notice.model.entity.Notice;
import com.zcsoft.rc.notice.dao.NoticeDAO;
import com.zcsoft.rc.common.dao.impl.BaseDAOImpl;


@Repository
public class NoticeDAOImpl extends BaseDAOImpl<Notice,java.lang.String> implements NoticeDAO {
	
}
