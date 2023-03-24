package ug.co.absa.microservice.app.client;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import ug.co.absa.microservice.app.security.oauth2.AuthorizationHeaderUtil;

public class OAuth2InterceptedFeignConfiguration {

    @Bean(name = "oauth2RequestInterceptor")
    public RequestInterceptor getOAuth2RequestInterceptor(AuthorizationHeaderUtil authorizationHeaderUtil) {
        return new TokenRelayRequestInterceptor(authorizationHeaderUtil);
    }
}
