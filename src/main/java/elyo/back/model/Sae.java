package elyo.back.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Sae {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String domaine;
    private String semestre;
    private String competence;

    private LocalDate dateDebut;
    private LocalDate dateFin;

    private Double note;
    private Double tauxReussite;

    private String ue;

    private String siteLink;
    private String codeLink;

    private String image;

    @ManyToMany
    private List<Student> authors;

    public Sae(){}

    public Long getId(){ return id; }

    public String getTitle(){ return title; }
    public void setTitle(String title){ this.title = title; }

    public String getDomaine(){ return domaine; }
    public void setDomaine(String domaine){ this.domaine = domaine; }

    public String getSemestre(){ return semestre; }
    public void setSemestre(String semestre){ this.semestre = semestre; }

    public String getCompetence(){ return competence; }
    public void setCompetence(String competence){ this.competence = competence; }

    public LocalDate getDateDebut(){ return dateDebut; }
    public void setDateDebut(LocalDate dateDebut){ this.dateDebut = dateDebut; }

    public LocalDate getDateFin(){ return dateFin; }
    public void setDateFin(LocalDate dateFin){ this.dateFin = dateFin; }

    public Double getNote(){ return note; }
    public void setNote(Double note){ this.note = note; }

    public Double getTauxReussite(){ return tauxReussite; }
    public void setTauxReussite(Double tauxReussite){ this.tauxReussite = tauxReussite; }

    public String getUe(){ return ue; }
    public void setUe(String ue){ this.ue = ue; }

    public String getSiteLink(){ return siteLink; }
    public void setSiteLink(String siteLink){ this.siteLink = siteLink; }

    public String getCodeLink(){ return codeLink; }
    public void setCodeLink(String codeLink){ this.codeLink = codeLink; }

    public String getImage(){ return image; }
    public void setImage(String image){ this.image = image; }

    public List<Student> getAuthors(){ return authors; }
    public void setAuthors(List<Student> authors){ this.authors = authors; }
}