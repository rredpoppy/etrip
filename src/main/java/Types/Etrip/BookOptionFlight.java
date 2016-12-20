/**
 * BookOptionFlight.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Types.Etrip;

public class BookOptionFlight  implements java.io.Serializable {
    private int outboundIndex;

    private int inboundIndex;

    public BookOptionFlight() {
    }

    public BookOptionFlight(
           int outboundIndex,
           int inboundIndex) {
           this.outboundIndex = outboundIndex;
           this.inboundIndex = inboundIndex;
    }


    /**
     * Gets the outboundIndex value for this BookOptionFlight.
     * 
     * @return outboundIndex
     */
    public int getOutboundIndex() {
        return outboundIndex;
    }


    /**
     * Sets the outboundIndex value for this BookOptionFlight.
     * 
     * @param outboundIndex
     */
    public void setOutboundIndex(int outboundIndex) {
        this.outboundIndex = outboundIndex;
    }


    /**
     * Gets the inboundIndex value for this BookOptionFlight.
     * 
     * @return inboundIndex
     */
    public int getInboundIndex() {
        return inboundIndex;
    }


    /**
     * Sets the inboundIndex value for this BookOptionFlight.
     * 
     * @param inboundIndex
     */
    public void setInboundIndex(int inboundIndex) {
        this.inboundIndex = inboundIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BookOptionFlight)) return false;
        BookOptionFlight other = (BookOptionFlight) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.outboundIndex == other.getOutboundIndex() &&
            this.inboundIndex == other.getInboundIndex();
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
        _hashCode += getOutboundIndex();
        _hashCode += getInboundIndex();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BookOptionFlight.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "BookOptionFlight"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outboundIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OutboundIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inboundIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InboundIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
