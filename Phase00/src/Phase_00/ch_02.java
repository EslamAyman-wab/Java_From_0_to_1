package Phase_00;

public class ch_02 {
    public static void main(String[] args) {

        String request = "READ";
        String response = switch (request) {
            case "CREATE" -> "Creating a new resource...";
            case "READ" -> "Reading existing resources....";
            case "UPDATE" -> "Updating a resource....";
            case "DELETE" -> "Deleting a resource...";
            case "EXIT" -> "Exiting the command tool. Goodbye!";
            default -> "Unknow command";
        };
        System.out.println("The response is " + response);
    }

}

/*
7. تمرين التحدي
تخيل أنك تقوم بتطوير أداة سطر أوامر بسيطة لخدمة backend.
اكتب برنامج Java يحاكي معالجة أوامر المستخدم المختلفة.
يجب أن يقوم البرنامج بما يلي:

مطالبة المستخدم بإدخال أمر (مثل "CREATE", "READ", "UPDATE", "DELETE", "EXIT").
استخدام جملة switch لمعالجة الأمر:
"CREATE": طباعة "Creating a new resource..."
"READ": طباعة "Reading existing resources..."
"UPDATE": طباعة "Updating a resource..."
"DELETE": طباعة "Deleting a resource..."
"EXIT": طباعة "Exiting the command tool. Goodbye!"
أي إدخال آخر: طباعة "Unknown command. Please try again."
لهذا التمرين، لا تحتاج إلى استخدام حلقة لمواصلة أخذ الأوامر. فقط قم بمعالجة أمر واحد.
*/
