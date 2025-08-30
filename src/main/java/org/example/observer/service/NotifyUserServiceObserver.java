package org.example.observer.service;

import org.example.observer.model.Book;

public interface NotifyUserServiceObserver {

    public void notifyBookStatus(Book book, String status);
}
