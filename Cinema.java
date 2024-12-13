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
