package a;

import a.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Library library = new Library("A");

        for(int i = 0; i < x ; i++){
            String title = scanner.next();
            int numberOfPages = scanner.nextInt();
            String author = scanner.next();
            String content = scanner.next();

            library.addBook(title , numberOfPages , author , content);

        }

        System.out.println(library);

    }
}
