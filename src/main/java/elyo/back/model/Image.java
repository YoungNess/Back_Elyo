package elyo.back.model;

import jakarta.persistence.*;

@Entity
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;
    private String legende;
    private int ordre;

    @ManyToOne
    @JoinColumn(name = "sae_id")
    private Sae sae;

    public Image() {}

    public Long getId() { return id; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    public String getLegende() { return legende; }
    public void setLegende(String legende) { this.legende = legende; }

    public int getOrdre() { return ordre; }
    public void setOrdre(int ordre) { this.ordre = ordre; }

    public Sae getSae() { return sae; }
    public void setSae(Sae sae) { this.sae = sae; }
}