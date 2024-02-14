package day7_feb_07;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private String genre;
    private String bookAvailabilityStatus;
    public Book(String title, String author, String isbn, String genre, String bookAvailabilityStatus){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
        this.bookAvailabilityStatus = bookAvailabilityStatus;
    }
    public String display(){
        return "Book Title: "+title + ", author:"+ author + ": "+bookAvailabilityStatus;
    }

    public String bookDetails(){
        return "Book Title: "+title+"\nAuthor: "+author+"\nisbn: "+isbn+"\nGenre: "+genre+"\nAvailability: "+bookAvailabilityStatus;
    }
    @Override
    public String toString() {
        return title + "... status: "+bookAvailabilityStatus;
    }
}
