import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        
        ArrayList<Book> library = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
      
        while (true) {
            
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;           
            }

            System.out.print("Pages: ");
            int numPages = Integer.valueOf(scanner.nextLine());
            
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            System.out.println();
            
            //library.add(new Book(title, numPages, year));
        }
        
       /*  System.out.println();
        System.out.print("What information will be printed? ");
        String answer = scanner.nextLine();
        
        if (answer.matches("everything")) {
            library.forEach((book) -> {
                System.out.println(book);
            }); 
        } else if (answer.matches("name")) {
            library.forEach((book) -> {
                System.out.println(book.getTitle());
            });
        } */

    }
}

