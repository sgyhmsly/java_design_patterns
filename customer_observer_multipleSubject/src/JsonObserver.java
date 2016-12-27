/**
 * Created by DT173 on 2016/12/26.
 */
public class JsonObserver extends Observer
{


    @Override
    public void update(ISubject objSub)
    {
        System.out.println("JsonObserver: "+objSub.toString()+" "+objSub.getState());


    }

}
