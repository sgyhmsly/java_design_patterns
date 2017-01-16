import java.util.Observable;

/**
 * Created by DT173 on 2016/12/27.
 */

public class Subject extends Observable
{
    private float temperature;
    private float humidity;
    private float pressure;
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    public float getTemperature() {
        return temperature;
    }
    public float getHumidity() {
        return humidity;
    }
    public float getPressure() {
        return pressure;
    }


    public void measurementsChanged() {
        setChanged();
        notifyObservers();
        //clearChanged();
    }
}
