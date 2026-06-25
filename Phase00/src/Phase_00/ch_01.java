package Phase_00;

public class ch_01 {
    public static void main(String[] args) {

        char letter = 'A';
        String grade = switch (letter) {
            case 'A' -> "Ecellent!";
            case 'B' -> "Very Good!";
            case 'C' -> "Good!";
            case 'D' -> "Pass!";
            case 'F' -> "Fail!";
            default -> "Invalid Grade";
        };
        System.out.println("The grade is " + grade);

    }
}


/*
اكتب برنامج Java يأخذ حرفًا واحدًا يمثل تقديرًا ('A', 'B', 'C', 'D', 'F') كمدخل ويطبع رسالة مقابلة:

'A': "Excellent!"
'B': "Very Good!"
'C': "Good!"
'D': "Pass!"
'F': "Fail!"
أي حرف آخر: "Invalid Grade!"
استخدم جملة switch (وليس if-else if).
 */
