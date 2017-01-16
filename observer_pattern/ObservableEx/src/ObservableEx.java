/**
 * Created by DT173 on 2016/12/27.
 */
public class ObservableEx
{
    public static void main(String args[])
    {
        Subject oSub = new Subject();
        MyObserver myObs = new MyObserver();
        myObs.setSubject(oSub);
        oSub.setMeasurements(10.0f,20.0f,30.0f);
    }
}
