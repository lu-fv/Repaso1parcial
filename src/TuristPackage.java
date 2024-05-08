public abstract class TuristPackage {
    private Integer id;
    private Integer stock;
    private Integer days;
    private  Double unitaryPrice;
    private  Double totalPrice;
    private Destiny destiny;

    public TuristPackage(Integer id, Integer stock, Integer days,  Destiny destiny) {
        this.id = id;
        this.stock = stock;
        this.days = days;
        this.destiny = destiny;
        this.unitaryPrice = this.PriceDestiny(destiny);

    }

    public TuristPackage() {
    }

    private Double PriceDestiny (Destiny destiny) {
        if (Destiny.BEACH == destiny) {
            return 600.0 ;
        } else  {
            return 500.0 ;
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Double getUnitaryPrice() {
        return unitaryPrice;
    }

    public void setUnitaryPrice(Double unitaryPrice) {
        this.unitaryPrice = unitaryPrice;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Destiny getDestiny() {
        return destiny;
    }

    public void setDestiny(Destiny destiny) {
        this.destiny = destiny;
    }

    @Override
    public String toString() {
        return "TuristPackage{" +
                "id=" + id +
                ", stock=" + stock +
                ", days=" + days +
                ", unitaryPrice=" + unitaryPrice +
                ", totalPrice=" + totalPrice +
                ", destiny=" + destiny +
                '}';
    }


}
