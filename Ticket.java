
public class Ticket {

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
