package com.yn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yn.model.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "测试swagger2")
@RestController
public class TestSwagger2Controller {
	
	@ApiOperation(value = "主页面请求",notes = "只请求用做于页面登录展示,请求必传有这几个name,pwd")
	@PostMapping("/index")
    public String index(@RequestBody User user) {
        return user.toString();
    }

	@GetMapping("/hello")
    public String login() {
        return "Hello World is ok login";
    }
	
}
