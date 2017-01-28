import java.io.File;

/**
 * Created by JJMM on 2017/1/28.
 */
public class GroovyStep extends AbstractStep
{

    public GroovyStep(String stepType)
    {
        super(stepType);
    }

    @Override
    void execute()
    {
        System.out.println("GroovyStep");
    }


}
