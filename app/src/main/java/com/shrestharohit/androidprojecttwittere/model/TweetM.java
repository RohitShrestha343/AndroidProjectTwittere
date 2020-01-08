package com.shrestharohit.androidprojecttwittere.model;

public class TweetM {
    String headingtext;
    String messagetext;
    String messageimage;
    String userimage;

    public TweetM(String headingtext, String messagetext, String messageimage, String userimage) {
        this.headingtext = headingtext;
        this.messagetext = messagetext;
        this.messageimage = messageimage;
        this.userimage = userimage;
    }

    public String getHeadingtext() {
        return headingtext;
    }

    public String getMessagetext() {
        return messagetext;
    }

    public String getMessageimage() {
        return messageimage;
    }

    public String getUserimage() {
        return userimage;
    }
}
