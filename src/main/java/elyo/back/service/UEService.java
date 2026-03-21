package elyo.back.service;

import elyo.back.model.UE;
import elyo.back.repository.UERepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UEService {

    private final UERepository ueRepository;

    public UEService(UERepository ueRepository) {
        this.ueRepository = ueRepository;
    }

    public List<UE> getAll() {
        return ueRepository.findAll();
    }

    public Optional<UE> getById(Long id) {
        return ueRepository.findById(id);
    }

    public List<UE> getBySemestre(int semestre) {
        return ueRepository.findBySemestre(semestre);
    }

    public UE create(UE ue) {
        return ueRepository.save(ue);
    }
}
