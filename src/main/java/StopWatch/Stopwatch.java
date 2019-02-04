package StopWatch;

public class Stopwatch {

    private long start;

    public long getStart() {
        return start;
    }

    public Stopwatch(){
        start = System.currentTimeMillis();
    }
    
    public double totalDuration(){
        long endTime = System.currentTimeMillis();
        return (endTime-start)/1000.0;
    }
}
