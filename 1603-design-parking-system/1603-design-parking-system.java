class ParkingSystem {

    private ParkingLot bigParkingLot;
    private ParkingLot mediumParingLot;
    private ParkingLot smallParkingLot;

    public ParkingSystem(int big, int medium, int small) {
        this.bigParkingLot = new ParkingLot(big);
        this.mediumParingLot = new ParkingLot(medium);
        this.smallParkingLot = new ParkingLot(small);
    }

    public boolean addCar(int carType) {
        if(carType==1){
            return bigParkingLot.isPossible();
        }
        else if(carType==2){
            return mediumParingLot.isPossible();
        }
        else{
            return smallParkingLot.isPossible();
        }
    }

    public static class ParkingLot{

        private int size;

        public ParkingLot(int size) {
            this.size = size;
        }

        boolean isPossible(){
            if(this.size==0){
                return false;
            }
            this.size--;
            return true;
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */