public class NoMoreTicketException extends Exception{
    private String nameOfEvent;

    public NoMoreTicketException(String nameOfEvent){
        super("There is no more tickets for: " + nameOfEvent);
        this.nameOfEvent = nameOfEvent;
    }

    public String getMessage(){
        return super.getMessage();
    }
}
