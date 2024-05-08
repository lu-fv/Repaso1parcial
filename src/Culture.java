public class Culture extends TuristPackage implements travelInsurance{
    private Integer visit;

    public Culture(Integer id, Integer stock, Integer days, Destiny destiny, Integer visit) {
        super(id, stock, days, destiny);
        this.visit = visit;
        this.setTotalPrice(this.cantVisit(visit));
    }

    private Double cantVisit (Integer visit){

        return visit * 10.0 + this.getUnitaryPrice();
    }
    public Integer getVisit() {
        return visit;
    }

    public void setVisit(Integer visit) {
        this.visit = visit;
    }

    @Override
    public void insurance() {
        Double insurance= 0.0;
        insurance = this.getTotalPrice() * 0.05;
        this.setTotalPrice(insurance);

    }

    @Override
    public String toString() {
        return  super.toString()+'\n' +
                " Culture:" + " visit='" + visit + '\'';
    }

}
