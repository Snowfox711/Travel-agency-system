public class overseasTour extends tour{

    // -- Constructor -- //
    private String country;
    private String state;
    private boolean joinedTour;
    private boolean privateTour;

    private overseasTour(){
        this(0,new normalPrice(),new peakPrice(),"Unknown","Unknown",false,false);
    }

    protected overseasTour(int days, price peakPrice, price normalPrice, String country, String state, boolean joinedTour, boolean privateTour){
        super(days, peakPrice, normalPrice);
        this.country = country;
        this.state = state;
        this.joinedTour = joinedTour;
        this.privateTour = privateTour;
    }

    public String validInput(boolean value){
        if(value){
            return "Yes";
        }
        return "No";
    }


    // -- Setter -- //
    public void setCountry(String country) {
        this.country = country;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setJoinedTour(boolean joinedTour) {
        this.joinedTour = joinedTour;
    }
    public void setPrivateTour(boolean privateTour) {
        this.privateTour = privateTour;
    }


    // -- Getter -- //
    public String getCountry(){
        return country;
    }
    public String getState(){
        return state;
    }
    public boolean getJoinedTour() {
        return joinedTour;
    }
    public boolean getPrivateTour() {
        return privateTour;
    }


    // -- Display Overseas Tour Information -- //
    public String toString(){
        return "\n -- Overseas Tour -- " +
                "\nCountry: " + country +
                "\nState: " + state +
                "\nJoined Tour (Yes or No): " + validInput(joinedTour) +
                "\nPrivate Tour (Yes or No): " + validInput(privateTour) +
                "\nDuration: " + super.getDays() + " days"
                ;
    }
}
