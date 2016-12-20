/**
 * Hotel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Types.Etrip;

public class Hotel  implements java.io.Serializable {
    private int id;

    private java.lang.String source;

    private java.lang.Integer sourceId;

    private java.lang.String code;

    private java.lang.String name;

    private int _class;

    private java.lang.String description;

    private java.lang.String address;

    private java.lang.String ZIP;

    private java.lang.String phone;

    private java.lang.String fax;

    private int location;

    private java.lang.String URL;

    private float latitude;

    private float longitude;

    private Types.Etrip.RoomCategory[] roomCategories;

    private Types.Etrip.FileInfo[] images;

    private Types.Etrip.DetailedDescription[] detailedDescriptions;

    private java.lang.String[] hotelTheme;

    private java.lang.String[] hotelAmenities;

    private java.lang.String[] roomAmenities;

    private java.lang.String extraClass;

    private boolean useIndividually;

    private boolean useOnPackages;

    private java.lang.String propertyType;

    public Hotel() {
    }

    public Hotel(
           int id,
           java.lang.String source,
           java.lang.Integer sourceId,
           java.lang.String code,
           java.lang.String name,
           int _class,
           java.lang.String description,
           java.lang.String address,
           java.lang.String ZIP,
           java.lang.String phone,
           java.lang.String fax,
           int location,
           java.lang.String URL,
           float latitude,
           float longitude,
           Types.Etrip.RoomCategory[] roomCategories,
           Types.Etrip.FileInfo[] images,
           Types.Etrip.DetailedDescription[] detailedDescriptions,
           java.lang.String[] hotelTheme,
           java.lang.String[] hotelAmenities,
           java.lang.String[] roomAmenities,
           java.lang.String extraClass,
           boolean useIndividually,
           boolean useOnPackages,
           java.lang.String propertyType) {
           this.id = id;
           this.source = source;
           this.sourceId = sourceId;
           this.code = code;
           this.name = name;
           this._class = _class;
           this.description = description;
           this.address = address;
           this.ZIP = ZIP;
           this.phone = phone;
           this.fax = fax;
           this.location = location;
           this.URL = URL;
           this.latitude = latitude;
           this.longitude = longitude;
           this.roomCategories = roomCategories;
           this.images = images;
           this.detailedDescriptions = detailedDescriptions;
           this.hotelTheme = hotelTheme;
           this.hotelAmenities = hotelAmenities;
           this.roomAmenities = roomAmenities;
           this.extraClass = extraClass;
           this.useIndividually = useIndividually;
           this.useOnPackages = useOnPackages;
           this.propertyType = propertyType;
    }


    /**
     * Gets the id value for this Hotel.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Hotel.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the source value for this Hotel.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this Hotel.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the sourceId value for this Hotel.
     * 
     * @return sourceId
     */
    public java.lang.Integer getSourceId() {
        return sourceId;
    }


    /**
     * Sets the sourceId value for this Hotel.
     * 
     * @param sourceId
     */
    public void setSourceId(java.lang.Integer sourceId) {
        this.sourceId = sourceId;
    }


    /**
     * Gets the code value for this Hotel.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this Hotel.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the name value for this Hotel.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Hotel.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the _class value for this Hotel.
     * 
     * @return _class
     */
    public int get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this Hotel.
     * 
     * @param _class
     */
    public void set_class(int _class) {
        this._class = _class;
    }


    /**
     * Gets the description value for this Hotel.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Hotel.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the address value for this Hotel.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Hotel.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the ZIP value for this Hotel.
     * 
     * @return ZIP
     */
    public java.lang.String getZIP() {
        return ZIP;
    }


    /**
     * Sets the ZIP value for this Hotel.
     * 
     * @param ZIP
     */
    public void setZIP(java.lang.String ZIP) {
        this.ZIP = ZIP;
    }


    /**
     * Gets the phone value for this Hotel.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this Hotel.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the fax value for this Hotel.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this Hotel.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the location value for this Hotel.
     * 
     * @return location
     */
    public int getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Hotel.
     * 
     * @param location
     */
    public void setLocation(int location) {
        this.location = location;
    }


    /**
     * Gets the URL value for this Hotel.
     * 
     * @return URL
     */
    public java.lang.String getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this Hotel.
     * 
     * @param URL
     */
    public void setURL(java.lang.String URL) {
        this.URL = URL;
    }


    /**
     * Gets the latitude value for this Hotel.
     * 
     * @return latitude
     */
    public float getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this Hotel.
     * 
     * @param latitude
     */
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this Hotel.
     * 
     * @return longitude
     */
    public float getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this Hotel.
     * 
     * @param longitude
     */
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the roomCategories value for this Hotel.
     * 
     * @return roomCategories
     */
    public Types.Etrip.RoomCategory[] getRoomCategories() {
        return roomCategories;
    }


    /**
     * Sets the roomCategories value for this Hotel.
     * 
     * @param roomCategories
     */
    public void setRoomCategories(Types.Etrip.RoomCategory[] roomCategories) {
        this.roomCategories = roomCategories;
    }


    /**
     * Gets the images value for this Hotel.
     * 
     * @return images
     */
    public Types.Etrip.FileInfo[] getImages() {
        return images;
    }


    /**
     * Sets the images value for this Hotel.
     * 
     * @param images
     */
    public void setImages(Types.Etrip.FileInfo[] images) {
        this.images = images;
    }


    /**
     * Gets the detailedDescriptions value for this Hotel.
     * 
     * @return detailedDescriptions
     */
    public Types.Etrip.DetailedDescription[] getDetailedDescriptions() {
        return detailedDescriptions;
    }


    /**
     * Sets the detailedDescriptions value for this Hotel.
     * 
     * @param detailedDescriptions
     */
    public void setDetailedDescriptions(Types.Etrip.DetailedDescription[] detailedDescriptions) {
        this.detailedDescriptions = detailedDescriptions;
    }


    /**
     * Gets the hotelTheme value for this Hotel.
     * 
     * @return hotelTheme
     */
    public java.lang.String[] getHotelTheme() {
        return hotelTheme;
    }


    /**
     * Sets the hotelTheme value for this Hotel.
     * 
     * @param hotelTheme
     */
    public void setHotelTheme(java.lang.String[] hotelTheme) {
        this.hotelTheme = hotelTheme;
    }


    /**
     * Gets the hotelAmenities value for this Hotel.
     * 
     * @return hotelAmenities
     */
    public java.lang.String[] getHotelAmenities() {
        return hotelAmenities;
    }


    /**
     * Sets the hotelAmenities value for this Hotel.
     * 
     * @param hotelAmenities
     */
    public void setHotelAmenities(java.lang.String[] hotelAmenities) {
        this.hotelAmenities = hotelAmenities;
    }


    /**
     * Gets the roomAmenities value for this Hotel.
     * 
     * @return roomAmenities
     */
    public java.lang.String[] getRoomAmenities() {
        return roomAmenities;
    }


    /**
     * Sets the roomAmenities value for this Hotel.
     * 
     * @param roomAmenities
     */
    public void setRoomAmenities(java.lang.String[] roomAmenities) {
        this.roomAmenities = roomAmenities;
    }


    /**
     * Gets the extraClass value for this Hotel.
     * 
     * @return extraClass
     */
    public java.lang.String getExtraClass() {
        return extraClass;
    }


    /**
     * Sets the extraClass value for this Hotel.
     * 
     * @param extraClass
     */
    public void setExtraClass(java.lang.String extraClass) {
        this.extraClass = extraClass;
    }


    /**
     * Gets the useIndividually value for this Hotel.
     * 
     * @return useIndividually
     */
    public boolean isUseIndividually() {
        return useIndividually;
    }


    /**
     * Sets the useIndividually value for this Hotel.
     * 
     * @param useIndividually
     */
    public void setUseIndividually(boolean useIndividually) {
        this.useIndividually = useIndividually;
    }


    /**
     * Gets the useOnPackages value for this Hotel.
     * 
     * @return useOnPackages
     */
    public boolean isUseOnPackages() {
        return useOnPackages;
    }


    /**
     * Sets the useOnPackages value for this Hotel.
     * 
     * @param useOnPackages
     */
    public void setUseOnPackages(boolean useOnPackages) {
        this.useOnPackages = useOnPackages;
    }


    /**
     * Gets the propertyType value for this Hotel.
     * 
     * @return propertyType
     */
    public java.lang.String getPropertyType() {
        return propertyType;
    }


    /**
     * Sets the propertyType value for this Hotel.
     * 
     * @param propertyType
     */
    public void setPropertyType(java.lang.String propertyType) {
        this.propertyType = propertyType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Hotel)) return false;
        Hotel other = (Hotel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.sourceId==null && other.getSourceId()==null) || 
             (this.sourceId!=null &&
              this.sourceId.equals(other.getSourceId()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this._class == other.get_class() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.ZIP==null && other.getZIP()==null) || 
             (this.ZIP!=null &&
              this.ZIP.equals(other.getZIP()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            this.location == other.getLocation() &&
            ((this.URL==null && other.getURL()==null) || 
             (this.URL!=null &&
              this.URL.equals(other.getURL()))) &&
            this.latitude == other.getLatitude() &&
            this.longitude == other.getLongitude() &&
            ((this.roomCategories==null && other.getRoomCategories()==null) || 
             (this.roomCategories!=null &&
              java.util.Arrays.equals(this.roomCategories, other.getRoomCategories()))) &&
            ((this.images==null && other.getImages()==null) || 
             (this.images!=null &&
              java.util.Arrays.equals(this.images, other.getImages()))) &&
            ((this.detailedDescriptions==null && other.getDetailedDescriptions()==null) || 
             (this.detailedDescriptions!=null &&
              java.util.Arrays.equals(this.detailedDescriptions, other.getDetailedDescriptions()))) &&
            ((this.hotelTheme==null && other.getHotelTheme()==null) || 
             (this.hotelTheme!=null &&
              java.util.Arrays.equals(this.hotelTheme, other.getHotelTheme()))) &&
            ((this.hotelAmenities==null && other.getHotelAmenities()==null) || 
             (this.hotelAmenities!=null &&
              java.util.Arrays.equals(this.hotelAmenities, other.getHotelAmenities()))) &&
            ((this.roomAmenities==null && other.getRoomAmenities()==null) || 
             (this.roomAmenities!=null &&
              java.util.Arrays.equals(this.roomAmenities, other.getRoomAmenities()))) &&
            ((this.extraClass==null && other.getExtraClass()==null) || 
             (this.extraClass!=null &&
              this.extraClass.equals(other.getExtraClass()))) &&
            this.useIndividually == other.isUseIndividually() &&
            this.useOnPackages == other.isUseOnPackages() &&
            ((this.propertyType==null && other.getPropertyType()==null) || 
             (this.propertyType!=null &&
              this.propertyType.equals(other.getPropertyType())));
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
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getSourceId() != null) {
            _hashCode += getSourceId().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += get_class();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getZIP() != null) {
            _hashCode += getZIP().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        _hashCode += getLocation();
        if (getURL() != null) {
            _hashCode += getURL().hashCode();
        }
        _hashCode += new Float(getLatitude()).hashCode();
        _hashCode += new Float(getLongitude()).hashCode();
        if (getRoomCategories() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoomCategories());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoomCategories(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getHotelTheme() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHotelTheme());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHotelTheme(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHotelAmenities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHotelAmenities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHotelAmenities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoomAmenities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoomAmenities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoomAmenities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExtraClass() != null) {
            _hashCode += getExtraClass().hashCode();
        }
        _hashCode += (isUseIndividually() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isUseOnPackages() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPropertyType() != null) {
            _hashCode += getPropertyType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Hotel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "Hotel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Class"));
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
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZIP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URL"));
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
        elemField.setFieldName("roomCategories");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RoomCategories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "RoomCategory"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("images");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Images"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "FileInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailedDescriptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DetailedDescriptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "DetailedDescription"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotelTheme");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HotelTheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotelAmenities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HotelAmenities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roomAmenities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RoomAmenities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExtraClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useIndividually");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UseIndividually"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useOnPackages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UseOnPackages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PropertyType"));
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
