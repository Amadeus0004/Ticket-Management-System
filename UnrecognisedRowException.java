public class UnrecognisedRowException extends RuntimeException {
    private String message;
    public UnrecognisedRowException(String message) {
      super(message);
      this.message = message;
    }

    public String getMessage(){
      return message;
    }
}
