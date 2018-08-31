package com.yn.model;

import java.sql.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BaseModel{
	
	private Date createTiem; //创建时间

	private String createBy; //创建人

	private String updateBy; //更新人

	private Date updateTime; //更新时间
	
	public Date getCreateTiem() {
		return createTiem;
	}
	public void setCreateTiem(Date createTiem) {
		this.createTiem = createTiem;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	@Override
	public String toString() {
		GsonBuilder gsonBuilder = new GsonBuilder();  
		gsonBuilder.serializeNulls(); //null也要展示
		Gson gson = gsonBuilder.create();
		return gson.toJson(this);
	}
	
	
}
