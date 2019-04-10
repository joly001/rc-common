package com.zcsoft.rc.mileage.model.entity;


import com.sharingif.cube.components.sequence.Sequence;

import java.util.Date;

public class WorkSegmentDataTime implements java.io.Serializable {
	
	//columns START
    /**
     * id			db_column: ID 
     */
	@Sequence(ref="uuidSequenceGenerator")
	private String id;
    /**
     * 作业面id			db_column: WORK_SEGMENT_ID 
     */	
	private String workSegmentId;
    /**
     * 开始作业时间			db_column: STARTWORK_TIME 
     */	
	private Date startworkTime;
    /**
     * 结束作业时间			db_column: END_WORK_TIME 
     */	
	private Date endWorkTime;
	//columns END

	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setWorkSegmentId(String workSegmentId) {
		this.workSegmentId = workSegmentId;
	}
	public String getWorkSegmentId() {
		return this.workSegmentId;
	}
	public void setStartworkTime(Date startworkTime) {
		this.startworkTime = startworkTime;
	}
	public Date getStartworkTime() {
		return this.startworkTime;
	}
	public void setEndWorkTime(Date endWorkTime) {
		this.endWorkTime = endWorkTime;
	}
	public Date getEndWorkTime() {
		return this.endWorkTime;
	}

	public String toString() {
		return new StringBuilder("WorkSegmentDataTime [")
			.append("Id=").append(getId()).append(", ")
					.append("WorkSegmentId=").append(getWorkSegmentId()).append(", ")
					.append("StartworkTime=").append(getStartworkTime()).append(", ")
					.append("EndWorkTime=").append(getEndWorkTime())
		.append("]").toString();
	}
	
}

