import java.util.ArrayList;
import java.util.List;

class BookingRecord {
    String guestName;
    String roomType;

    public BookingRecord(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }
}

public class Main {

    public static void main(String[] args) {
        // Initialize booking history list
        List<BookingRecord> history = new ArrayList<>();

        // Add sample booking records
        history.add(new BookingRecord("Abhi", "Single"));
        history.add(new BookingRecord("Subha", "Double"));
        history.add(new BookingRecord("Vanmathi", "Suite"));

        // Display booking history report
        System.out.println("Booking History and Reporting\n");
        System.out.println("Booking History Report");
        for (BookingRecord record : history) {
            System.out.println("Guest: " + record.guestName + ", Room Type: " + record.roomType);
        }
    }
}