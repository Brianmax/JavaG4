package ejercicio4;

public class Book extends LibraryItem {
    private String author;

    public Book(String title, int itemId, boolean isLoaned, String author)
    {
        super(title, itemId, isLoaned);
        this.author = author;
    }
}
