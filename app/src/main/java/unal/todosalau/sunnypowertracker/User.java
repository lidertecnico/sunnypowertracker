package unal.todosalau.sunnypowertracker;

public class User {
    String username;
    private SolarPanelSystem solarPanelSystem;

    public User(String username, SolarPanelSystem solarPanelSystem) {
        this.username = username;
        this.solarPanelSystem = solarPanelSystem;
    }

    public SolarPanelSystem getSolarPanelSystem() {
        return solarPanelSystem;
    }
}
