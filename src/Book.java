/*
 * This software if free to use
 */

/**
 *
 * @author julles
 */

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int numPages;
    private int year;
    
    public Book(String title, String author, String publisher, int numPages, int year){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.numPages = numPages;
        this.year = year;
    };
    
    public String getTitle(){
        return this.title;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getPublisher(){
        return this.publisher;
    }
    
    public int getNumPages(){
        return this.numPages;
    }
    
    public int getYear(){
        return this.year;
    }
    
    @Override
    public String toString() {
        return this.title + ", " + this.author + " pages, " + this.year;
    }
    
}

