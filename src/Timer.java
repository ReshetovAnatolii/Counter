public class Timer {

    int seconds = 0;

    public synchronized void getTime() {

            System.out.println(seconds);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            seconds++;

        while (seconds % 5 == 0) {
            try {
                System.out.println(seconds);
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
      notify();

    }

    public synchronized void message() {

            while (seconds % 5 != 0) {
                try {
                   wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            seconds++;
            System.out.println("Прошло 5 секунд");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            notify();

    }
}

