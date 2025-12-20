3. Адаптер для датчиков (Sensor Adapter)
────────────────────────────────────────────────────────────────────────────
Ситуация:
• В системе есть интерфейс TempSensor, который возвращает температуру в градусах Цельсия.
• Появились новые датчики, которые выдают температуру только в Фаренгейтах.
• Нужно позволить контейнеру вашего приложения обращаться к этим новым датчикам через привычный интерфейс TempSensor, не ломая существующий код.

Данные классы/интерфейсы, которые считаем «заданными на входе»:
1. Интерфейс TempSensor (старый, ожидающий значение в градусах Цельсия):
   public interface TempSensor {
       double getTemperatureCelsius();
   }

2. Новый класс датчика, который возвращает температуру в Фаренгейтах:
   public class NewFahrenheitSensor {
       public double getTemperatureFahrenheit() {
           // Предположим, как-то считает температуру...
           return 96.8;
       }
   }

Задача:
• Реализовать класс-адаптер TempSensorAdapter, который будет имплементировать TempSensor, но внутри иметь экземпляр NewFahrenheitSensor.
• При вызове getTemperatureCelsius() адаптер должен конвертировать значение из Фаренгейта в Цельсия.

Пример кода адаптера:
public class ...



        double f = ...fahrenheit();
        return (f - 32) * 5.0 / 9.0;
    }
}

Демонстрация (main):
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

        // Допустим, у нас массив/список «общих» датчиков:
        TempSensor[] sensors = {oldSensor, adaptedSensor};

        // Считываем показания:
        for (TempSensor sensor : sensors) {
            System.out.printf("Sensor reading: %.2f °C%n", sensor.getTemperatureCelsius());
        }
    }
