import java.awt.print.Book;
import java.util.ArrayList;


public class Library {

//        private String book;
        private ArrayList<Book> collection;
        private int capacity;


        public Library(int capacity){

//            this.book = book;
            this.collection = new ArrayList<>();
            this.capacity = capacity;


        }

        public int getBookCount() {
            return this.collection.size();
        }

        public void addBook(Book new_book){
            if (this.collection.size() < this.capacity) {
                this.collection.add(new_book);
            }


        }


}


