public class Relax extends TuristPackage {
    private Spa spa;

    public Relax(Integer id, Integer stock, Integer days, Destiny destiny, Spa spa) {
        super(id,
                stock,
                days,
                destiny);
        this.spa = spa;
        this.setTotalPrice(this.PriceSpa(spa));
    }

    private Double PriceSpa(Spa spa){
        if (Spa.HIDRO == spa){
            return 20.0 + this.getUnitaryPrice();
        }
        else if( Spa.MUDBATHS == spa){
            return 30.0+ this.getUnitaryPrice();
        }
        else{
            return 20.0+ this.getUnitaryPrice();
        }
    }
    public Spa getSpa() {
        return spa;
    }

    public void setSpa(Spa spa) {
        this.spa = spa;
    }

    @Override
    public String toString() {
        return "Relax{" +
                "spa=" + spa +
                "} " + super.toString();
    }
}
