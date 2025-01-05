package com.example.church_resources.controller;

import com.example.church_resources.dto.UserInputDto;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class Usercontroller {


    @PostMapping ("/subscribe")

    public ResponseEntity<String> response(@RequestBody UserInputDto userInputDto){
        return ResponseEntity.ok("Saved");

    }

    List<String> Welcome=List.of("welcome","hello");
    @GetMapping("/get-products")

    public String  getProducts(Model welcome){
        welcome.addAttribute("products",Welcome);
        return "menu";
    }


}
