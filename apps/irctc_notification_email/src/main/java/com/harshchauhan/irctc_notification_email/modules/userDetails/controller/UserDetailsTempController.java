package com.harshchauhan.irctc_notification_email.modules.userDetails.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harshchauhan.grpc.customer_details.CustomerIdRequest;
import com.harshchauhan.irctc_notification_email.modules.userDetails.UserDetailsService;

@RestController
@RequestMapping("/user")
public class UserDetailsTempController {

    private UserDetailsService userDetailsService;

    public UserDetailsTempController(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @GetMapping("")
    public Object getMethodName() {
        return userDetailsService
                .getCustomerPrimaryDetails(CustomerIdRequest.newBuilder().setEmail("temp@temp.com").build());
    }

}
