package com.project.webserver.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import util.Customer;
import util.CustomerMap;

import java.lang.reflect.Parameter;

@RestController
public class Mappings {
    @GetMapping("/get/customer")
    public String getCustomer(@RequestParam Integer id){
        return "get customer";
    }
    @GetMapping
    public String getTest(){
        return "hi";
    }
    @PostMapping(value = "/sendCustomer", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Customer> request(@RequestBody Customer customer){
        System.out.println("testsetest");
         ResponseEntity<Customer> cust = new ResponseEntity<Customer>(customer, HttpStatus.OK);
         return cust;
    }
    @GetMapping("/get/hello")
    public String getHelloWorld(){
        return "hello world! ";
    }
}
