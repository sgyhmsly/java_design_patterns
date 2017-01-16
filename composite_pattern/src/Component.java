/**
 * Created by JJMM on 2017/1/16.
 */
public interface Component
{
    void addComponent(Component component);
    void remove(Component component);
    void execute();
}
