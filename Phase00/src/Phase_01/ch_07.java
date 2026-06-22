package Phase_01;

public class ch_07 {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            if ((i % 7 == 0) && (i % 13 == 0)) {
                System.out.println("The first number divisible by 7 and 13 is: " + i);

                break;
            }
            System.out.println("Scanning number: " + i);

        }

    }
}

/* 6. Exercise (تمرين للمبتدئين)
اكتب برنامجاً يقوم بالدوران من الرقم 1 إلى 100 باستخدام حلقة while أو for.
استخدم break لإيقاف الحلقة فوراً عند العثور على أول رقم يقبل القسمة على كل من 7 و 13 في نفس الوقت
*/