package com.example.omsirajarajeshwaragoodsandtransport.invoicing.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/invoice")
public class InvoiceController {

    @GetMapping("/")
    public ResponseEntity<String> getCheck() {
        return ResponseEntity.ok("invoice");
    }
}
