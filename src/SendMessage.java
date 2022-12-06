public class SendMessage implements Runnable{
    Timer timer;

    SendMessage(Timer timer) {
        this.timer = timer;
    }
    @Override
    public void run() {
        while(true){
                timer.message();
            }
        }
    }

