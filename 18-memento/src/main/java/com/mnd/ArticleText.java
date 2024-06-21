package com.mnd;

import java.time.LocalDateTime;

public class ArticleText {

    private String title;

    private String content;

    private LocalDateTime createTime;

    public ArticleText(String title, String content, LocalDateTime createTime) {
        this.title = title;
        this.content = content;
        this.createTime = createTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatTime() {
        return createTime;
    }

    public void setCreatTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public ArticleMemento saveArticleText() {
        ArticleMemento articleMemento = new ArticleMemento(this.title, this.content, this.createTime);
        return articleMemento;
    }
    
    public void getArticleText(ArticleMemento articleMemento) {
        this.title = articleMemento.getTitle();
        this.content = articleMemento.getContent();
        this.createTime = articleMemento.getCreateTime();
    }
}
