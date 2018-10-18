package bo;

public class Pokemon {
    String Name;
    int PV;   /*Point de vie*/
    int PP;   /*Point de pouvoir*/
    String crisDeCombat;
    String crisDeVictoire;
    String crisDeDefaite;

    public Pokemon(String name, int PV, int PP, String crisDeCombat, String crisDeVictoire, String crisDeDefaite) {
        Name = name;
        this.PV = PV;
        this.PP = PP;
        this.crisDeCombat = crisDeCombat;
        this.crisDeVictoire = crisDeVictoire;
        this.crisDeDefaite = crisDeDefaite;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPV() {
        return PV;
    }

    public void setPV(int PV) {
        this.PV = PV;
    }

    public int getPP() {
        return PP;
    }

    public void setPP(int PP) {
        this.PP = PP;
    }

    public String getCrisDeCombat() {
        return crisDeCombat;
    }

    public void setCrisDeCombat(String crisDeCombat) {
        this.crisDeCombat = crisDeCombat;
    }

    public String getCrisDeVictoire() {
        return crisDeVictoire;
    }

    public void setCrisDeVictoire(String crisDeVictoire) {
        this.crisDeVictoire = crisDeVictoire;
    }

    public String getCrisDeDefaite() {
        return crisDeDefaite;
    }

    public void setCrisDeDefaite(String crisDeDefaite) {
        this.crisDeDefaite = crisDeDefaite;
    }
}
