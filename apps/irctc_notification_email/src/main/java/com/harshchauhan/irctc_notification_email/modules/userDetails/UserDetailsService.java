package com.harshchauhan.irctc_notification_email.modules.userDetails;

import org.springframework.stereotype.Service;

import com.harshchauhan.grpc.customer_details.CustomerIdRequest;
import com.harshchauhan.grpc.customer_details.CustomerPrimaryDataResponse;
import com.harshchauhan.grpc.customer_details.CustomerDetailsServiceGrpc.CustomerDetailsServiceBlockingStub;

// import net.devh.boot.grpc.client.inject.GrpcClient;

@Service
public class UserDetailsService {

    // @GrpcClient("customerDetailsService")
    private CustomerDetailsServiceBlockingStub customerDetailsServiceBlockingStub;

    public CustomerPrimaryDataResponse getCustomerPrimaryDetails(CustomerIdRequest customerIdRequest) {
        return customerDetailsServiceBlockingStub.getCustomerPrimaryDetails(customerIdRequest);
    }
}
