package BT.ss4;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    StopWatch(LocalTime starTime, LocalTime endTime) {
        this.endTime = endTime;
        this.startTime = starTime;
    }

    private LocalTime getStartTime() {
        return startTime;
    }

    private LocalTime getEndTime() {
        return endTime;
    }

    private void setStartTime() {
        startTime = LocalTime.now();
    }

    public void setEndTime() {
        endTime = LocalTime.now();
    }

    public int getElapsedTime() {
        int milliSecond = (((endTime.getHour() - startTime.getHour()) * 3600) + (endTime.getMinute() * 60 - startTime.getMinute()) * 3600 +
                (endTime.getSecond() - startTime.getSecond()) * 1000);
        return milliSecond;
    }

    public static void main(String[] args) {
        LocalTime starTime = LocalTime.now();
        LocalTime endTime = LocalTime.now();
        StopWatch count = new StopWatch(starTime, endTime);
        System.out.println("Time:"+count.getElapsedTime()+" MilliSecond");
    }
}

