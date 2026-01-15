package com.apad99.JobApplicationBoardProject.repository;

import com.apad99.JobApplicationBoardProject.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobPosts = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Senior Software Engineer", "Develop and maintain scalable backend systems using Java and Spring Boot", 5, Arrays.asList("Java", "Spring Boot", "MySQL", "Docker", "Kubernetes")),
            new JobPost(2, "Frontend Developer", "Build responsive and interactive user interfaces for web applications", 3, Arrays.asList("React", "TypeScript", "CSS", "Redux", "Webpack")),
            new JobPost(3, "DevOps Engineer", "Manage CI/CD pipelines and cloud infrastructure automation", 4, Arrays.asList("AWS", "Terraform", "Jenkins", "Python", "Ansible")),
            new JobPost(4, "Data Scientist", "Analyze large datasets and build machine learning models for business insights", 2, Arrays.asList("Python", "TensorFlow", "Pandas", "SQL", "Jupyter")),
            new JobPost(5, "Mobile App Developer", "Create native mobile applications for iOS and Android platforms", 3, Arrays.asList("Swift", "Kotlin", "React Native", "Firebase", "REST APIs"))
    ));

    public List<JobPost> getAllJobs() {
        return jobPosts;
    }

    public void addJob(JobPost jobPost) {
        jobPosts.add(jobPost);
        System.out.println(jobPosts);
    }
}
