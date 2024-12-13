public class Movie {
    private final String name;
    private final String genre;
    private final double price;

    public Movie(String name, String genre, double price) {
        this.name = name;
        this.genre = genre;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }
}

