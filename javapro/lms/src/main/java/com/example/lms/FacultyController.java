package com.example.lms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FacultyController {
    @GetMapping("/fdashboard")
    public String fdashboard(){
        return "fdashboard";
    }
        
    
}
 
