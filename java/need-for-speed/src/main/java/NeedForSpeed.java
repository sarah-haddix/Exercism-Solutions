class NeedForSpeed {
    private int batteryDrain;
    private int battery;
    private int speed;
    private int distance;

    public NeedForSpeed(int speed, int batteryDrain){
        this.batteryDrain = batteryDrain;
        this.battery = 100;
        this.speed = speed;
        this.distance = 0;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if(!this.batteryDrained()){
        distance += speed;
            }
        battery -= batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;

    public RaceTrack(int distance){
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while(!(car.batteryDrained())){
            car.drive();
            if(car.distanceDriven() >= this.distance)
                return true;
        }
        return false;
    }
}
