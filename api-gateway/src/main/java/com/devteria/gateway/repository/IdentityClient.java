package com.devteria.gateway.repository;

<<<<<<< Updated upstream
import com.devteria.gateway.dto.ApiResponse;
import com.devteria.gateway.dto.request.IntrospectRequest;
import com.devteria.gateway.dto.response.IntrospectResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.PostExchange;
import reactor.core.publisher.Mono;

public interface IdentityClient {
    @PostExchange(url = "/auth/introspect", contentType = MediaType.APPLICATION_JSON_VALUE)
    Mono<ApiResponse<IntrospectResponse>> introspect(@RequestBody IntrospectRequest request);
=======
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.PostExchange;

import com.devteria.gateway.dto.request.IntrospectRequest;
import com.devteria.gateway.dto.response.IntrospectResponse;

import reactor.core.publisher.Mono;

import com.devteria.gateway.dto.request.ApiResponse;

public interface IdentityClient {
	@PostExchange(url="/auth/introspect", contentType = MediaType.APPLICATION_JSON_VALUE)
	Mono<ApiResponse<IntrospectResponse>> introspect(@RequestBody IntrospectRequest request);

>>>>>>> Stashed changes
}
