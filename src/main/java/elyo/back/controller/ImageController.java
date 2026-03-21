package elyo.back.controller;

import elyo.back.model.Image;
import elyo.back.service.ImageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/image")
public class ImageController {

    private final ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping("/sae/{saeId}")
    public List<Image> getBySae(@PathVariable Long saeId) {
        return imageService.getBySaeId(saeId);
    }

    @PostMapping
    public Image create(@RequestBody Image image) {
        return imageService.create(image);
    }
}