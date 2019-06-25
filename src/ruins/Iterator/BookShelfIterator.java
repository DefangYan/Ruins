package ruins.Iterator;

import java.util.HashMap;

/**
 * @author defang.yan
 * @date 19-5-5 下午3:31
 */
public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;

    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getBookLength()){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Book bookAt = bookShelf.getBookAt(index);
        index++;
        return bookAt;
    }
}
