public class Product implements Priceable,Nameable {
    private String name;
    private double price;

    public Product(String name,double price){
       setName(name);
       setPrice(price); 

    }

    public void setName(String name) throws IllegalArgumentException{
        if (name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        else {this.name = name;}

    }

    public void setPrice(double price) throws IllegalArgumentException{
        if (price <= 0.0){
            throw new IllegalArgumentException("Price should have positive value");
        }
        else {this.price = price;}
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    
}
