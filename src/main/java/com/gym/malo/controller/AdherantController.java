package com.gym.malo.controller;

import com.gym.malo.entity.Adherant;
import com.gym.malo.service.AdherantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class AdherantController {
    @Autowired
    private AdherantService adherantService;

    @PostMapping("/save/adherant")
    public Adherant saveAdherant(@RequestBody Adherant adherant){
       return adherantService.saveAdherant(adherant);
    }

    @GetMapping("/get/adherant")
    public List<Adherant> getAdherants(){
        return adherantService.getAdherants();
    }

    @GetMapping("/get/adherant/{adherantId}")
    public Adherant getAdherant(@PathVariable Integer adherantId){
        return adherantService.getAdherants(adherantId);
    }

    @DeleteMapping("/delete/adherant/{adherantId}")
    public void deleteAdherant(@PathVariable Integer adherantId){
         adherantService.deleteAdherant(adherantId);
    }

    @PutMapping("/update/adherant")
    public Adherant updateAdherant(@RequestBody Adherant adherant){
        return adherantService.updateAdherant(adherant);
    }
}
