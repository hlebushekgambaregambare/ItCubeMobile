package com.example.it_cubick_mao.domain.models;

import java.io.Serializable;

public class DictionaryItem implements Serializable {
    private String subject;
    private String russianWord;
    private String englishWord;
    private String deutschWord;

    public DictionaryItem(String subject, String russianWord, String englishWord, String deutschWord) {
        this.subject = subject;
        this.russianWord = russianWord;
        this.englishWord = englishWord;
        this.deutschWord = deutschWord;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRussianWord() {
        return russianWord;
    }

    public void setRussianWord(String russianWord) {
        this.russianWord = russianWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getDeutschWord() {
        return deutschWord;
    }

    public void setDeutschWord(String deutschWord) {
        this.deutschWord = deutschWord;
    }
}
