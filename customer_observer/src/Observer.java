/**
 * Created by DT173 on 2016/12/26.
 */
public abstract class Observer {

    protected Subject subject;
    public abstract void update();
    public void registerSubject(Subject subject)
    {
        this.subject = subject;
    }
}
