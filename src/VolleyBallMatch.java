public class VolleyBallMatch extends Event{
    protected String firstTeam;
    protected String secondTeam;

    public VolleyBallMatch(String place, String date, String startHour, int numberOfTickets, double priceOfTicket) {
        super(place, date, startHour, numberOfTickets, priceOfTicket);
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
    }

    public VolleyBallMatch(String place, String date, String startHour, String s, String s1, int i, double v) {
        super();
    }

    @Override
    public boolean sellTicket(int num) throws NoMoreTicketException {
        if (this.numberOfTickets > num || this.numberOfTickets == 0){
            throw new NoMoreTicketException(this.firstTeam + " - " + this.secondTeam);
        } else {
            this.numberOfTickets = this.numberOfTickets - num;
            return true;
        }
    }
}
