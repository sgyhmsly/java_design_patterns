package MyObserver;

/**
 * Created by DT173 on 2016/12/27.
 */
public interface IObservable
{
    void attach(IObserver observer) throws NullPointerException;
    void detach(IObserver observer) throws NullPointerException;
    void detachAll();
    void notifyChanges(Object args);

}
