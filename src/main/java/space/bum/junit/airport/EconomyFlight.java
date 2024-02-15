package space.bum.junit.airport;

public class EconomyFlight extends Flight {

  public EconomyFlight(String id) {
    super(id);
  }

  @Override
  public boolean addPassenger(Passenger passenger) {
    return passengers.add(passenger);
  }

  @Override
  public boolean remvoePassenger(Passenger passenger) {
    if (passenger.isVip()) {
      return false;
    } else {
      return passengers.remove(passenger);
    }
  }

}
