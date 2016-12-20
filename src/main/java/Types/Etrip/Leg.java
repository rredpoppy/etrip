/**
 * Leg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Types.Etrip;

public class Leg  implements java.io.Serializable {
    private java.lang.String from;

    private java.lang.String to;

    private java.util.Calendar departure;

    private java.util.Calendar arrival;

    private java.lang.String airline;

    private java.lang.String flightNo;

    private java.lang.String _class;

    private java.lang.String depTerminal;

    private java.lang.String arrTerminal;

    private java.lang.String depGate;

    private java.lang.String arrGate;

    private java.lang.String flightTime;

    public Leg() {
    }

    public Leg(
           java.lang.String from,
           java.lang.String to,
           java.util.Calendar departure,
           java.util.Calendar arrival,
           java.lang.String airline,
           java.lang.String flightNo,
           java.lang.String _class,
           java.lang.String depTerminal,
           java.lang.String arrTerminal,
           java.lang.String depGate,
           java.lang.String arrGate,
           java.lang.String flightTime) {
           this.from = from;
           this.to = to;
           this.departure = departure;
           this.arrival = arrival;
           this.airline = airline;
           this.flightNo = flightNo;
           this._class = _class;
           this.depTerminal = depTerminal;
           this.arrTerminal = arrTerminal;
           this.depGate = depGate;
           this.arrGate = arrGate;
           this.flightTime = flightTime;
    }


    /**
     * Gets the from value for this Leg.
     * 
     * @return from
     */
    public java.lang.String getFrom() {
        return from;
    }


    /**
     * Sets the from value for this Leg.
     * 
     * @param from
     */
    public void setFrom(java.lang.String from) {
        this.from = from;
    }


    /**
     * Gets the to value for this Leg.
     * 
     * @return to
     */
    public java.lang.String getTo() {
        return to;
    }


    /**
     * Sets the to value for this Leg.
     * 
     * @param to
     */
    public void setTo(java.lang.String to) {
        this.to = to;
    }


    /**
     * Gets the departure value for this Leg.
     * 
     * @return departure
     */
    public java.util.Calendar getDeparture() {
        return departure;
    }


    /**
     * Sets the departure value for this Leg.
     * 
     * @param departure
     */
    public void setDeparture(java.util.Calendar departure) {
        this.departure = departure;
    }


    /**
     * Gets the arrival value for this Leg.
     * 
     * @return arrival
     */
    public java.util.Calendar getArrival() {
        return arrival;
    }


    /**
     * Sets the arrival value for this Leg.
     * 
     * @param arrival
     */
    public void setArrival(java.util.Calendar arrival) {
        this.arrival = arrival;
    }


    /**
     * Gets the airline value for this Leg.
     * 
     * @return airline
     */
    public java.lang.String getAirline() {
        return airline;
    }


    /**
     * Sets the airline value for this Leg.
     * 
     * @param airline
     */
    public void setAirline(java.lang.String airline) {
        this.airline = airline;
    }


    /**
     * Gets the flightNo value for this Leg.
     * 
     * @return flightNo
     */
    public java.lang.String getFlightNo() {
        return flightNo;
    }


    /**
     * Sets the flightNo value for this Leg.
     * 
     * @param flightNo
     */
    public void setFlightNo(java.lang.String flightNo) {
        this.flightNo = flightNo;
    }


    /**
     * Gets the _class value for this Leg.
     * 
     * @return _class
     */
    public java.lang.String get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this Leg.
     * 
     * @param _class
     */
    public void set_class(java.lang.String _class) {
        this._class = _class;
    }


    /**
     * Gets the depTerminal value for this Leg.
     * 
     * @return depTerminal
     */
    public java.lang.String getDepTerminal() {
        return depTerminal;
    }


    /**
     * Sets the depTerminal value for this Leg.
     * 
     * @param depTerminal
     */
    public void setDepTerminal(java.lang.String depTerminal) {
        this.depTerminal = depTerminal;
    }


    /**
     * Gets the arrTerminal value for this Leg.
     * 
     * @return arrTerminal
     */
    public java.lang.String getArrTerminal() {
        return arrTerminal;
    }


    /**
     * Sets the arrTerminal value for this Leg.
     * 
     * @param arrTerminal
     */
    public void setArrTerminal(java.lang.String arrTerminal) {
        this.arrTerminal = arrTerminal;
    }


    /**
     * Gets the depGate value for this Leg.
     * 
     * @return depGate
     */
    public java.lang.String getDepGate() {
        return depGate;
    }


    /**
     * Sets the depGate value for this Leg.
     * 
     * @param depGate
     */
    public void setDepGate(java.lang.String depGate) {
        this.depGate = depGate;
    }


    /**
     * Gets the arrGate value for this Leg.
     * 
     * @return arrGate
     */
    public java.lang.String getArrGate() {
        return arrGate;
    }


    /**
     * Sets the arrGate value for this Leg.
     * 
     * @param arrGate
     */
    public void setArrGate(java.lang.String arrGate) {
        this.arrGate = arrGate;
    }


    /**
     * Gets the flightTime value for this Leg.
     * 
     * @return flightTime
     */
    public java.lang.String getFlightTime() {
        return flightTime;
    }


    /**
     * Sets the flightTime value for this Leg.
     * 
     * @param flightTime
     */
    public void setFlightTime(java.lang.String flightTime) {
        this.flightTime = flightTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Leg)) return false;
        Leg other = (Leg) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo()))) &&
            ((this.departure==null && other.getDeparture()==null) || 
             (this.departure!=null &&
              this.departure.equals(other.getDeparture()))) &&
            ((this.arrival==null && other.getArrival()==null) || 
             (this.arrival!=null &&
              this.arrival.equals(other.getArrival()))) &&
            ((this.airline==null && other.getAirline()==null) || 
             (this.airline!=null &&
              this.airline.equals(other.getAirline()))) &&
            ((this.flightNo==null && other.getFlightNo()==null) || 
             (this.flightNo!=null &&
              this.flightNo.equals(other.getFlightNo()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.depTerminal==null && other.getDepTerminal()==null) || 
             (this.depTerminal!=null &&
              this.depTerminal.equals(other.getDepTerminal()))) &&
            ((this.arrTerminal==null && other.getArrTerminal()==null) || 
             (this.arrTerminal!=null &&
              this.arrTerminal.equals(other.getArrTerminal()))) &&
            ((this.depGate==null && other.getDepGate()==null) || 
             (this.depGate!=null &&
              this.depGate.equals(other.getDepGate()))) &&
            ((this.arrGate==null && other.getArrGate()==null) || 
             (this.arrGate!=null &&
              this.arrGate.equals(other.getArrGate()))) &&
            ((this.flightTime==null && other.getFlightTime()==null) || 
             (this.flightTime!=null &&
              this.flightTime.equals(other.getFlightTime())));
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
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        if (getDeparture() != null) {
            _hashCode += getDeparture().hashCode();
        }
        if (getArrival() != null) {
            _hashCode += getArrival().hashCode();
        }
        if (getAirline() != null) {
            _hashCode += getAirline().hashCode();
        }
        if (getFlightNo() != null) {
            _hashCode += getFlightNo().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getDepTerminal() != null) {
            _hashCode += getDepTerminal().hashCode();
        }
        if (getArrTerminal() != null) {
            _hashCode += getArrTerminal().hashCode();
        }
        if (getDepGate() != null) {
            _hashCode += getDepGate().hashCode();
        }
        if (getArrGate() != null) {
            _hashCode += getArrGate().hashCode();
        }
        if (getFlightTime() != null) {
            _hashCode += getFlightTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Leg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Etrip.Types", "Leg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("", "From"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "To"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Departure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrival");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Arrival"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airline");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Airline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FlightNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Class"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depTerminal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DepTerminal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrTerminal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ArrTerminal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depGate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DepGate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrGate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ArrGate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FlightTime"));
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
