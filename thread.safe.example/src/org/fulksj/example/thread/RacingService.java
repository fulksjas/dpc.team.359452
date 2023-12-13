package org.fulksj.example.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class RaceTrackingService {
    private Map<String, Long> lapTimes;
    private Lock raceStatusLock;

/**
 * RaceTrackingService class is responsible for tracking lap times and race status.
 */
public class RaceTrackingService {
    private HashMap<String, Integer> lapTimes;
    private ReentrantLock raceStatusLock;

    /**
     * Constructs a new RaceTrackingService object.
     */
    public RaceTrackingService() {
        this.lapTimes = new HashMap<>();
        this.raceStatusLock = new ReentrantLock();
    }
}

    public void reportLapTime(String carName, long lapTime) {
        raceStatusLock.lock();
        try {
            lapTimes.put(carName, lapTime);
            System.out.printf("Car %s completed a lap in %d milliseconds.%n", carName, lapTime);
        } finally {
            raceStatusLock.unlock();
        }
    }

    public void displayRaceResults() {
        raceStatusLock.lock();
        try {
            System.out.println("Race Results:");
            for (Map.Entry<String, Long> entry : lapTimes.entrySet()) {
                String carName = entry.getKey();
                long lapTime = entry.getValue();
                System.out.printf("Car %s: %d milliseconds%n", carName, lapTime);
            }
        } finally {
            raceStatusLock.unlock();
        }
    }
}
