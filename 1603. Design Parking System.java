class ParkingSystem {

    int big, medium, small;
    public ParkingSystem(int big, int medium, int small) {
        this.big = big; //大車的停車位有幾個
        this.medium = medium; //中車的停車位有幾個
        this.small = small; //小車的停車位有幾個
        
    }
    
    public boolean addCar(int carType) {
        //check car type
        if(carType == 1 && big == 0 || carType == 2 && medium == 0 || carType == 3 && small == 0){
            //大車但沒有大車停車位
            return false;
        };
        if (carType == 1) big--; //大車停車位少一格
        if (carType == 2) medium--; //大車停車位少一格
        if (carType == 3) small--; //大車停車位少一格
        
        
        return true;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
