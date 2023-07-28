package com.krishna.PaymentAPI.controller;

import com.krishna.PaymentAPI.service.PaymentService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from Krishna";
    }

    @GetMapping("/doPayment/{amount}")
    public String doPayment(@PathVariable int amount){
        return "Payment of Rs. "+amount+" Successfull!!!!";
    }

    @GetMapping("/paymentStatus/{orderId}")
    public String checkPaymentStatus(@PathVariable int orderId){
        return paymentService.checkPaymentStatus(orderId);
    }

}
