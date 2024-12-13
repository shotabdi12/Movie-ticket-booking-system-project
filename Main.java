public class Main {

    public static void main(String[] args) {
        // Create a Movie object
        Movie movie = new Movie("Avengers", "Action", 300.0);

        // Create a Customer object
        Customer customer = new Customer("Shatabdi", 22);

        // Create a Ticket object
        Ticket ticket = new Ticket(movie, customer);

        // Print ticket details
        ticket.printTicket();

        // Process payment using OnlinePayment (which implements Payment interface)
        Payment payment = new OnlinePayment();
        payment.processPayment(ticket.getMovie().getPrice());
    }
}
 class Movie{
     // Create a extends Movie object

    // Fields 
    private String title;
    private String genre;
    private double price;

    // Constructor
    public Movie(String title, String genre, double price) {
        // Validation for title and genre
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty.");
        }
        if (genre == null || genre.isEmpty()) {
            throw new IllegalArgumentException("Genre cannot be null or empty.");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }

        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }

    // Optional: Override toString for better debugging
    @Override
    public String toString() {
        return "Movie: " + title + "\nGenre: " + genre + "\nPrice: " + price;
    }
}

 class Ticket{
      // Create a extend object

    private final Movie movie;
    private Customer customer;

    public Ticket(Movie movie, Customer customer) {
        this.movie = movie;
        this.customer = customer;
    }

    public void printTicket() {
        System.out.println("Ticket Details:");
        System.out.println("Movie: " + movie.getTitle());
        System.out.println("Genre: " + movie.getGenre());
        System.out.println("Price: " + movie.getPrice());
        System.out.println("Customer: " + customer.getName());
    }

    public Movie getMovie() {
        return movie;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
class Cinema {
    private final String name;
    private String location;

    public Cinema(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void showMovie(Movie movie) {
        System.out.println("Now Showing: " + movie.getTitle() + " in " + location);
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

class Customer {

    private final String name;
    private final int age;

    // Constructor
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
@SuppressWarnings("unused")
class Ticketbooking {
    //extends objcet 
    private final Ticket ticket;
    private final Cinema cinema;

    public Ticketbooking(Ticket ticket, Cinema cinema) {
        this.ticket = ticket;
        this.cinema = cinema;
    }

    public void confirmBooking() {
        cinema.showMovie(ticket.getMovie());
        System.out.println("Booking confirmed for: " + ticket.getCustomer().getName());
        System.out.println("Total Price: " + ticket.getMovie().getPrice());
    }
}

interface Payment {

    void processPayment(double amount);
}

class OnlinePayment
// extends objcet 
        implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment of " + amount + " completed via Online Payment.");
    }
}
