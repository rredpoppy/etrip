/**
 * Geography.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Types.Etrip;

public class Geography  implements java.io.Serializable {
    private int id;

    private java.lang.String name;

    private java.lang.String intName;

    private java.lang.String childLabel;

    private java.lang.String description;

    private Types.Etrip.FileInfo image;

    private Types.Etrip.Geography[] children;

    private double minVal;

    private double maxVal;

    private int treeLevel;

    public Geography() {
    }

    public Geography(
           int id,
           java.lang.String name,
           java.lang.String intName,
           java.lang.String childLabel,
           java.lang.String description,
           Types.Etrip.FileInfo image,
           Types.Etrip.Geography[] children,
           double minVal,
           double maxVal,
           int treeLevel) {
           this.id = id;
           this.name = name;
           this.intName = intName;
           this.childLabel = childLabel;
           this.description = description;
           this.image = image;
           this.children = children;
           this.minVal = minVal;
           this.maxVal = maxVal;
           this.treeLevel = treeLevel;
    }


    /**
     * Gets the id value for this Geography.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Geography.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Geography.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Geography.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the intName value for this Geography.
     * 
     * @return intName
     */
    public java.lang.String getIntName() {
        return intName;
    }


    /**
     * Sets the intName value for this Geography.
     * 
     * @param intName
     */
    public void setIntName(java.lang.String intName) {
        this.intName = intName;
    }


    /**
     * Gets the childLabel value for this Geography.
     * 
     * @return childLabel
     */
    public java.lang.String getChildLabel() {
        return childLabel;
    }


    /**
     * Sets the childLabel value for this Geography.
     * 
     * @param childLabel
     */
    public void setChildLabel(java.lang.String childLabel) {
        this.childLabel = childLabel;
    }


    /**
     * Gets the description value for this Geography.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Geography.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the image value for this Geography.
     * 
     * @return image
     */
    public Types.Etrip.FileInfo getImage() {
        return image;
    }


    /**
     * Sets the image value for this Geography.
     * 
     * @param image
     */
    public void setImage(Types.Etrip.FileInfo image) {
        this.image = image;
    }


    /**
     * Gets the children value for this Geography.
     * 
     * @return children
     */
    public Types.Etrip.Geography[] getChildren() {
        return children;
    }


    /**
     * Sets the children value for this Geography.
     * 
     * @param children
     */
    public void setChildren(Types.Etrip.Geography[] children) {
        this.children = children;
    }


    /**
     * Gets the minVal value for this Geography.
     * 
     * @return minVal
     */
    public double getMinVal() {
        return minVal;
    }


    /**
     * Sets the minVal value for this Geography.
     * 
     * @param minVal
     */
    public void setMinVal(double minVal) {
        this.minVal = minVal;
    }


    /**
     * Gets the maxVal value for this Geography.
     * 
     * @return maxVal
     */
    public double getMaxVal() {
        return maxVal;
    }


    /**
     * Sets the maxVal value for this Geography.
     * 
     * @param maxVal
     */
    public void setMaxVal(double maxVal) {
        this.maxVal = maxVal;
    }


    /**
     * Gets the treeLevel value for this Geography.
     * 
     * @return treeLevel
     */
    public int getTreeLevel() {
        return treeLevel;
    }


    /**
     * Sets the treeLevel value for this Geography.
     * 
     * @param treeLevel
     */
    public void setTreeLevel(int treeLevel) {
        this.treeLevel = treeLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Geography)) return false;
        Geography other = (Geography) obj;
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
            ((this.intName==null && other.getIntName()==null) || 
             (this.intName!=null &&
              this.intName.equals(other.getIntName()))) &&
            ((this.childLabel==null && other.getChildLabel()==null) || 
             (this.childLabel!=null &&
              this.childLabel.equals(other.getChildLabel()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              this.image.equals(other.getImage()))) &&
            ((this.children==null && other.getChildren()==null) || 
             (this.children!=null &&
              java.util.Arrays.equals(this.children, other.getChildren()))) &&
            this.minVal == other.getMinVal() &&
            this.maxVal == other.getMaxVal() &&
            this.treeLevel == other.getTreeLevel();
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
        if (getIntName() != null) {
            _hashCode += getIntName().hashCode();
        }
        if (getChildLabel() != null) {
            _hashCode += getChildLabel().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getImage() != null) {
            _hashCode += getImage().hashCode();
        }
        if (getChildren() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildren());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildren(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Double(getMinVal()).hashCode();
        _hashCode += new Double(getMaxVal()).hashCode();
        _hashCode += getTreeLevel();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Geography.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "Geography"));
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
        elemField.setFieldName("intName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IntName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChildLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Image"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "FileInfo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("children");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Children"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "Geography"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minVal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MinVal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxVal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MaxVal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("treeLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TreeLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
