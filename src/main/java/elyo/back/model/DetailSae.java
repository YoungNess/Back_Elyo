package elyo.back.model;

import jakarta.persistence.*;

@Entity
public class DetailSae {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rapportUrl;
    private String soutenanceUrl;
    private String remarques;

    @OneToOne(mappedBy = "detail")
    private Sae sae;

    public DetailSae() {}

    public Long getId() { return id; }

    public String getRapportUrl() { return rapportUrl; }
    public void setRapportUrl(String rapportUrl) { this.rapportUrl = rapportUrl; }

    public String getSoutenanceUrl() { return soutenanceUrl; }
    public void setSoutenanceUrl(String soutenanceUrl) { this.soutenanceUrl = soutenanceUrl; }

    public String getRemarques() { return remarques; }
    public void setRemarques(String remarques) { this.remarques = remarques; }

    public Sae getSae() { return sae; }
    public void setSae(Sae sae) { this.sae = sae; }
}