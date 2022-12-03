package com.example.projectmanagementsystem.controller;

import com.example.projectmanagementsystem.domain.Itlab;
import com.example.projectmanagementsystem.service.ItlabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ItlabController {

    @Autowired
    private ItlabService service;

    @GetMapping("/pcDetail")
    public String viewItlabPage(Model model) {
        List<Itlab> listitlab = service.listAll();
        model.addAttribute("listitlab", listitlab);
        System.out.print("Get / ");
        return "pcDetail";
    }

    @GetMapping("/addPc")
    public String add(Model model) {
        model.addAttribute("itlab", new Itlab());
        return "addPc";
    }

    @RequestMapping(value = "/savePc", method = RequestMethod.POST)
    public String saveItlab(@ModelAttribute("itlab") Itlab std) {
        service.saveItlab(std);
        return "redirect:/pcDetail";
    }

    @RequestMapping("/editPc/{pcid}")
    public ModelAndView showEditItlabPage(@PathVariable(name = "pcid") int pcid) {
        ModelAndView mav = new ModelAndView("addPc");
        Itlab std = service.getitlab(pcid);
        mav.addObject("itlab", std);
        return mav;

    }
    @RequestMapping("/deletePc/{pcid}")
    public String deleteitlab(@PathVariable(name = "pcid") int pcid) {
        service.deleteitlab(pcid);
        return "redirect:/pcDetail";
    }
}
