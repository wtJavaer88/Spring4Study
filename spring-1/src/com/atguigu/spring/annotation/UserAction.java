package com.atguigu.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class UserAction {

	// �ӿ�ֻ��һ��ʵ�ֵ�ʱ��, Autowired���������(ByType)ȥ��
	// @Autowired
	// private UserService usreService;

	// �ӿڴ��ڶ��ʵ�ֵ�ʱ��, ÿ��ʵ����дResposity��ָ������,
	// ���ô�дResourceָ������,����ָ������,��ȥ�ұ�������������ͬ��bean
	// @Resource(name = "userServiceImpl")
	// private UserService userService;

	// ���userServiceImpl��ΪuserService���߱�������ΪuserServiceImpl
	// ��ô����Ϳ���ֻ��AutoWired��,
	// IOC���Զ���������(ByName:��������beanע��ʱ������һ��)ȥ��
	// @Resource(name = "userService")
	@Autowired
	private UserService userServiceImpl;

	// Ҳ����Autowired��@Qualifierһ�����ʹ��
	@Autowired
	@Qualifier("mgrServiceImpl")
	private UserService mgrService;

	public void execute() {
		System.out.println("��������");
		userServiceImpl.addNew();
		mgrService.addNew();
	}

}
