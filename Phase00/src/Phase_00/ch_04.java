package Phase_00;

import java.util.Scanner;

public class ch_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int secnum = 7;

        System.out.println("welcometo  Number Guessing Game ");

        System.out.print("Enter the secret number = ");
        while (num != secnum) {
            num = sc.nextInt();

            if (num != secnum) {
                System.out.print("Tray agene = ");
            }
        }

        System.out.println("you have get the secret number = " + secnum);
        sc.close();
    }
}

/*
7. Challenge Exercise (تمرين التحدي)
لعبة تخمين الرقم السري (Number Guessing Game) [3]:
اكتب برنامجاً يقوم بالآتي:

حدد رقماً سرياً ثابتاً في الكود (مثلاً: int secretWord = 7;).
اطلب من المستخدم عبر الـ Scanner أن يقوم بتخمين الرقم.
استخدم حلقة while لتكرار طلب التخمين طالما أن إدخال المستخدم لا يساوي الرقم السري.
بمجرد أن يكتب المستخدم الرقم الصحيح، اخرج من الحلقة واطبع رسالة تهنئة: "تهانينا! لقد خمنت الرقم الصحيح."
*/
