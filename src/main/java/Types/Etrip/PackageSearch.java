/**
 * PackageSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Types.Etrip;

public class PackageSearch  implements java.io.Serializable {
    private java.lang.String currency;

    private boolean isTour;

    private boolean isFlight;

    private boolean isBus;

    private int departure;

    private int destination;

    private java.lang.Integer hotel;

    private java.lang.String hotelSource;

    private java.util.Calendar departureDate;

    private int duration;

    private int minStars;

    private Types.Etrip.Room[] rooms;

    private boolean showBlackedOut;

    public PackageSearch() {
    }

    public PackageSearch(
           java.lang.String currency,
           boolean isTour,
           boolean isFlight,
           boolean isBus,
           int departure,
           int destination,
           java.lang.Integer hotel,
           java.lang.String hotelSource,
           java.util.Calendar departureDate,
           int duration,
           int minStars,
           Types.Etrip.Room[] rooms,
           boolean showBlackedOut) {
           this.currency = currency;
           this.isTour = isTour;
           this.isFlight = isFlight;
           this.isBus = isBus;
           this.departure = departure;
           this.destination = destination;
           this.hotel = hotel;
           this.hotelSource = hotelSource;
           this.departureDate = departureDate;
           this.duration = duration;
           this.minStars = minStars;
           this.rooms = rooms;
           this.showBlackedOut = showBlackedOut;
    }


    /**
     * Gets the currency value for this PackageSearch.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this PackageSearch.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the isTour value for this PackageSearch.
     * 
     * @return isTour
     */
    public boolean isIsTour() {
        return isTour;
    }


    /**
     * Sets the isTour value for this PackageSearch.
     * 
     * @param isTour
     */
    public void setIsTour(boolean isTour) {
        this.isTour = isTour;
    }


    /**
     * Gets the isFlight value for this PackageSearch.
     * 
     * @return isFlight
     */
    public boolean isIsFlight() {
        return isFlight;
    }


    /**
     * Sets the isFlight value for this PackageSearch.
     * 
     * @param isFlight
     */
    public void setIsFlight(boolean isFlight) {
        this.isFlight = isFlight;
    }


    /**
     * Gets the isBus value for this PackageSearch.
     * 
     * @return isBus
     */
    public boolean isIsBus() {
        return isBus;
    }


    /**
     * Sets the isBus value for this PackageSearch.
     * 
     * @param isBus
     */
    public void setIsBus(boolean isBus) {
        this.isBus = isBus;
    }


    /**
     * Gets the departure value for this PackageSearch.
     * 
     * @return departure
     */
    public int getDeparture() {
        return departure;
    }


    /**
     * Sets the departure value for this PackageSearch.
     * 
     * @param departure
     */
    public void setDeparture(int departure) {
        this.departure = departure;
    }


    /**
     * Gets the destination value for this PackageSearch.
     * 
     * @return destination
     */
    public int getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this PackageSearch.
     * 
     * @param destination
     */
    public void setDestination(int destination) {
        this.destination = destination;
    }


    /**
     * Gets the hotel value for this PackageSearch.
     * 
     * @return hotel
     */
    public java.lang.Integer getHotel() {
        return hotel;
    }


    /**
     * Sets the hotel value for this PackageSearch.
     * 
     * @param hotel
     */
    public void setHotel(java.lang.Integer hotel) {
        this.hotel = hotel;
    }


    /**
     * Gets the hotelSource value for this PackageSearch.
     * 
     * @return hotelSource
     */
    public java.lang.String getHotelSource() {
        return hotelSource;
    }


    /**
     * Sets the hotelSource value for this PackageSearch.
     * 
     * @param hotelSource
     */
    public void setHotelSource(java.lang.String hotelSource) {
        this.hotelSource = hotelSource;
    }


    /**
     * Gets the departureDate value for this PackageSearch.
     * 
     * @return departureDate
     */
    public java.util.Calendar getDepartureDate() {
        return departureDate;
    }


    /**
     * Sets the departureDate value for this PackageSearch.
     * 
     * @param departureDate
     */
    public void setDepartureDate(java.util.Calendar departureDate) {
        this.departureDate = departureDate;
    }


    /**
     * Gets the duration value for this PackageSearch.
     * 
     * @return duration
     */
    public int getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this PackageSearch.
     * 
     * @param duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }


    /**
     * Gets the minStars value for this PackageSearch.
     * 
     * @return minStars
     */
    public int getMinStars() {
        return minStars;
    }


    /**
     * Sets the minStars value for this PackageSearch.
     * 
     * @param minStars
     */
    public void setMinStars(int minStars) {
        this.minStars = minStars;
    }


    /**
     * Gets the rooms value for this PackageSearch.
     * 
     * @return rooms
     */
    public Types.Etrip.Room[] getRooms() {
        return rooms;
    }


    /**
     * Sets the rooms value for this PackageSearch.
     * 
     * @param rooms
     */
    public void setRooms(Types.Etrip.Room[] rooms) {
        this.rooms = rooms;
    }


    /**
     * Gets the showBlackedOut value for this PackageSearch.
     * 
     * @return showBlackedOut
     */
    public boolean isShowBlackedOut() {
        return showBlackedOut;
    }


    /**
     * Sets the showBlackedOut value for this PackageSearch.
     * 
     * @param showBlackedOut
     */
    public void setShowBlackedOut(boolean showBlackedOut) {
        this.showBlackedOut = showBlackedOut;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackageSearch)) return false;
        PackageSearch other = (PackageSearch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            this.isTour == other.isIsTour() &&
            this.isFlight == other.isIsFlight() &&
            this.isBus == other.isIsBus() &&
            this.departure == other.getDeparture() &&
            this.destination == other.getDestination() &&
            ((this.hotel==null && other.getHotel()==null) || 
             (this.hotel!=null &&
              this.hotel.equals(other.getHotel()))) &&
            ((this.hotelSource==null && other.getHotelSource()==null) || 
             (this.hotelSource!=null &&
              this.hotelSource.equals(other.getHotelSource()))) &&
            ((this.departureDate==null && other.getDepartureDate()==null) || 
             (this.departureDate!=null &&
              this.departureDate.equals(other.getDepartureDate()))) &&
            this.duration == other.getDuration() &&
            this.minStars == other.getMinStars() &&
            ((this.rooms==null && other.getRooms()==null) || 
             (this.rooms!=null &&
              java.util.Arrays.equals(this.rooms, other.getRooms()))) &&
            this.showBlackedOut == other.isShowBlackedOut();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        _hashCode += (isIsTour() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsFlight() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsBus() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getDeparture();
        _hashCode += getDestination();
        if (getHotel() != null) {
            _hashCode += getHotel().hashCode();
        }
        if (getHotelSource() != null) {
            _hashCode += getHotelSource().hashCode();
        }
        if (getDepartureDate() != null) {
            _hashCode += getDepartureDate().hashCode();
        }
        _hashCode += getDuration();
        _hashCode += getMinStars();
        if (getRooms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRooms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRooms(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isShowBlackedOut() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PackageSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "PackageSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTour");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsTour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFlight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsFlight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsBus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Departure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Hotel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotelSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HotelSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DepartureDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minStars");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MinStars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rooms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Rooms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "Room"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showBlackedOut");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ShowBlackedOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
