import java.io.File;

/**
 * Created by JJMM on 2017/1/28.
 */
abstract public class AbstractStep
{
    private String stepType;
    public AbstractStep(String stepType)
    {
        this.stepType = stepType;
    }
    abstract void execute();
}
