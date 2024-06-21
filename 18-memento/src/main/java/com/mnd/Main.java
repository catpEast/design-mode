package com.mnd;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        ArticleCaretaker articleCaretaker = new ArticleCaretaker();

        ArticleText article1 = new ArticleText("题目1", "hello world", LocalDateTime.now());
        articleCaretaker.setArticleMemento(article1.saveArticleText());
        article1.setTitle("new title1");
        System.out.println(article1.getTitle());
        
        article1.getArticleText(articleCaretaker.getArticleMemento(0));
        System.out.println(article1.getTitle());
    }
}