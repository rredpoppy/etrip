/**
 * FlightSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Types.Etrip;

public class FlightSearch  implements java.io.Serializable {
    private java.lang.String currency;

    private java.lang.String[] airlines;

    private Types.Etrip.AirlineCabin cabin;

    private Types.Etrip.SearchLeg outbound;

    private Types.Etrip.SearchLeg inbound;

    private int adults;

    private int children;

    private int infants;

    public FlightSearch() {
    }

    public FlightSearch(
           java.lang.String currency,
           java.lang.String[] airlines,
           Types.Etrip.AirlineCabin cabin,
           Types.Etrip.SearchLeg outbound,
           Types.Etrip.SearchLeg inbound,
           int adults,
           int children,
           int infants) {
           this.currency = currency;
           this.airlines = airlines;
           this.cabin = cabin;
           this.outbound = outbound;
           this.inbound = inbound;
           this.adults = adults;
           this.children = children;
           this.infants = infants;
    }


    /**
     * Gets the currency value for this FlightSearch.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this FlightSearch.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the airlines value for this FlightSearch.
     * 
     * @return airlines
     */
    public java.lang.String[] getAirlines() {
        return airlines;
    }


    /**
     * Sets the airlines value for this FlightSearch.
     * 
     * @param airlines
     */
    public void setAirlines(java.lang.String[] airlines) {
        this.airlines = airlines;
    }


    /**
     * Gets the cabin value for this FlightSearch.
     * 
     * @return cabin
     */
    public Types.Etrip.AirlineCabin getCabin() {
        return cabin;
    }


    /**
     * Sets the cabin value for this FlightSearch.
     * 
     * @param cabin
     */
    public void setCabin(Types.Etrip.AirlineCabin cabin) {
        this.cabin = cabin;
    }


    /**
     * Gets the outbound value for this FlightSearch.
     * 
     * @return outbound
     */
    public Types.Etrip.SearchLeg getOutbound() {
        return outbound;
    }


    /**
     * Sets the outbound value for this FlightSearch.
     * 
     * @param outbound
     */
    public void setOutbound(Types.Etrip.SearchLeg outbound) {
        this.outbound = outbound;
    }


    /**
     * Gets the inbound value for this FlightSearch.
     * 
     * @return inbound
     */
    public Types.Etrip.SearchLeg getInbound() {
        return inbound;
    }


    /**
     * Sets the inbound value for this FlightSearch.
     * 
     * @param inbound
     */
    public void setInbound(Types.Etrip.SearchLeg inbound) {
        this.inbound = inbound;
    }


    /**
     * Gets the adults value for this FlightSearch.
     * 
     * @return adults
     */
    public int getAdults() {
        return adults;
    }


    /**
     * Sets the adults value for this FlightSearch.
     * 
     * @param adults
     */
    public void setAdults(int adults) {
        this.adults = adults;
    }


    /**
     * Gets the children value for this FlightSearch.
     * 
     * @return children
     */
    public int getChildren() {
        return children;
    }


    /**
     * Sets the children value for this FlightSearch.
     * 
     * @param children
     */
    public void setChildren(int children) {
        this.children = children;
    }


    /**
     * Gets the infants value for this FlightSearch.
     * 
     * @return infants
     */
    public int getInfants() {
        return infants;
    }


    /**
     * Sets the infants value for this FlightSearch.
     * 
     * @param infants
     */
    public void setInfants(int infants) {
        this.infants = infants;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlightSearch)) return false;
        FlightSearch other = (FlightSearch) obj;
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
            ((this.airlines==null && other.getAirlines()==null) || 
             (this.airlines!=null &&
              java.util.Arrays.equals(this.airlines, other.getAirlines()))) &&
            ((this.cabin==null && other.getCabin()==null) || 
             (this.cabin!=null &&
              this.cabin.equals(other.getCabin()))) &&
            ((this.outbound==null && other.getOutbound()==null) || 
             (this.outbound!=null &&
              this.outbound.equals(other.getOutbound()))) &&
            ((this.inbound==null && other.getInbound()==null) || 
             (this.inbound!=null &&
              this.inbound.equals(other.getInbound()))) &&
            this.adults == other.getAdults() &&
            this.children == other.getChildren() &&
            this.infants == other.getInfants();
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
        if (getAirlines() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAirlines());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAirlines(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCabin() != null) {
            _hashCode += getCabin().hashCode();
        }
        if (getOutbound() != null) {
            _hashCode += getOutbound().hashCode();
        }
        if (getInbound() != null) {
            _hashCode += getInbound().hashCode();
        }
        _hashCode += getAdults();
        _hashCode += getChildren();
        _hashCode += getInfants();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlightSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "FlightSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airlines");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Airlines"));
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
        elemField.setFieldName("outbound");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Outbound"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "SearchLeg"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inbound");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Inbound"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "SearchLeg"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adults");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Adults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("children");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infants");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Infants"));
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
