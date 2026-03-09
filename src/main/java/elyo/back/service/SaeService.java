package elyo.back.service;

import elyo.back.model.Sae;
import elyo.back.repository.SaeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaeService {

    private final SaeRepository saeRepository;

    public SaeService(SaeRepository saeRepository){
        this.saeRepository = saeRepository;
    }

    public Sae create(Sae sae){
        return saeRepository.save(sae);
    }

    public List<Sae> getAll(){
        return saeRepository.findAll();
    }

    public List<Sae> getByDomain(String domaine){
        return saeRepository.findByDomaine(domaine);
    }

    public List<Sae> getBySemestre(String semestre){
        return saeRepository.findBySemestre(semestre);
    }

}