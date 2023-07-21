public class domesticTour extends tour{

    // -- Constructor -- //
    private String state;
    private boolean privateTour;
    private boolean honeymoonTour;

    protected domesticTour(int days, price peakPrice, price normalPrice, String state, boolean privateTour, boolean honeymoonTour){
        super(days, peakPrice, normalPrice);
        this.state = state;
        this.privateTour = privateTour;
        this.honeymoonTour = honeymoonTour;
    }

    public String validInput(boolean value){
        if(value){
            return "Yes";
        }
        return "No";
    }


    // -- Setter -- //
    public void setState(String state) {
        this.state = state;
    }
    public void setPrivateTour(boolean privateTour) {
        this.privateTour = privateTour;
    }
    public void setHoneymoonTour(boolean honeymoonTour) {
        this.honeymoonTour = honeymoonTour;
    }


    // -- Getter -- //
    public String getState(){
        return state;
    }
    public boolean getPrivateTour(){
        return privateTour;
    }
    public boolean getHoneymoonTour(){
        return honeymoonTour;
    }


    // -- Display Domestic Tour Information -- //
    public String toString(){
        return "\n -- Domestic Tour -- " +
                "\nState: " + state +
                "\nPrivate Tour (Yes or No): " + validInput(privateTour) +
                "\nHoneymoon Tour (Yes or No): " + validInput(honeymoonTour) +
                "\nDuration: " + super.getDays() + " days"
                ;
    }
}
