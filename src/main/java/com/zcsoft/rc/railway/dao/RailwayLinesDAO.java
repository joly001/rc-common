package com.zcsoft.rc.railway.dao;


import com.zcsoft.rc.railway.model.entity.RailwayLines;
import com.zcsoft.rc.common.dao.BaseDAO;


public interface RailwayLinesDAO extends BaseDAO<RailwayLines,java.lang.String> {

    /**
     * 查询区间经度车站信息
     * @param startLongitude
     * @param endLongitude
     * @return
     */
    RailwayLines queryByStartLongitudeEndLongitude(double startLongitude, double endLongitude);

}
