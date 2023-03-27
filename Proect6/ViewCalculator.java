
import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            double ax = promptInt("Введите действительную часть комплексного числа А: ");
            double ay = promptInt("Введите коэффициент мнимой части комплексного числа А: ");
            double bx = promptInt("Введите действительную часть комплексного числа B: ");
            double by = promptInt("Введите коэффициент мнимой части комплексного числа B: ");
            Calculable calculator = calculableFactory.create(ax, ay, bx, bx);
            while (true) {
                String cmd = prompt("Введите команду (*, +,-, /, =) : ");
                if (cmd.equals("*")) {
                    calculator.multiplication(ax, ay, bx, by);
                    continue;
                }
                if (cmd.equals("+")) {
                    calculator.sum(ax, ay, bx, by);
                    continue;
                }
                if (cmd.equals("-")) {
                    calculator.difference(ax, ay, bx, by);
                    continue;
                }
                if (cmd.equals("/")) {
                    calculator.division(ax, ay, bx, by);
                    continue;
                }
                if (cmd.equals("=")) {
                    System.out.printf(calculator.getResult());
                    System.out.println();
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}