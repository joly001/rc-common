package com.zcsoft.rc.common.autoconfigure.components;

import com.sharingif.cube.security.web.exception.handler.validation.access.AccessDecisionCubeExceptionHandler;
import com.sharingif.cube.web.exception.handler.WebCubeExceptionHandler;
import com.sharingif.cube.web.exception.handler.validation.TokenValidationCubeExceptionHandler;
import com.sharingif.cube.web.exception.handler.validation.ValidationCubeExceptionHandler;
import com.sharingif.cube.web.springmvc.exception.NoHandlerFoundExceptionHandler;
import com.zcsoft.rc.common.components.exception.ExtendedSingleBindValidationCubeExceptionHandler;
import com.zcsoft.rc.common.components.exception.ExtendedSingleMethodArgumentNotValidExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration("commonComponentsAutoconfigure")
public class CommonComponentsAutoconfigure {

    @Bean(name = "springMVCCubeExceptionHandlers")
    public List<WebCubeExceptionHandler> createSpringMVCCubeExceptionHandlers(
            AccessDecisionCubeExceptionHandler accessDecisionCubeExceptionHandler
            , TokenValidationCubeExceptionHandler tokenValidationCubeExceptionHandler
            , ExtendedSingleMethodArgumentNotValidExceptionHandler extendedSingleMethodArgumentNotValidExceptionHandler
            , ExtendedSingleBindValidationCubeExceptionHandler extendedSingleBindValidationCubeExceptionHandler
            , NoHandlerFoundExceptionHandler noHandlerFoundExceptionHandler
            , ValidationCubeExceptionHandler validationCubeExceptionHandler
            , WebCubeExceptionHandler webCubeExceptionHandler) {

        List<WebCubeExceptionHandler> springMVCCubeExceptionHandlers = new ArrayList<WebCubeExceptionHandler>();
        springMVCCubeExceptionHandlers.add(accessDecisionCubeExceptionHandler);
        springMVCCubeExceptionHandlers.add(tokenValidationCubeExceptionHandler);
        springMVCCubeExceptionHandlers.add(extendedSingleMethodArgumentNotValidExceptionHandler);
        springMVCCubeExceptionHandlers.add(extendedSingleBindValidationCubeExceptionHandler);
        springMVCCubeExceptionHandlers.add(noHandlerFoundExceptionHandler);
        springMVCCubeExceptionHandlers.add(validationCubeExceptionHandler);
        springMVCCubeExceptionHandlers.add(webCubeExceptionHandler);

        return springMVCCubeExceptionHandlers;

    }

}
