package demo.code.entity;

import javax.persistence.*;

@Entity
public class Bond {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String cusip;
    @Column
    private Long faceValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCusip() {
        return cusip;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    public Long getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(Long faceValue) {
        this.faceValue = faceValue;
    }
}
