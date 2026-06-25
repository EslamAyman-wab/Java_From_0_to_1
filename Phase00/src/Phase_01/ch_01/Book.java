package Phase_01.ch_01;

public class Book {

    private String title;
    private String author;
    private int publicationYear ;
    

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public  void displayBookInfo(){
        System.out.println("Title: [ " + title + "] , Author: [ " + author + "] , PublicationYear: [" + publicationYear + "]" );
    }
}
