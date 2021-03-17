package model;

public class CarModel {

    private String carProducer;
    private String carModel;
    private int carYear;

    public CarModel(){}

    public CarModel(String carProducer, String carModel, int carYear) {
        this.carProducer = carProducer;
        this.carModel = carModel;
        this.carYear = carYear;
    }

    public String getCarProducer() {
        return carProducer;
    }

    public void setCarProducer(String carProducer) {
        this.carProducer = carProducer;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    private static String setPostFix(){
        int ran = (int) (Math.random()*10);
        String postFix;
        switch (ran) {
            case 0: postFix=". It's a great car!";
                break;
            case 1: postFix=". Bingo! Good choice!";
                break;
            case 2: postFix=". I love it!";
                break;
            case 3: postFix=". The better car!";
                break;
            case 4: postFix=". Good choice!";
                break;
            case 5: postFix=". You are welcome!";
                break;
            case 6: postFix=". You've done it! I knew!";
                break;
            case 7: postFix=". Could be better!";
                break;
            case 8: postFix=". Maybe one more time?";
                break;
            default: postFix=". It's good choice!";
                break;
        }
        return postFix;
    }
    @Override
    public String toString() {
        return "Your car: " +
                "Mark - " + carProducer +
                ", Model - " + carModel +
                ", Year - " + carYear + setPostFix();
    }
}
