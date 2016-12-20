/**
 * Booking.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Types.Etrip;

public class Booking  implements java.io.Serializable {
    private int reference;

    private java.util.Calendar created;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private java.util.Calendar balanceDueDate;

    private java.lang.String invoiceCurrency;

    private Types.Etrip.PriceInfo price;

    private Types.Etrip.BookingItem[] items;

    public Booking() {
    }

    public Booking(
           int reference,
           java.util.Calendar created,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           java.util.Calendar balanceDueDate,
           java.lang.String invoiceCurrency,
           Types.Etrip.PriceInfo price,
           Types.Etrip.BookingItem[] items) {
           this.reference = reference;
           this.created = created;
           this.startDate = startDate;
           this.endDate = endDate;
           this.balanceDueDate = balanceDueDate;
           this.invoiceCurrency = invoiceCurrency;
           this.price = price;
           this.items = items;
    }


    /**
     * Gets the reference value for this Booking.
     * 
     * @return reference
     */
    public int getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this Booking.
     * 
     * @param reference
     */
    public void setReference(int reference) {
        this.reference = reference;
    }


    /**
     * Gets the created value for this Booking.
     * 
     * @return created
     */
    public java.util.Calendar getCreated() {
        return created;
    }


    /**
     * Sets the created value for this Booking.
     * 
     * @param created
     */
    public void setCreated(java.util.Calendar created) {
        this.created = created;
    }


    /**
     * Gets the startDate value for this Booking.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Booking.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this Booking.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this Booking.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the balanceDueDate value for this Booking.
     * 
     * @return balanceDueDate
     */
    public java.util.Calendar getBalanceDueDate() {
        return balanceDueDate;
    }


    /**
     * Sets the balanceDueDate value for this Booking.
     * 
     * @param balanceDueDate
     */
    public void setBalanceDueDate(java.util.Calendar balanceDueDate) {
        this.balanceDueDate = balanceDueDate;
    }


    /**
     * Gets the invoiceCurrency value for this Booking.
     * 
     * @return invoiceCurrency
     */
    public java.lang.String getInvoiceCurrency() {
        return invoiceCurrency;
    }


    /**
     * Sets the invoiceCurrency value for this Booking.
     * 
     * @param invoiceCurrency
     */
    public void setInvoiceCurrency(java.lang.String invoiceCurrency) {
        this.invoiceCurrency = invoiceCurrency;
    }


    /**
     * Gets the price value for this Booking.
     * 
     * @return price
     */
    public Types.Etrip.PriceInfo getPrice() {
        return price;
    }


    /**
     * Sets the price value for this Booking.
     * 
     * @param price
     */
    public void setPrice(Types.Etrip.PriceInfo price) {
        this.price = price;
    }


    /**
     * Gets the items value for this Booking.
     * 
     * @return items
     */
    public Types.Etrip.BookingItem[] getItems() {
        return items;
    }


    /**
     * Sets the items value for this Booking.
     * 
     * @param items
     */
    public void setItems(Types.Etrip.BookingItem[] items) {
        this.items = items;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Booking)) return false;
        Booking other = (Booking) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.reference == other.getReference() &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.balanceDueDate==null && other.getBalanceDueDate()==null) || 
             (this.balanceDueDate!=null &&
              this.balanceDueDate.equals(other.getBalanceDueDate()))) &&
            ((this.invoiceCurrency==null && other.getInvoiceCurrency()==null) || 
             (this.invoiceCurrency!=null &&
              this.invoiceCurrency.equals(other.getInvoiceCurrency()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              java.util.Arrays.equals(this.items, other.getItems())));
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
        _hashCode += getReference();
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getBalanceDueDate() != null) {
            _hashCode += getBalanceDueDate().hashCode();
        }
        if (getInvoiceCurrency() != null) {
            _hashCode += getInvoiceCurrency().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItems(), i);
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
        new org.apache.axis.description.TypeDesc(Booking.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "Booking"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceDueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BalanceDueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InvoiceCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "PriceInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Items"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "BookingItem"));
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
