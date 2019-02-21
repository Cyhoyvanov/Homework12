import java.util.Scanner;

public class Homework12 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите расстояние до места назначения(в километрах): ");
        float distance = scan.nextFloat();
        System.out.println("Введите время за которое нужно доехать(в часах): ");
        float time = scan.nextFloat();
        float speed = distance/time;
        System.out.println("Нужно ехать со скоростью: "+speed+"(км/ч)");
    }
}
