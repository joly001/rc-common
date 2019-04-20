package com.zcsoft.rc.mileage.dao.impl;


import org.springframework.stereotype.Repository;


import com.zcsoft.rc.mileage.model.entity.Mileage;
import com.zcsoft.rc.mileage.dao.MileageDAO;
import com.zcsoft.rc.common.dao.impl.BaseDAOImpl;


@Repository
public class MileageDAOImpl extends BaseDAOImpl<Mileage,java.lang.String> implements MileageDAO {

    @Override
    public Mileage queryByStartLongitudeEndLongitude(double longitude) {
        return selectOne("queryByStartLongitudeEndLongitude", longitude);
    }
}
