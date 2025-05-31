package practiceEx;

public class BookConstructorOverloading {
    String title;
    String author;
    double price;

    public BookConstructorOverloading() {
        title = "Ramayan";
        author = "Valmiki";
        price = 35.75;
    }

    public BookConstructorOverloading(String title, String author) {
        this.title = title;
        this.author = author;
        price = 20.25;
    }

    public BookConstructorOverloading(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void DisplayInfo(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }

    public static void main(String[] args) {
        BookConstructorOverloading book = new BookConstructorOverloading();
        book.DisplayInfo();
        System.out.println("_____________________");
        BookConstructorOverloading book1 = new BookConstructorOverloading("Dear God's daughter","Tonya");
        book1.DisplayInfo();
        System.out.println("_____________________");
        BookConstructorOverloading book2 = new BookConstructorOverloading("Atomic Habits","James",43.21);
        book2.DisplayInfo();
    }
}
