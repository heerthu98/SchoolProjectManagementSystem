package com.example.projectmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.projectmanagementsystem.domain.Project;
import com.example.projectmanagementsystem.service.ProjectService;


@Controller
public class ProjectController {
    @Autowired
    private ProjectService service;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Project> listproject = service.listAll();
        model.addAttribute("listproject", listproject);
        System.out.print("Get / ");
        return "index";
    }

    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("project", new Project());
        return "new";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProject(@ModelAttribute("project") Project std) {
        service.save(std);
        return "redirect:/";
    }

    @RequestMapping("/edit/{projectid}")
    public ModelAndView showEditProjectPage(@PathVariable(name = "projectid") int projectid) {
        ModelAndView mav = new ModelAndView("new");
        Project std = service.get(projectid);
        mav.addObject("project", std);
        return mav;

    }
    @RequestMapping("/delete/{projectid}")
    public String deleteProject(@PathVariable(name = "projectid") int projectid) {
        service.delete(projectid);
        return "redirect:/";
    }

}
