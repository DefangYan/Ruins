package ruins.Iterator;

import java.util.HashMap;

/**
 * @author defang.yan
 * @date 19-5-5 下午3:36
 */
public class Library {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Baby Plan B"));
        bookShelf.appendBook(new Book("meiziziBook"));
        bookShelf.appendBook(new Book("TomAndJerry"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("TiAng"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            Book nextBook = (Book) iterator.next();
            System.out.println(nextBook.getBookName());
        }
    }
}
