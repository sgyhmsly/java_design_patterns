import java.util.ArrayList;

/**
 * Created by DT173 on 2016/12/26.
 */

// This is client class. Not a observer!
public class customer_observer
{
    public static void main(String args[])
    {
        Subject mySubject = Subject.getInstance();
        BinaryObserver oBObserver = new BinaryObserver();
        JsonObserver oJObserver = new JsonObserver();
        XmlObserver oXObserver = new XmlObserver();
        mySubject.attach(oBObserver);
        mySubject.attach(oJObserver);
        mySubject.attach(oXObserver);
        mySubject.setState(4);
        mySubject.detach(oJObserver);
        mySubject.setState(100);

    }
}
