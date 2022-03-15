package com.example.memvoca;

public class CardListItem {

    public Integer number;
    public String word;
    public String mean;

    public CardListItem(Integer number, String word, String mean) {
        this.number = number;
        this.word = word;
        this.mean = mean;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }
}