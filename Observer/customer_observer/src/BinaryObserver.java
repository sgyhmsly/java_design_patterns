/**
 * Created by DT173 on 2016/12/26.
 */
public class BinaryObserver extends Observer
{



    @Override
    public void update()
    {
        System.out.println("BinaryObserver: "+subject.getState());

    }
}
