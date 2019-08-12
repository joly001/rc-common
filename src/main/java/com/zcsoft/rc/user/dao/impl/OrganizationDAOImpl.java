package com.zcsoft.rc.user.dao.impl;


import org.springframework.stereotype.Repository;


import com.zcsoft.rc.user.model.entity.Organization;
import com.zcsoft.rc.user.dao.OrganizationDAO;
import com.zcsoft.rc.common.dao.impl.BaseDAOImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class OrganizationDAOImpl extends BaseDAOImpl<Organization,java.lang.String> implements OrganizationDAO {

    @Override
    public Integer queryMaxSequenceNumber(String parentId) {
        Organization organization = new Organization();
        organization.setParentId(parentId);

        return query("queryMaxSequenceNumber", organization, Integer.TYPE);
    }

    @Override
    public Integer updateDecrementSequenceNumberByParentIdSequenceNumber(String parentId, Integer sequenceNumber) {
        Organization organization = new Organization();
        organization.setParentId(parentId);
        organization.setSequenceNumber(sequenceNumber);

        return update("updateDecrementSequenceNumberByParentIdSequenceNumber", organization);
    }

    @Override
    public List<Organization> queryUserFollowOrganizationList(String userId, String followType) {
        Map<String, String> parameter = new HashMap<>();
        parameter.put("userId", userId);
        parameter.put("followType", followType);

        return selectList("queryUserFollowOrganizationList", parameter);
    }

    @Override
    public Organization queryByOrgNameParentId(String orgName, String parentId) {
        Organization organization = new Organization();
        organization.setOrgName(orgName);
        organization.setParentId(parentId);

        return selectOne("queryByOrgNameParentId", organization);
    }
}
