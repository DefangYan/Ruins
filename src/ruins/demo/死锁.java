package ruins.demo;

/**
 * @author defang.yan
 * @date 19-4-25 下午1:47
 */
public class 死锁 {

    private static final String a1 = "test001";

    private static final String a2 = "test002";

    public static void main(String[] args) {

        死锁 sisuo1 = new 死锁();

        死锁 sisuo2 = new 死锁();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (sisuo1){
                    System.out.println(a1);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (sisuo2){
                        System.out.println(a2);
                    }
                }
            }
        }).start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                synchronized (sisuo2){
//                    System.out.println(a2);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    synchronized (sisuo1){
//                        System.out.println(a1);
//                    }
//                }
//            }
//        }).start();
    }
}
