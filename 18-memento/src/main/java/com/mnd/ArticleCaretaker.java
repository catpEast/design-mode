package com.mnd;

import java.util.ArrayList;
import java.util.List;

public class ArticleCaretaker {
    
    private final List<ArticleMemento> list = new ArrayList<>();
    
    public ArticleMemento getArticleMemento(int index) {
        return list.get(index);
    }

    public void setArticleMemento(ArticleMemento articleMemento){
        list.add(articleMemento);
    }
}
