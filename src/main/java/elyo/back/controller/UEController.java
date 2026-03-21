package elyo.back.controller;

import elyo.back.model.UE;
import elyo.back.service.UEService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ue")
public class UEController {

    private final UEService ueService;

    public UEController(UEService ueService) {
        this.ueService = ueService;
    }

    @GetMapping
    public List<UE> getAll() {
        return ueService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<UE> getById(@PathVariable Long id) {
        return ueService.getById(id);
    }

    @GetMapping("/semestre/{semestre}")
    public List<UE> getBySemestre(@PathVariable int semestre) {
        return ueService.getBySemestre(semestre);
    }

    @PostMapping
    public UE create(@RequestBody UE ue) {
        return ueService.create(ue);
    }
}