package threads.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/App")
public class HealthController {
    @GetMapping(value = "/getHealth")
     public ResponseEntity<String>getApplicationHealth(){
        return ResponseEntity.ok("200");

    }


}
