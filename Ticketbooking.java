class Ticketbooking {
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
