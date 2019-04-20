package com.zcsoft.rc.mileage.dao.impl;


import org.springframework.stereotype.Repository;


import com.zcsoft.rc.mileage.model.entity.MileageSegment;
import com.zcsoft.rc.mileage.dao.MileageSegmentDAO;
import com.zcsoft.rc.common.dao.impl.BaseDAOImpl;


@Repository
public class MileageSegmentDAOImpl extends BaseDAOImpl<MileageSegment,java.lang.String> implements MileageSegmentDAO {

    @Override
    public MileageSegment queryByStartLongitudeEndLongitude(double longitude) {
        return selectOne("queryByStartLongitudeEndLongitude", longitude);
    }
}
