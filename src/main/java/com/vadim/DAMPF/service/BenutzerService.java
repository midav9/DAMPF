package com.vadim.DAMPF.service;

import com.vadim.DAMPF.*;
import com.vadim.DAMPF.repository.BenutzerRepository;
import org.springframework.stereotype.Service;

@Service
public class BenutzerService {
    private final BenutzerRepository repo;

    public BenutzerService(BenutzerRepository repo) { this.repo = repo; }


}
