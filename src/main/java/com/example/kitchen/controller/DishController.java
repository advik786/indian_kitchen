package com.example.kitchen.controller;

import com.example.kitchen.dto.DishDetailsDto;
import com.example.kitchen.service.DishService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class DishController {
    @Autowired
    private final DishService dishService;

    public DishController(DishService dishService) {
        this.dishService = dishService;
    }

    @GetMapping("/get-all-products/{userId}/{cuisineType}")
    public DishDetailsDto getAllDishes(@PathVariable int userId, @PathVariable String cuisineType) {
        return dishService.getAllDishes(userId, cuisineType);
    }


    @PostMapping("/check_api")
    public JSONObject getData(@RequestBody JSONObject jsonObj) {
        return dishService.checkApi();
    }
}
