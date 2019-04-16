package com.zcsoft.rc.mileage.dao;


import com.zcsoft.rc.mileage.model.entity.WorkSegment;
import com.zcsoft.rc.common.dao.BaseDAO;

import java.util.Date;
import java.util.List;


public interface WorkSegmentDAO extends BaseDAO<WorkSegment,java.lang.String> {

    /**
     * 查询区间经度作业面信息
     * @param longitude
     * @return
     */
    WorkSegment queryByStartLongitudeEndLongitude(double longitude);

    /**
     * 根据时间查询作业面列表
     * @param startWorkDate
     * @param endWorkDate
     * @return
     */
    List<WorkSegment> queryListByWorkDate(Date startWorkDate, Date endWorkDate);

}
