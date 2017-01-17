package factory_method;

/**
 * Created by DT173 on 2017/1/17.
 */
public class PDF_Application extends AbstractApplication
{
    @Override
    protected AbstractDocument createDocument()
    {
        return new PDFDocument();
    }
}
