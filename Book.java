public class Book {

    private String bookID;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(){

    }

    public Book(String bookID, String title, String author, boolean isAvailable){
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;

    }

    public String getBookID() {
        return this.bookID;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public boolean getIsAvailable(){
        return this.isAvailable;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public void setBookID(String bookID){
        this.bookID = bookID;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    public static void main(String[] args) {
        System.out.println();

    }
}