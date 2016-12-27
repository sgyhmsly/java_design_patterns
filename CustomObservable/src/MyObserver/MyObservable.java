package MyObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Created by DT173 on 2016/12/27.
 */
public class MyObservable implements IObservable
{
    protected List<IObserver> observers;

    MyObservable()
    {
        observers = new ArrayList<>();
    }
    @Override
    public void attach(IObserver observer)
    {
        if(!observers.contains(observer))
        {
            observer.registerObserver(this);
            observers.add(observer);
        }
    }

    @Override
    public void detach(IObserver observer)
    {

        if(observers.contains(observer))
        {
            observer.registerObserver(null);
            observers.remove(observer);
        }
    }

    @Override
    public void detachAll()
    {
        if(observers != null && observers.size()!=0)
        {
            for(IObserver observer:observers)
            {
                observer.registerObserver(null);
                observers.remove(observer);
            }
        }
    }

    @Override
    public void notifyChanges(Object args)
    {
        if(observers != null && observers.size()!=0)
        {
            for(IObserver observer:observers)
            {
                observer.update(this,args);

            }
        }
    }
}
