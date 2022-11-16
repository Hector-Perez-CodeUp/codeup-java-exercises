package movies;

public class Movie {
    private String name;
    private String category;

    public static void main(String[] args) {
        Movie myMovie = new Movie("Halloween", "Horror");
        System.out.println(myMovie.getName());
        System.out.println(myMovie.getCategory());

    }

    // Constructor
    public Movie(String myName, String myCategory){
        this.name = myName;
        this.category = myCategory;
    }

    // Name Getter
    public String getName() {
        return name;
    }
    // Name Setter
    public void setName(String name) {
        this.name = name;
    }
    // Category Getter
    public String getCategory() {
        return category;
    }
    // Category Setter
    public void setCategory(String name) {
        this.category = name;
    }
}
