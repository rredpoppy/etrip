/**
 * BookingItemStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Types.Etrip;

public class BookingItemStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BookingItemStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "not requested";
    public static final java.lang.String _value2 = "requested";
    public static final java.lang.String _value3 = "confirmed";
    public static final java.lang.String _value4 = "not confirmed";
    public static final java.lang.String _value5 = "cancelled";
    public static final BookingItemStatus value1 = new BookingItemStatus(_value1);
    public static final BookingItemStatus value2 = new BookingItemStatus(_value2);
    public static final BookingItemStatus value3 = new BookingItemStatus(_value3);
    public static final BookingItemStatus value4 = new BookingItemStatus(_value4);
    public static final BookingItemStatus value5 = new BookingItemStatus(_value5);
    public java.lang.String getValue() { return _value_;}
    public static BookingItemStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BookingItemStatus enumeration = (BookingItemStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BookingItemStatus fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BookingItemStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "BookingItemStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
