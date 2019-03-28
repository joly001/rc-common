package com.zcsoft.rc.mileage.model.entity;


import com.sharingif.cube.components.monitor.IObjectDateOperationHistory;

public class WorkSegmentDataTime implements java.io.Serializable, IObjectDateOperationHistory {
	
	//columns START
    /**
     * id			db_column: ID 
     */	
	private java.lang.String id;
    /**
     * 作业面id			db_column: WORK_SEGMENT_ID 
     */	
	private java.lang.String workSegmentId;
    /**
     * 作业时间			db_column: WORK_TIME 
     */	
	private Date workTime;
	//columns END

	public void setId(java.lang.String id) {
		this.id = id;
	}
	public java.lang.String getId() {
		return this.id;
	}
	public void setWorkSegmentId(java.lang.String workSegmentId) {
		this.workSegmentId = workSegmentId;
	}
	public java.lang.String getWorkSegmentId() {
		return this.workSegmentId;
	}
	public void setWorkTime(Date workTime) {
		this.workTime = workTime;
	}
	public Date getWorkTime() {
		return this.workTime;
	}

	public String toString() {
		return new StringBuilder("WorkSegmentDataTime [")
			.append("Id=").append(getId()).append(", ")
					.append("WorkSegmentId=").append(getWorkSegmentId()).append(", ")
					.append("WorkTime=").append(getWorkTime())
		.append("]").toString();
	}
	
}

