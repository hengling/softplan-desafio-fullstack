package br.com.processos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/status")
public class StatusController {

    @GetMapping
    public String checkStatus() {
        return "ok";
    }
}
