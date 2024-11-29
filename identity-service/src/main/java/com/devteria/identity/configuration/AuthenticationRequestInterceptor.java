package com.devteria.identity.configuration;

<<<<<<< Updated upstream
import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;
=======
>>>>>>> Stashed changes
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

<<<<<<< Updated upstream
@Slf4j
public class AuthenticationRequestInterceptor implements RequestInterceptor {
=======
import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AuthenticationRequestInterceptor implements RequestInterceptor {

>>>>>>> Stashed changes
    @Override
    public void apply(RequestTemplate template) {
        ServletRequestAttributes servletRequestAttributes =
                (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
<<<<<<< Updated upstream

        var authHeader = servletRequestAttributes.getRequest().getHeader("Authorization");

        log.info("Header: {}", authHeader);
        if (StringUtils.hasText(authHeader))
            template.header("Authorization", authHeader);
=======
        var authHeader = servletRequestAttributes.getRequest().getHeader("Authorization");
        log.info("Header {}", authHeader);
        if (StringUtils.hasText(authHeader)) template.header("Authorization", authHeader);
>>>>>>> Stashed changes
    }
}
