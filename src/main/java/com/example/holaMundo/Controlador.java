package com.example.holaMundo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class Controlador {
    @GetMapping("/app/hello")
    public Map<String, String> hello() {
        Map<String, String> map = new HashMap<>();
        map.put("Mensaje", "Hola mundo");
        map.put("fecha", new Date().toString());
        return map;
    }
}
