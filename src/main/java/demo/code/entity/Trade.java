package demo.code.entity;

import javax.persistence.*;
import java.util.List;

/**
 * This entity contains sub entities whose properties will not be created by ai.
 */
@Entity
public class Trade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(targetEntity = Bond.class, mappedBy = "id", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Bond> bonds;
    @Column
    private String trader;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Bond> getBonds() {
        return bonds;
    }

    public void setBonds(List<Bond> bonds) {
        this.bonds = bonds;
    }

    public String getTrader() {
        return trader;
    }

    public void setTrader(String trader) {
        this.trader = trader;
    }
}
