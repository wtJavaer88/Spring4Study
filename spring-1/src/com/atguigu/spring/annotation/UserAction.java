package com.atguigu.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class UserAction {

	// 接口只有一个实现的时候, Autowired会根据类型(ByType)去找
	// @Autowired
	// private UserService usreService;

	// 接口存在多个实现的时候, 每个实现上写Resposity并指明名字,
	// 调用处写Resource指定名字,若不指定名字,则去找变量名的名字相同的bean
	// @Resource(name = "userServiceImpl")
	// private UserService userService;

	// 如果userServiceImpl改为userService或者变量名改为userServiceImpl
	// 那么这儿就可以只用AutoWired了,
	// IOC会自动根据名称(ByName:属性名和bean注册时的名字一致)去找
	// @Resource(name = "userService")
	@Autowired
	private UserService userServiceImpl;

	// 也可以Autowired和@Qualifier一起配合使用
	@Autowired
	@Qualifier("mgrServiceImpl")
	private UserService mgrService;

	public void execute() {
		System.out.println("接受请求");
		userServiceImpl.addNew();
		mgrService.addNew();
	}

}
