import java.util.List;

public class Intersection {
    private String id;
    private List<TrafficLight> trafficLights;

    public Intersection(String id, List<TrafficLight> lights) {
        this.id = id;
        this.trafficLights = lights;
    }

    public void updateLights() {
        for (TrafficLight light : trafficLights) {
            light.updateState();
        }
    }

    public List<TrafficLight> getTrafficLights() {
        return trafficLights;
    }

    public String getId() {
        return id;
    }
}
