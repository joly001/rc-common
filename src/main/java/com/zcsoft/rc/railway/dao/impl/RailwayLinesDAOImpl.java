package com.zcsoft.rc.railway.dao.impl;


import com.zcsoft.rc.common.dao.impl.BaseDAOImpl;
import com.zcsoft.rc.railway.dao.RailwayLinesDAO;
import com.zcsoft.rc.railway.model.entity.RailwayLines;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;


@Repository
public class RailwayLinesDAOImpl extends BaseDAOImpl<RailwayLines,java.lang.String> implements RailwayLinesDAO {

    @Override
    public RailwayLines queryByStartLongitudeEndLongitude(double startLongitude, double endLongitude) {
        Map<String,Object> parameterMap = new HashMap<>();
        parameterMap.put("startLongitude",startLongitude);
        parameterMap.put("endLongitude",endLongitude);

        return selectOne("queryByStartLongitudeEndLongitude", parameterMap);
    }
}
