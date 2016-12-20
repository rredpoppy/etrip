/**
 * EtripWS_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package EtripWS_pkg;

public interface EtripWS_Service extends javax.xml.rpc.Service {
    public java.lang.String getEtripWSAddress();

    public EtripWS_pkg.EtripWS_PortType getEtripWS() throws javax.xml.rpc.ServiceException;

    public EtripWS_pkg.EtripWS_PortType getEtripWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
