package a;

import java.util.ArrayList;

public class Library {

    private String address;

    private ArrayList books;

    public Library(String address) {
        this(address , new ArrayList());
    }

    public Library(String address, ArrayList books) {
        this.address = address;
        this.books = books;
        this.books.add(756);
    }

    public void addBook(Book b){
        this.books.add(b);
    }

    public void addBook(String title , int numberOfPages , String author,String content){
        Book book = new Book(title , numberOfPages ,author, content);
        this.addBook(book);
    }

//    @Override
//    public String toString() {
//
//        String result = "{" + "address='" + address + '\'';
//
//        for (int i = 0; i < books.size(); i++) {
//            result = result +"\n";
//            result = result + books.get(i).toString();
//        }
//        return result;
//    }


    @Override
    public String toString() {
        return "Library{" +
                "address='" + address + '\'' +
                ", books=" + books +
                '}';
    }
}
