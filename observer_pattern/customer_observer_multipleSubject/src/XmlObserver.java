/**
 * Created by DT173 on 2016/12/26.
 */
public class XmlObserver extends Observer
{

    @Override
    public void update(ISubject objSub)
    {
        System.out.println("XmlObserver: "+objSub.toString()+" "+objSub.getState());
    }
}
