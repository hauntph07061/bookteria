package com.devteria.identity.configuration;

import java.text.ParseException;

<<<<<<< Updated upstream
import com.nimbusds.jwt.SignedJWT;
=======
import org.springframework.beans.factory.annotation.Value;
>>>>>>> Stashed changes
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtException;
import org.springframework.stereotype.Component;

<<<<<<< Updated upstream
@Component
public class CustomJwtDecoder implements JwtDecoder {
    @Override
    public Jwt decode(String token) throws JwtException {
        try {
            SignedJWT signedJWT = SignedJWT.parse(token);

            return new Jwt(token,
                    signedJWT.getJWTClaimsSet().getIssueTime().toInstant(),
                    signedJWT.getJWTClaimsSet().getExpirationTime().toInstant(),
                    signedJWT.getHeader().toJSONObject(),
                    signedJWT.getJWTClaimsSet().getClaims()
            );

=======
import com.devteria.identity.service.AuthenticationService;
import com.nimbusds.jwt.SignedJWT;

@Component
public class CustomJwtDecoder implements JwtDecoder {
    @Value("${jwt.signerKey}")
    private String signerKey;

    private final AuthenticationService authenticationService;

    private NimbusJwtDecoder nimbusJwtDecoder = null;

    public CustomJwtDecoder(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    //    @Override
    //    public Jwt decode(String token) throws JwtException {
    //
    //        var response = authenticationService.introspect(
    //                IntrospectRequest.builder().token(token).build());
    //
    //        if (!response.isValid()) throw new JwtException("Token invalid");
    //
    //        if (Objects.isNull(nimbusJwtDecoder)) {
    //            SecretKeySpec secretKeySpec = new SecretKeySpec(signerKey.getBytes(), "HS512");
    //            nimbusJwtDecoder = NimbusJwtDecoder.withSecretKey(secretKeySpec)
    //                    .macAlgorithm(MacAlgorithm.HS512)
    //                    .build();
    //        }
    //
    //        return nimbusJwtDecoder.decode(token);
    //    }

    @Override
    public Jwt decode(String token) throws JwtException {

        try {
            SignedJWT signedJWT = SignedJWT.parse(token);
            return new Jwt(
                    token,
                    signedJWT.getJWTClaimsSet().getIssueTime().toInstant(),
                    signedJWT.getJWTClaimsSet().getExpirationTime().toInstant(),
                    signedJWT.getHeader().toJSONObject(),
                    signedJWT.getJWTClaimsSet().getClaims());
>>>>>>> Stashed changes
        } catch (ParseException e) {
            throw new JwtException("Invalid token");
        }
    }
}
