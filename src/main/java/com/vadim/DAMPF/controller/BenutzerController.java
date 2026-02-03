package com.vadim.DAMPF.controller;
import com.vadim.DAMPF.service.BenutzerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/benutzer")
public class BenutzerController {
    private final BenutzerService service;

    public BenutzerController(BenutzerService service) { this.service = service; }

    @PostMapping("/{benutzerID}/AddToBalance")
    public ResponseEntity<String> addBalance(@PathVariable int benutzerID, @RequestParam float Betrag) {
        service.addBalance(benutzerID, Betrag);
        return ResponseEntity.ok("Balance Aktuelisiert");

    }

}
