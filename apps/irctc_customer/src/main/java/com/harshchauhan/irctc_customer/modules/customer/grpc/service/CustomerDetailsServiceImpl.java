package com.harshchauhan.irctc_customer.modules.customer.grpc.service;

import com.harshchauhan.grpc.customer_details.CustomerDetailsServiceGrpc;
import com.harshchauhan.grpc.customer_details.CustomerIdRequest;
import com.harshchauhan.grpc.customer_details.CustomerPrimaryDataResponse;

import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

import org.springframework.grpc.server.service.GrpcService;

@Slf4j
@GrpcService
public class CustomerDetailsServiceImpl extends CustomerDetailsServiceGrpc.CustomerDetailsServiceImplBase {

    @Override
    public void getCustomerPrimaryDetails(CustomerIdRequest request,
            StreamObserver<CustomerPrimaryDataResponse> responseObserver) {

        String email = request.getEmail();
        String name = "Harsh Chauhan - 1";

        log.info("getCustomerPrimaryDetails invoked");

        CustomerPrimaryDataResponse customerPrimaryDataResponse = CustomerPrimaryDataResponse.newBuilder()
                .setEmail(email).setName(name).build();

        responseObserver.onNext(customerPrimaryDataResponse);
        responseObserver.onCompleted();
    }
}
