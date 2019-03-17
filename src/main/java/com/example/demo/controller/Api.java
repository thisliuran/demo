package com.example.demo.controller;

import com.example.demo.Entity.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class Api {


    private Order[] orders = {new Order("10001"),new Order("10002") };
    private Set<Order> orderSet = new HashSet<>(
            Arrays.asList(orders)
    );


    @RequestMapping("/all")
    public Set<Order>orders(){


        return orderSet;
    }


    @RequestMapping("add")
    public Map<String,String> add(String order_id){
        Map<String,String> result = new HashMap<>();

    Order o = new Order(order_id);
        if(orderSet.contains(o)){
        result.put("result","exist");

    }else{
        orderSet.add(o);
        result.put("result","success");
        result.put("order_id",order_id);
    }

        return result;
    }


    @RequestMapping("get")
    public Order getOne(String order_id){
        List<Order> temp = orderSet.stream().filter(x->x.getOrder_id().equals(order_id)).collect(Collectors.toList());
        if(temp.size()==1)
        return temp.get(0);
        else return null;
    }
}
