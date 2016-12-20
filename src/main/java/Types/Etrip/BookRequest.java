/**
 * BookRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Types.Etrip;

public class BookRequest  implements java.io.Serializable {
    private Types.Etrip.PaxInfo[] paxInfo;

    private int resultIndex;

    private java.lang.String clientReference;

    private Types.Etrip.BookOptionPackage packageOptions;

    private Types.Etrip.BookOptionHotel hotelOptions;

    private Types.Etrip.BookOptionFlight flightOptions;

    private Types.Etrip.BookRequestStatus status;

    private Types.Etrip.Client client;

    public BookRequest() {
    }

    public BookRequest(
           Types.Etrip.PaxInfo[] paxInfo,
           int resultIndex,
           java.lang.String clientReference,
           Types.Etrip.BookOptionPackage packageOptions,
           Types.Etrip.BookOptionHotel hotelOptions,
           Types.Etrip.BookOptionFlight flightOptions,
           Types.Etrip.BookRequestStatus status,
           Types.Etrip.Client client) {
           this.paxInfo = paxInfo;
           this.resultIndex = resultIndex;
           this.clientReference = clientReference;
           this.packageOptions = packageOptions;
           this.hotelOptions = hotelOptions;
           this.flightOptions = flightOptions;
           this.status = status;
           this.client = client;
    }


    /**
     * Gets the paxInfo value for this BookRequest.
     * 
     * @return paxInfo
     */
    public Types.Etrip.PaxInfo[] getPaxInfo() {
        return paxInfo;
    }


    /**
     * Sets the paxInfo value for this BookRequest.
     * 
     * @param paxInfo
     */
    public void setPaxInfo(Types.Etrip.PaxInfo[] paxInfo) {
        this.paxInfo = paxInfo;
    }


    /**
     * Gets the resultIndex value for this BookRequest.
     * 
     * @return resultIndex
     */
    public int getResultIndex() {
        return resultIndex;
    }


    /**
     * Sets the resultIndex value for this BookRequest.
     * 
     * @param resultIndex
     */
    public void setResultIndex(int resultIndex) {
        this.resultIndex = resultIndex;
    }


    /**
     * Gets the clientReference value for this BookRequest.
     * 
     * @return clientReference
     */
    public java.lang.String getClientReference() {
        return clientReference;
    }


    /**
     * Sets the clientReference value for this BookRequest.
     * 
     * @param clientReference
     */
    public void setClientReference(java.lang.String clientReference) {
        this.clientReference = clientReference;
    }


    /**
     * Gets the packageOptions value for this BookRequest.
     * 
     * @return packageOptions
     */
    public Types.Etrip.BookOptionPackage getPackageOptions() {
        return packageOptions;
    }


    /**
     * Sets the packageOptions value for this BookRequest.
     * 
     * @param packageOptions
     */
    public void setPackageOptions(Types.Etrip.BookOptionPackage packageOptions) {
        this.packageOptions = packageOptions;
    }


    /**
     * Gets the hotelOptions value for this BookRequest.
     * 
     * @return hotelOptions
     */
    public Types.Etrip.BookOptionHotel getHotelOptions() {
        return hotelOptions;
    }


    /**
     * Sets the hotelOptions value for this BookRequest.
     * 
     * @param hotelOptions
     */
    public void setHotelOptions(Types.Etrip.BookOptionHotel hotelOptions) {
        this.hotelOptions = hotelOptions;
    }


    /**
     * Gets the flightOptions value for this BookRequest.
     * 
     * @return flightOptions
     */
    public Types.Etrip.BookOptionFlight getFlightOptions() {
        return flightOptions;
    }


    /**
     * Sets the flightOptions value for this BookRequest.
     * 
     * @param flightOptions
     */
    public void setFlightOptions(Types.Etrip.BookOptionFlight flightOptions) {
        this.flightOptions = flightOptions;
    }


    /**
     * Gets the status value for this BookRequest.
     * 
     * @return status
     */
    public Types.Etrip.BookRequestStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this BookRequest.
     * 
     * @param status
     */
    public void setStatus(Types.Etrip.BookRequestStatus status) {
        this.status = status;
    }


    /**
     * Gets the client value for this BookRequest.
     * 
     * @return client
     */
    public Types.Etrip.Client getClient() {
        return client;
    }


    /**
     * Sets the client value for this BookRequest.
     * 
     * @param client
     */
    public void setClient(Types.Etrip.Client client) {
        this.client = client;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BookRequest)) return false;
        BookRequest other = (BookRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paxInfo==null && other.getPaxInfo()==null) || 
             (this.paxInfo!=null &&
              java.util.Arrays.equals(this.paxInfo, other.getPaxInfo()))) &&
            this.resultIndex == other.getResultIndex() &&
            ((this.clientReference==null && other.getClientReference()==null) || 
             (this.clientReference!=null &&
              this.clientReference.equals(other.getClientReference()))) &&
            ((this.packageOptions==null && other.getPackageOptions()==null) || 
             (this.packageOptions!=null &&
              this.packageOptions.equals(other.getPackageOptions()))) &&
            ((this.hotelOptions==null && other.getHotelOptions()==null) || 
             (this.hotelOptions!=null &&
              this.hotelOptions.equals(other.getHotelOptions()))) &&
            ((this.flightOptions==null && other.getFlightOptions()==null) || 
             (this.flightOptions!=null &&
              this.flightOptions.equals(other.getFlightOptions()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.client==null && other.getClient()==null) || 
             (this.client!=null &&
              this.client.equals(other.getClient())));
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
        if (getPaxInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaxInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaxInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getResultIndex();
        if (getClientReference() != null) {
            _hashCode += getClientReference().hashCode();
        }
        if (getPackageOptions() != null) {
            _hashCode += getPackageOptions().hashCode();
        }
        if (getHotelOptions() != null) {
            _hashCode += getHotelOptions().hashCode();
        }
        if (getFlightOptions() != null) {
            _hashCode += getFlightOptions().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getClient() != null) {
            _hashCode += getClient().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BookRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "BookRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paxInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PaxInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "PaxInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClientReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PackageOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "BookOptionPackage"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotelOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HotelOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "BookOptionHotel"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FlightOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "BookOptionFlight"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "BookRequestStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Client"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "Client"));
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
