package assignment3;

import java.util.Scanner;

public class LibraryManagementMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Search for a book: ");
        String search = scanner.nextLine();
        int bookIndex = LibraryManagement.searchBook(search);
        if (bookIndex>=0){
            System.out.println("Book is Available");
        }else {
            System.out.println("Book is not available.!");
        }
    }

}
