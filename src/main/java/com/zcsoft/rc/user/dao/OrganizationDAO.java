package com.zcsoft.rc.user.dao;


import com.zcsoft.rc.user.model.entity.Organization;
import com.zcsoft.rc.common.dao.BaseDAO;

import java.util.List;


public interface OrganizationDAO extends BaseDAO<Organization,java.lang.String> {

    /**
     * 查询指定目录下最大的排序号
     * @param parentId
     * @return
     */
    Integer queryMaxSequenceNumber(String parentId);

    /**
     * 根据上级组织、序列号递减序列号
     * @param parentId
     * @param sequenceNumber
     * @return
     */
    Integer updateDecrementSequenceNumberByParentIdSequenceNumber(String parentId, Integer sequenceNumber);

    /**
     * 组织用户关注
     * @param userId
     * @param followType
     * @return
     */
    List<Organization> queryUserFollowOrganizationList(String userId, String followType);

}
