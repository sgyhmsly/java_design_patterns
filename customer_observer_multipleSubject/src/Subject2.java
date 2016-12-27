import java.util.ArrayList;

/**
 * Created by DT173 on 2016/12/26.
 */
public class Subject2 extends ISubject
{
    public Subject2()
    {
        ob = new ArrayList<>();
    }




    public void attach(Observer obj)
    {
        if(obj == null)
            return;

        if(!ob.contains(obj))
        {
            ob.add(obj);
        }
    }
    public void detach(Observer obj)
    {

        if(ob.contains(obj))
        {
            ob.remove(obj);
        }
    }

    public void notifyUpdate()
    {
        for(Observer tob:ob)
        {
            tob.update(this);
        }
    }

    public void setState(int state)
    {
        this.state = state;
        notifyUpdate();
    }

    public int getState()
    {
        return state;
    }

    @Override
    public String toString()
    {
        return "SubjectB";
    }
}
