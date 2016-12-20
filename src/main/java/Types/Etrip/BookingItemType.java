/**
 * BookingItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Types.Etrip;

public class BookingItemType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BookingItemType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "other";
    public static final java.lang.String _value2 = "package";
    public static final java.lang.String _value3 = "bus";
    public static final java.lang.String _value4 = "flight";
    public static final java.lang.String _value5 = "transfer";
    public static final java.lang.String _value6 = "hotel";
    public static final BookingItemType value1 = new BookingItemType(_value1);
    public static final BookingItemType value2 = new BookingItemType(_value2);
    public static final BookingItemType value3 = new BookingItemType(_value3);
    public static final BookingItemType value4 = new BookingItemType(_value4);
    public static final BookingItemType value5 = new BookingItemType(_value5);
    public static final BookingItemType value6 = new BookingItemType(_value6);
    public java.lang.String getValue() { return _value_;}
    public static BookingItemType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BookingItemType enumeration = (BookingItemType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BookingItemType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BookingItemType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "BookingItemType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
