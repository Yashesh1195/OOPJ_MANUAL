class SumWithoutSync extends Thread {
    Integer[] sum;

    SumWithoutSync(Integer[] sum) {
        this.sum = sum;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            sum[0] = sum[0] + 1;
        }
    }
}

class SumWithSync extends Thread {
    Integer[] sum;

    SumWithSync(Integer[] sum) {
        this.sum = sum;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronized (sum) {
                sum[0] = sum[0] + 1;
            }
        }
    }
}

public class Practical_6B_3 {
    public static void main(String[] args) throws InterruptedException {
        // Without synchronization
        Integer[] sum1 = {0};
        Thread[] threads1 = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads1[i] = new SumWithoutSync(sum1);
            threads1[i].start();
        }
        for (int i = 0; i < 10; i++) {
            threads1[i].join();
        }
        System.out.println("Sum without synchronization: " + sum1[0]);

        // With synchronization
        Integer[] sum2 = {0};
        Thread[] threads2 = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads2[i] = new SumWithSync(sum2);
            threads2[i].start();
        }
        for (int i = 0; i < 10; i++) {
            threads2[i].join();
        }
        System.out.println("Sum with synchronization: " + sum2[0]);
    }
}
