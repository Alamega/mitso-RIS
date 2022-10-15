package mitso.shuman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("mitso.shuman");
        QuadraticEquation service = context.getBean(QuadraticEquation.class);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("The program solves equations of the form ax^2+bx+c=0");
            System.out.print("Input a: ");
            double a = scanner.nextDouble();
            if (a == 0) { break; }
            System.out.print("Input b: ");
            double b = scanner.nextDouble();
            System.out.print("Input c: ");
            double c = scanner.nextDouble();
            service.calculate(a,b,c);
        }
    }
}