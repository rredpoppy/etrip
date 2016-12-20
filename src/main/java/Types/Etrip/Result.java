/**
 * Result.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Types.Etrip;

public class Result  implements java.io.Serializable {
    private Types.Etrip.PriceInfo price;

    private java.math.BigDecimal totalDiscount;

    private boolean isBookable;

    private boolean isHotDeal;

    public Result() {
    }

    public Result(
           Types.Etrip.PriceInfo price,
           java.math.BigDecimal totalDiscount,
           boolean isBookable,
           boolean isHotDeal) {
           this.price = price;
           this.totalDiscount = totalDiscount;
           this.isBookable = isBookable;
           this.isHotDeal = isHotDeal;
    }


    /**
     * Gets the price value for this Result.
     * 
     * @return price
     */
    public Types.Etrip.PriceInfo getPrice() {
        return price;
    }


    /**
     * Sets the price value for this Result.
     * 
     * @param price
     */
    public void setPrice(Types.Etrip.PriceInfo price) {
        this.price = price;
    }


    /**
     * Gets the totalDiscount value for this Result.
     * 
     * @return totalDiscount
     */
    public java.math.BigDecimal getTotalDiscount() {
        return totalDiscount;
    }


    /**
     * Sets the totalDiscount value for this Result.
     * 
     * @param totalDiscount
     */
    public void setTotalDiscount(java.math.BigDecimal totalDiscount) {
        this.totalDiscount = totalDiscount;
    }


    /**
     * Gets the isBookable value for this Result.
     * 
     * @return isBookable
     */
    public boolean isIsBookable() {
        return isBookable;
    }


    /**
     * Sets the isBookable value for this Result.
     * 
     * @param isBookable
     */
    public void setIsBookable(boolean isBookable) {
        this.isBookable = isBookable;
    }


    /**
     * Gets the isHotDeal value for this Result.
     * 
     * @return isHotDeal
     */
    public boolean isIsHotDeal() {
        return isHotDeal;
    }


    /**
     * Sets the isHotDeal value for this Result.
     * 
     * @param isHotDeal
     */
    public void setIsHotDeal(boolean isHotDeal) {
        this.isHotDeal = isHotDeal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Result)) return false;
        Result other = (Result) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.totalDiscount==null && other.getTotalDiscount()==null) || 
             (this.totalDiscount!=null &&
              this.totalDiscount.equals(other.getTotalDiscount()))) &&
            this.isBookable == other.isIsBookable() &&
            this.isHotDeal == other.isIsHotDeal();
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
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getTotalDiscount() != null) {
            _hashCode += getTotalDiscount().hashCode();
        }
        _hashCode += (isIsBookable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsHotDeal() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Result.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "Result"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "PriceInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TotalDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBookable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsBookable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isHotDeal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsHotDeal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
