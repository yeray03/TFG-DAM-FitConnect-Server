package org.fitconnect.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {
    @GetMapping
    public ResponseEntity<Map<String, Object>> apiInfo() {
        Map<String, Object> info = new HashMap<>();

        info.put("nombre", "FitConnect API");
        info.put("status", "online");

        Map<String, String> endpoints = new HashMap<>();
        endpoints.put("Usuarios", "GET/POST/PUT/DELETE /api/users");

        info.put("endpoints", endpoints);

        return ResponseEntity.ok(info);
    }
}
