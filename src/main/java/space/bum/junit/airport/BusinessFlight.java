package space.bum.junit.airport;

public class BusinessFlight extends Flight {

  public BusinessFlight(String id) {
    super(id);
  }

  @Override
  public boolean addPassenger(Passenger passenger) {
    if (passenger.isVip()) {
      return passengers.add(passenger);
    } else {
      return false;
    }
  }

  @Override
  public boolean remvoePassenger(Passenger passenger) {
    return false;
  }

}
