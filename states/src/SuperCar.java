public abstract class SuperCar implements Car {

    private Person _driver;

    public void getIn(Person person) {

        if (this._driver != null) {
            this._driver = person;
        }
    }

    public void drive(int miles) {
        for (int i = 0; i < miles; i++) {
            useFuel();
        }
    }

    public String getDriversName() {
        if (this._driver != null) {
            return this._driver.getName();
        }

        return "No driver yet";
    }

    public abstract void useFuel();
}
