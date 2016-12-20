/**
 * Journey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Types.Etrip;

public class Journey  implements java.io.Serializable {
    private java.lang.String airline;

    private java.lang.String _class;

    private Types.Etrip.AirlineCabin cabin;

    private java.lang.String cabinName;

    private Types.Etrip.Leg[] legs;

    public Journey() {
    }

    public Journey(
           java.lang.String airline,
           java.lang.String _class,
           Types.Etrip.AirlineCabin cabin,
           java.lang.String cabinName,
           Types.Etrip.Leg[] legs) {
           this.airline = airline;
           this._class = _class;
           this.cabin = cabin;
           this.cabinName = cabinName;
           this.legs = legs;
    }


    /**
     * Gets the airline value for this Journey.
     * 
     * @return airline
     */
    public java.lang.String getAirline() {
        return airline;
    }


    /**
     * Sets the airline value for this Journey.
     * 
     * @param airline
     */
    public void setAirline(java.lang.String airline) {
        this.airline = airline;
    }


    /**
     * Gets the _class value for this Journey.
     * 
     * @return _class
     */
    public java.lang.String get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this Journey.
     * 
     * @param _class
     */
    public void set_class(java.lang.String _class) {
        this._class = _class;
    }


    /**
     * Gets the cabin value for this Journey.
     * 
     * @return cabin
     */
    public Types.Etrip.AirlineCabin getCabin() {
        return cabin;
    }


    /**
     * Sets the cabin value for this Journey.
     * 
     * @param cabin
     */
    public void setCabin(Types.Etrip.AirlineCabin cabin) {
        this.cabin = cabin;
    }


    /**
     * Gets the cabinName value for this Journey.
     * 
     * @return cabinName
     */
    public java.lang.String getCabinName() {
        return cabinName;
    }


    /**
     * Sets the cabinName value for this Journey.
     * 
     * @param cabinName
     */
    public void setCabinName(java.lang.String cabinName) {
        this.cabinName = cabinName;
    }


    /**
     * Gets the legs value for this Journey.
     * 
     * @return legs
     */
    public Types.Etrip.Leg[] getLegs() {
        return legs;
    }


    /**
     * Sets the legs value for this Journey.
     * 
     * @param legs
     */
    public void setLegs(Types.Etrip.Leg[] legs) {
        this.legs = legs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Journey)) return false;
        Journey other = (Journey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.airline==null && other.getAirline()==null) || 
             (this.airline!=null &&
              this.airline.equals(other.getAirline()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.cabin==null && other.getCabin()==null) || 
             (this.cabin!=null &&
              this.cabin.equals(other.getCabin()))) &&
            ((this.cabinName==null && other.getCabinName()==null) || 
             (this.cabinName!=null &&
              this.cabinName.equals(other.getCabinName()))) &&
            ((this.legs==null && other.getLegs()==null) || 
             (this.legs!=null &&
              java.util.Arrays.equals(this.legs, other.getLegs())));
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
        if (getAirline() != null) {
            _hashCode += getAirline().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getCabin() != null) {
            _hashCode += getCabin().hashCode();
        }
        if (getCabinName() != null) {
            _hashCode += getCabinName().hashCode();
        }
        if (getLegs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLegs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLegs(), i);
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
        new org.apache.axis.description.TypeDesc(Journey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "Journey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airline");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Airline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Class"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cabin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Cabin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "AirlineCabin"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cabinName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CabinName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Legs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "Leg"));
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
