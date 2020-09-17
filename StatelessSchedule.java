/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iut.eHealth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="StatelessSchedule")
public class StatelessSchedule {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="schedule_id")
	private int id;
	
	@Column(name="start_time")
	private String startTime;
	
	@Column(name="end_time")
	private String endTime;
	
	@Transient
	private boolean flag;

	public StatelessSchedule() {
		//flag=false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String start_time) {
		this.startTime = start_time;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String end_time) {
		this.endTime = end_time;
	}

	@Transient
	public boolean isFlag() {
		return flag;
	}

	@Transient
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "StatelessSchedule [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
	
	
	

}
