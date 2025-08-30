package org.example.observer;

import org.example.observer.model.Book;
import org.example.observer.service.*;

import java.util.ArrayList;
import java.util.List;

public class MainObserver {

    public static void main(String[] args) {

        Book myBook = new Book("Raul Bael", "Luiz");

        Library library = new Library();

        List<NotifyUserServiceObserver> observers = new ArrayList<>();
        observers.add(new ClientA());
        observers.add(new ClientB());
        observers.add(new ClientC());

        library.addObserverToLibrary(observers);

        library.addBook(myBook);

        library.removeBook(myBook);

        //Second block

        process(10);         // Integer: 20
        process("hello");    // String: HELLO
        process(5.5);        // Double: 16.0
        process(null);       // Null value provided!




    }

    public strictfp class MYclass{

    }

    static void process(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("Integer: " + (i * 2));
            case String s -> System.out.println("String: " + s.toUpperCase());
            case Double d -> System.out.println("Double: " + (d + 10.5));
            case null -> System.out.println("Null value provided!");
            default -> System.out.println("Unknown type!");
        }
}

}
