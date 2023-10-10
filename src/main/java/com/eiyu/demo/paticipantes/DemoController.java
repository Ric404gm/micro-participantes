package com.eiyu.demo.paticipantes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/eiyu/participantes")
public class DemoController {

    @GetMapping("/registro")
    @ResponseBody
    public String  demoController(){
        
        return new  String("{\"name\":\"Ricardo\", \"age\":28, \"apellido\":\"Camacho\"}"); 
    }


    
}
