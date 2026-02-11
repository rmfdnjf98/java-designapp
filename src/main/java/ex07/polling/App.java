package ex07.polling;

public class App {
    public static void main(String[] args) {
        LotteMart lm = new LotteMart();
        Customer1 cus1 = new Customer1();

        // 1. 마트 입고 준비
        new Thread(() -> {
            // 10초 대기
            for (int i = 1; i < 11; i++) {
                System.out.println("입고중...(" + i + "초)"); // 새로운 스레드에 sleep 걸어주기
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            // 입고 완료
            lm.received();
            System.out.println("입고 완료!!");
        }).start();

        // 2. 손님이 폴링
        new Thread(() -> {
            // 전화를 3초에 한 번씩
            while(true){
                cus1.request(lm);
                System.out.println("[손님]상품 있어??........");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
