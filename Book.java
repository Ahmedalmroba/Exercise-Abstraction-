
class Book extends Product {
    private String author;

    public Book() {
    }
    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getDiscount() {
        double discount=getPrice()* 0.07;
        return discount;

}}