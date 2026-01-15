package com.apad99.JobApplicationBoardProject.model;

import com.apad99.JobApplicationBoardProject.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping({"/", "home"})
    public String home() {
        return "home";
    }

    @GetMapping("/addjob")
    public String addjob() {
        return "addjob";
    }

    @PostMapping("/handleForm")
    public String handleForm(JobPost jobPost, Model model) {
        service.addJob(jobPost);
        model.addAttribute("jobPost", jobPost);
        return "success";
    }

//    @RequestMapping("success")
//    public String success() {
//        return "success";
//    }
//
//    @RequestMapping("/viewalljobs")
//    public String viewalljobs() {
//        return "viewalljobs";
//    }
}
