package com.example.study.logic;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class SampleLogic {

	public String test() {
		Integer r = new Random().nextInt(10);
		return r.toString();
		
	}
}
