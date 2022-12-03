package com.example.projectmanagementsystem.controller;

import com.example.projectmanagementsystem.domain.Students;
import com.example.projectmanagementsystem.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentsController {

    @Autowired
    private StudentsService service;

    @GetMapping("/StudentDetail")
    public String viewStudentsPage(Model model) {
        List<Students> liststudents = service.listAll();
        model.addAttribute("liststudents", liststudents);
        System.out.print("Get / ");
        return "StudentDetail";
    }

    @GetMapping("/AddStudent")
    public String add(Model model) {
        model.addAttribute("students", new Students());
        return "AddStudent";
    }

    @RequestMapping(value = "/saveStudents", method = RequestMethod.POST)
    public String saveStudents(@ModelAttribute("students") Students std) {
        service.saveStudents(std);
        return "redirect:/StudentDetail";
    }

    @RequestMapping("/editStudents/{studentsid}")
    public ModelAndView showEditStudentsPage(@PathVariable(name = "studentsid") int studentsid) {
        ModelAndView mav = new ModelAndView("AddStudent");
        Students std = service.getStudents(studentsid);
        mav.addObject("students", std);
        return mav;

    }
    @RequestMapping("/deleteStudents/{studentsid}")
    public String deletestudents(@PathVariable(name = "studentsid") int studentsid) {
        service.deleteStudents(studentsid);
        return "redirect:/StudentDetail";
    }

}
