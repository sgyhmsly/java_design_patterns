import java.util.ArrayList;

/**
 * Created by DT173 on 2016/12/26.
 */
public class Subject extends ISubject
{
    private String identification;
    public Subject(String id)

    {
        identification = id;
        ob = new ArrayList<>();
    }


    @Override
    public String toString()
    {
        return identification;
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

}
