package elyo.back.controller;

import elyo.back.model.Sae;
import elyo.back.service.SaeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sae")
public class SaeController {

    private final SaeService saeService;

    public SaeController(SaeService saeService){
        this.saeService = saeService;
    }

    @PostMapping
    public Sae create(@RequestBody Sae sae){
        return saeService.create(sae);
    }

    @GetMapping
    public List<Sae> getAll(){
        return saeService.getAll();
    }

    @GetMapping("/domain/{domaine}")
    public List<Sae> getByDomain(@PathVariable String domaine){
        return saeService.getByDomain(domaine);
    }

    @GetMapping("/semestre/{semestre}")
    public List<Sae> getBySemestre(@PathVariable String semestre){
        return saeService.getBySemestre(semestre);
    }


    @GetMapping("/sorted")
    public List<Sae> sortByNote(){
        return saeService.getAll()
                .stream()
                .sorted((a,b) -> Double.compare(b.getNote(), a.getNote()))
                .toList();
    }

}