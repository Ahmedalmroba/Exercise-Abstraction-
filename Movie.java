public class Movie extends Product{
    private String director;

    public Movie(){

    }

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;

    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    public double getDiscount() {
        double discount=getPrice()* 0.09;
        return discount;
    }


}

