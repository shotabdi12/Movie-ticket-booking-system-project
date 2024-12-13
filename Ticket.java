public class Ticket {
    private final Movie movie;
    private final Customer customer;
    private final double totalPrice;

    public Ticket(Movie movie, Customer customer) {
        this.movie = movie;
        this.customer = customer;
        this.totalPrice = movie.getPrice();
    }

    public void displayTicketDetails() {
        System.out.println("Booking confirmed for: " + customer.getName());
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Ticket Details:");
        System.out.println("Movie: " + movie.getName());
        System.out.println("Genre: " + movie.getGenre());
        System.out.println("Price: " + movie.getPrice());
        System.out.println("Customer: " + customer.getName());
    }
}

