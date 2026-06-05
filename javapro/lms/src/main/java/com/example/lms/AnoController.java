package com.example.lms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpSession;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
        return "calculate";
    }

    @PostMapping("/calculate")
    public String calculate_data(Model model, @RequestParam("btn") String btn, @RequestParam("f") int f, @RequestParam("s") int s) {
        int r = 0;
        if (btn.equals("add")) r = f + s;
        else if (btn.equals("sub")) r = f - s;
        model.addAttribute("result", r);
        return "calculate";
    }

    @GetMapping("/dashboard")
    public String dashboard() { return "dashboard"; }

    @GetMapping("/test")
    public String test() { return "test"; }

    @GetMapping("/manage")
    public String manage() { return "manage"; }

    @GetMapping("/changepwd")
    public String change() { return "changepwd"; }

    @GetMapping("/userhome")
    public String userhome() { return "userhome"; }

    @GetMapping("/testlogin")
    public String login_page() { return "testlogin"; }

    @PostMapping("/testlogin")
    public String login_post(@RequestParam("userid") String userid, HttpSession session) {
        session.setAttribute("userid", userid);
        return "userhome";
    }

    @PostMapping("/updatepwd")
    public String updatepwd(@RequestParam("pwd") String pwd, HttpSession session) {
        String userid = (String) session.getAttribute("userid");
        System.out.println("User: " + userid);
        System.out.println("New Password: " + pwd);
        return "userhome";
    }

    @GetMapping("/index")
    public String indexx() { return "index"; }

    @GetMapping("/about")
    public String about() { return "about"; }

    @GetMapping("/contact")
    public String contact() { return "contact"; }

    @PostMapping("/contact")
    public String contact_save(@RequestParam("name") String name, @RequestParam("email") String email,
            @RequestParam("mobile") String mobile, @RequestParam("message") String message, Model model) {
        jdbc.execute("insert into contact_master(name, email, mobile, message) values('" + name + "','" + email + "','" + mobile + "','" + message + "')");
        model.addAttribute("sms", "Success");
        return "contact";
    }

    @GetMapping("/faq")
    public String faq() { return "faq"; }

    @GetMapping("/gallery")
    public String gallery() { return "gallery"; }

    @GetMapping("/login")
    public String login() { return "login"; }

    @PostMapping("/login")
    public String login_chk(HttpSession session,
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            Model model) {

        // DEBUG
        System.out.println("=== LOGIN DEBUG ===");
        System.out.println("Email: [" + email + "]");
        System.out.println("Password: [" + password + "]");

        ArrayList<String> ali = new ArrayList<String>();
        String sql = "select * from user_master where email='" + email + "' and password='" + password + "'";
        System.out.println("SQL: " + sql);

        jdbc.query(sql, new RowMapper<String>() {
            public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                ali.add(rs.getString(1));
                ali.add(rs.getString(2));
                ali.add(rs.getString(3));
                ali.add(rs.getString(4));
                ali.add(rs.getString(6));
                ali.add(rs.getString(7));
                return "";
            }
        });

        System.out.println("ali size: " + ali.size());

        if (!ali.isEmpty()) {
            if (ali.get(5).equals("1")) {
                session.setAttribute("name", ali.get(1));
                session.setAttribute("email", ali.get(2));
                if (ali.get(4).equalsIgnoreCase("student")) return "sdashboard";
                if (ali.get(4).equalsIgnoreCase("faculty")) return "fdashboard";
                if (ali.get(4).equalsIgnoreCase("admin")) return "adashboard";
            } else {
                model.addAttribute("output", "contact to admin");
            }
        } else {
            model.addAttribute("output", "invalid");
        }
        return "login";
    }

    @GetMapping("/register")
    public String register() { return "register"; }

    @PostMapping("/register")
    public String register_save(@RequestParam("name") String name, @RequestParam("email") String email,
            @RequestParam("mobile") String mobile, @RequestParam("password") String password,
            @RequestParam("role") String role, Model model) {
        jdbc.execute("insert into user_master(name, email, mobile, password, role) values('" + name + "','" + email + "','" + mobile + "','" + password + "','" + role + "')");
        model.addAttribute("sms", "Registered Successfully");
        return "register";
    }

    @GetMapping("/service")
    public String service() { return "service"; }
}