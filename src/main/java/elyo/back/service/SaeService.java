package elyo.back.service;

import elyo.back.model.Sae;
import elyo.back.repository.SaeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaeService {

    private final SaeRepository saeRepository;

    public SaeService(SaeRepository saeRepository) {
        this.saeRepository = saeRepository;
    }

    public Sae create(Sae sae) {
        return saeRepository.save(sae);
    }

    public List<Sae> getAll() {
        return saeRepository.findAll();
    }

    public List<Sae> getBySemestre(int semestre) {
        return saeRepository.findBySemestre(semestre);
    }

    public List<Sae> getByDomaineId(Long domaineId) {
        return saeRepository.findByDomaineId(domaineId);
    }
}