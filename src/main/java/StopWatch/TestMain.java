package StopWatch;

public class TestMain {
    public static void main(String[] args){
        Stopwatch stopwatch = new Stopwatch();
        System.out.println("Start time: " + stopwatch.getStart());
        //find all the prime numbers less than a given number n
        int num = 250;
        for (int i = 2; i <= num; i++){
            boolean count = false;
            for(int j = 2; j < i; j++){
                if( i%j ==0){
                    count = true;
                }
            }
            if(!count){
                System.out.println(i);
            }
        }

        double durationTime = stopwatch.totalDuration();
        System.out.println("Total duration that method took: " + durationTime);
    }
}
