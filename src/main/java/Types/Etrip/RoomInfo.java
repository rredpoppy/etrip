/**
 * RoomInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Types.Etrip;

public class RoomInfo  implements java.io.Serializable {
    private java.lang.String label;

    private Types.Etrip.RoomPax[] pax;

    public RoomInfo() {
    }

    public RoomInfo(
           java.lang.String label,
           Types.Etrip.RoomPax[] pax) {
           this.label = label;
           this.pax = pax;
    }


    /**
     * Gets the label value for this RoomInfo.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this RoomInfo.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the pax value for this RoomInfo.
     * 
     * @return pax
     */
    public Types.Etrip.RoomPax[] getPax() {
        return pax;
    }


    /**
     * Sets the pax value for this RoomInfo.
     * 
     * @param pax
     */
    public void setPax(Types.Etrip.RoomPax[] pax) {
        this.pax = pax;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoomInfo)) return false;
        RoomInfo other = (RoomInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.pax==null && other.getPax()==null) || 
             (this.pax!=null &&
              java.util.Arrays.equals(this.pax, other.getPax())));
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
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getPax() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPax());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPax(), i);
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
        new org.apache.axis.description.TypeDesc(RoomInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "RoomInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Pax"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "RoomPax"));
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
