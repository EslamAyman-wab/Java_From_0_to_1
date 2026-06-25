package Phase_01.ch_01;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("the end " , "eslam ", 2026);
        book.displayBookInfo();

    }
}

/*أنشئ فئة اسمها Book.
يجب أن تحتوي الفئة على الخصائص التالية (أو الـ fields): title (من نوع String) و author (من نوع String) و publicationYear (من نوع int).
أضف constructor لهذه الفئة يقبل قيمًا لـ title و author و publicationYear ويقوم بتهيئة الخصائص.
أضف method اسمها displayBookInfo() لا تأخذ أي parameters ولا تُرجع أي قيمة (void)، تقوم بطباعة معلومات الكتاب على النحو التالي: "Title: [title], Author: [author], Year: [publicationYear]".
Constraints:

لا تستخدم أي libraries خارجية.
يجب أن تكون جميع الخصائص private.
استخدم this للإشارة إلى خصائص الكائن داخل الـ constructor.
Success Criteria:

يجب أن يتم تجميع الكود بنجاح.
عند إنشاء كائن Book واستدعاء displayBookInfo()، يجب أن تُطبع معلومات الكتاب بالشكل المطلوب.
قم بكتابة الكود.*/
