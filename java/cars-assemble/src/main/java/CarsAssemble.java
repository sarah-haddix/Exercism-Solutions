public class CarsAssemble {
	
    public double productionRatePerHour(int speed) {
        int rate = 221*speed;
        if(speed<5){
            return rate;
        }
        if(speed<9){
            return rate*0.9;
        }
        if(speed==9){
            return rate*0.8;
        }
            return rate*0.77;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed)/60);
    }
}
