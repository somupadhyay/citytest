package org.example.cities;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StagingController {

    @RequestMapping("/")
    public String index() {
        Date timestamp = new Date(System.currentTimeMillis());
        return "Somnath Application was staged at: " + timestamp;
    }
}
