package com.example.ezmilja.libraryapp;

/**
 * Created by emirmun on 13/07/2017.
 */

public class Book {

    private final String isbn;
    private final String bookName;
    private final int imageId;
    private final String author;
    private final String description;
    private final String page;
    private final String publisher;
    private final int rating;

    public Book(final String isbn, final String bookName, final int imageId, final String author, final String description,
                final String page, final String publisher, final int rating){
        this.isbn = isbn;
        this.bookName =bookName;
        this.imageId = imageId;
        this.author = author;
        this.description = description;
        this.page = page;
       this.publisher = publisher;
        this.rating = rating;
    }

    public String getIsbn() {return isbn;}

    public String getBookName(){ return bookName;}

    public String getAuthor(){ return author;}

    public int getImageId(){return  imageId;}

    public String getDescription(){return  description;}

    public String getPage(){return  page;}

    public String getPublisher(){return  publisher;}

    public  int getRating() {return rating;}

    @Override
    public boolean equals(final Object obj) {
        final Book other = (Book) obj;
        return other.bookName.equals(this.bookName);
    }

    @Override
    public int hashCode() {
        int result = isbn != null ? isbn.hashCode() : 0;
        result = 31 * result + (bookName != null ? bookName.hashCode() : 0);
        result = 31 * result + imageId;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (page != null ? page.hashCode() : 0);
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        return result;
    }
}
