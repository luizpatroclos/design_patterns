package org.example.observer.service;

import org.example.observer.model.Book;

import java.util.ArrayList;
import java.util.List;

public class Library implements NotifyUserServiceObserver {

    public String name;
    public List<NotifyUserServiceObserver> observers;


    public void removeBook(Book book) {

        //implement method to remove

        //send a notification to the observers
        observers.forEach( o -> {
            o.notifyBookStatus(book, "Book is being removed ");
        });
    }

    public void addBook(Book book) {

        //implement method to add
        //send a notification to the observers
        observers.forEach( o -> {
           o.notifyBookStatus(book, "Book added");
        });

    }

    public List<Book> borrowingBooks(List<Book> books) {

        //verify the list of books if it available

        //get the list of the books which is available

        //foreach on the list of books to notify the users which on was booked and is not available

        return null;
    }

    public Library() {
        observers = new ArrayList<NotifyUserServiceObserver>();
    }

    public void addObserverToLibrary(List<NotifyUserServiceObserver> object){
        this.observers.addAll(object);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public void notifyBookStatus(Book book, String status) {

    }

    /**

    public List<NotifyUserServiceObserver> getObservers() {
        return observers;
    }

    public void setObservers(List<NotifyUserServiceObserver> observers) {
        this.observers = observers;
    }

     **/
}
