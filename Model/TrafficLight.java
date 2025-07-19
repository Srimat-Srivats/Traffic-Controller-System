package model;

public class TrafficLight {
    public enum State { RED, GREEN, YELLOW }

    private State currentState;
    private int timer;

    public TrafficLight() {
        this.currentState = State.RED;
        this.timer = 0;
    }

    public void updateState() {
        switch (currentState) {
            case RED: currentState = State.GREEN; break;
            case GREEN: currentState = State.YELLOW; break;
            case YELLOW: currentState = State.RED; break;
        }
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setTimer(int seconds) {
        this.timer = seconds;
    }

    public int getTimer() {
        return timer;
    }
}
