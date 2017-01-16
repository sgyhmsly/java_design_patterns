import java.util.ArrayList;
import java.util.List;

/**
 * Created by JJMM on 2017/1/16.
 */
public class Composite implements Component
{
    private List<Component> components;

    public Composite()
    {
        components = new ArrayList<>();
    }

    @Override
    public void addComponent(Component component)
    {
        components.add(component);
    }

    @Override
    public void remove(Component component)
    {
        components.remove(component);
    }

    @Override
    public void execute()
    {

        for (Component component:components)
            component.execute();
    }
}
