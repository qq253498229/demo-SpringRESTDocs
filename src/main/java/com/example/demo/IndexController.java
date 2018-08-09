package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.ResponseEntity.ok;

/**
 * @author wangbin
 */
@RestController
public class IndexController {
    @GetMapping("/")
    public ResponseEntity<Map<String, Map<String, String>>> index() {
        Map<String, String> contact = new HashMap<>();
        contact.put("name", "Josh Long");
        contact.put("email", "josh@spring.io");
        Map<String, Map<String, String>> result = new HashMap<>();
        result.put("contact", contact);
        return ok(result);
    }
}
