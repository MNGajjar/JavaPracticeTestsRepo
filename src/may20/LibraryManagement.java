package may20;

public class LibraryManagement {

    String studentName;
    String bookTitle;
    String author;
    static int totalBookIssued = 0;

    public LibraryManagement(String studentName, String bookTitle, String author) {
        this.studentName = studentName;
        this.bookTitle = bookTitle;
        this.author = author;
        totalBookIssued++;
    }

    public void printInfo(){
        System.out.println("StudentName: "+studentName);
        System.out.println("BookTitle is: "+bookTitle);
        System.out.println("Author is: "+author);
    }

    public static void showTotalIssued(){
        System.out.println("Total book issued: "+totalBookIssued);
    }

}
