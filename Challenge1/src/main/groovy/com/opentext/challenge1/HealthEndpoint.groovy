package com.opentext.challenge1

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Ojesvi
 * @since 16.01.2017
 */
@RestController
@RequestMapping("/health")
class HealthEndpoint {

    @GetMapping
    HealthStatusMessage getStatus() {
        new HealthStatusMessage()
    }

}
