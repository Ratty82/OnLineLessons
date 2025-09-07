public class NumberBox<T extends Number & Comparable<T>> {

    private T number;

    

    public NumberBox(T number) {
        this.number = number;
    }



    public double getDoubleVal(){
        return number.doubleValue();
    }
    
}
