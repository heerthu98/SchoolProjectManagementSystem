package com.example.projectmanagementsystem.controller;



import com.example.projectmanagementsystem.domain.Supervisor;

import com.example.projectmanagementsystem.service.SupervisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SupervisorController {

    @Autowired
    private SupervisorService service;

    @GetMapping("/supervisorDetail")
    public String viewSupervisorPage(Model model) {
        List<Supervisor> listsupervisor = service.listAll();
        model.addAttribute("listsupervisor", listsupervisor);
        System.out.print("Get / ");
        return "supervisorDetail";
    }

    @GetMapping("/addSupervisors")
    public String add(Model model) {
        model.addAttribute("supervisor", new Supervisor());
        return "addSupervisors";
    }

    @RequestMapping(value = "/saveSuper", method = RequestMethod.POST)
    public String saveSupervisor(@ModelAttribute("supervisor") Supervisor std) {
        service.saveSupervisor(std);
        return "redirect:/supervisorDetail";
    }

    @RequestMapping("/editSuper/{supervisorid}")
    public ModelAndView showEditSupervisorPage(@PathVariable(name = "supervisorid") int supervisorid) {
        ModelAndView mav = new ModelAndView("addSupervisors");
        Supervisor std = service.getsupervisor(supervisorid);
        mav.addObject("supervisor", std);
        return mav;

    }
    @RequestMapping("/deleteSuper/{supervisorid}")
    public String deletesupervisor(@PathVariable(name = "supervisorid") int supervisorid) {
        service.deletesupervisor(supervisorid);
        return "redirect:/supervisorDetail";
    }
}
