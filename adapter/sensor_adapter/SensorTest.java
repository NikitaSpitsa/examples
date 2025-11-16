package org.example.patterns.adapter.sensor_adapter;

public class SensorTest {

    public static void main(String[] args) {
        // У нас уже может быть существующий датчик, который возвращает сразу в Цельсиях:
        TempSensor oldSensor = new TempSensor() {
            @Override
            public double getTemperatureCelsius() {
                return 25.0;
            }
        };

        // Новый датчик (только по Фаренгейту):
        NewFahrenheitSensor newFahrenheitSensor = new NewFahrenheitSensor();

        // Оборачиваем новый датчик в адаптер:
        TempSensorAdapter adaptedSensor = new TempSensorAdapter(newFahrenheitSensor);

        // Допустим, у нас массив/список «общих» датчиков:
        TempSensor[] sensors = {oldSensor, adaptedSensor};

        System.out.println("\n\n  Sensor Adapter \n\n");

        // Считываем показания:
        for (TempSensor sensor : sensors) {
            System.out.printf("Sensor reading: %.2f °C%n", sensor.getTemperatureCelsius());
        }
        System.out.println("\n\n  Sensor Adapter finished \n\n");
    }
}
