/**
 * AllHotelsSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Types.Etrip;

public class AllHotelsSearch  implements java.io.Serializable {
    private java.lang.String currency;

    private int destination;

    private java.util.Calendar checkIn;

    private int stay;

    private Types.Etrip.Room[] rooms;

    public AllHotelsSearch() {
    }

    public AllHotelsSearch(
           java.lang.String currency,
           int destination,
           java.util.Calendar checkIn,
           int stay,
           Types.Etrip.Room[] rooms) {
           this.currency = currency;
           this.destination = destination;
           this.checkIn = checkIn;
           this.stay = stay;
           this.rooms = rooms;
    }


    /**
     * Gets the currency value for this AllHotelsSearch.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this AllHotelsSearch.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the destination value for this AllHotelsSearch.
     * 
     * @return destination
     */
    public int getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this AllHotelsSearch.
     * 
     * @param destination
     */
    public void setDestination(int destination) {
        this.destination = destination;
    }


    /**
     * Gets the checkIn value for this AllHotelsSearch.
     * 
     * @return checkIn
     */
    public java.util.Calendar getCheckIn() {
        return checkIn;
    }


    /**
     * Sets the checkIn value for this AllHotelsSearch.
     * 
     * @param checkIn
     */
    public void setCheckIn(java.util.Calendar checkIn) {
        this.checkIn = checkIn;
    }


    /**
     * Gets the stay value for this AllHotelsSearch.
     * 
     * @return stay
     */
    public int getStay() {
        return stay;
    }


    /**
     * Sets the stay value for this AllHotelsSearch.
     * 
     * @param stay
     */
    public void setStay(int stay) {
        this.stay = stay;
    }


    /**
     * Gets the rooms value for this AllHotelsSearch.
     * 
     * @return rooms
     */
    public Types.Etrip.Room[] getRooms() {
        return rooms;
    }


    /**
     * Sets the rooms value for this AllHotelsSearch.
     * 
     * @param rooms
     */
    public void setRooms(Types.Etrip.Room[] rooms) {
        this.rooms = rooms;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AllHotelsSearch)) return false;
        AllHotelsSearch other = (AllHotelsSearch) obj;
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
            ((this.checkIn==null && other.getCheckIn()==null) || 
             (this.checkIn!=null &&
              this.checkIn.equals(other.getCheckIn()))) &&
            this.stay == other.getStay() &&
            ((this.rooms==null && other.getRooms()==null) || 
             (this.rooms!=null &&
              java.util.Arrays.equals(this.rooms, other.getRooms())));
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
        if (getCheckIn() != null) {
            _hashCode += getCheckIn().hashCode();
        }
        _hashCode += getStay();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AllHotelsSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "AllHotelsSearch"));
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
        elemField.setFieldName("rooms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Rooms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "Room"));
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
