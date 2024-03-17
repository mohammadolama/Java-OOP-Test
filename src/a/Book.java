package a;

public class Book {
    private String title;
    private int numberOfPages;
    private String author;
    private String content;

    public Book(){
    }

    public Book(String title , int numberOfPages , String content ){
        this(title , numberOfPages , null , content);
    }

    public Book(String title , int numberOfPages , String author , String content){
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void addContent(String newContent){
        this.content = content + newContent;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String print(){
        return "Title is: {" + title + "}, page# is: {" + numberOfPages +"}";
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
