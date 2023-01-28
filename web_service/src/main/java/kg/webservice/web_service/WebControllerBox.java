package kg.webservice.web_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class WebControllerBox {
    @GetMapping
    public String getStartMessage(){
        return "Запустился сервер";
    }
}
