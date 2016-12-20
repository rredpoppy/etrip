/**
 * DiscountInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Types.Etrip;

public class DiscountInfo  implements java.io.Serializable {
    private java.lang.String label;

    private java.lang.String text;

    private java.util.Calendar bookingFrom;

    private java.util.Calendar bookingTo;

    private java.util.Calendar travelFrom;

    private java.util.Calendar travelTo;

    private java.math.BigDecimal percent;

    private java.math.BigDecimal value;

    public DiscountInfo() {
    }

    public DiscountInfo(
           java.lang.String label,
           java.lang.String text,
           java.util.Calendar bookingFrom,
           java.util.Calendar bookingTo,
           java.util.Calendar travelFrom,
           java.util.Calendar travelTo,
           java.math.BigDecimal percent,
           java.math.BigDecimal value) {
           this.label = label;
           this.text = text;
           this.bookingFrom = bookingFrom;
           this.bookingTo = bookingTo;
           this.travelFrom = travelFrom;
           this.travelTo = travelTo;
           this.percent = percent;
           this.value = value;
    }


    /**
     * Gets the label value for this DiscountInfo.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this DiscountInfo.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the text value for this DiscountInfo.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this DiscountInfo.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the bookingFrom value for this DiscountInfo.
     * 
     * @return bookingFrom
     */
    public java.util.Calendar getBookingFrom() {
        return bookingFrom;
    }


    /**
     * Sets the bookingFrom value for this DiscountInfo.
     * 
     * @param bookingFrom
     */
    public void setBookingFrom(java.util.Calendar bookingFrom) {
        this.bookingFrom = bookingFrom;
    }


    /**
     * Gets the bookingTo value for this DiscountInfo.
     * 
     * @return bookingTo
     */
    public java.util.Calendar getBookingTo() {
        return bookingTo;
    }


    /**
     * Sets the bookingTo value for this DiscountInfo.
     * 
     * @param bookingTo
     */
    public void setBookingTo(java.util.Calendar bookingTo) {
        this.bookingTo = bookingTo;
    }


    /**
     * Gets the travelFrom value for this DiscountInfo.
     * 
     * @return travelFrom
     */
    public java.util.Calendar getTravelFrom() {
        return travelFrom;
    }


    /**
     * Sets the travelFrom value for this DiscountInfo.
     * 
     * @param travelFrom
     */
    public void setTravelFrom(java.util.Calendar travelFrom) {
        this.travelFrom = travelFrom;
    }


    /**
     * Gets the travelTo value for this DiscountInfo.
     * 
     * @return travelTo
     */
    public java.util.Calendar getTravelTo() {
        return travelTo;
    }


    /**
     * Sets the travelTo value for this DiscountInfo.
     * 
     * @param travelTo
     */
    public void setTravelTo(java.util.Calendar travelTo) {
        this.travelTo = travelTo;
    }


    /**
     * Gets the percent value for this DiscountInfo.
     * 
     * @return percent
     */
    public java.math.BigDecimal getPercent() {
        return percent;
    }


    /**
     * Sets the percent value for this DiscountInfo.
     * 
     * @param percent
     */
    public void setPercent(java.math.BigDecimal percent) {
        this.percent = percent;
    }


    /**
     * Gets the value value for this DiscountInfo.
     * 
     * @return value
     */
    public java.math.BigDecimal getValue() {
        return value;
    }


    /**
     * Sets the value value for this DiscountInfo.
     * 
     * @param value
     */
    public void setValue(java.math.BigDecimal value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiscountInfo)) return false;
        DiscountInfo other = (DiscountInfo) obj;
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
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.bookingFrom==null && other.getBookingFrom()==null) || 
             (this.bookingFrom!=null &&
              this.bookingFrom.equals(other.getBookingFrom()))) &&
            ((this.bookingTo==null && other.getBookingTo()==null) || 
             (this.bookingTo!=null &&
              this.bookingTo.equals(other.getBookingTo()))) &&
            ((this.travelFrom==null && other.getTravelFrom()==null) || 
             (this.travelFrom!=null &&
              this.travelFrom.equals(other.getTravelFrom()))) &&
            ((this.travelTo==null && other.getTravelTo()==null) || 
             (this.travelTo!=null &&
              this.travelTo.equals(other.getTravelTo()))) &&
            ((this.percent==null && other.getPercent()==null) || 
             (this.percent!=null &&
              this.percent.equals(other.getPercent()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getBookingFrom() != null) {
            _hashCode += getBookingFrom().hashCode();
        }
        if (getBookingTo() != null) {
            _hashCode += getBookingTo().hashCode();
        }
        if (getTravelFrom() != null) {
            _hashCode += getTravelFrom().hashCode();
        }
        if (getTravelTo() != null) {
            _hashCode += getTravelTo().hashCode();
        }
        if (getPercent() != null) {
            _hashCode += getPercent().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DiscountInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "DiscountInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BookingFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BookingTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travelFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TravelFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travelTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TravelTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Percent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
