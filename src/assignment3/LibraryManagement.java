package assignment3;

import java.util.Scanner;

public class LibraryManagement {

    public static void main(String[] args) {
        String[] bookList = {"God's fav Daughter", "Now you See me", "Indian Girl","Illusion of Palace","Ikigai","2 States"};
        System.out.println("Book List: ");
        for (int i = 0; i< bookList.length;i++){
            System.out.println(bookList[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Search for a Book:");
        String userSearch = scanner.nextLine();
        for (int i = 0;i<bookList.length;i++){
            if (userSearch.equals(bookList[i])){
                System.out.println("Book Available at index of: "+i);
            }else {
                System.out.println("Book Not Available.!");
            }
        }
    }
}
