package HW1;
import java.lang.*;

    public class Book {
        private String author;
        private String title;
        private String genre;
        private int pages;


        public Book (String author, String title, String genre, int pages) {
            this.author = author;
            this.title = title;
            this.genre = genre;
            this.pages = pages;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "author='" + author + '\'' +
                    ", title='" + title + '\'' +
                    ", genre='" + genre + '\'' +
                    ", pages=" + pages +
                    '}';
        }
    }
