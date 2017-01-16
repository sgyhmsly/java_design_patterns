/**
 * Created by JJMM on 2017/1/16.
 */
public abstract class Leaf implements Component
{
    @Override
    public void addComponent(Component component)
    {
        // throw exeception.
    }

    @Override
    public void remove(Component component)
    {
        // throw exeception.
    }

    @Override
    public abstract void execute();
}
