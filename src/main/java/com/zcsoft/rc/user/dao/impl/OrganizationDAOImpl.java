package com.zcsoft.rc.user.dao.impl;


import org.springframework.stereotype.Repository;


import com.zcsoft.rc.user.model.entity.Organization;
import com.zcsoft.rc.user.dao.OrganizationDAO;
import com.zcsoft.rc.common.dao.impl.BaseDAOImpl;


@Repository
public class OrganizationDAOImpl extends BaseDAOImpl<Organization,java.lang.String> implements OrganizationDAO {

    @Override
    public Integer queryMaxSequenceNumber(String parentId) {
        Organization organization = new Organization();
        organization.setParentId(parentId);

        return query("queryMaxSequenceNumber", organization, Integer.TYPE);
    }
}
