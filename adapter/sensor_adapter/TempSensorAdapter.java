package org.example.patterns.adapter.sensor_adapter;

public class TempSensorAdapter implements TempSensor{
    NewFahrenheitSensor newFahrenheitSensor;

    public TempSensorAdapter(NewFahrenheitSensor newFahrenheitSensor) {
        this.newFahrenheitSensor = newFahrenheitSensor;
    }

    @Override
    public double getTemperatureCelsius() {
        double f = newFahrenheitSensor.getTemperatureFahrenheit();
        return (f - 32) * 5.0 / 9.0;
    }

}

