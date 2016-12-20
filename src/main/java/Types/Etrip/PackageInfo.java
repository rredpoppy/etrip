/**
 * PackageInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Types.Etrip;

public class PackageInfo  implements java.io.Serializable {
    private int id;

    private java.lang.String name;

    private boolean isTour;

    private boolean isBus;

    private boolean isFlight;

    private int duration;

    private int outboundTransportDuration;

    private java.lang.String description;

    private int destination;

    private java.lang.String includedServices;

    private java.lang.String notIncludedServices;

    private int hotel;

    private java.lang.String hotelSource;

    private java.util.Calendar[] departureDates;

    private int[] departurePoints;

    private Types.Etrip.PriceSet[] priceSets;

    private Types.Etrip.DetailedDescription[] detailedDescriptions;

    private java.lang.String[] fareType;

    private java.lang.String currency;

    public PackageInfo() {
    }

    public PackageInfo(
           int id,
           java.lang.String name,
           boolean isTour,
           boolean isBus,
           boolean isFlight,
           int duration,
           int outboundTransportDuration,
           java.lang.String description,
           int destination,
           java.lang.String includedServices,
           java.lang.String notIncludedServices,
           int hotel,
           java.lang.String hotelSource,
           java.util.Calendar[] departureDates,
           int[] departurePoints,
           Types.Etrip.PriceSet[] priceSets,
           Types.Etrip.DetailedDescription[] detailedDescriptions,
           java.lang.String[] fareType,
           java.lang.String currency) {
           this.id = id;
           this.name = name;
           this.isTour = isTour;
           this.isBus = isBus;
           this.isFlight = isFlight;
           this.duration = duration;
           this.outboundTransportDuration = outboundTransportDuration;
           this.description = description;
           this.destination = destination;
           this.includedServices = includedServices;
           this.notIncludedServices = notIncludedServices;
           this.hotel = hotel;
           this.hotelSource = hotelSource;
           this.departureDates = departureDates;
           this.departurePoints = departurePoints;
           this.priceSets = priceSets;
           this.detailedDescriptions = detailedDescriptions;
           this.fareType = fareType;
           this.currency = currency;
    }


    /**
     * Gets the id value for this PackageInfo.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this PackageInfo.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the name value for this PackageInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PackageInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the isTour value for this PackageInfo.
     * 
     * @return isTour
     */
    public boolean isIsTour() {
        return isTour;
    }


    /**
     * Sets the isTour value for this PackageInfo.
     * 
     * @param isTour
     */
    public void setIsTour(boolean isTour) {
        this.isTour = isTour;
    }


    /**
     * Gets the isBus value for this PackageInfo.
     * 
     * @return isBus
     */
    public boolean isIsBus() {
        return isBus;
    }


    /**
     * Sets the isBus value for this PackageInfo.
     * 
     * @param isBus
     */
    public void setIsBus(boolean isBus) {
        this.isBus = isBus;
    }


    /**
     * Gets the isFlight value for this PackageInfo.
     * 
     * @return isFlight
     */
    public boolean isIsFlight() {
        return isFlight;
    }


    /**
     * Sets the isFlight value for this PackageInfo.
     * 
     * @param isFlight
     */
    public void setIsFlight(boolean isFlight) {
        this.isFlight = isFlight;
    }


    /**
     * Gets the duration value for this PackageInfo.
     * 
     * @return duration
     */
    public int getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this PackageInfo.
     * 
     * @param duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }


    /**
     * Gets the outboundTransportDuration value for this PackageInfo.
     * 
     * @return outboundTransportDuration
     */
    public int getOutboundTransportDuration() {
        return outboundTransportDuration;
    }


    /**
     * Sets the outboundTransportDuration value for this PackageInfo.
     * 
     * @param outboundTransportDuration
     */
    public void setOutboundTransportDuration(int outboundTransportDuration) {
        this.outboundTransportDuration = outboundTransportDuration;
    }


    /**
     * Gets the description value for this PackageInfo.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PackageInfo.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the destination value for this PackageInfo.
     * 
     * @return destination
     */
    public int getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this PackageInfo.
     * 
     * @param destination
     */
    public void setDestination(int destination) {
        this.destination = destination;
    }


    /**
     * Gets the includedServices value for this PackageInfo.
     * 
     * @return includedServices
     */
    public java.lang.String getIncludedServices() {
        return includedServices;
    }


    /**
     * Sets the includedServices value for this PackageInfo.
     * 
     * @param includedServices
     */
    public void setIncludedServices(java.lang.String includedServices) {
        this.includedServices = includedServices;
    }


    /**
     * Gets the notIncludedServices value for this PackageInfo.
     * 
     * @return notIncludedServices
     */
    public java.lang.String getNotIncludedServices() {
        return notIncludedServices;
    }


    /**
     * Sets the notIncludedServices value for this PackageInfo.
     * 
     * @param notIncludedServices
     */
    public void setNotIncludedServices(java.lang.String notIncludedServices) {
        this.notIncludedServices = notIncludedServices;
    }


    /**
     * Gets the hotel value for this PackageInfo.
     * 
     * @return hotel
     */
    public int getHotel() {
        return hotel;
    }


    /**
     * Sets the hotel value for this PackageInfo.
     * 
     * @param hotel
     */
    public void setHotel(int hotel) {
        this.hotel = hotel;
    }


    /**
     * Gets the hotelSource value for this PackageInfo.
     * 
     * @return hotelSource
     */
    public java.lang.String getHotelSource() {
        return hotelSource;
    }


    /**
     * Sets the hotelSource value for this PackageInfo.
     * 
     * @param hotelSource
     */
    public void setHotelSource(java.lang.String hotelSource) {
        this.hotelSource = hotelSource;
    }


    /**
     * Gets the departureDates value for this PackageInfo.
     * 
     * @return departureDates
     */
    public java.util.Calendar[] getDepartureDates() {
        return departureDates;
    }


    /**
     * Sets the departureDates value for this PackageInfo.
     * 
     * @param departureDates
     */
    public void setDepartureDates(java.util.Calendar[] departureDates) {
        this.departureDates = departureDates;
    }


    /**
     * Gets the departurePoints value for this PackageInfo.
     * 
     * @return departurePoints
     */
    public int[] getDeparturePoints() {
        return departurePoints;
    }


    /**
     * Sets the departurePoints value for this PackageInfo.
     * 
     * @param departurePoints
     */
    public void setDeparturePoints(int[] departurePoints) {
        this.departurePoints = departurePoints;
    }


    /**
     * Gets the priceSets value for this PackageInfo.
     * 
     * @return priceSets
     */
    public Types.Etrip.PriceSet[] getPriceSets() {
        return priceSets;
    }


    /**
     * Sets the priceSets value for this PackageInfo.
     * 
     * @param priceSets
     */
    public void setPriceSets(Types.Etrip.PriceSet[] priceSets) {
        this.priceSets = priceSets;
    }


    /**
     * Gets the detailedDescriptions value for this PackageInfo.
     * 
     * @return detailedDescriptions
     */
    public Types.Etrip.DetailedDescription[] getDetailedDescriptions() {
        return detailedDescriptions;
    }


    /**
     * Sets the detailedDescriptions value for this PackageInfo.
     * 
     * @param detailedDescriptions
     */
    public void setDetailedDescriptions(Types.Etrip.DetailedDescription[] detailedDescriptions) {
        this.detailedDescriptions = detailedDescriptions;
    }


    /**
     * Gets the fareType value for this PackageInfo.
     * 
     * @return fareType
     */
    public java.lang.String[] getFareType() {
        return fareType;
    }


    /**
     * Sets the fareType value for this PackageInfo.
     * 
     * @param fareType
     */
    public void setFareType(java.lang.String[] fareType) {
        this.fareType = fareType;
    }


    /**
     * Gets the currency value for this PackageInfo.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this PackageInfo.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackageInfo)) return false;
        PackageInfo other = (PackageInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.isTour == other.isIsTour() &&
            this.isBus == other.isIsBus() &&
            this.isFlight == other.isIsFlight() &&
            this.duration == other.getDuration() &&
            this.outboundTransportDuration == other.getOutboundTransportDuration() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.destination == other.getDestination() &&
            ((this.includedServices==null && other.getIncludedServices()==null) || 
             (this.includedServices!=null &&
              this.includedServices.equals(other.getIncludedServices()))) &&
            ((this.notIncludedServices==null && other.getNotIncludedServices()==null) || 
             (this.notIncludedServices!=null &&
              this.notIncludedServices.equals(other.getNotIncludedServices()))) &&
            this.hotel == other.getHotel() &&
            ((this.hotelSource==null && other.getHotelSource()==null) || 
             (this.hotelSource!=null &&
              this.hotelSource.equals(other.getHotelSource()))) &&
            ((this.departureDates==null && other.getDepartureDates()==null) || 
             (this.departureDates!=null &&
              java.util.Arrays.equals(this.departureDates, other.getDepartureDates()))) &&
            ((this.departurePoints==null && other.getDeparturePoints()==null) || 
             (this.departurePoints!=null &&
              java.util.Arrays.equals(this.departurePoints, other.getDeparturePoints()))) &&
            ((this.priceSets==null && other.getPriceSets()==null) || 
             (this.priceSets!=null &&
              java.util.Arrays.equals(this.priceSets, other.getPriceSets()))) &&
            ((this.detailedDescriptions==null && other.getDetailedDescriptions()==null) || 
             (this.detailedDescriptions!=null &&
              java.util.Arrays.equals(this.detailedDescriptions, other.getDetailedDescriptions()))) &&
            ((this.fareType==null && other.getFareType()==null) || 
             (this.fareType!=null &&
              java.util.Arrays.equals(this.fareType, other.getFareType()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency())));
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
        _hashCode += getId();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += (isIsTour() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsBus() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsFlight() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getDuration();
        _hashCode += getOutboundTransportDuration();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += getDestination();
        if (getIncludedServices() != null) {
            _hashCode += getIncludedServices().hashCode();
        }
        if (getNotIncludedServices() != null) {
            _hashCode += getNotIncludedServices().hashCode();
        }
        _hashCode += getHotel();
        if (getHotelSource() != null) {
            _hashCode += getHotelSource().hashCode();
        }
        if (getDepartureDates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepartureDates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepartureDates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeparturePoints() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeparturePoints());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeparturePoints(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPriceSets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPriceSets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPriceSets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDetailedDescriptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetailedDescriptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetailedDescriptions(), i);
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
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PackageInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "PackageInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTour");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsTour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsBus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFlight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsFlight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outboundTransportDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OutboundTransportDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includedServices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IncludedServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notIncludedServices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NotIncludedServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Hotel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotelSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HotelSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureDates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DepartureDates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departurePoints");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeparturePoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceSets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PriceSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "PriceSet"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailedDescriptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DetailedDescriptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "DetailedDescription"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FareType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Currency"));
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
