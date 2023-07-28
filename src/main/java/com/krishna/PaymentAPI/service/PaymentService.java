package com.krishna.PaymentAPI.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    private Map<Integer, String> getPaymentMap(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"successful");
        map.put(2,"failed");
        map.put(3,"pending");
        map.put(4,"successful");
        map.put(5,"failed");
        return map;
    }

    public String checkPaymentStatus(int orderId){
        Map<Integer, String> map = getPaymentMap();
        return map.get(orderId);
    }
}
