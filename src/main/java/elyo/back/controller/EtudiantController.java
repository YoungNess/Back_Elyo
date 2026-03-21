package elyo.back.controller;

import elyo.back.model.Etudiant;
import elyo.back.service.EtudiantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {

    private final EtudiantService etudiantService;

    public EtudiantController(EtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }

    @GetMapping
    public List<Etudiant> getAll() {
        return etudiantService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Etudiant> getById(@PathVariable Long id) {
        return etudiantService.getById(id);
    }

    @GetMapping("/groupe/{groupeId}")
    public List<Etudiant> getByGroupe(@PathVariable Long groupeId) {
        return etudiantService.getByGroupeId(groupeId);
    }
}