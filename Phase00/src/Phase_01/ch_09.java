package Phase_01;

public class ch_09 {
    public static void main(String[] args) {

    }

    public static void logMessage(String message) {
        System.out.println(message + ":[INFO]");
    }
    public static void logMessage(String message, int errorCode) {
        System.out.println(message + ":[INFO]" + errorCode);
    }


}
/*6. التمارين البرمجية (Exercises)
الآن حان دورك للتطبيق العملي لتثبيت المعلومة! جرب حل هذه التمارين واكتب الكود الخاص بها:

التمرين الأول (مبتدئ - Easy)
الموضوع: طباعة الرسائل (Multi-Logger).
المطلوب: اكتب كلاس يحتوي على دالة باسم logMessage مكررة مرتين:
الأولى: تستقبل نصاً واحداً (String message) وتطبعه على الشاشة مسبوقاً بكلمة [INFO]: .
الثانية: تستقبل نصاً ورقم خطأ (String message, int errorCode) وتطبعهما بصيغة: [ERROR "errorCode"]: message.
الهدف: تجربة تغيير عدد ونوع المعاملات. */
