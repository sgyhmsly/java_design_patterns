/**
 * Created by DT173 on 2016/12/26.
 */
public class BinaryObserver extends Observer
{





    @Override
    public void update(ISubject objSub)
    {
        System.out.println("BinaryObserver: "+objSub.toString()+" "+objSub.getState());

    }
}
