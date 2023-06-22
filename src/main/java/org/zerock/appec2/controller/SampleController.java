package org.zerock.appec2.controller;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/sample")
public class SampleController {

    @GetMapping("/getArr")
    public String[] getArr() {

        log.info("INFO");

        return new String[]{"AAA", "BBB", "CCC"};
    }
}
