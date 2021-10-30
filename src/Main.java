public class Main {
    public static void main(String[] args) {
        new LivingRoom().pressButton("5", "20");
        new BadRoom().pressButton("1", "25");
    }
}

class TV {
    public void playChannel(String channel) {
        System.out.println("Play channel " + channel);
    }
}

class AirConditioning {
    public void setTemperature(String temperature) {
        System.out.println("Set temperature " + temperature);
    }
}

class Light {
    public void turnOnLight() {
        System.out.println("Turn on light");
    }
}

class RoomFacade {
    TV tv = new TV();
    AirConditioning airConditioning = new AirConditioning();
    Light light = new Light();

    public void pressButton(String channel, String temperature) {
        light.turnOnLight();
        tv.playChannel(channel);
        airConditioning.setTemperature(temperature);
    }
}

class LivingRoom {
    RoomFacade facade = new RoomFacade();

    public void pressButton(String channel, String temperature) {
        facade.pressButton(channel, temperature);
    }
}

class BadRoom {
    RoomFacade facade = new RoomFacade();

    public void pressButton(String channel, String temperature) {
        facade.pressButton(channel, temperature);
    }
}