# Movie-ticket-booking-system-project
This project is about  to develop a Movie Ticket Booking System using Object-Oriented Programming (OOP) principles in Java. The system will allow users to browse movies, view available show times, select seats, and book tickets.
 
Requirements :
1.The system should allow users to view the lists of the movies playing in different theaters.
2.Users should be able to select a movie, theater, and show timing to book tickets.
3.Users should be able to make payments and confirm their booking tickets.
4.The system should display the seating arrangement of the selected seats.
5.The system should allow theater administrators to add, update, and remove movies, shows, and seating arrangements.

Implementations :
 OOP Java Implementation

Classes, Interfaces and Enumerations :
1.The MovieTicketBookingSystem class is the main class that manages the movie ticket booking system.
2.The Movie class represents a movie with properties such as ID, title, description, and duration.
3.The Theater class represents a theater with properties such as ID, name, location, and a list of shows.
4.The Show class represents a movie show in a theater, with properties such as ID, movie, theater, start time, end time, and a map of seats.
5.The Seat class represents a seat in a show, with properties such as ID, row, column, type, price, and status.
6.The SeatStatus enum defines the different statuses of a seat (available or booked).
7.The User class represents a user of the booking system, with properties such as ID, name, and email.
8.The Booking class represents a booking made by a user, with properties such as ID, user, show, selected seats, total price, and status.
9.The BookingStatus enum defines the different statuses of a booking (pending, confirmed, or cancelled).











