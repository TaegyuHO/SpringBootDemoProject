package demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {

	@RequestMapping("/jsonView")
	@ResponseBody
	String home() {
		return "Hello World - ResponseBody";
	}
	
	@RequestMapping("/jspView")
	String home2() {
		return "index";
	}
}
