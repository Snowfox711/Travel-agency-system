public class normalPrice extends price{

    // -- Constructor -- //
    private double adult;
    private double childWithExtraBed;
    private double childWithNoExtraBed;
    private double infant;

    protected normalPrice() {
        this(0, 0, 0, 0);
    }

    protected normalPrice(double adult, double childWithExtraBed, double childWithNoExtraBed, double infant){
        this.adult = adult;
        this.childWithExtraBed = childWithExtraBed;
        this.childWithNoExtraBed = childWithNoExtraBed;
        this.infant = infant;
    }


    // -- Setter -- //
    public void setAdult(double adult) {
        this.adult = adult;
    }
    public void setChildWithExtraBed(double childWithExtraBed) {
        this.childWithExtraBed = childWithExtraBed;
    }
    public void setChildWithNoExtraBed(double childWithNoExtraBed) {
        this.childWithNoExtraBed = childWithNoExtraBed;
    }
    public void setInfant(double infant) {
        this.infant = infant;
    }


    // -- Getter -- //
    public double getAdult() {
        return adult;
    }
    public double getChildWithExtraBed() {
        return childWithExtraBed;
    }
    public double getChildWithNoExtraBed() {
        return childWithNoExtraBed;
    }
    public double getInfant() {
        return infant;
    }


    // -- Display Normal Price Information -- //
    public String toString() {
        return
                "\n -- Normal Price -- " +
                "\nAdult Price: RM " + adult +
                "\nChild With Extra Bed Price: RM " + childWithExtraBed+
                "\nChild With No Extra Bed Price: RM " + childWithNoExtraBed +
                "\nInfant Price: RM " + infant
                ;
    }
}
