class Darts {
    double x;
    double y;
    
    Darts(double x, double y) {
        this.x = Math.abs(x);
        this.y = Math.abs(y);
    }

    int score() {
        double distance = Math.sqrt((x*x) + (y*y));
        if(distance>10){
            return 0;
        }
        if(distance>5){
            return 1;
        }
        if(distance>1){
            return 5;
        }
        return 10;
    }
}
