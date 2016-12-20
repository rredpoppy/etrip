/**
 * PackageResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Types.Etrip;

public class PackageResult  extends Types.Etrip.Result  implements java.io.Serializable {
    private int departure;

    private int destination;

    private int duration;

    private java.util.Calendar date;

    private boolean usesAllocation;

    private int packageId;

    private Types.Etrip.HotelResult hotelInfo;

    private Types.Etrip.BusResult busInfo;

    private Types.Etrip.FlightResult flightInfo;

    private Types.Etrip.TransferResult transferInfo;

    private Types.Etrip.DiscountInfo discountInfo;

    private Types.Etrip.SpecialOffer[] specials;

    private Types.Etrip.ExtraComponent[] extraComponents;

    private java.lang.String[] fareType;

    private boolean isAvailable;

    public PackageResult() {
    }

    public PackageResult(
           Types.Etrip.PriceInfo price,
           java.math.BigDecimal totalDiscount,
           boolean isBookable,
           boolean isHotDeal,
           int departure,
           int destination,
           int duration,
           java.util.Calendar date,
           boolean usesAllocation,
           int packageId,
           Types.Etrip.HotelResult hotelInfo,
           Types.Etrip.BusResult busInfo,
           Types.Etrip.FlightResult flightInfo,
           Types.Etrip.TransferResult transferInfo,
           Types.Etrip.DiscountInfo discountInfo,
           Types.Etrip.SpecialOffer[] specials,
           Types.Etrip.ExtraComponent[] extraComponents,
           java.lang.String[] fareType,
           boolean isAvailable) {
        super(
            price,
            totalDiscount,
            isBookable,
            isHotDeal);
        this.departure = departure;
        this.destination = destination;
        this.duration = duration;
        this.date = date;
        this.usesAllocation = usesAllocation;
        this.packageId = packageId;
        this.hotelInfo = hotelInfo;
        this.busInfo = busInfo;
        this.flightInfo = flightInfo;
        this.transferInfo = transferInfo;
        this.discountInfo = discountInfo;
        this.specials = specials;
        this.extraComponents = extraComponents;
        this.fareType = fareType;
        this.isAvailable = isAvailable;
    }


    /**
     * Gets the departure value for this PackageResult.
     * 
     * @return departure
     */
    public int getDeparture() {
        return departure;
    }


    /**
     * Sets the departure value for this PackageResult.
     * 
     * @param departure
     */
    public void setDeparture(int departure) {
        this.departure = departure;
    }


    /**
     * Gets the destination value for this PackageResult.
     * 
     * @return destination
     */
    public int getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this PackageResult.
     * 
     * @param destination
     */
    public void setDestination(int destination) {
        this.destination = destination;
    }


    /**
     * Gets the duration value for this PackageResult.
     * 
     * @return duration
     */
    public int getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this PackageResult.
     * 
     * @param duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }


    /**
     * Gets the date value for this PackageResult.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this PackageResult.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the usesAllocation value for this PackageResult.
     * 
     * @return usesAllocation
     */
    public boolean isUsesAllocation() {
        return usesAllocation;
    }


    /**
     * Sets the usesAllocation value for this PackageResult.
     * 
     * @param usesAllocation
     */
    public void setUsesAllocation(boolean usesAllocation) {
        this.usesAllocation = usesAllocation;
    }


    /**
     * Gets the packageId value for this PackageResult.
     * 
     * @return packageId
     */
    public int getPackageId() {
        return packageId;
    }


    /**
     * Sets the packageId value for this PackageResult.
     * 
     * @param packageId
     */
    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }


    /**
     * Gets the hotelInfo value for this PackageResult.
     * 
     * @return hotelInfo
     */
    public Types.Etrip.HotelResult getHotelInfo() {
        return hotelInfo;
    }


    /**
     * Sets the hotelInfo value for this PackageResult.
     * 
     * @param hotelInfo
     */
    public void setHotelInfo(Types.Etrip.HotelResult hotelInfo) {
        this.hotelInfo = hotelInfo;
    }


    /**
     * Gets the busInfo value for this PackageResult.
     * 
     * @return busInfo
     */
    public Types.Etrip.BusResult getBusInfo() {
        return busInfo;
    }


    /**
     * Sets the busInfo value for this PackageResult.
     * 
     * @param busInfo
     */
    public void setBusInfo(Types.Etrip.BusResult busInfo) {
        this.busInfo = busInfo;
    }


    /**
     * Gets the flightInfo value for this PackageResult.
     * 
     * @return flightInfo
     */
    public Types.Etrip.FlightResult getFlightInfo() {
        return flightInfo;
    }


    /**
     * Sets the flightInfo value for this PackageResult.
     * 
     * @param flightInfo
     */
    public void setFlightInfo(Types.Etrip.FlightResult flightInfo) {
        this.flightInfo = flightInfo;
    }


    /**
     * Gets the transferInfo value for this PackageResult.
     * 
     * @return transferInfo
     */
    public Types.Etrip.TransferResult getTransferInfo() {
        return transferInfo;
    }


    /**
     * Sets the transferInfo value for this PackageResult.
     * 
     * @param transferInfo
     */
    public void setTransferInfo(Types.Etrip.TransferResult transferInfo) {
        this.transferInfo = transferInfo;
    }


    /**
     * Gets the discountInfo value for this PackageResult.
     * 
     * @return discountInfo
     */
    public Types.Etrip.DiscountInfo getDiscountInfo() {
        return discountInfo;
    }


    /**
     * Sets the discountInfo value for this PackageResult.
     * 
     * @param discountInfo
     */
    public void setDiscountInfo(Types.Etrip.DiscountInfo discountInfo) {
        this.discountInfo = discountInfo;
    }


    /**
     * Gets the specials value for this PackageResult.
     * 
     * @return specials
     */
    public Types.Etrip.SpecialOffer[] getSpecials() {
        return specials;
    }


    /**
     * Sets the specials value for this PackageResult.
     * 
     * @param specials
     */
    public void setSpecials(Types.Etrip.SpecialOffer[] specials) {
        this.specials = specials;
    }


    /**
     * Gets the extraComponents value for this PackageResult.
     * 
     * @return extraComponents
     */
    public Types.Etrip.ExtraComponent[] getExtraComponents() {
        return extraComponents;
    }


    /**
     * Sets the extraComponents value for this PackageResult.
     * 
     * @param extraComponents
     */
    public void setExtraComponents(Types.Etrip.ExtraComponent[] extraComponents) {
        this.extraComponents = extraComponents;
    }


    /**
     * Gets the fareType value for this PackageResult.
     * 
     * @return fareType
     */
    public java.lang.String[] getFareType() {
        return fareType;
    }


    /**
     * Sets the fareType value for this PackageResult.
     * 
     * @param fareType
     */
    public void setFareType(java.lang.String[] fareType) {
        this.fareType = fareType;
    }


    /**
     * Gets the isAvailable value for this PackageResult.
     * 
     * @return isAvailable
     */
    public boolean isIsAvailable() {
        return isAvailable;
    }


    /**
     * Sets the isAvailable value for this PackageResult.
     * 
     * @param isAvailable
     */
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackageResult)) return false;
        PackageResult other = (PackageResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.departure == other.getDeparture() &&
            this.destination == other.getDestination() &&
            this.duration == other.getDuration() &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            this.usesAllocation == other.isUsesAllocation() &&
            this.packageId == other.getPackageId() &&
            ((this.hotelInfo==null && other.getHotelInfo()==null) || 
             (this.hotelInfo!=null &&
              this.hotelInfo.equals(other.getHotelInfo()))) &&
            ((this.busInfo==null && other.getBusInfo()==null) || 
             (this.busInfo!=null &&
              this.busInfo.equals(other.getBusInfo()))) &&
            ((this.flightInfo==null && other.getFlightInfo()==null) || 
             (this.flightInfo!=null &&
              this.flightInfo.equals(other.getFlightInfo()))) &&
            ((this.transferInfo==null && other.getTransferInfo()==null) || 
             (this.transferInfo!=null &&
              this.transferInfo.equals(other.getTransferInfo()))) &&
            ((this.discountInfo==null && other.getDiscountInfo()==null) || 
             (this.discountInfo!=null &&
              this.discountInfo.equals(other.getDiscountInfo()))) &&
            ((this.specials==null && other.getSpecials()==null) || 
             (this.specials!=null &&
              java.util.Arrays.equals(this.specials, other.getSpecials()))) &&
            ((this.extraComponents==null && other.getExtraComponents()==null) || 
             (this.extraComponents!=null &&
              java.util.Arrays.equals(this.extraComponents, other.getExtraComponents()))) &&
            ((this.fareType==null && other.getFareType()==null) || 
             (this.fareType!=null &&
              java.util.Arrays.equals(this.fareType, other.getFareType()))) &&
            this.isAvailable == other.isIsAvailable();
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
        _hashCode += getDeparture();
        _hashCode += getDestination();
        _hashCode += getDuration();
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        _hashCode += (isUsesAllocation() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getPackageId();
        if (getHotelInfo() != null) {
            _hashCode += getHotelInfo().hashCode();
        }
        if (getBusInfo() != null) {
            _hashCode += getBusInfo().hashCode();
        }
        if (getFlightInfo() != null) {
            _hashCode += getFlightInfo().hashCode();
        }
        if (getTransferInfo() != null) {
            _hashCode += getTransferInfo().hashCode();
        }
        if (getDiscountInfo() != null) {
            _hashCode += getDiscountInfo().hashCode();
        }
        if (getSpecials() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecials());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpecials(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExtraComponents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtraComponents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtraComponents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFareType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFareType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFareType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isIsAvailable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PackageResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "PackageResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Departure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usesAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UsesAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PackageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotelInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HotelInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "HotelResult"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BusInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "BusResult"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FlightInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "FlightResult"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TransferInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "TransferResult"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DiscountInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "DiscountInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specials");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Specials"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "SpecialOffer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExtraComponents"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "ExtraComponent"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FareType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsAvailable"));
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
