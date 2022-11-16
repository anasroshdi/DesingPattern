package Observer;

public class User implements Observer{

    private String location;

    @Override
    public void update(String location) {
        this.location = location;
        showLocation();
    }

    private void showLocation() {
        System.out.println("Current Location is"+ location);
    }
}
