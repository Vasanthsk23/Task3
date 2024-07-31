public class Library {

  private Book [] books;

  public Book [] getBooks(){
      return this.books;
  }

  public void setBooks(Book [] books){
      this.books = books;
  }

    public Library(){
        this.books = new Book[5];
    }

    public void addBook(Book book){

        for (int i = 0; i < books.length; i++){
            if(books[i] == null){
                books[i] = book;
                System.out.println("Book added");
                break;
            }
        }
    }

    public void removeBook(String bookID){

        for(int i = 0; i < books.length; i++){
            if(books[i] != null &&  books[i].getBookID().equals(bookID)){
                books[i] = null;
                System.out.println("Book removed SuccessFully");
            }
        }
    }

    public void searchBook(String bookId){
        boolean found = false;
        for (int i = 0; i < books.length; i++){
            if(books[i] != null && books[i].getBookID().equals(bookId)){
                System.out.println("book found!!!!");
              displayBook(books[i]);
              found = true;
            }
        }
        if (found == false){
            System.out.println("not found");
        }
  }

    public void displayBook(Book book){
        System.out.println("BookID: " + book.getBookID());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("IS Available: " + book.getIsAvailable());
    }

    public void displayAllBooks(){

        for (int i = 0; i < books.length; i++){
            if(books[i] != null){
                displayBook(books[i]);
            }

        }
    }


}
