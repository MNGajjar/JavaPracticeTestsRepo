package may20;

public class LibraryManagementMain {
    public static void main(String[] args) {
        LibraryManagement lm = new LibraryManagement("Maitree","Ikigai","Hector Gracia");
        LibraryManagement lm1 = new LibraryManagement("Nisarg","Atomic Habits","James Clear");
        LibraryManagement lm2 = new LibraryManagement("Khushi","Dear God's daughter","Tonya");
        lm.printInfo();
        System.out.println("----------");
        lm1.printInfo();
        System.out.println("----------");
        lm2.printInfo();
        System.out.println("----------");
        LibraryManagement.showTotalIssued();
    }
}
