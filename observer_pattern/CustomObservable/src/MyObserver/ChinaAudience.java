package MyObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DT173 on 2016/12/27.
 */
public class ChinaAudience implements IObserver
{
    private List<IObservable> subjects;


    public ChinaAudience()
    {
        subjects = new ArrayList<IObservable>();
    }

    @Override
    public void update(IObservable observer, Object message)
    {
        System.out.println(observer.toString()+" "+"price: "+message.toString());
    }

    @Override
    public void registerObserver(IObservable observer)
    {
        if(observer == null)
            throw new IllegalArgumentException();
        subjects.add(observer);
    }
}
