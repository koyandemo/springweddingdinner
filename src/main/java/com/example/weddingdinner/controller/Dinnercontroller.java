package com.example.weddingdinner.controller;

import com.example.weddingdinner.model.Dinner;
import com.example.weddingdinner.repository.DinnerRepository;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class Dinnercontroller {

    private MongoTemplate mongoTemplate;
    private DinnerRepository dinnerRepository;

    public Dinnercontroller(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @GetMapping("/all")
    public String showAll(Model model){
    List<Dinner> dinners =   this.mongoTemplate.findAll(Dinner.class);
    model.addAttribute("dinners",dinners);
        return "showtable";

    }

    @GetMapping("/showform")
    public String showForm(Model model){

        model.addAttribute("wedinner",new Dinner());
        return "showform/dinnerform";
    }

    @PostMapping("/showform")
    public String processform(Dinner dinner){

        this.mongoTemplate.save(dinner);


     return "redirect:/all";
    }



}
