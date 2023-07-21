public class tour{

        // -- Constructor -- //
        private int days;
        private price peakPrice;
        private price normalPrice;

        protected tour(int days, price peakPrice, price normalPrice){
            this.days = days;
            this.peakPrice = peakPrice;
            this.normalPrice = normalPrice;
        }


        // -- Setter -- //
        public void setDays(int days) {
            this.days = days;
        }
        public void setPeakPrice(price peakPrice) {
            this.peakPrice = peakPrice;
        }
        public void setNormalPrice(price normalPrice) {
            this.normalPrice = normalPrice;
        }


        // -- Getter -- //
        public int getDays() {return days;}
        public price getPeakPrice() {
            return peakPrice;
        }
        public price getNormalPrice() {
            return normalPrice;
        }
}
