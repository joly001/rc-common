package com.zcsoft.rc.mileage.dao.impl;


import org.springframework.stereotype.Repository;


import com.zcsoft.rc.mileage.model.entity.WorkSegment;
import com.zcsoft.rc.mileage.dao.WorkSegmentDAO;
import com.zcsoft.rc.common.dao.impl.BaseDAOImpl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class WorkSegmentDAOImpl extends BaseDAOImpl<WorkSegment,java.lang.String> implements WorkSegmentDAO {

    @Override
    public WorkSegment queryByStartLongitudeEndLongitude(double longitude) {
        return selectOne("queryByStartLongitudeEndLongitude", longitude);
    }

    @Override
    public List<WorkSegment> queryListByWorkDate(Date startWorkDate, Date endWorkDate) {
        Map<String, Object> parameter = new HashMap<>();
        parameter.put("startWorkDate", startWorkDate);
        parameter.put("endWorkDate", endWorkDate);

        return selectList("queryListByWorkDate", parameter);
    }

}
