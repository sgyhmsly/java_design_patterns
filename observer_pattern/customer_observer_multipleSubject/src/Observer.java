import java.util.ArrayList;

/**
 * Created by DT173 on 2016/12/26.
 */
public abstract class Observer {

    Observer()
    {

        subjectList = new ArrayList<>();
    }
    protected ArrayList<ISubject> subjectList;
    public abstract void update(ISubject objSub);
    public void registerSubject(ISubject subject)
    {
        if(subjectList ==null || (!subjectList.contains(subject)))
            return;
        subjectList.add(subject);
    }
}
