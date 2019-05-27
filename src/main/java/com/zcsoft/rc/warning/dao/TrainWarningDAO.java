package com.zcsoft.rc.warning.dao;


import com.sharingif.cube.persistence.database.pagination.PaginationCondition;
import com.sharingif.cube.persistence.database.pagination.PaginationRepertory;
import com.zcsoft.rc.common.dao.BaseDAO;
import com.zcsoft.rc.warning.model.entity.TrainWarning;


public interface TrainWarningDAO extends BaseDAO<TrainWarning,java.lang.String> {

    /**
     * 根据用户查询分页警告信息
     * @param paginationCondition
     * @return
     */
    PaginationRepertory<TrainWarning> queryPaginationListByUserId(PaginationCondition<TrainWarning> paginationCondition);

}
