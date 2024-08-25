import java.util.Scanner;

public class BookManagementSystem
{
    public static void main(String[] args) {
//        Scanner Method
        Scanner scanner  = new Scanner(System.in);

//        Creating a Object
        Library library = new Library();
        
        // Adding books to library
        for (int i = 1; i <= library.getBooks().length; i++){
            System.out.println("Enter the bookID for book" + i);
            String bookID = scanner.nextLine();

            System.out.println("Enter the Title for book" + i);
            String title = scanner.nextLine();

            System.out.println("Enter the Author for book" + i);
            String author = scanner.nextLine();

            System.out.println("Enter the ISAvailable for book" + i);
            boolean isAvailable = scanner.nextBoolean();
            scanner.nextLine();

            Book book = new Book(bookID,title,author,isAvailable);

            library.addBook(book);


        }

        System.out.println("Enter the id you want to remove");
        String removeBookId = scanner.nextLine();

        library.removeBook(removeBookId);


        System.out.println("Enter the id you want to search");
        String searchBookId = scanner.nextLine();

        library.searchBook(searchBookId);

        System.out.println("<-------List of all books in library-------->");
        library.displayAllBooks();

    }

}
