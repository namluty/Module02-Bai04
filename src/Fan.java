public class Fan {
    // Khai báo hằng (thuộc tính của Fan)
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;
// Tốc độ quạt
    private int speed = SLOW;
    private boolean on;
    private double radius = 5;
    private String color = "Blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public static boolean getOn() {
        return false;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void Fan() {
    }

    public String toString() {
        if (on) {
            return " Speed : " + speed + ", Color : " + color + ", Radius : " + radius + ", Fan is ON ";
        } else return " Speed : " + speed + ", Color : " + color + ", Radius : " + radius + ", Fan is OFF ";
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setColor("Yellow");
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan1.setSpeed(fan1.MEDIUM);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}