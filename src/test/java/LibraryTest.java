import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;


    public class LibraryTest {

        Library testLibrary;
//        Book book1;


        @Before
        public void setup(){

            testLibrary = new Library(4);
            Book bible = new Book();
            testLibrary.addBook(bible);
            Book koran = new Book();
            testLibrary.addBook(koran);
            Book torah = new Book();
            testLibrary.addBook(torah);
            Book baghavadgita = new Book();
            testLibrary.addBook(baghavadgita);

        }


//        @Test
//        public void countBooksEmpty(){
//
//            assertEquals(0, testLibrary.getBookCount());
//
//        }

        @Test
        public void canAddBook(){
            Book book1 = new Book();
            testLibrary.addBook(book1);
            assertEquals(4, testLibrary.getBookCount());

        }







}
