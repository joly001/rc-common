package com.zcsoft.rc.user.model.entity;


import com.sharingif.cube.components.monitor.IObjectDateOperationHistory;
import com.sharingif.cube.components.sequence.Sequence;
import com.zcsoft.rc.bms.api.user.entity.OrganizationAllRsp;

import java.util.ArrayList;
import java.util.Date;

public class Organization implements java.io.Serializable, IObjectDateOperationHistory {
	
	//columns START
    /**
     * id			db_column: ID 
     */
	@Sequence(ref="uuidSequenceGenerator")
	private String id;
    /**
     * 组织名称			db_column: ORG_NAME 
     */	
	private String orgName;
    /**
     * 组织描述			db_column: ORG_DESC 
     */	
	private String orgDesc;
    /**
     * 排序号			db_column: SEQUENCE_NUMBER 
     */	
	private Integer sequenceNumber;
    /**
     * 上级id			db_column: PARENT_ID 
     */	
	private String parentId;
    /**
     * 创建时间			db_column: CREATE_TIME 
     */	
	private Date createTime;
    /**
     * 修改时间			db_column: MODIFY_TIME 
     */	
	private Date modifyTime;
	//columns END

	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getOrgName() {
		return this.orgName;
	}
	public void setOrgDesc(String orgDesc) {
		this.orgDesc = orgDesc;
	}
	public String getOrgDesc() {
		return this.orgDesc;
	}
	public void setSequenceNumber(Integer sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	public Integer getSequenceNumber() {
		return this.sequenceNumber;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getParentId() {
		return this.parentId;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime() {
		return this.createTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public Date getModifyTime() {
		return this.modifyTime;
	}

	public OrganizationAllRsp convertToOrganizationAllRsp() {
		OrganizationAllRsp organizationAllRsp = new OrganizationAllRsp();
		organizationAllRsp.setId(getId());
		organizationAllRsp.setOrgName(getOrgName());
		organizationAllRsp.setSequenceNumber(getSequenceNumber());
		organizationAllRsp.setChildOrgList(new ArrayList<>());

		return organizationAllRsp;
	}

	public String toString() {
		return new StringBuilder("Organization [")
			.append("Id=").append(getId()).append(", ")
					.append("OrgName=").append(getOrgName()).append(", ")
					.append("OrgDesc=").append(getOrgDesc()).append(", ")
					.append("SequenceNumber=").append(getSequenceNumber()).append(", ")
					.append("ParentId=").append(getParentId()).append(", ")
					.append("CreateTime=").append(getCreateTime()).append(", ")
					.append("ModifyTime=").append(getModifyTime())
		.append("]").toString();
	}
	
}

