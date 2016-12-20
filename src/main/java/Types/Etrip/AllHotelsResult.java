/**
 * AllHotelsResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Types.Etrip;

public class AllHotelsResult  extends Types.Etrip.Result  implements java.io.Serializable {
    private java.lang.String supplierName;

    private java.lang.String supplierType;

    private java.lang.String hotelName;

    private java.lang.String hotelDescription;

    private float hotelRating;

    private java.lang.String hotelAddress;

    private float latitude;

    private float longitude;

    private java.lang.String roomCategory;

    private java.lang.String mealBasis;

    private java.lang.String supplierStatus;

    private java.lang.String imageUrl;

    private java.lang.String[] images;

    private Types.Etrip.DetailedDescription[] detailedDescriptions;

    private java.lang.String cancellationRules;

    public AllHotelsResult() {
    }

    public AllHotelsResult(
           Types.Etrip.PriceInfo price,
           java.math.BigDecimal totalDiscount,
           boolean isBookable,
           boolean isHotDeal,
           java.lang.String supplierName,
           java.lang.String supplierType,
           java.lang.String hotelName,
           java.lang.String hotelDescription,
           float hotelRating,
           java.lang.String hotelAddress,
           float latitude,
           float longitude,
           java.lang.String roomCategory,
           java.lang.String mealBasis,
           java.lang.String supplierStatus,
           java.lang.String imageUrl,
           java.lang.String[] images,
           Types.Etrip.DetailedDescription[] detailedDescriptions,
           java.lang.String cancellationRules) {
        super(
            price,
            totalDiscount,
            isBookable,
            isHotDeal);
        this.supplierName = supplierName;
        this.supplierType = supplierType;
        this.hotelName = hotelName;
        this.hotelDescription = hotelDescription;
        this.hotelRating = hotelRating;
        this.hotelAddress = hotelAddress;
        this.latitude = latitude;
        this.longitude = longitude;
        this.roomCategory = roomCategory;
        this.mealBasis = mealBasis;
        this.supplierStatus = supplierStatus;
        this.imageUrl = imageUrl;
        this.images = images;
        this.detailedDescriptions = detailedDescriptions;
        this.cancellationRules = cancellationRules;
    }


    /**
     * Gets the supplierName value for this AllHotelsResult.
     * 
     * @return supplierName
     */
    public java.lang.String getSupplierName() {
        return supplierName;
    }


    /**
     * Sets the supplierName value for this AllHotelsResult.
     * 
     * @param supplierName
     */
    public void setSupplierName(java.lang.String supplierName) {
        this.supplierName = supplierName;
    }


    /**
     * Gets the supplierType value for this AllHotelsResult.
     * 
     * @return supplierType
     */
    public java.lang.String getSupplierType() {
        return supplierType;
    }


    /**
     * Sets the supplierType value for this AllHotelsResult.
     * 
     * @param supplierType
     */
    public void setSupplierType(java.lang.String supplierType) {
        this.supplierType = supplierType;
    }


    /**
     * Gets the hotelName value for this AllHotelsResult.
     * 
     * @return hotelName
     */
    public java.lang.String getHotelName() {
        return hotelName;
    }


    /**
     * Sets the hotelName value for this AllHotelsResult.
     * 
     * @param hotelName
     */
    public void setHotelName(java.lang.String hotelName) {
        this.hotelName = hotelName;
    }


    /**
     * Gets the hotelDescription value for this AllHotelsResult.
     * 
     * @return hotelDescription
     */
    public java.lang.String getHotelDescription() {
        return hotelDescription;
    }


    /**
     * Sets the hotelDescription value for this AllHotelsResult.
     * 
     * @param hotelDescription
     */
    public void setHotelDescription(java.lang.String hotelDescription) {
        this.hotelDescription = hotelDescription;
    }


    /**
     * Gets the hotelRating value for this AllHotelsResult.
     * 
     * @return hotelRating
     */
    public float getHotelRating() {
        return hotelRating;
    }


    /**
     * Sets the hotelRating value for this AllHotelsResult.
     * 
     * @param hotelRating
     */
    public void setHotelRating(float hotelRating) {
        this.hotelRating = hotelRating;
    }


    /**
     * Gets the hotelAddress value for this AllHotelsResult.
     * 
     * @return hotelAddress
     */
    public java.lang.String getHotelAddress() {
        return hotelAddress;
    }


    /**
     * Sets the hotelAddress value for this AllHotelsResult.
     * 
     * @param hotelAddress
     */
    public void setHotelAddress(java.lang.String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }


    /**
     * Gets the latitude value for this AllHotelsResult.
     * 
     * @return latitude
     */
    public float getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this AllHotelsResult.
     * 
     * @param latitude
     */
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this AllHotelsResult.
     * 
     * @return longitude
     */
    public float getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this AllHotelsResult.
     * 
     * @param longitude
     */
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the roomCategory value for this AllHotelsResult.
     * 
     * @return roomCategory
     */
    public java.lang.String getRoomCategory() {
        return roomCategory;
    }


    /**
     * Sets the roomCategory value for this AllHotelsResult.
     * 
     * @param roomCategory
     */
    public void setRoomCategory(java.lang.String roomCategory) {
        this.roomCategory = roomCategory;
    }


    /**
     * Gets the mealBasis value for this AllHotelsResult.
     * 
     * @return mealBasis
     */
    public java.lang.String getMealBasis() {
        return mealBasis;
    }


    /**
     * Sets the mealBasis value for this AllHotelsResult.
     * 
     * @param mealBasis
     */
    public void setMealBasis(java.lang.String mealBasis) {
        this.mealBasis = mealBasis;
    }


    /**
     * Gets the supplierStatus value for this AllHotelsResult.
     * 
     * @return supplierStatus
     */
    public java.lang.String getSupplierStatus() {
        return supplierStatus;
    }


    /**
     * Sets the supplierStatus value for this AllHotelsResult.
     * 
     * @param supplierStatus
     */
    public void setSupplierStatus(java.lang.String supplierStatus) {
        this.supplierStatus = supplierStatus;
    }


    /**
     * Gets the imageUrl value for this AllHotelsResult.
     * 
     * @return imageUrl
     */
    public java.lang.String getImageUrl() {
        return imageUrl;
    }


    /**
     * Sets the imageUrl value for this AllHotelsResult.
     * 
     * @param imageUrl
     */
    public void setImageUrl(java.lang.String imageUrl) {
        this.imageUrl = imageUrl;
    }


    /**
     * Gets the images value for this AllHotelsResult.
     * 
     * @return images
     */
    public java.lang.String[] getImages() {
        return images;
    }


    /**
     * Sets the images value for this AllHotelsResult.
     * 
     * @param images
     */
    public void setImages(java.lang.String[] images) {
        this.images = images;
    }


    /**
     * Gets the detailedDescriptions value for this AllHotelsResult.
     * 
     * @return detailedDescriptions
     */
    public Types.Etrip.DetailedDescription[] getDetailedDescriptions() {
        return detailedDescriptions;
    }


    /**
     * Sets the detailedDescriptions value for this AllHotelsResult.
     * 
     * @param detailedDescriptions
     */
    public void setDetailedDescriptions(Types.Etrip.DetailedDescription[] detailedDescriptions) {
        this.detailedDescriptions = detailedDescriptions;
    }


    /**
     * Gets the cancellationRules value for this AllHotelsResult.
     * 
     * @return cancellationRules
     */
    public java.lang.String getCancellationRules() {
        return cancellationRules;
    }


    /**
     * Sets the cancellationRules value for this AllHotelsResult.
     * 
     * @param cancellationRules
     */
    public void setCancellationRules(java.lang.String cancellationRules) {
        this.cancellationRules = cancellationRules;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AllHotelsResult)) return false;
        AllHotelsResult other = (AllHotelsResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.supplierName==null && other.getSupplierName()==null) || 
             (this.supplierName!=null &&
              this.supplierName.equals(other.getSupplierName()))) &&
            ((this.supplierType==null && other.getSupplierType()==null) || 
             (this.supplierType!=null &&
              this.supplierType.equals(other.getSupplierType()))) &&
            ((this.hotelName==null && other.getHotelName()==null) || 
             (this.hotelName!=null &&
              this.hotelName.equals(other.getHotelName()))) &&
            ((this.hotelDescription==null && other.getHotelDescription()==null) || 
             (this.hotelDescription!=null &&
              this.hotelDescription.equals(other.getHotelDescription()))) &&
            this.hotelRating == other.getHotelRating() &&
            ((this.hotelAddress==null && other.getHotelAddress()==null) || 
             (this.hotelAddress!=null &&
              this.hotelAddress.equals(other.getHotelAddress()))) &&
            this.latitude == other.getLatitude() &&
            this.longitude == other.getLongitude() &&
            ((this.roomCategory==null && other.getRoomCategory()==null) || 
             (this.roomCategory!=null &&
              this.roomCategory.equals(other.getRoomCategory()))) &&
            ((this.mealBasis==null && other.getMealBasis()==null) || 
             (this.mealBasis!=null &&
              this.mealBasis.equals(other.getMealBasis()))) &&
            ((this.supplierStatus==null && other.getSupplierStatus()==null) || 
             (this.supplierStatus!=null &&
              this.supplierStatus.equals(other.getSupplierStatus()))) &&
            ((this.imageUrl==null && other.getImageUrl()==null) || 
             (this.imageUrl!=null &&
              this.imageUrl.equals(other.getImageUrl()))) &&
            ((this.images==null && other.getImages()==null) || 
             (this.images!=null &&
              java.util.Arrays.equals(this.images, other.getImages()))) &&
            ((this.detailedDescriptions==null && other.getDetailedDescriptions()==null) || 
             (this.detailedDescriptions!=null &&
              java.util.Arrays.equals(this.detailedDescriptions, other.getDetailedDescriptions()))) &&
            ((this.cancellationRules==null && other.getCancellationRules()==null) || 
             (this.cancellationRules!=null &&
              this.cancellationRules.equals(other.getCancellationRules())));
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
        if (getSupplierName() != null) {
            _hashCode += getSupplierName().hashCode();
        }
        if (getSupplierType() != null) {
            _hashCode += getSupplierType().hashCode();
        }
        if (getHotelName() != null) {
            _hashCode += getHotelName().hashCode();
        }
        if (getHotelDescription() != null) {
            _hashCode += getHotelDescription().hashCode();
        }
        _hashCode += new Float(getHotelRating()).hashCode();
        if (getHotelAddress() != null) {
            _hashCode += getHotelAddress().hashCode();
        }
        _hashCode += new Float(getLatitude()).hashCode();
        _hashCode += new Float(getLongitude()).hashCode();
        if (getRoomCategory() != null) {
            _hashCode += getRoomCategory().hashCode();
        }
        if (getMealBasis() != null) {
            _hashCode += getMealBasis().hashCode();
        }
        if (getSupplierStatus() != null) {
            _hashCode += getSupplierStatus().hashCode();
        }
        if (getImageUrl() != null) {
            _hashCode += getImageUrl().hashCode();
        }
        if (getImages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImages(), i);
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
        if (getCancellationRules() != null) {
            _hashCode += getCancellationRules().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AllHotelsResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "AllHotelsResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SupplierName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SupplierType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotelName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HotelName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotelDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HotelDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotelRating");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HotelRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotelAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HotelAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roomCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RoomCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mealBasis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MealBasis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SupplierStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ImageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("images");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Images"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailedDescriptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DetailedDescriptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "DetailedDescription"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancellationRules");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CancellationRules"));
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
