/**
 * Created by JJMM on 2017/1/28.
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
public class StepFactory
{

    private static StepFactory ourInstance = new StepFactory();

    public static StepFactory getInstance()
    {
        return ourInstance;
    }

    private StepFactory()
    {
    }

    private HashMap m_Step = new HashMap();
    public void registerProduct (String stepID, Class stepClass)
    {
        m_Step.put(stepID,stepClass);
    }

    AbstractStep createStep(String stepID)
    {
        Class productClass = (Class)m_Step.get(stepID);
        Constructor productConstructor = null;
        try
        {
            productConstructor = productClass.getDeclaredConstructor(new Class[] { String.class });
            try
            {
                return (AbstractStep) productConstructor.newInstance(stepID);
            } catch (InstantiationException e)
            {
                e.printStackTrace();
            } catch (IllegalAccessException e)
            {
                e.printStackTrace();
            } catch (InvocationTargetException e)
            {
                e.printStackTrace();
            }

        } catch (NoSuchMethodException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
