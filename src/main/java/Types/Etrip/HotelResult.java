/**
 * HotelResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Types.Etrip;

public class HotelResult  extends Types.Etrip.Result  implements java.io.Serializable {
    private int hotelId;

    private int categoryId;

    private Types.Etrip.AllocationType allocation;

    private Types.Etrip.RoomInfo[] rooms;

    private Types.Etrip.MealPlan[] mealPlans;

    private boolean isAvailable;

    private Types.Etrip.DiscountInfo[] discounts;

    private java.lang.String[] fareType;

    public HotelResult() {
    }

    public HotelResult(
           Types.Etrip.PriceInfo price,
           java.math.BigDecimal totalDiscount,
           boolean isBookable,
           boolean isHotDeal,
           int hotelId,
           int categoryId,
           Types.Etrip.AllocationType allocation,
           Types.Etrip.RoomInfo[] rooms,
           Types.Etrip.MealPlan[] mealPlans,
           boolean isAvailable,
           Types.Etrip.DiscountInfo[] discounts,
           java.lang.String[] fareType) {
        super(
            price,
            totalDiscount,
            isBookable,
            isHotDeal);
        this.hotelId = hotelId;
        this.categoryId = categoryId;
        this.allocation = allocation;
        this.rooms = rooms;
        this.mealPlans = mealPlans;
        this.isAvailable = isAvailable;
        this.discounts = discounts;
        this.fareType = fareType;
    }


    /**
     * Gets the hotelId value for this HotelResult.
     * 
     * @return hotelId
     */
    public int getHotelId() {
        return hotelId;
    }


    /**
     * Sets the hotelId value for this HotelResult.
     * 
     * @param hotelId
     */
    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }


    /**
     * Gets the categoryId value for this HotelResult.
     * 
     * @return categoryId
     */
    public int getCategoryId() {
        return categoryId;
    }


    /**
     * Sets the categoryId value for this HotelResult.
     * 
     * @param categoryId
     */
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }


    /**
     * Gets the allocation value for this HotelResult.
     * 
     * @return allocation
     */
    public Types.Etrip.AllocationType getAllocation() {
        return allocation;
    }


    /**
     * Sets the allocation value for this HotelResult.
     * 
     * @param allocation
     */
    public void setAllocation(Types.Etrip.AllocationType allocation) {
        this.allocation = allocation;
    }


    /**
     * Gets the rooms value for this HotelResult.
     * 
     * @return rooms
     */
    public Types.Etrip.RoomInfo[] getRooms() {
        return rooms;
    }


    /**
     * Sets the rooms value for this HotelResult.
     * 
     * @param rooms
     */
    public void setRooms(Types.Etrip.RoomInfo[] rooms) {
        this.rooms = rooms;
    }


    /**
     * Gets the mealPlans value for this HotelResult.
     * 
     * @return mealPlans
     */
    public Types.Etrip.MealPlan[] getMealPlans() {
        return mealPlans;
    }


    /**
     * Sets the mealPlans value for this HotelResult.
     * 
     * @param mealPlans
     */
    public void setMealPlans(Types.Etrip.MealPlan[] mealPlans) {
        this.mealPlans = mealPlans;
    }


    /**
     * Gets the isAvailable value for this HotelResult.
     * 
     * @return isAvailable
     */
    public boolean isIsAvailable() {
        return isAvailable;
    }


    /**
     * Sets the isAvailable value for this HotelResult.
     * 
     * @param isAvailable
     */
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }


    /**
     * Gets the discounts value for this HotelResult.
     * 
     * @return discounts
     */
    public Types.Etrip.DiscountInfo[] getDiscounts() {
        return discounts;
    }


    /**
     * Sets the discounts value for this HotelResult.
     * 
     * @param discounts
     */
    public void setDiscounts(Types.Etrip.DiscountInfo[] discounts) {
        this.discounts = discounts;
    }


    /**
     * Gets the fareType value for this HotelResult.
     * 
     * @return fareType
     */
    public java.lang.String[] getFareType() {
        return fareType;
    }


    /**
     * Sets the fareType value for this HotelResult.
     * 
     * @param fareType
     */
    public void setFareType(java.lang.String[] fareType) {
        this.fareType = fareType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HotelResult)) return false;
        HotelResult other = (HotelResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.hotelId == other.getHotelId() &&
            this.categoryId == other.getCategoryId() &&
            ((this.allocation==null && other.getAllocation()==null) || 
             (this.allocation!=null &&
              this.allocation.equals(other.getAllocation()))) &&
            ((this.rooms==null && other.getRooms()==null) || 
             (this.rooms!=null &&
              java.util.Arrays.equals(this.rooms, other.getRooms()))) &&
            ((this.mealPlans==null && other.getMealPlans()==null) || 
             (this.mealPlans!=null &&
              java.util.Arrays.equals(this.mealPlans, other.getMealPlans()))) &&
            this.isAvailable == other.isIsAvailable() &&
            ((this.discounts==null && other.getDiscounts()==null) || 
             (this.discounts!=null &&
              java.util.Arrays.equals(this.discounts, other.getDiscounts()))) &&
            ((this.fareType==null && other.getFareType()==null) || 
             (this.fareType!=null &&
              java.util.Arrays.equals(this.fareType, other.getFareType())));
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
        _hashCode += getHotelId();
        _hashCode += getCategoryId();
        if (getAllocation() != null) {
            _hashCode += getAllocation().hashCode();
        }
        if (getRooms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRooms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRooms(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMealPlans() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMealPlans());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMealPlans(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isIsAvailable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDiscounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiscounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiscounts(), i);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HotelResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "HotelResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotelId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HotelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CategoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Allocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "AllocationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rooms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Rooms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "RoomInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mealPlans");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MealPlans"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "MealPlan"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Discounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "DiscountInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FareType"));
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
