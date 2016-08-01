package com.rquest.service;

import org.springframework.stereotype.Service;

@Service
public interface DubboService {

	void sayHello(String username);
	
}
