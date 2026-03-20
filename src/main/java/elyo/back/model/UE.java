package elyo.back.model;

import jakarta.persistence.*;

@Entity
public class UE {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codeUe;
    private String libelle;
    private int semestre;

    public UE() {}

    public Long getId() { return id; }

    public String getCodeUe() { return codeUe; }
    public void setCodeUe(String codeUe) { this.codeUe = codeUe; }

    public String getLibelle() { return libelle; }
    public void setLibelle(String libelle) { this.libelle = libelle; }

    public int getSemestre() { return semestre; }
    public void setSemestre(int semestre) { this.semestre = semestre; }
}