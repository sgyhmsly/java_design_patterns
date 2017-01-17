package factory_method;

/**
 * Created by DT173 on 2017/1/17.
 */
public class Word_Application extends AbstractApplication
{
    @Override
    protected AbstractDocument createDocument()
    {
        return new WordDocument();
    }
}
