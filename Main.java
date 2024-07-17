public class Main {
    public static void main(String[] args) {
/*
        Book book = new Book("Network", 50, "ahmed");

        System.out.println("Book: " + book.getName());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: " + book.getPrice());
        System.out.println("Discount: " + book.getDiscount());

        System.out.println("....................................................");

        Movie movie = new Movie("Batman", 40, "Matt");

        System.out.println("Movie: " + movie.getName());
        System.out.println("Director: " + movie.getDirector());
        System.out.println("Price:" + movie.getPrice());
        System.out.println("Discount: " + movie.getDiscount());

        System.out.println("....................................................");

        */

           MovablePoint point = new MovablePoint(8, 6, 4, 3);
             point.moveUp();
             point.moveDown();
             point.moveLeft();
             point.moveRight();


          System.out.println("Final position: (" + point.getX() + ", " + point.getY() + ")");

    }}