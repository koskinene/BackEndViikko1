package Palautettava.palautettavavko1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

		@RequestMapping("index")
		@ResponseBody
		public String returnIndexPage() {
			return "This is the main page.";
		}
		
		@RequestMapping("contact")
		@ResponseBody
		public String returnContactPage() {
			return "This is the contact page.";
		}
		
		@RequestMapping("hello")
		@ResponseBody
		public String sayHello(@RequestParam(name="location") String paikka, @RequestParam(name="name") String nimi) {
			return "Welcome to the " + paikka + " " + nimi + "!";
		}
}
