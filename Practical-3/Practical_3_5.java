class Time {
    int hours;
    int minutes;

    void setTime(int h, int m) {
        this.hours = h;
        this.minutes = m;
    }

    void display() {
        System.out.println("Time: " + hours + " hours " + minutes + " minutes");
    }

    void sum(Time t1, Time t2) {
        this.minutes = t1.minutes + t2.minutes;
        this.hours = t1.hours + t2.hours + (this.minutes / 60);
        this.minutes = this.minutes % 60;
    }
}

public class Practical_3_5 {
    public static void main(String[] args) {
        Time T1 = new Time();
        Time T2 = new Time();
        Time T3 = new Time();

        T1.setTime(3, 45);
        T1.display();
        T2.setTime(4, 30);
        T2.display();

        T3.sum(T1, T2);

        System.out.print("Sum of T1 & T2: ");
        T3.display();
    }
}
