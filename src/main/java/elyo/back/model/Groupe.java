package elyo.back.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Groupe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomGroupe;
    private String anneePromo;

    @OneToMany(mappedBy = "groupe")
    private List<Etudiant> etudiants;

    public Groupe() {}

    public Long getId() { return id; }

    public String getNomGroupe() { return nomGroupe; }
    public void setNomGroupe(String nomGroupe) { this.nomGroupe = nomGroupe; }

    public String getAnneePromo() { return anneePromo; }
    public void setAnneePromo(String anneePromo) { this.anneePromo = anneePromo; }

    public List<Etudiant> getEtudiants() { return etudiants; }
    public void setEtudiants(List<Etudiant> etudiants) { this.etudiants = etudiants; }
}