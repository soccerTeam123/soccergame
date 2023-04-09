package practice;

import day08.poly.car.Stinger;

public class Book {

    private String title;
    private String author;

    private  String publisher;

    public Book() {
    }//디폴트 생성자 만드는 이유

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    //책 정보 문자열 생성
    public  String info(){
        //문자열 글자수 얻기 length()
        int length = this.title.length();
        String prettier;
        if(length>8){
            //문자열 slice substring()
            prettier=this.title.substring(0,8)+"...";
        }else {
            prettier = this.title;
        }
        return String.format("제목: %s", this.title);
    }

}
