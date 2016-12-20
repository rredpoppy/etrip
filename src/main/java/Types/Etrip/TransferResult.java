/**
 * TransferResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Types.Etrip;

public class TransferResult  extends Types.Etrip.Result  implements java.io.Serializable {
    private java.lang.String label;

    private int from;

    private int to;

    private java.lang.String pickup;

    private java.lang.String dropoff;

    private java.util.Calendar date;

    public TransferResult() {
    }

    public TransferResult(
           Types.Etrip.PriceInfo price,
           java.math.BigDecimal totalDiscount,
           boolean isBookable,
           boolean isHotDeal,
           java.lang.String label,
           int from,
           int to,
           java.lang.String pickup,
           java.lang.String dropoff,
           java.util.Calendar date) {
        super(
            price,
            totalDiscount,
            isBookable,
            isHotDeal);
        this.label = label;
        this.from = from;
        this.to = to;
        this.pickup = pickup;
        this.dropoff = dropoff;
        this.date = date;
    }


    /**
     * Gets the label value for this TransferResult.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this TransferResult.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the from value for this TransferResult.
     * 
     * @return from
     */
    public int getFrom() {
        return from;
    }


    /**
     * Sets the from value for this TransferResult.
     * 
     * @param from
     */
    public void setFrom(int from) {
        this.from = from;
    }


    /**
     * Gets the to value for this TransferResult.
     * 
     * @return to
     */
    public int getTo() {
        return to;
    }


    /**
     * Sets the to value for this TransferResult.
     * 
     * @param to
     */
    public void setTo(int to) {
        this.to = to;
    }


    /**
     * Gets the pickup value for this TransferResult.
     * 
     * @return pickup
     */
    public java.lang.String getPickup() {
        return pickup;
    }


    /**
     * Sets the pickup value for this TransferResult.
     * 
     * @param pickup
     */
    public void setPickup(java.lang.String pickup) {
        this.pickup = pickup;
    }


    /**
     * Gets the dropoff value for this TransferResult.
     * 
     * @return dropoff
     */
    public java.lang.String getDropoff() {
        return dropoff;
    }


    /**
     * Sets the dropoff value for this TransferResult.
     * 
     * @param dropoff
     */
    public void setDropoff(java.lang.String dropoff) {
        this.dropoff = dropoff;
    }


    /**
     * Gets the date value for this TransferResult.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this TransferResult.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferResult)) return false;
        TransferResult other = (TransferResult) obj;
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
            ((this.pickup==null && other.getPickup()==null) || 
             (this.pickup!=null &&
              this.pickup.equals(other.getPickup()))) &&
            ((this.dropoff==null && other.getDropoff()==null) || 
             (this.dropoff!=null &&
              this.dropoff.equals(other.getDropoff()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate())));
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
        if (getPickup() != null) {
            _hashCode += getPickup().hashCode();
        }
        if (getDropoff() != null) {
            _hashCode += getDropoff().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "TransferResult"));
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
        elemField.setFieldName("pickup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Pickup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dropoff");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Dropoff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Date"));
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
