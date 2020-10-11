package Logowanie;

import javax.persistence.*;

@Entity
public class Uczestnik {
    @GeneratedValue
    @Id
    private Long id;

    @Column
    private String imie;

    @Column
    private String nazwisko;

    @Column
    private int wiek;

    @Column
    private String imiePartnera;

    @Column
    private Boolean czyBędzie;
    private Boolean czyBędzie2;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getImiePartnera() {
        return imiePartnera;
    }

    public void setImiePartnera(String imiePartnera) {
        this.imiePartnera = imiePartnera;
    }

    public Boolean getCzyBędzie() {
        return czyBędzie;
    }

    public void setCzyBędzie(Boolean czyBędzie) {
        this.czyBędzie = czyBędzie;
    }


    public Uczestnik withId(final Long id) {
        this.id = id;
        return this;
    }

    public Uczestnik withName(final String imie) {
        this.imie = imie;
        return this;
    }

    public Uczestnik withSurname(final String nazwisko) {
        this.nazwisko = nazwisko;
        return this;
    }

    public Uczestnik withAge(final int wiek) {
        this.wiek = wiek;
        return this;
    }

    public Uczestnik withPartnerName(final String imiePartnera) {
        this.imiePartnera = imiePartnera;
        return this;
    }
    public Uczestnik withDecision(final boolean czyBędzie) {
        this.czyBędzie = czyBędzie;
        return this;
    }
    @Override
    public String toString() {
        return "TaskEntity{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek + '\'' +
                ", imiePartnera=" + imiePartnera + '\'' +
                ", czyBędzie=" + czyBędzie +
                '}';
    }
}
