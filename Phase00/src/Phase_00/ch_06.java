package Phase_00;

import java.util.Scanner;

public class ch_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctPin = 1234;
        int attempts = 0;
        int pin;
        int maxAttempts = 3;
        System.out.print("Enter the PIN =  ");
        do {
            pin = scanner.nextInt();
            if (pin != correctPin) {
                System.out.println("Try again. Enter the PIN = ");
                attempts++;
            }

        } while (pin != correctPin && attempts < maxAttempts);

        if (attempts == 3) {
            System.out.println("Card Blocked!");
        } else {
            System.out.println("Access Granted!");
        }
        scanner.close();

    }
}

/*
7. Challenge Exercise (تمرين التحدي)
محاكاة محاولات تسجيل الدخول (Login Attempts):
اكتب برنامجاً يحاكي نظام حماية لتسجيل الدخول:

حدد رمز PIN سري وثابت داخل الكود (مثلاً: int correctPin = 1234;).
يمنح البرنامج المستخدم 3 محاولات كحد أقصى لإدخال الرمز الصحيح
Back End plan.md
.
استخدم حلقة do-while لطلب الرمز من المستخدم.
يجب أن يتوقف البرنامج في الحالات التالية:
إذا أدخل المستخدم الرمز الصحيح (اطبع له "Access Granted!").
إذا استنفد المستخدم الـ 3 محاولات دون كتابة الرمز الصحيح (اطبع له "Card Blocked!").
تلميح: ستحتاج إلى متغير لحساب عدد المحاولات (مثلاً int attempts = 0;) وزيادته مع كل محاولة.
*/
