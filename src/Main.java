
public class Main {

    public static void main(String[] args) {
      Timer timer = new Timer();
      Thread thread1= new Thread(new Counter(timer));
      Thread thread2= new Thread(new SendMessage(timer));
      thread1.start();
      thread2.start();
    }
}