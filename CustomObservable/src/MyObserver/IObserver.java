package MyObserver;



/**
 * Created by DT173 on 2016/12/27.
 */
public interface IObserver
{
    void update(IObservable observer, Object message);
    void registerObserver(IObservable observer);
}


