package com.apad99.JobApplicationBoardProject;

import com.apad99.JobApplicationBoardProject.model.JobPost;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobController {

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
        model.addAttribute("jobPost", jobPost);
        return "success"; // success.html can now use ${jobPost...}
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
