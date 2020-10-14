public class Product {

    private String name, description;
    private double prize;


    public Product(String name, String description, Double prize){
        this.name = name;
        this.description = description;
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", prize=" + prize +
                '}';
    }
}
