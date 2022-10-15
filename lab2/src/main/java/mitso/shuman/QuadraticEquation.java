package mitso.shuman;

import org.springframework.stereotype.Component;

@Component
public class QuadraticEquation {
    public void calculate(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (d > 0) {
            System.out.println("x1 = " + ((-b - Math.sqrt(d)) / (2 * a)) + ", x2 = " + ((-b + Math.sqrt(d)) / (2 * a)));
        } else if (d == 0) {
            System.out.println("D = 0 then x = " + (-b / (2 * a)));
        } else {
            System.out.println("The equation has no solution.");
        }
        System.out.println();
    }
}
