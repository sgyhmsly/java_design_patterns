package MyObserver;



/**
 * Created by DT173 on 2016/12/27.
 */
public class CustomObservable
{
    public static void main(String args[])
    {
        ChinaAudience chinaObserver = new ChinaAudience();

        TVStation mySubject = new TVStation("TVB");
        mySubject.attach(chinaObserver);
        mySubject.changePrice();
    }
}
