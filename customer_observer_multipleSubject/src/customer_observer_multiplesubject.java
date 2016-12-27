/**
 * Created by DT173 on 2016/12/26.
 */
public class customer_observer_multiplesubject
{
    public static void main(String args[])
    {
        Subject osub = new Subject();
        Subject2 osub2 = new Subject2();
        BinaryObserver binObserver = new BinaryObserver();
        JsonObserver jsonObserver = new JsonObserver();
        XmlObserver xmlObserver = new XmlObserver();
        osub.attach(binObserver);
        osub.attach(xmlObserver);
        osub2.attach(jsonObserver);
        osub2.attach(xmlObserver);
        osub.setState(10);
        osub2.setState(100);

    }
}
