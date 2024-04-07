package com.example.demo;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UmamusumeController {

	public UmamusumeController() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	@GetMapping("input")
	public ModelAndView input(ModelAndView mv) {
		mv.setViewName("input");
		return mv;
	}

	@PostMapping("/register")
	public ModelAndView register(@ModelAttribute UmamusumeData uData, ModelAndView mv) {

		StringBuilder sb = new StringBuilder();
		sb.append(uData.getName());
		sb.append(Arrays.toString(uData.getInterest()));
		mv.setViewName("result");
		mv.addObject("registData", sb.toString());

		return mv;
	}
}
