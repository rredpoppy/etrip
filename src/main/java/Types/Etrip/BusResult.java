/**
 * BusResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Types.Etrip;

public class BusResult  extends Types.Etrip.Result  implements java.io.Serializable {
    private java.lang.String label;

    private int from;

    private int to;

    private java.util.Calendar outboundDate;

    private java.util.Calendar inboundDate;

    private java.lang.String busType;

    public BusResult() {
    }

    public BusResult(
           Types.Etrip.PriceInfo price,
           java.math.BigDecimal totalDiscount,
           boolean isBookable,
           boolean isHotDeal,
           java.lang.String label,
           int from,
           int to,
           java.util.Calendar outboundDate,
           java.util.Calendar inboundDate,
           java.lang.String busType) {
        super(
            price,
            totalDiscount,
            isBookable,
            isHotDeal);
        this.label = label;
        this.from = from;
        this.to = to;
        this.outboundDate = outboundDate;
        this.inboundDate = inboundDate;
        this.busType = busType;
    }


    /**
     * Gets the label value for this BusResult.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this BusResult.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the from value for this BusResult.
     * 
     * @return from
     */
    public int getFrom() {
        return from;
    }


    /**
     * Sets the from value for this BusResult.
     * 
     * @param from
     */
    public void setFrom(int from) {
        this.from = from;
    }


    /**
     * Gets the to value for this BusResult.
     * 
     * @return to
     */
    public int getTo() {
        return to;
    }


    /**
     * Sets the to value for this BusResult.
     * 
     * @param to
     */
    public void setTo(int to) {
        this.to = to;
    }


    /**
     * Gets the outboundDate value for this BusResult.
     * 
     * @return outboundDate
     */
    public java.util.Calendar getOutboundDate() {
        return outboundDate;
    }


    /**
     * Sets the outboundDate value for this BusResult.
     * 
     * @param outboundDate
     */
    public void setOutboundDate(java.util.Calendar outboundDate) {
        this.outboundDate = outboundDate;
    }


    /**
     * Gets the inboundDate value for this BusResult.
     * 
     * @return inboundDate
     */
    public java.util.Calendar getInboundDate() {
        return inboundDate;
    }


    /**
     * Sets the inboundDate value for this BusResult.
     * 
     * @param inboundDate
     */
    public void setInboundDate(java.util.Calendar inboundDate) {
        this.inboundDate = inboundDate;
    }


    /**
     * Gets the busType value for this BusResult.
     * 
     * @return busType
     */
    public java.lang.String getBusType() {
        return busType;
    }


    /**
     * Sets the busType value for this BusResult.
     * 
     * @param busType
     */
    public void setBusType(java.lang.String busType) {
        this.busType = busType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusResult)) return false;
        BusResult other = (BusResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            this.from == other.getFrom() &&
            this.to == other.getTo() &&
            ((this.outboundDate==null && other.getOutboundDate()==null) || 
             (this.outboundDate!=null &&
              this.outboundDate.equals(other.getOutboundDate()))) &&
            ((this.inboundDate==null && other.getInboundDate()==null) || 
             (this.inboundDate!=null &&
              this.inboundDate.equals(other.getInboundDate()))) &&
            ((this.busType==null && other.getBusType()==null) || 
             (this.busType!=null &&
              this.busType.equals(other.getBusType())));
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
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        _hashCode += getFrom();
        _hashCode += getTo();
        if (getOutboundDate() != null) {
            _hashCode += getOutboundDate().hashCode();
        }
        if (getInboundDate() != null) {
            _hashCode += getInboundDate().hashCode();
        }
        if (getBusType() != null) {
            _hashCode += getBusType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "BusResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("", "From"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "To"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outboundDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OutboundDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inboundDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InboundDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BusType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
