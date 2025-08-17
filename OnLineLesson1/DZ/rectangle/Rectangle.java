public class Rectangle {
    private double width;
    private double height;
    
    /*Конструктор */
    public Rectangle(double width,double height){
        this.setHeight(height);
        this.height = height;
        this.width = width;
    }

    /*set */   
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 1;
        }
        
    }
    public void setHeight(double height) {
        if (height>0) {this.height = height;}
        else {this.height = 1;}
    }

    /*get */
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    };

    /*метод 1 */    
    public double calculateArea() {
        return this.width*this.height;
    }

    /*метод 2 */    
    public double calculatePerimeter() {
        return (this.width+this.height)*2;
    }






}
