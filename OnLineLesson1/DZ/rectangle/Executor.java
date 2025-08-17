import java.util.Scanner;
public class Executor {
    public static void main(String[] args) {
        System.out.println("Введите ширину прямоугольника");
        Scanner scanner = new Scanner(System.in);
        double width = scanner.nextDouble();
        System.out.println("Введите высоту прямоугольника");
        double height = scanner.nextDouble();
        Rectangle rec = new Rectangle(width, height);
        rec.setHeight(height);
        rec.setWidth(width);
        System.out.println("Параметры прямоугольника:" + " высота = " + rec.getHeight() + "," + " ширина = " + rec.getWidth() + "," + " площадь = " + rec.calculateArea() + "," + " периметр = " + rec.calculatePerimeter());

    }
}
