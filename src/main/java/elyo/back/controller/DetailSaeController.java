package elyo.back.controller;

import elyo.back.model.DetailSae;
import elyo.back.service.DetailSaeService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/detail-sae")
public class DetailSaeController {

    private final DetailSaeService detailSaeService;

    public DetailSaeController(DetailSaeService detailSaeService) {
        this.detailSaeService = detailSaeService;
    }

    @GetMapping("/{id}")
    public Optional<DetailSae> getById(@PathVariable Long id) {
        return detailSaeService.getById(id);
    }

    @PostMapping
    public DetailSae create(@RequestBody DetailSae detailSae) {
        return detailSaeService.create(detailSae);
    }
}