
public class Launcher {
    public static void main(String[] args) {
        BookSearch bs = new BookSearch.BookSearchBuilder("software engineering").author("HIIII").publicationYear(2017).build();


        System.out.println(bs.getKeyword() + " " + bs.getAuthor() + " " + bs.getPublicationYear());

    }
}
