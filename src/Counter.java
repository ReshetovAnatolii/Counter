public class Counter implements Runnable{
    Timer timer;

    public Counter(Timer timer) {
        this.timer = timer;
    }

    @Override
    public void run() {
        while (true){
            timer.getTime();
        }
        }
    }

