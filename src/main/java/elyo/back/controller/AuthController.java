package elyo.back.controller;

import elyo.back.model.Etudiant;
import elyo.back.service.EtudiantService;

import java.util.Optional;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final EtudiantService etudiantService;

    public AuthController(EtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }

    @PostMapping("/login")
    public Optional<Etudiant> login(@RequestParam String email) {
        return etudiantService.findByEmail(email);
    }

    @PostMapping("/add")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.create(etudiant);
    }
}