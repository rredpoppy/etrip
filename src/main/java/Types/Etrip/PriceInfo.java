/**
 * PriceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Types.Etrip;

public class PriceInfo  implements java.io.Serializable {
    private java.math.BigDecimal gross;

    private java.math.BigDecimal commission;

    private java.math.BigDecimal VAT;

    private java.math.BigDecimal tax;

    public PriceInfo() {
    }

    public PriceInfo(
           java.math.BigDecimal gross,
           java.math.BigDecimal commission,
           java.math.BigDecimal VAT,
           java.math.BigDecimal tax) {
           this.gross = gross;
           this.commission = commission;
           this.VAT = VAT;
           this.tax = tax;
    }


    /**
     * Gets the gross value for this PriceInfo.
     * 
     * @return gross
     */
    public java.math.BigDecimal getGross() {
        return gross;
    }


    /**
     * Sets the gross value for this PriceInfo.
     * 
     * @param gross
     */
    public void setGross(java.math.BigDecimal gross) {
        this.gross = gross;
    }


    /**
     * Gets the commission value for this PriceInfo.
     * 
     * @return commission
     */
    public java.math.BigDecimal getCommission() {
        return commission;
    }


    /**
     * Sets the commission value for this PriceInfo.
     * 
     * @param commission
     */
    public void setCommission(java.math.BigDecimal commission) {
        this.commission = commission;
    }


    /**
     * Gets the VAT value for this PriceInfo.
     * 
     * @return VAT
     */
    public java.math.BigDecimal getVAT() {
        return VAT;
    }


    /**
     * Sets the VAT value for this PriceInfo.
     * 
     * @param VAT
     */
    public void setVAT(java.math.BigDecimal VAT) {
        this.VAT = VAT;
    }


    /**
     * Gets the tax value for this PriceInfo.
     * 
     * @return tax
     */
    public java.math.BigDecimal getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this PriceInfo.
     * 
     * @param tax
     */
    public void setTax(java.math.BigDecimal tax) {
        this.tax = tax;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PriceInfo)) return false;
        PriceInfo other = (PriceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gross==null && other.getGross()==null) || 
             (this.gross!=null &&
              this.gross.equals(other.getGross()))) &&
            ((this.commission==null && other.getCommission()==null) || 
             (this.commission!=null &&
              this.commission.equals(other.getCommission()))) &&
            ((this.VAT==null && other.getVAT()==null) || 
             (this.VAT!=null &&
              this.VAT.equals(other.getVAT()))) &&
            ((this.tax==null && other.getTax()==null) || 
             (this.tax!=null &&
              this.tax.equals(other.getTax())));
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
        if (getGross() != null) {
            _hashCode += getGross().hashCode();
        }
        if (getCommission() != null) {
            _hashCode += getCommission().hashCode();
        }
        if (getVAT() != null) {
            _hashCode += getVAT().hashCode();
        }
        if (getTax() != null) {
            _hashCode += getTax().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PriceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "PriceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gross");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Gross"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commission");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Commission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Tax"));
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
