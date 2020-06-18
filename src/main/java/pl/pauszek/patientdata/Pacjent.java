package pl.pauszek.patientdata;

public class Pacjent {

    private String imie;
    private String nazwisko;
    private String wzrost;
    private String waga;
    private String choroba;

    public Pacjent(String imie, String nazwisko, String wzrost, String waga, String choroba) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wzrost = wzrost;
        this.waga = waga;
        this.choroba = choroba;
    }

    public Pacjent() {
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

    public String getWzrost() {
        return wzrost;
    }

    public void setWzrost(String wzrost) {
        this.wzrost = wzrost;
    }

    public String getWaga() {
        return waga;
    }

    public void setWaga(String waga) {
        this.waga = waga;
    }

    public String getChoroba() {
        return choroba;
    }

    public void setChoroba(String choroba) {
        this.choroba = choroba;
    }

    @Override
    public String toString() {
        return "Pacjent{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wzrost='" + wzrost + '\'' +
                ", waga='" + waga + '\'' +
                ", choroba='" + choroba + '\'' +
                '}';
    }
}
