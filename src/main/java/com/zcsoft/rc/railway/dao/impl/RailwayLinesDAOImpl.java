package com.zcsoft.rc.railway.dao.impl;


import com.zcsoft.rc.common.dao.impl.BaseDAOImpl;
import com.zcsoft.rc.railway.dao.RailwayLinesDAO;
import com.zcsoft.rc.railway.model.entity.RailwayLines;
import org.springframework.stereotype.Repository;


@Repository
public class RailwayLinesDAOImpl extends BaseDAOImpl<RailwayLines,java.lang.String> implements RailwayLinesDAO {

    @Override
    public RailwayLines queryByStartLongitudeEndLongitude(double longitude) {
        return selectOne("queryByStartLongitudeEndLongitude", longitude);
    }
}
