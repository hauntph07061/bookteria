package com.devteria.gateway.service;

<<<<<<< Updated upstream
import com.devteria.gateway.dto.ApiResponse;
import com.devteria.gateway.dto.request.IntrospectRequest;
import com.devteria.gateway.dto.response.IntrospectResponse;
import com.devteria.gateway.repository.IdentityClient;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
=======


import org.springframework.stereotype.Service;

import com.devteria.gateway.dto.request.ApiResponse;
import com.devteria.gateway.dto.request.IntrospectRequest;
import com.devteria.gateway.dto.response.IntrospectResponse;
import com.devteria.gateway.repository.IdentityClient;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
>>>>>>> Stashed changes
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class IdentityService {
<<<<<<< Updated upstream
    IdentityClient identityClient;

    public Mono<ApiResponse<IntrospectResponse>> introspect(String token){
        return identityClient.introspect(IntrospectRequest.builder()
                        .token(token)
                .build());
    }
=======
	
	IdentityClient identityClient;
	
	public Mono<ApiResponse<IntrospectResponse>> introspect(String token) {
		
		return identityClient.introspect(IntrospectRequest.builder().token(token).build());
	}

>>>>>>> Stashed changes
}
