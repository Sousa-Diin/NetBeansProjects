package bookstore;
public class Book implements Publishing {
    
    private String title;
    private String author;
    private int fullPage;
    private int currentPage;
    private boolean open;
    private Person reader; //Aggregation

    
    // Constructor method

    public Book(String title, String author, int fullPage, Person reader) {
        this.title = title;
        this.author = author;
        this.fullPage = fullPage;
        currentPage = 0;
        open = false;
        this.reader = reader;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getFullPage() {
        return fullPage;
    }

    public void setFullPage(int fullPage) {
        this.fullPage = fullPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Person getReader() {
        return reader;
    }

    public void setReader(Person reader) {
        this.reader = reader;
    }
    
    //Return to String
   
    public String details() {
        return "Book{" + "title=" + title + "\n, author="
                + author + "\n, fullPage=" + fullPage +
                "\n, currentPage=" + currentPage + "\n, open=" 
                + open + "\n, reader=" + reader.getName() + '}';
        
    }
    
    // Special method
    @Override
    public void open() {
        open = true;
    }

    @Override
    public void close() {
       open = false;
    }

    @Override
    public void leafThrough(int page) {
        if(page > fullPage)
            currentPage = 0;
        else
            currentPage = page;
    }

    @Override
    public void pageForward() {
        if (currentPage < fullPage)
            currentPage++;
        else
            close();
    }

    @Override
    public void backPage() {
        currentPage--;
    }
    
    
}
