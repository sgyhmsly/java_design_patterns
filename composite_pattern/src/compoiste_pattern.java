/**
 * Created by JJMM on 2017/1/16.
 */
public class compoiste_pattern
{
    public static void main(String args[])
    {
        Composite cs = new Composite();
        cs.addComponent(new LeafA());
        cs.addComponent(new LeafB());
        cs.execute();
    }
}
