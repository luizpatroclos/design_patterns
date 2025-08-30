package org.example.observer.service;

import org.example.observer.model.Book;

public class ClientB implements NotifyUserServiceObserver{

    @Override
    public void notifyBookStatus(Book book, String status) {

        System.out.println("Notify the ClientB observer -- Book status is " + status);

    }
}
