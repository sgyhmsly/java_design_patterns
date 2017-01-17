package factory_method;

/**
 * Created by DT173 on 2017/1/17.
 */
public abstract class AbstractApplication
{
    public void processDoc()
    {
        AbstractDocument oDoc = createDocument();
        editDoc(oDoc);
        saveDoc(oDoc);
    }

    protected abstract AbstractDocument createDocument();


    private void editDoc(AbstractDocument doc)
    {
        ;
    }

    private void saveDoc(AbstractDocument doc)
    {
        ;
    }
}
