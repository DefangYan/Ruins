package ruins.demo;

/**
 * @author defang.yan
 * @date 19-4-28 下午1:59
 */
public class CASDemo {

    public static int count = 0;

    public static void main(String[] args) {
        for (int i=0; i<2; i++){
            new Thread(
                    new Runnable() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(10);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            for (int j=0; j<100; j++){
                                count++;
                            }
                        }
                    }
            ).start();
        }
    }
}
