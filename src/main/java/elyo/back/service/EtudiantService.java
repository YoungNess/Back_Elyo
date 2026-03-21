package elyo.back.service;

import elyo.back.model.Etudiant;
import elyo.back.repository.EtudiantRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EtudiantService {

    private final EtudiantRepository etudiantRepository;

    public EtudiantService(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    public List<Etudiant> getAll() {
        return etudiantRepository.findAll();
    }

    public Optional<Etudiant> getById(Long id) {
        return etudiantRepository.findById(id);
    }

    public List<Etudiant> getByGroupeId(Long groupeId) {
        return etudiantRepository.findByGroupeId(groupeId);
    }

    public Optional<Etudiant> findByEmail(String email) {
        return etudiantRepository.findByEmail(email);
    }

    public Etudiant create(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }
}