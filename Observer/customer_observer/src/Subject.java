import java.util.ArrayList;
import java.util.List;

/**
 * Created by DT173 on 2016/12/26.
 */
public final class Subject
{
    private int state;
    private final List<Observer> ob;

    public Subject()
    {
        ob = new ArrayList<>();
    }




    public void attach(final Observer obj)
    {
        if(obj == null)
            return;

        if(!ob.contains(obj))
        {
            obj.registerSubject(this);
            ob.add(obj);

        }
    }
    public void detach(final Observer obj)
    {

        if(ob.contains(obj))
        {
            obj.registerSubject(null);
            ob.remove(obj);
        }
    }

    public void notifyUpdate()
    {
        for(final Observer tob:ob)
        {
            tob.update();
        }
    }

    public void setState(final int state)
    {
        this.state = state;
        // Any changes, let's nofity all.
        notifyUpdate();
    }
    public int getState()
    {
        return state;
    }

}
