package com.demo.spring;

import org.springframework.stereotype.Service;

@Service
public class Singer implements Performer{

	@Override
	public void perform() throws PerformerException {
		//System.out.println("Singer Singing Song......");
		throw new PerformerException();
	}

}
