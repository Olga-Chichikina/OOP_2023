package Proect7;
import java.util.Scanner;

import javax.swing.ListModel;

public class ViewModel {
    
    public void run() {
        while (true) {
            MobilPhone mobilPhone = new MobilPhone("Мобильный", 23658999);       
            HomePhone homePhone = new HomePhone("стационарный", 235698);
            String cmd = "";
            while (true) {
                cmd = prompt("Введите команду (1-добавить,2-позвонить, 3 - отправить SMS, 4-выход ) : ");
                if (cmd.equals("1")) {
                    String nameF = prompt("Введите название телефона: ");
                    int in = promptInt("Введите номер телефона: ");
                   mobilPhone.add(nameF, in);
                   System.out.println("Телефон добавлен в список mobilPhone");
                    continue;
                    }
            
                if (cmd.equals("2")) {
                    mobilPhone.Call();
                    homePhone.Call();
                    continue;
                }
                if (cmd.equals("3")) {
                    mobilPhone.SendSMS();;
                    homePhone.SendSMS();
                    continue;
                }
                if (cmd.equals("4")) {
                    break;
                } 
            }
                
            cmd = prompt("Продолжить/Выход (Y/N)?");
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


