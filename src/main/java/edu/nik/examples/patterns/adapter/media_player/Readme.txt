1. Адаптер для медиаплеера
────────────────────────────────────────────────────────────────────────────
Ситуация:
• Дан базовый интерфейс SimpleAudioPlayer, который умеет проигрывать только mp3.  
• У нас есть более продвинутый плеер AdvancedMediaPlayer, который умеет играть mp4 и flv, и мы не хотим/не можем менять его код.  
• Нужно «обернуть» AdvancedMediaPlayer, чтобы он выглядел как SimpleAudioPlayer и умел работать с mp4/flv через единый метод playAudio(String fileName).

Данные классы/интерфейсы, которые считаем «заданными на входе»:
1. Интерфейс SimpleAudioPlayer:  
   public interface SimpleAudioPlayer {
       void playAudio(String fileName);
   }

2. Интерфейс AdvancedMediaPlayer:  
   public interface AdvancedMediaPlayer {
       void playMp4(String fileName);
       void playFlv(String fileName);
   }

3. Реализация AdvancedMediaPlayer, которую менять нельзя (пример):  
   public class AdvancedMediaPlayerImpl implements AdvancedMediaPlayer {
       @Override
       public void playMp4(String fileName) {
           System.out.println("Playing MP4 file: " + fileName);
       }

       @Override
       public void playFlv(String fileName) {
           System.out.println("Playing FLV file: " + fileName);
       }
   }

Задача:  
• Реализовать адаптер MediaAdapter, который имплементирует SimpleAudioPlayer, но внутри будет держать ссылку на AdvancedMediaPlayer.  
• При вызове playAudio(...) определять, какой формат файла (mp3/mp4/flv). Если это mp3, можно просто вывести на консоль «Playing MP3...». Если mp4 или flv — переадресовать в AdvancedMediaPlayer.

Пример кода адаптера:
...

Демонстрация (main):
public class AudioTest {
    public static void main(String[] args) {