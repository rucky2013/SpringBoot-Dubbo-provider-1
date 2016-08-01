package com.rquest.service.impl;

import org.springframework.stereotype.Service;

import com.rquest.service.DubboService;

@Service("dubboService")
public class DubboServiceImpl implements DubboService{

	@Override
	public void sayHello(String username) {
		System.out.println("hello"+username);
	}
}
