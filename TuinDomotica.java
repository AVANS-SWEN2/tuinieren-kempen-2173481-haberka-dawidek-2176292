public class TuinDomotica {
    private Boolean daglicht;
    private Boolean regen;
    private Schakelaar slimmeschakelaar;

    public TuinDomotica() {
        super();
        slimmeschakelaar = Schakelaar.AUTOMATISCH;
    }
    
    public Boolean getDaglicht() {
        return daglicht;
    }

    public Boolean getRegen() {
        return regen;
    }
    public void setRegen(Boolean regen) {
        this.regen = regen;
    }

    public Schakelaar getSlimmeschakelaar() {
        return slimmeschakelaar;
    }

    public void setSlimmeschakelaar(Schakelaar slimmeschakelaar) {
        this.slimmeschakelaar = slimmeschakelaar;
    }
}
