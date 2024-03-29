public class Book extends Product {

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    private String author;
    private int pages;

    @Override
    public String toString() {
        return "Code:                " + author+ "\n" +
                "Description:        " + pages;

    }


}