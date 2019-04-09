package com.zcsoft.rc.mileage.dao;


import com.zcsoft.rc.mileage.model.entity.WorkSegment;
import com.zcsoft.rc.common.dao.BaseDAO;


public interface WorkSegmentDAO extends BaseDAO<WorkSegment,java.lang.String> {

    /**
     * 查询区间纬度作业面信息
     * @param longitude
     * @return
     */
    WorkSegment queryByStartLongitudeEndLongitude(double longitude);

}
