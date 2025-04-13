interface Exam {
    boolean Pass(int mark);
}

interface Classify {
    String Division(int average);
}

class Result implements Exam, Classify {

    public boolean Pass(int mark) {
        return mark >= 50;
    }

    public String Division(int average) {
        if (average >= 60) {
            return "First";
        } else if (average >= 50) {
            return "Second";
        } else {
            return "No division";
        }
    }
}

public class Practical_5_3 {
    public static void main(String[] args) {
        Result r = new Result();

        int mark = 60;
        int avg = 70;

        System.out.println("Mark: " + mark);
        System.out.println("Pass: " + r.Pass(mark));
        System.out.println("Average: " + avg);
        System.out.println("Division: " + r.Division(avg));
    }
}
