/**
 * EtripWS_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package EtripWS_pkg;

public interface EtripWS_PortType extends java.rmi.Remote {
    public Types.Etrip.Result[] packageSearch(Types.Etrip.PackageSearch packageSearchRequest) throws java.rmi.RemoteException;
    public Types.Etrip.Result[] hotelSearch(Types.Etrip.HotelSearch hotelSearchRequest) throws java.rmi.RemoteException;
    public Types.Etrip.Result[] flightSearch(Types.Etrip.FlightSearch flightSearchRequest) throws java.rmi.RemoteException;
    public Types.Etrip.Result[] allHotelsSearch(Types.Etrip.AllHotelsSearch allHotelsSearchRequest) throws java.rmi.RemoteException;
    public Types.Etrip.Hotel[] getHotels() throws java.rmi.RemoteException;
    public Types.Etrip.Geography getGeography() throws java.rmi.RemoteException;
    public Types.Etrip.PackageInfo[] getPackages() throws java.rmi.RemoteException;
    public Types.Etrip.Booking book(Types.Etrip.BookRequest bookRequest) throws java.rmi.RemoteException;
    public Types.Etrip.Booking getBooking(int bookingRef) throws java.rmi.RemoteException;
    public Types.Etrip.Booking confirmBooking(int bookingRef) throws java.rmi.RemoteException;
    public Types.Etrip.Destination[] getDestinations() throws java.rmi.RemoteException;
    public Types.Etrip.Result selectResult(int resultIndex) throws java.rmi.RemoteException;
}
