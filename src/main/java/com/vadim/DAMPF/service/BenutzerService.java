package com.vadim.DAMPF.service;

import com.sun.jna.platform.win32.Netapi32Util;
import com.vadim.DAMPF.repository.BenutzerRepository;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import com.vadim.DAMPF.entity.benutzer;

@Service
public class BenutzerService {
    private final BenutzerRepository repo;

    public BenutzerService(BenutzerRepository repo) { this.repo = repo; }

    public void addBalance(int benutzerID, float Betrag) {
        benutzer u = repo.findById(benutzerID).orElseThrow();
        u.setBalance(u.getBalance() + Betrag);
        repo.save(u);
    }
}
