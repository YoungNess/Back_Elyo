package elyo.back.controller;

import elyo.back.model.Domaine;
import elyo.back.service.DomaineService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/domaine")
public class DomaineController {

    private final DomaineService domaineService;

    public DomaineController(DomaineService domaineService) {
        this.domaineService = domaineService;
    }

    @GetMapping
    public List<Domaine> getAll() {
        return domaineService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Domaine> getById(@PathVariable Long id) {
        return domaineService.getById(id);
    }

    @PostMapping
    public Domaine create(@RequestBody Domaine domaine) {
        return domaineService.create(domaine);
    }
}