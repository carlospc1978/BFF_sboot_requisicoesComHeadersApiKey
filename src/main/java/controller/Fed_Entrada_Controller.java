package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fed_Entrada_Controller {

    @GetMapping
    public String getBFF(){
        return "funcionando";
    }

    @PostMapping
    public String postBFF(){
        return "funcionando";
    }

}
