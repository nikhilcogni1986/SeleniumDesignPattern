package com.udemy.selenumdesign.factory;

public abstract class GooglePage
{
    public abstract void launchSite() throws InterruptedException;
    public abstract void search(String keyword);
    public abstract int getResultsCount();
}