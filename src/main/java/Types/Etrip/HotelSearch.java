/**
 * HotelSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Types.Etrip;

public class HotelSearch  implements java.io.Serializable {
    private java.lang.String currency;

    private int destination;

    private java.lang.Integer hotel;

    private java.util.Calendar checkIn;

    private int stay;

    private int minStars;

    private Types.Etrip.Room[] rooms;

    private java.util.Calendar pricesAsOf;

    private boolean forPackage;

    private boolean showBlackedOut;

    public HotelSearch() {
    }

    public HotelSearch(
           java.lang.String currency,
           int destination,
           java.lang.Integer hotel,
           java.util.Calendar checkIn,
           int stay,
           int minStars,
           Types.Etrip.Room[] rooms,
           java.util.Calendar pricesAsOf,
           boolean forPackage,
           boolean showBlackedOut) {
           this.currency = currency;
           this.destination = destination;
           this.hotel = hotel;
           this.checkIn = checkIn;
           this.stay = stay;
           this.minStars = minStars;
           this.rooms = rooms;
           this.pricesAsOf = pricesAsOf;
           this.forPackage = forPackage;
           this.showBlackedOut = showBlackedOut;
    }


    /**
     * Gets the currency value for this HotelSearch.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this HotelSearch.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the destination value for this HotelSearch.
     * 
     * @return destination
     */
    public int getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this HotelSearch.
     * 
     * @param destination
     */
    public void setDestination(int destination) {
        this.destination = destination;
    }


    /**
     * Gets the hotel value for this HotelSearch.
     * 
     * @return hotel
     */
    public java.lang.Integer getHotel() {
        return hotel;
    }


    /**
     * Sets the hotel value for this HotelSearch.
     * 
     * @param hotel
     */
    public void setHotel(java.lang.Integer hotel) {
        this.hotel = hotel;
    }


    /**
     * Gets the checkIn value for this HotelSearch.
     * 
     * @return checkIn
     */
    public java.util.Calendar getCheckIn() {
        return checkIn;
    }


    /**
     * Sets the checkIn value for this HotelSearch.
     * 
     * @param checkIn
     */
    public void setCheckIn(java.util.Calendar checkIn) {
        this.checkIn = checkIn;
    }


    /**
     * Gets the stay value for this HotelSearch.
     * 
     * @return stay
     */
    public int getStay() {
        return stay;
    }


    /**
     * Sets the stay value for this HotelSearch.
     * 
     * @param stay
     */
    public void setStay(int stay) {
        this.stay = stay;
    }


    /**
     * Gets the minStars value for this HotelSearch.
     * 
     * @return minStars
     */
    public int getMinStars() {
        return minStars;
    }


    /**
     * Sets the minStars value for this HotelSearch.
     * 
     * @param minStars
     */
    public void setMinStars(int minStars) {
        this.minStars = minStars;
    }


    /**
     * Gets the rooms value for this HotelSearch.
     * 
     * @return rooms
     */
    public Types.Etrip.Room[] getRooms() {
        return rooms;
    }


    /**
     * Sets the rooms value for this HotelSearch.
     * 
     * @param rooms
     */
    public void setRooms(Types.Etrip.Room[] rooms) {
        this.rooms = rooms;
    }


    /**
     * Gets the pricesAsOf value for this HotelSearch.
     * 
     * @return pricesAsOf
     */
    public java.util.Calendar getPricesAsOf() {
        return pricesAsOf;
    }


    /**
     * Sets the pricesAsOf value for this HotelSearch.
     * 
     * @param pricesAsOf
     */
    public void setPricesAsOf(java.util.Calendar pricesAsOf) {
        this.pricesAsOf = pricesAsOf;
    }


    /**
     * Gets the forPackage value for this HotelSearch.
     * 
     * @return forPackage
     */
    public boolean isForPackage() {
        return forPackage;
    }


    /**
     * Sets the forPackage value for this HotelSearch.
     * 
     * @param forPackage
     */
    public void setForPackage(boolean forPackage) {
        this.forPackage = forPackage;
    }


    /**
     * Gets the showBlackedOut value for this HotelSearch.
     * 
     * @return showBlackedOut
     */
    public boolean isShowBlackedOut() {
        return showBlackedOut;
    }


    /**
     * Sets the showBlackedOut value for this HotelSearch.
     * 
     * @param showBlackedOut
     */
    public void setShowBlackedOut(boolean showBlackedOut) {
        this.showBlackedOut = showBlackedOut;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HotelSearch)) return false;
        HotelSearch other = (HotelSearch) obj;
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
            this.destination == other.getDestination() &&
            ((this.hotel==null && other.getHotel()==null) || 
             (this.hotel!=null &&
              this.hotel.equals(other.getHotel()))) &&
            ((this.checkIn==null && other.getCheckIn()==null) || 
             (this.checkIn!=null &&
              this.checkIn.equals(other.getCheckIn()))) &&
            this.stay == other.getStay() &&
            this.minStars == other.getMinStars() &&
            ((this.rooms==null && other.getRooms()==null) || 
             (this.rooms!=null &&
              java.util.Arrays.equals(this.rooms, other.getRooms()))) &&
            ((this.pricesAsOf==null && other.getPricesAsOf()==null) || 
             (this.pricesAsOf!=null &&
              this.pricesAsOf.equals(other.getPricesAsOf()))) &&
            this.forPackage == other.isForPackage() &&
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
        _hashCode += getDestination();
        if (getHotel() != null) {
            _hashCode += getHotel().hashCode();
        }
        if (getCheckIn() != null) {
            _hashCode += getCheckIn().hashCode();
        }
        _hashCode += getStay();
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
        if (getPricesAsOf() != null) {
            _hashCode += getPricesAsOf().hashCode();
        }
        _hashCode += (isForPackage() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowBlackedOut() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HotelSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "HotelSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("checkIn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CheckIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Stay"));
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
        elemField.setFieldName("pricesAsOf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PricesAsOf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forPackage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ForPackage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
