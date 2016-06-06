package com.pratiyush.fundamentals.beans;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public NotificationService(){

    }

    public void send(){
        // do something
    }

    public void sendAsync(){
        // do something
    }

    @Override
    public String toString() {
        return "NotificationService{}";
    }
}
