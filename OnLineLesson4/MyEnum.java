public enum MyEnum {
    ANNA("анна"),
    PETR("петя"),
    VASAY();


    private String rusName;

    MyEnum(String name){
        this.rusName = name;
    }
    
    MyEnum(){
        this.rusName = "Empty";
    }

    public String getName(){
        return rusName;
    }
}
