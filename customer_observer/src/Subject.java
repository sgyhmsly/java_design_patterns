import java.util.ArrayList;

/**
 * Created by DT173 on 2016/12/26.
 */
public final class Subject
{
    private static Subject instance;
    private Subject()
    {
        ob = new ArrayList<>();
    }

    public static Subject getInstance()
    {
        if(instance == null)
        {
            instance = new Subject();
        }
        return instance;
    }


    public void attach(Observer obj)
    {
        if(obj == null)
            return;

        if(!ob.contains(obj))
        {
            obj.registerSubject(this);
            ob.add(obj);

        }
    }
    public void detach(Observer obj)
    {

        if(ob.contains(obj))
        {
            obj.registerSubject(null);
            ob.remove(obj);
        }
    }

    public void notifyUpdate()
    {
        for(Observer tob:ob)
        {
            tob.update();
        }
    }

    public void setState(int state)
    {
        this.state = state;
        // Any changes, let's nofity all.
        notifyUpdate();
    }
    public int getState()
    {
        return state;
    }
    private int state = 0;
    private ArrayList<Observer> ob;
}
