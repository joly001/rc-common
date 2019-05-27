package com.zcsoft.rc.warning.dao;


import com.sharingif.cube.persistence.database.pagination.PaginationCondition;
import com.sharingif.cube.persistence.database.pagination.PaginationRepertory;
import com.zcsoft.rc.warning.model.entity.WorkWarning;
import com.zcsoft.rc.common.dao.BaseDAO;


public interface WorkWarningDAO extends BaseDAO<WorkWarning,java.lang.String> {

    /**
     * 根据userId、状态修改状态
     * @param workWarningId
     * @param currentStatus
     * @param updateStatus
     * @return
     */
    int updateStatusByWorkWarningIdStatus(String workWarningId, String currentStatus, String updateStatus);

    /**
     * 根据用户查询分页警告信息
     * @param paginationCondition
     * @return
     */
    PaginationRepertory<WorkWarning> queryPaginationListByUserId(PaginationCondition<WorkWarning> paginationCondition);

}
