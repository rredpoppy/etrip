/**
 * BookOptionPackage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Types.Etrip;

public class BookOptionPackage  implements java.io.Serializable {
    private int[] extraComponents;

    public BookOptionPackage() {
    }

    public BookOptionPackage(
           int[] extraComponents) {
           this.extraComponents = extraComponents;
    }


    /**
     * Gets the extraComponents value for this BookOptionPackage.
     * 
     * @return extraComponents
     */
    public int[] getExtraComponents() {
        return extraComponents;
    }


    /**
     * Sets the extraComponents value for this BookOptionPackage.
     * 
     * @param extraComponents
     */
    public void setExtraComponents(int[] extraComponents) {
        this.extraComponents = extraComponents;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BookOptionPackage)) return false;
        BookOptionPackage other = (BookOptionPackage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.extraComponents==null && other.getExtraComponents()==null) || 
             (this.extraComponents!=null &&
              java.util.Arrays.equals(this.extraComponents, other.getExtraComponents())));
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
        if (getExtraComponents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtraComponents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtraComponents(), i);
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
        new org.apache.axis.description.TypeDesc(BookOptionPackage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "BookOptionPackage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExtraComponents"));
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
