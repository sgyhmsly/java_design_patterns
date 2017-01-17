

/**
 * Created by DT173 on 2017/1/17.
 */
import  factory_method.*;
public class factory_method
{
    public static void main(String args[])
    {
        AbstractApplication myApp1 = new Word_Application();
        myApp1.processDoc();

        AbstractApplication myApp2 = new PDF_Application();
        myApp2.processDoc();
    }
}
