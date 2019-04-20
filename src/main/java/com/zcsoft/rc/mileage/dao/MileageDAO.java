package com.zcsoft.rc.mileage.dao;


import com.zcsoft.rc.mileage.model.entity.Mileage;
import com.zcsoft.rc.common.dao.BaseDAO;


public interface MileageDAO extends BaseDAO<Mileage,java.lang.String> {

    /**
     * 根据坐标查询里程
     * @param longitude
     * @return
     */
    Mileage queryByStartLongitudeEndLongitude(double longitude);

}
