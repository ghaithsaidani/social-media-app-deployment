package com.codingShuttle.linkedIn.api_gatway.execption;

import com.codingShuttle.linkedIn.api_gatway.execption.DTO.ApiErrorApiFateWay;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Vinay B R
 * @project LinkedIn
 * @package com.codingShuttle.linkedIn.api_gatway.execption
 * @since 11/10/2024 - 11:55 pm
 */
@RestControllerAdvice
public class GlobalExceptionApiGateWay {

//    @ExceptionHandler(UnauthorizedException.class)
//    public ResponseEntity<String> handleUnauthorizedException(UnauthorizedException ex) {
//        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(ex.getMessage());
//    }

    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<ApiErrorApiFateWay> handlerResourceNotFoundException(UnauthorizedException exception){
        ApiErrorApiFateWay apiError=new ApiErrorApiFateWay(exception.getLocalizedMessage(), HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(apiError,HttpStatus.NOT_FOUND);
    }
}
