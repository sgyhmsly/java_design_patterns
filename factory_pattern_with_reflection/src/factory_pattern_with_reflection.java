/**
 * Created by JJMM on 2017/1/28.
 */
public class factory_pattern_with_reflection
{
    static{
        System.out.println("factory_pattern_with_reflection");
        StepFactory.getInstance().registerProduct("SqlStep",SqlStep.class);
        StepFactory.getInstance().registerProduct("GroovyStep",GroovyStep.class);
    }
    public static void main(String args[])
    {
        //Move the two lines to static part of static part of the class
        //StepFactory.getInstance().registerProduct("GroovyStep",GroovyStep.class);
        //StepFactory.getInstance().registerProduct("SqlStep",SqlStep.class);
        GroovyStep oGroovyStep = (GroovyStep)StepFactory.getInstance().createStep("GroovyStep");
        oGroovyStep.execute();
    }
}
