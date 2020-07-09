package com.deployment.healthengine.initial;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping( value = "/api/deploy", produces = MediaType.APPLICATION_JSON_VALUE )
public class deployController {


    @GetMapping
    public ResponseEntity getDeploy() {
        return new ResponseEntity( "Hello word", HttpStatus.OK );
    }

}
