import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;


public class TicketLoader implements Importable {
        private final static String FILE_WITH_CONCERTS_NAME = "dailyTickets.txt";
        private static BufferedReader reader = null;

        @Override
        public Object[] importDataFromFile() throws IOException {
            Event[] arrayOfEvents = null;
            int numberOfRows = getNumberOfRows();

            reader = new BufferedReader(new FileReader(FILE_WITH_CONCERTS_NAME));

            arrayOfEvents = new Event[numberOfRows];
            String line;
            int currentRowIndex = 0;

            Field[] fieldsOfConcertClass = Concert.class.getDeclaredFields();
            Field[] fieldsOfEventClass = VolleyBallMatch.class.getSuperclass().getDeclaredFields();
            Field[] fieldsOfVolleyClass = VolleyBallMatch.class.getDeclaredFields();

            int totalNumberOfFieldsOfVolleyClass = fieldsOfEventClass.length + fieldsOfVolleyClass.length;
            int totalNumberOfFieldOfConcertClass = fieldsOfEventClass.length + fieldsOfConcertClass.length;

            while((line = reader.readLine()) != null){
                try{
                    if(line.startsWith("1")){
                        String[] concertArray = line.split("\\*");
                        if (concertArray.length == (totalNumberOfFieldOfConcertClass + 1)){
                            Concert c = new Concert(concertArray[1], concertArray[2], concertArray[3], concertArray[4], Integer.parseInt(concertArray[5]), Double.parseDouble(concertArray[6]));
                            arrayOfEvents[currentRowIndex++] = c;
                        }
                    }else if (line.startsWith("2")) {
                        String[] volleyArray = line.split("\\*");
                        if (volleyArray.length == (totalNumberOfFieldsOfVolleyClass + 1)){
                            VolleyBallMatch v = new VolleyBallMatch(volleyArray[1], volleyArray[2], volleyArray[3], volleyArray[4], volleyArray[5], Integer.parseInt(volleyArray[6]), Double.parseDouble(volleyArray[7]));
                                    arrayOfEvents[currentRowIndex++] = v;

                        } else {
                            throw new UnrecognisedRowException("One unrecognised row was founded at " + (currentRowIndex + 1) + " row!");
                        }
                    }
                } catch (UnrecognisedRowException e) {
                    System.out.println(e.getMessage());
                }
            }
            return arrayOfEvents;
        }

        private int getNumberOfRows() throws IOException {
            reader = new BufferedReader(new FileReader(FILE_WITH_CONCERTS_NAME));

            int numberOfRows = 0;
            while (reader.readLine() != null){
                numberOfRows++;
            }
            reader.close();
            return numberOfRows;
        }
}
