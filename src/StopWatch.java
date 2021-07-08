import java.util.Scanner;

public class StopWatch {
    private double startTime;
    private double endTime;

    public StopWatch() {
    }

    public StopWatch(double startTime, double endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
//
//    public double getStartTime() {
//        return startTime;
//    }
//
//    public double getEndTime() {
//        return endTime;
//    }

    public double start() {
        return this.startTime = System.currentTimeMillis();
    }

    public double stop() {
        return this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StopWatch st = new StopWatch();
        System.out.println("Bạn muốn xuyên thời gian không?:\n" + "Nếu muốn ấn 1");
        int a = sc.nextInt();
        System.out.println("Thời gian hiện tại là: " + st.start());
        System.out.println("Dừng thời gian lại:\n" + "Nếu muốn ấn 0");
        int b = sc.nextInt();
        System.out.println("Nơi thời gian dừng lại: " + st.stop());
        System.out.println("Chênh lệnh thời gian là: " + st.getElapsedTime());
    }
}