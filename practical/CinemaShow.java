public class CinemaShow {

    private String title;
    private int seatsAvailable;
    private final int capacity;

    private static int totalBooked = 0;
    

   
    public CinemaShow(String title, int capacity) {
        this.title = title;
        this.capacity = capacity;
        this.seatsAvailable = capacity;
    }

    
    public CinemaShow(String title) {
        this(title, 100);
    }

    
    public boolean book(int n) {
        if (n <= seatsAvailable) {
            seatsAvailable -= n;
            totalBooked += n;
            return true;
        }
        return false;
    }

   
    public void cancel(int n) {
        seatsAvailable += n;

        if (seatsAvailable > capacity) {
            seatsAvailable = capacity;
        }
    }

    
    public int getSeatsAvailable() {
        return seatsAvailable;
    }

   
    public static int getTotalBooked() {
        return totalBooked;
    }

    
    public static void main(String[] args) {

        CinemaShow show = new CinemaShow("Avengers: Doomsday ", 80);
        System.out.println("25AIML039");

        System.out.println("Book 25: " + show.book(25));
        System.out.println("Seats Available: " + show.getSeatsAvailable());

        System.out.println("Book 30: " + show.book(30));
        System.out.println("Seats Available: " + show.getSeatsAvailable());

        System.out.println("Book 35: " + show.book(35)); // Not enough seats
        System.out.println("Seats Available: " + show.getSeatsAvailable());

        show.cancel(20);
        System.out.println("After Cancel 20 Seats: " + show.getSeatsAvailable());

        System.out.println("Book 15: " + show.book(15));
        System.out.println("Seats Available: " + show.getSeatsAvailable());

        System.out.println("Total Booked Seats: " + CinemaShow.getTotalBooked());
    }
}