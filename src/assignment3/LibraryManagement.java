package assignment3;

public class LibraryManagement {

    private static final String[] books = {"2 States","Sita","Atomic Habits", "Ikigai","Palace of illusion","Ramayana"};

    public static int searchBook(String searchBookByName){
        for (int i = 0; i< books.length; i++){
            if(books[i].equalsIgnoreCase(searchBookByName.trim())){
                return i;
            }
        }
        return -1;
    }



}


