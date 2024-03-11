package ejercicio4;

public class LibraryItem {
    protected String title;
    protected int itemId;
    protected boolean isLoaned;

    public LibraryItem(String title, int itemId, boolean isLoaned) {
        this.title = title;
        this.itemId = itemId;
        this.isLoaned = isLoaned;
    }

    public void showDeatails()
    {
        System.out.println("Title: " + title);
        System.out.println("Item ID: " + itemId);
        System.out.println("Is loaned: " + isLoaned);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public boolean isLoaned() {
        return isLoaned;
    }

    public void setLoaned(boolean loaned) {
        isLoaned = loaned;
    }
}
