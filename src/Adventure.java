public class Adventure extends TuristPackage implements increacePriceAd, travelInsurance {
    private Activities activities;

    public Adventure(Integer id, Integer stock, Integer days,  Destiny destiny, Activities activities) {
        super(id, stock, days, destiny);
        this.activities = activities;
        this.setTotalPrice(this.PriceActivities(activities));
    }

    public Activities getActivities() {
        return activities;
    }

    private Double PriceActivities(Activities activities){
        if (Activities.KAYAK == activities){
            return 50.0 + this.getUnitaryPrice();
        }
        else {
            return 40.0+ this.getUnitaryPrice();
        }
    }
    public void setActivities(Activities activities) {
        this.activities = activities;
    }

    @Override
    public void increacePriceAdventure() {
        Double increace =0.0;

        increace = this.getTotalPrice() * 0.10+ this.getTotalPrice();
        this.setTotalPrice(increace);
    }

    @Override
    public void insurance() {
        Double insurance= 0.0;
        insurance = this.getTotalPrice() * 0.05 + this.getTotalPrice();
        this.setTotalPrice(insurance);
    }

    @Override
    public String toString() {
        return "Adventure{" +
                "activities=" + activities +
                "} " + super.toString();
    }
}
