package com.example.weddingdinner.controller;

import com.example.weddingdinner.model.Dinner;
import com.example.weddingdinner.model.Response;
import com.example.weddingdinner.repository.DinnerRepository;
import com.example.weddingdinner.service.DinnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class Dinnercontroller {



    @Autowired
    private DinnerService dinnerService;



    @PostMapping("/create")
    public ResponseEntity<Response> createdinner(@RequestBody Dinner dinner){
       this.dinnerService.create(dinner);
       return ResponseEntity.ok().body(new Response(HttpStatus.CREATED,"successfully created"));



//
//
//    @GetMapping("/all")
//    public String showAll(Model model){
//    List<Dinner> dinners =   this.mongoTemplate.findAll(Dinner.class);
//    model.addAttribute("dinners",dinners);
//        return "showtable";
//
//    }
//
//    @GetMapping("/showform")
//    public String showForm(Model model){
//
//        model.addAttribute("wedinner",new Dinner());
//        return "showform/dinnerform";
//    }
//
//    @PostMapping("/showform")
//    public String processform(Dinner dinner){
//
//        this.mongoTemplate.save(dinner);
//
//
//     return "redirect:/all";
//    }



    }


}
