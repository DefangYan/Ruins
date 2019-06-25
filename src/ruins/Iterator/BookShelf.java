package ruins.Iterator;


import java.util.ArrayList;

/**
 * @author defang.yan
 * @date 19-5-5 下午3:16
 */
public class BookShelf implements Aggregate{

    private ArrayList books;

    //private int last = 0;

    public ArrayList getBooks() {
        return books;
    }

    public void setBooks(ArrayList books) {
        this.books = books;
    }

    public BookShelf(int maxsize) {
        this.books = new ArrayList(maxsize);
    }

    public void appendBook(Book book) {
        this.books.add(book);
    }

    public Book getBookAt(int index){
        return (Book)this.books.get(index);
    }

    public int getBookLength(){
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
