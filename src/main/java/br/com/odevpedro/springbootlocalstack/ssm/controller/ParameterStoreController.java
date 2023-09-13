package br.com.odevpedro.springbootlocalstack.ssm.controller;

import br.com.odevpedro.springbootlocalstack.ssm.configuration.ParameterStoreConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ParameterStoreController {

    private final ParameterStoreConfiguration configuration;

    public ParameterStoreController(ParameterStoreConfiguration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/parameterStoreConfiguration")
    public String configuration() {
        return configuration.getHelloWorld();
    }
}
