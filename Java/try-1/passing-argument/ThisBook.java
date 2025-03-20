public class ThisBook {
    String title;
    String author;
    public ThisBook(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void printDetails() {
        System.out.println("title: " + this.title + " " + "author: " + this.author);
    }
    public static void main(String[] args) {
        ThisBook book = new ThisBook("Muna Madan", "Laxmi Prasad Devkota");
        book.printDetails();
    }
}
