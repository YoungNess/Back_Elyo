package elyo.back.controller;

import elyo.back.model.Groupe;
import elyo.back.service.GroupeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/groupe")
public class GroupeController {

    private final GroupeService groupeService;

    public GroupeController(GroupeService groupeService) {
        this.groupeService = groupeService;
    }

    @GetMapping
    public List<Groupe> getAll() {
        return groupeService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Groupe> getById(@PathVariable Long id) {
        return groupeService.getById(id);
    }

    @PostMapping
    public Groupe create(@RequestBody Groupe groupe) {
        return groupeService.create(groupe);
    }
}