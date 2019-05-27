package com.zcsoft.rc.warning.dao.impl;


import com.sharingif.cube.persistence.database.pagination.PaginationCondition;
import com.sharingif.cube.persistence.database.pagination.PaginationRepertory;
import org.springframework.stereotype.Repository;


import com.zcsoft.rc.warning.model.entity.TrainWarning;
import com.zcsoft.rc.warning.dao.TrainWarningDAO;
import com.zcsoft.rc.common.dao.impl.BaseDAOImpl;


@Repository
public class TrainWarningDAOImpl extends BaseDAOImpl<TrainWarning,java.lang.String> implements TrainWarningDAO {

    @Override
    public PaginationRepertory<TrainWarning> queryPaginationListByUserId(PaginationCondition<TrainWarning> paginationCondition) {
        return queryPagination("queryPaginationListByUserId", paginationCondition);
    }
}
