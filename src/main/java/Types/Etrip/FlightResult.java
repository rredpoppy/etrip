/**
 * FlightResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Types.Etrip;

public class FlightResult  extends Types.Etrip.Result  implements java.io.Serializable {
    private Types.Etrip.Journey[] outbound;

    private Types.Etrip.Journey[] inbound;

    private Types.Etrip.FareRule[] fareRules;

    private java.util.Calendar lastTicketDate;

    public FlightResult() {
    }

    public FlightResult(
           Types.Etrip.PriceInfo price,
           java.math.BigDecimal totalDiscount,
           boolean isBookable,
           boolean isHotDeal,
           Types.Etrip.Journey[] outbound,
           Types.Etrip.Journey[] inbound,
           Types.Etrip.FareRule[] fareRules,
           java.util.Calendar lastTicketDate) {
        super(
            price,
            totalDiscount,
            isBookable,
            isHotDeal);
        this.outbound = outbound;
        this.inbound = inbound;
        this.fareRules = fareRules;
        this.lastTicketDate = lastTicketDate;
    }


    /**
     * Gets the outbound value for this FlightResult.
     * 
     * @return outbound
     */
    public Types.Etrip.Journey[] getOutbound() {
        return outbound;
    }


    /**
     * Sets the outbound value for this FlightResult.
     * 
     * @param outbound
     */
    public void setOutbound(Types.Etrip.Journey[] outbound) {
        this.outbound = outbound;
    }


    /**
     * Gets the inbound value for this FlightResult.
     * 
     * @return inbound
     */
    public Types.Etrip.Journey[] getInbound() {
        return inbound;
    }


    /**
     * Sets the inbound value for this FlightResult.
     * 
     * @param inbound
     */
    public void setInbound(Types.Etrip.Journey[] inbound) {
        this.inbound = inbound;
    }


    /**
     * Gets the fareRules value for this FlightResult.
     * 
     * @return fareRules
     */
    public Types.Etrip.FareRule[] getFareRules() {
        return fareRules;
    }


    /**
     * Sets the fareRules value for this FlightResult.
     * 
     * @param fareRules
     */
    public void setFareRules(Types.Etrip.FareRule[] fareRules) {
        this.fareRules = fareRules;
    }


    /**
     * Gets the lastTicketDate value for this FlightResult.
     * 
     * @return lastTicketDate
     */
    public java.util.Calendar getLastTicketDate() {
        return lastTicketDate;
    }


    /**
     * Sets the lastTicketDate value for this FlightResult.
     * 
     * @param lastTicketDate
     */
    public void setLastTicketDate(java.util.Calendar lastTicketDate) {
        this.lastTicketDate = lastTicketDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlightResult)) return false;
        FlightResult other = (FlightResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.outbound==null && other.getOutbound()==null) || 
             (this.outbound!=null &&
              java.util.Arrays.equals(this.outbound, other.getOutbound()))) &&
            ((this.inbound==null && other.getInbound()==null) || 
             (this.inbound!=null &&
              java.util.Arrays.equals(this.inbound, other.getInbound()))) &&
            ((this.fareRules==null && other.getFareRules()==null) || 
             (this.fareRules!=null &&
              java.util.Arrays.equals(this.fareRules, other.getFareRules()))) &&
            ((this.lastTicketDate==null && other.getLastTicketDate()==null) || 
             (this.lastTicketDate!=null &&
              this.lastTicketDate.equals(other.getLastTicketDate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getOutbound() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutbound());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutbound(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInbound() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInbound());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInbound(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFareRules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFareRules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFareRules(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastTicketDate() != null) {
            _hashCode += getLastTicketDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlightResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "FlightResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outbound");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Outbound"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "Journey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inbound");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Inbound"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "Journey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareRules");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FareRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "FareRule"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastTicketDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastTicketDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
