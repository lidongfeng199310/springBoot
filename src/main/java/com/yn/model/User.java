package com.yn.model;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;

@ApiModel(value="User",description="用户相关字段")
public class User extends BaseModel{
	

	@ApiParam(name="id")
	private Long id;   

	@ApiParam(name="名字")
	@NotNull(message = "名字不能为空")
	private String name; //名字

	@ApiParam(name="密码")
	private String pwd;  //密码
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	

}
