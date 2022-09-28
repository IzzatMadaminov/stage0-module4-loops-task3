package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        for (t = Math.abs(t); t > 9; t /=10) {
            sum += t % 10;
        }
        sum += t;
        System.out.println(sum);
    }
}
