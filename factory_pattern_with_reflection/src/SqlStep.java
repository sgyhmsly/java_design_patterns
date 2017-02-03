import java.io.File;

/**
 * Created by JJMM on 2017/1/28.
 */
public class SqlStep extends AbstractStep
{
    static
    {
        StepFactory.getInstance().registerProduct("SqlStep",SqlStep.class);
    }
    public SqlStep(String stepType)
    {
        super(stepType);
    }

    @Override
    void execute()
    {
        System.out.println("SqlStep");
    }


}
