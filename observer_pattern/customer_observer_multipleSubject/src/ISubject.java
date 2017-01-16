import java.util.ArrayList;

/**
 * Created by DT173 on 2016/12/26.
 */
public abstract class ISubject
{

    public abstract void attach(Observer obj);
    public  abstract void detach(Observer obj);
    public abstract  void notifyUpdate();
    public abstract void setState(int state);
    public abstract int getState();
    protected int state = 0;
    protected ArrayList<Observer> ob;

}
