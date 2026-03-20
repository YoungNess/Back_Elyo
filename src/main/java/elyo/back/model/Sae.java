package elyo.back.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Sae {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String description;
    private int semestre;
    private String annee;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private float note;
    private float tauxReussite;
    private String lienSite;
    private String lienProduction;

    @ManyToOne
    @JoinColumn(name = "ue_id")
    private UE ue;

    @ManyToOne
    @JoinColumn(name = "domaine_id")
    private Domaine domaine;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "detail_id")
    private DetailSae detail;

    @OneToMany(mappedBy = "sae", cascade = CascadeType.ALL)
    private List<Image> images;

    @ManyToMany
    @JoinTable(
        name = "sae_groupe",
        joinColumns = @JoinColumn(name = "sae_id"),
        inverseJoinColumns = @JoinColumn(name = "groupe_id")
    )
    private List<Groupe> groupes;

    @ManyToMany
    @JoinTable(
        name = "sae_competence",
        joinColumns = @JoinColumn(name = "sae_id"),
        inverseJoinColumns = @JoinColumn(name = "competence_id")
    )
    private List<Competence> competences;

    public Sae() {}

    public Long getId() { return id; }

    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getSemestre() { return semestre; }
    public void setSemestre(int semestre) { this.semestre = semestre; }

    public String getAnnee() { return annee; }
    public void setAnnee(String annee) { this.annee = annee; }

    public LocalDate getDateDebut() { return dateDebut; }
    public void setDateDebut(LocalDate dateDebut) { this.dateDebut = dateDebut; }

    public LocalDate getDateFin() { return dateFin; }
    public void setDateFin(LocalDate dateFin) { this.dateFin = dateFin; }

    public float getNote() { return note; }
    public void setNote(float note) { this.note = note; }

    public float getTauxReussite() { return tauxReussite; }
    public void setTauxReussite(float tauxReussite) { this.tauxReussite = tauxReussite; }

    public String getLienSite() { return lienSite; }
    public void setLienSite(String lienSite) { this.lienSite = lienSite; }

    public String getLienProduction() { return lienProduction; }
    public void setLienProduction(String lienProduction) { this.lienProduction = lienProduction; }

    public UE getUe() { return ue; }
    public void setUe(UE ue) { this.ue = ue; }

    public Domaine getDomaine() { return domaine; }
    public void setDomaine(Domaine domaine) { this.domaine = domaine; }

    public DetailSae getDetail() { return detail; }
    public void setDetail(DetailSae detail) { this.detail = detail; }

    public List<Image> getImages() { return images; }
    public void setImages(List<Image> images) { this.images = images; }

    public List<Groupe> getGroupes() { return groupes; }
    public void setGroupes(List<Groupe> groupes) { this.groupes = groupes; }

    public List<Competence> getCompetences() { return competences; }
    public void setCompetences(List<Competence> competences) { this.competences = competences; }
}