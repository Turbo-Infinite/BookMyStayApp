import java.util.HashMap;
import java.util.Map;

class RoomInventory {
    private Map<String, RoomDetails> inventory;

    public RoomInventory() {
        inventory = new HashMap<>();
    }

    // Register room type with details
    public void addRoomType(String roomType, int beds, int sizeSqFt, double price, int availableCount) {
        inventory.put(roomType, new RoomDetails(beds, sizeSqFt, price, availableCount));
    }

    // Display current inventory in structured format
    public void displayInventory() {
        System.out.println("Hotel Room Inventory Status\n");
        for (Map.Entry<String, RoomDetails> entry : inventory.entrySet()) {
            String roomType = entry.getKey();
            RoomDetails details = entry.getValue();
            System.out.println(roomType + ":");
            System.out.println("Beds: " + details.beds);
            System.out.println("Size: " + details.sizeSqFt + " sqft");
            System.out.println("Price per night: " + details.price);
            System.out.println("Available Rooms: " + details.availableCount);
            System.out.println();
        }
    }

    // Inner class to hold room details
    private static class RoomDetails {
        int beds;
        int sizeSqFt;
        double price;
        int availableCount;

        RoomDetails(int beds, int sizeSqFt, double price, int availableCount) {
            this.beds = beds;
            this.sizeSqFt = sizeSqFt;
            this.price = price;
            this.availableCount = availableCount;
        }
    }
}

public class Main {

    public static void main(String[] args) {
        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Register room types with details
        inventory.addRoomType("Single Room", 1, 250, 1500.0, 5);
        inventory.addRoomType("Double Room", 2, 400, 2500.0, 3);
        inventory.addRoomType("Suite Room", 3, 750, 5000.0, 2);

        // Display inventory state
        inventory.displayInventory();

    }
}