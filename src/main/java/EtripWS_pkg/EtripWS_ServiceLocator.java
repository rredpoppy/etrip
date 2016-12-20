/**
 * EtripWS_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package EtripWS_pkg;

public class EtripWS_ServiceLocator extends org.apache.axis.client.Service implements EtripWS_pkg.EtripWS_Service {

    public EtripWS_ServiceLocator() {
    }


    public EtripWS_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EtripWS_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EtripWS
    private java.lang.String EtripWS_address = "";

    public java.lang.String getEtripWSAddress() {
        return EtripWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EtripWSWSDDServiceName = "EtripWS";

    public java.lang.String getEtripWSWSDDServiceName() {
        return EtripWSWSDDServiceName;
    }

    public void setEtripWSWSDDServiceName(java.lang.String name) {
        EtripWSWSDDServiceName = name;
    }

    public EtripWS_pkg.EtripWS_PortType getEtripWS() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EtripWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEtripWS(endpoint);
    }

    public EtripWS_pkg.EtripWS_PortType getEtripWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            EtripWS_pkg.EtripWSBindingStub _stub = new EtripWS_pkg.EtripWSBindingStub(portAddress, this);
            _stub.setPortName(getEtripWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEtripWSEndpointAddress(java.lang.String address) {
        EtripWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (EtripWS_pkg.EtripWS_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                EtripWS_pkg.EtripWSBindingStub _stub = new EtripWS_pkg.EtripWSBindingStub(new java.net.URL(EtripWS_address), this);
                _stub.setPortName(getEtripWSWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException(
                "There is no stub implementation for the interface:  "
                + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName())
        );
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EtripWS".equals(inputPortName)) {
            return getEtripWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:EtripWS", "EtripWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:EtripWS", "EtripWS"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {

        if ("EtripWS".equals(portName)) {
            setEtripWSEndpointAddress(address);
        }
        else
        { // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
