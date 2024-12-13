public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        // Create movie and theater
        Movie movie = new Movie("Avengers", "Action", 300.0);

        // Create customer
        Customer customer = new Customer("Shatabdi");

        // Create ticket
        Ticket ticket = new Ticket(movie, customer);

        // Payment
        OnlinePayment payment = new OnlinePayment();
        ((Object) payment).pay(movie.getPrice());

        // Display ticket details
        ticket.displayTicketDetails();
    }
}

