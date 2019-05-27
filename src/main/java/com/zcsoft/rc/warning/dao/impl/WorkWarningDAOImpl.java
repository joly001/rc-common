package com.zcsoft.rc.warning.dao.impl;


import com.sharingif.cube.persistence.database.pagination.PaginationCondition;
import com.sharingif.cube.persistence.database.pagination.PaginationRepertory;
import org.springframework.stereotype.Repository;


import com.zcsoft.rc.warning.model.entity.WorkWarning;
import com.zcsoft.rc.warning.dao.WorkWarningDAO;
import com.zcsoft.rc.common.dao.impl.BaseDAOImpl;

import java.util.HashMap;
import java.util.Map;


@Repository
public class WorkWarningDAOImpl extends BaseDAOImpl<WorkWarning,java.lang.String> implements WorkWarningDAO {

    @Override
    public int updateStatusByWorkWarningIdStatus(String workWarningId, String currentStatus, String updateStatus) {
        Map<String, Object> parameter = new HashMap<>();
        parameter.put("workWarningId", workWarningId);
        parameter.put("currentStatus", currentStatus);
        parameter.put("updateStatus", updateStatus);

        return update("updateStatusByWorkWarningIdStatus", parameter);
    }

    @Override
    public PaginationRepertory<WorkWarning> queryPaginationListByUserId(PaginationCondition<WorkWarning> paginationCondition) {
        return queryPagination("queryPaginationListByUserId", paginationCondition);
    }


}
