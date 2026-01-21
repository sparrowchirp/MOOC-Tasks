public class Timer {
    private ClockHand seconds; 
    private ClockHand hundredthsOfSecond;
    
    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredthsOfSecond = new ClockHand(100);
    }
    
    public void advance () {
        hundredthsOfSecond.advance();
        if (hundredthsOfSecond.value() == 0) {
            seconds.advance();
        }
    }
   
    public String toString() {
        return seconds + ":" + hundredthsOfSecond;
    }
}
