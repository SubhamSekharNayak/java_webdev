package com.example.lms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class AnoController {
    @Autowired
    JdbcTemplate jdbc;

    @GetMapping("/calculate")
    public String calculate() {
        System.out.println("calculate get method");
        return "calculate";
    }

    @PostMapping("/calculate")
    public String calculate_data(Model model, @RequestParam("btn") String btn, @RequestParam("f") int f,
            @RequestParam("s") int s) {
        System.out.println("calculate post method");
        int r = 0;
        if (btn.equals("add")) {
            r = f + s;
        } else if (btn.equals("sub")) {
            r = f - s;
        }
        model.addAttribute("result", r);
        return "calculate";

        // design to code - form
        // code to design - model
    }

    // @GetMapping("/test")
    // public String test(Model model){

    // List<String> li=new ArrayList<String>();
    // li.add("jaga");
    // li.add("aja");
    // li.add("prabin");
    // model.addAttribute("data", li); //list
    // return "test";
    // }

    // @GetMapping("/test")
    // public ModelAndView test(){
    // List<String> li=new ArrayList<>();
    // li.add("raja");
    // li.add("dama");
    // li.add("jama");
    // ModelAndView obj=new ModelAndView();
    // obj.addObject("data",li);
    // obj.addObject("name","shreyan");
    // obj.setViewName("test");
    // return obj;
    // }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/manage")
    public String manage() {
        return "manage";
    }

    @GetMapping("/changepwd")
    public String change() {
        return "changepwd";
    }

    @GetMapping("/userhome")
    public String userhome() {
        return "userhome";
    }

    @GetMapping("/testlogin")
    public String login_page() {
        return "testlogin";
    }

    @PostMapping("/testlogin")
    public String login_post(@RequestParam("userid") String userid, HttpSession session) {
        // Store user data in the session
        session.setAttribute("userid", userid);
        return "userhome"; // redirect to success.jsp
    }

    @PostMapping("/updatepwd")
    public String updatepwd(@RequestParam("pwd") String pwd,
            HttpSession session) {

        String userid = (String) session.getAttribute("userid");

        // Here you would normally update password in database
        System.out.println("User: " + userid);
        System.out.println("New Password: " + pwd);

        return "userhome";
    }

    @GetMapping("/index")
    public String indexx() {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @PostMapping("/contact")
    public String contact_save(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("mobile") String mobile,
            @RequestParam("message") String message,
            Model model) {
        jdbc.execute("insert into contact_master(name, email, mobile, message) values('" + name + "','" + email + "','"
                + mobile + "','" + message + "')");
        model.addAttribute("sms", "Success");
        return "contact";
    }

    @GetMapping("/faq")
    public String faq() {
        return "faq";
    }

    @GetMapping("/gallery")
    public String gallery() {
        return "gallery";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")

    // receive user id and password
    public String login_chk(HttpSession session,
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            Model model) {

        ArrayList<String> ali = new ArrayList<String>();
        String sql = "select * from user_master where email='" + email + "' and password='" + password + "'";
        // get match data from db
        jdbc.query(sql, new RowMapper<String>() {
            public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                ali.add(rs.getString(1)); // id ali[0] contains id
                ali.add(rs.getString(2)); // name ali[1] contains name
                ali.add(rs.getString(3)); // email ali[2] contains email
                ali.add(rs.getString(4)); // mobile ali[3] contains mobile
                ali.add(rs.getString(6)); // role ali[4] contains role
                ali.add(rs.getString(7)); // status ali[5] contains status
                return "";

            }

        });

        // if match
        if (!ali.isEmpty()) {
            // success //chk the status is 1 or not
            if (ali.get(5).equals("1")) {
                session.setAttribute("name", ali.get(1));
                session.setAttribute("email", ali.get(2));

                if (ali.get(4).equalsIgnoreCase("student")) { // chk the role //if student
                    return "sdashboard"; // student dashboard
                }
                if (ali.get(4).equalsIgnoreCase("faculty")) { // chk the role //if faculty
                    return "fdashboard"; // faculty dashboard
                }
                if (ali.get(4).equalsIgnoreCase("admin")) { // chk the role //if admin
                    return "adashboard"; // admin dashboard
                }

            } else { // else
                model.addAttribute("output", "contact to admin"); // inactive user, please contact admin
            }
        } else {
            // no match //invalid
            model.addAttribute("output", "invalid");

        }

        // System.out.println("chk login....");
        return "login";

    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String register_save(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("mobile") String mobile,
            @RequestParam("password") String password,
            @RequestParam("role") String role,
            Model model) {
        jdbc.execute("insert into user_master(name, email, mobile, password, role) values('" + name + "','" + email
                + "','" + mobile + "','" + password + "','" + role + "')");
        model.addAttribute("sms", "Registered Successfully");
        return "register";
    }

    @GetMapping("/service")
    public String service() {
        return "service";
    }

}
