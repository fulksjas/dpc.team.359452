package org.fulksj.example.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * this service is designed to take input from race cars.  Each race car is a thread unto itself as they go around
 * the track.  It has been designed so that only one car at a time can can update the race status with laps and times.
 * This ensures that one car does not update or override the status at the same time another is making it report
 */

class RacingService {
    private Map<String, Long> lapTimes;
    private Lock raceStatusLock;

    /**
     * RaceTrackingService class is responsible for tracking lap times and race status.
     */
    public static class RaceTrackingService {
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

    /**
    * this provides support for only one car to update the race status at a time
    */
    public void reportLapTime(String carName, long lapTime) {
        // prevent any other car from updating the results
        raceStatusLock.lock();
        try {
            lapTimes.put(carName, lapTime);
            System.out.printf("Car %s completed a lap in %d milliseconds.%n", carName, lapTime);
        } finally {
            raceStatusLock.unlock();
        }
    }

    public void displayRaceResults() {
        // as the racer is over, lock out any other updates
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
