package com.zcsoft.rc.warning.dao;


import com.zcsoft.rc.warning.model.entity.WorkWarning;
import com.zcsoft.rc.common.dao.BaseDAO;


public interface WorkWarningDAO extends BaseDAO<WorkWarning,java.lang.String> {

    /**
     * 根据userId、状态修改状态
     * @param userId
     * @param currentStatus
     * @param updateStatus
     * @return
     */
    int updateStatusByUserIdStatus(String userId, String currentStatus, String updateStatus);

}
