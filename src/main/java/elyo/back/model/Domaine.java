package elyo.back.model;

import jakarta.persistence.*;

@Entity
public class Domaine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String libelle;
    private String code;

    public Domaine() {}

    public Long getId() { return id; }

    public String getLibelle() { return libelle; }
    public void setLibelle(String libelle) { this.libelle = libelle; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
}