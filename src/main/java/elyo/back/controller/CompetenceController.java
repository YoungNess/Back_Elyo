package elyo.back.controller;

import elyo.back.model.Competence;
import elyo.back.service.CompetenceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/competence")
public class CompetenceController {

    private final CompetenceService competenceService;

    public CompetenceController(CompetenceService competenceService) {
        this.competenceService = competenceService;
    }

    @GetMapping
    public List<Competence> getAll() {
        return competenceService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Competence> getById(@PathVariable Long id) {
        return competenceService.getById(id);
    }

    @PostMapping
    public Competence create(@RequestBody Competence competence) {
        return competenceService.create(competence);
    }
}