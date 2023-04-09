package com.sureshfirst.customer;

import com.sureshfirst.DemoApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CustomerController {
    @GetMapping
    Customer getCustomer(){
        return new Customer(1L,"new name");
    }
}
