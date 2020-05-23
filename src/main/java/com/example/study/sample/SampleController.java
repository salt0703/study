package com.example.study.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.study.logic.SampleLogic;

@RestController
public class SampleController {

	@Autowired
	private SampleLogic sampleLogic;
	
    @GetMapping("/index")
    public String find() {
        return sampleLogic.test();
    }
}
