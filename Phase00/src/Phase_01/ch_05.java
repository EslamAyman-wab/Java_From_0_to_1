package Phase_01;

import java.util.Scanner;

public class ch_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter a positive number");

        System.out.print("Enter the number =  ");
        do {
            num = scanner.nextInt();
            if (num <= 0) {
                System.out.print("Tray agene = ");
            }
        } while (num <= 0);

        System.out.println("Thank you! You entered = " + num);

    }
}
/*
6. Exercise (تمرين للمبتدئين)
اكتب برنامجاً يطلب من المستخدم إدخال رقم موجب (أكبر من 0) باستخدام الـ Scanner و حلقة do-while.

إذا قام المستخدم بإدخال رقم سالب أو صفر، يستمر البرنامج في طلب إدخال رقم موجب.
بمجرد إدخال رقم موجب، يطبع البرنامج: "Thank you! You entered: [الرقم]" وينتهي.
*/