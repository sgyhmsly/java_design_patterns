import java.util.Observable;
import java.util.Observer;

/**
 * Created by DT173 on 2016/12/27.
 */
public class MyObserver implements Observer
{
    private float temperature;
    private float humidity;
    Observable observable;

    MyObserver()
    {

    }




    public void setSubject(Observable observable )
    {
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override
    public void update(Observable o, Object arg)
    {
        //Below three lines are unnecessary code. For double checking it's ok
        //if(observable != o)
            //throw new Exception("Observer not expected");
          //  return;
        if(o instanceof Subject)
        {
            Subject tSubject = (Subject)o;
            temperature = tSubject.getTemperature();
            humidity = tSubject.getHumidity();
        }
        display();

    }


    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + " % humidity");
    }
}
