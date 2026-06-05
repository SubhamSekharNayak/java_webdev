package com.example.lms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootApplication
@RestController
// @RequestMapping("/api")
public class LmsApplication {

	@Autowired
	private Toyota t;

	@GetMapping("/car")
	public String ttt() {
		return t.drive();
	}

	@Autowired
	private GreetingService greetingService;

	@GetMapping("/greet/{name}")
	public String greet(@PathVariable String name) {
		return greetingService.greet(name);
	}

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello from Spring Boot!";
	}

	@GetMapping("/greet")
	public String greet() {
		return "Helloooo!";
	}

	@PostMapping("/submit")
	public String submit(@RequestBody String data) {
		return "Data received: " + data;
	}

	@PutMapping("/update")
	public String update() {
		return "Updated!";
	}

	@DeleteMapping("/remove")
	public String delete() {
		return "Deleted!";
	}

	@Autowired
	JdbcTemplate jdbc;

	@GetMapping("/get")
	public List get_student() {
		List<Map<String, Object>> li = jdbc.queryForList("select * from students");
		return li;
	}

	@PostMapping("/save")
	public Map<String, Object> save_student(@RequestBody Student stu) {
		jdbc.execute("insert into students values('" + stu.getRoll() + "', '" + stu.getName() + "')");
		Map<String, Object> response = new HashMap<>();
		response.put("message", "Inserted Successfully");
		response.put("student", stu);
		return response;
	}

	@PutMapping("/updates")
	public Map<String, Object> update(@RequestBody Student stu) {
		jdbc.execute("update students set name='" + stu.getName() + "' where roll='" + stu.getRoll() + "'");
		Map<String, Object> response = new HashMap<>();
		response.put("message", "Updated Successfully");
		response.put("student", stu);
		return response;
	}

	@DeleteMapping("/delete")
	public Map<String, Object> delete(@RequestBody Student stu) {
		jdbc.execute("delete from students where roll=" + stu.getRoll());
		Map<String, Object> res = new HashMap<>();
		res.put("msgg", "Deleted Successfully");
		res.put("user id", stu);
		return res;
	}

	// @RequestMapping(method = RequestMethod.GET, path = "abcd")
	// public String abc(){
	// return "hello abcdefghijklm";
	// }
	// @GetMapping({"", "/", "index"})
	// public String index(){
	// return "hello seeeeeeree, get into the mojo";
	// }
	// // http://localhost:8081/hello?name=subham
	// @GetMapping("/hello")
	// public String hello(@RequestParam("name") String n){
	// return "hello "+n;
	// }
	// // http://localhost:8081/add?f=100&s=600
	// @PostMapping("/add")
	// public String add(@RequestParam("f") int a, @RequestParam("s") int b){
	// return String.valueOf(a+b);
	// }
	// // http://localhost:8081/hii?name=subhamm
	// @GetMapping("/hii")
	// public String hii(@RequestParam("name") String n){
	// return "hii "+n;
	// }

	public static void main(String[] args) {
		SpringApplication.run(LmsApplication.class, args);
	}

}
