

/**
 * Created by DT173 on 2016/12/26.
 */

// This is client class. Not a observer!
public class customer_observer
{
    public static void main(final String args[])
    {
        final Subject mySubject = new Subject();
        final BinaryObserver oBObserver = new BinaryObserver();
        final JsonObserver oJObserver = new JsonObserver();
        final XmlObserver oXObserver = new XmlObserver();
        mySubject.attach(oBObserver);
        mySubject.attach(oJObserver);
        mySubject.attach(oXObserver);
        mySubject.setState(4);
        mySubject.detach(oJObserver);
        mySubject.setState(100);

    }
}
