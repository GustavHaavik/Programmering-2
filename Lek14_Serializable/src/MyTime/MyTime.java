package MyTime;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MyTime implements Serializable {
    private int time = 0;
    private List<String> times = new ArrayList<>();


    public void saveTimes() {
        times.add(this.toString());
    }

    public void increase() {
        time++;
    }

    public void reset() {
        time = 0;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "MyTime.MyTime{" +
                "time=" + time +
                ", times=" + times +
                '}';
    }
}
