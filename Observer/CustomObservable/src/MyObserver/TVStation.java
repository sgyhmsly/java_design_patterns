package MyObserver;

/**
 * Created by DT173 on 2016/12/27.
 */
public class TVStation extends  MyObservable
{
    private String subName;
    private int price;
    public TVStation(String subName)
    {
        this.subName = subName;
        price = 10;
    }

    public void changePrice()
    {
        price += 10;
        notifyChanges(price);
    }

    @Override
    public String toString()
    {
        return subName;

    }
}
