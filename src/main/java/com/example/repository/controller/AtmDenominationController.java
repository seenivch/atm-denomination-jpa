package com.example.repository.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.repository.model.ResponsePossibleDenom;
import com.example.repository.model.ResponseWrapper;
import com.example.repository.service.AtmDenominationService;

/**
 * @author Seenivasan Chandrasekaran
 */

@RestController
public class AtmDenominationController {

    @Autowired
    AtmDenominationService atmService;

    @CrossOrigin(origins = "*", allowCredentials = "true")
    @GetMapping("/totalDenom")
    public ResponseEntity<ResponseWrapper> totalDenom() {
        return atmService.totalDenomation();
    }
    
    @CrossOrigin(origins = "*", allowCredentials = "true")
    @GetMapping("/possibleDenom")
    public ResponseEntity<ResponsePossibleDenom> possibleDenom(
            @RequestParam("amount") int amount) {
        return atmService.possibleDenom(amount);
    }

}
