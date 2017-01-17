package MyCollections;

/**
 * Created by DT173 on 2017/1/17.
 */
public interface MyIterator<T>
{
    boolean hasNext();
    T next();
    default void remove() {
        throw new UnsupportedOperationException("remove");
    }

}
