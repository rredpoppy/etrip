/**
 * EtripWSBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package EtripWS_pkg;

public class EtripWSBindingStub extends org.apache.axis.client.Stub implements EtripWS_pkg.EtripWS_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[12];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PackageSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PackageSearchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Etrip.Types", "PackageSearch"), Types.Etrip.PackageSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfResult"));
        oper.setReturnClass(Types.Etrip.Result[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "PackageSearchResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("HotelSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "HotelSearchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Etrip.Types", "HotelSearch"), Types.Etrip.HotelSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfResult"));
        oper.setReturnClass(Types.Etrip.Result[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "HotelSearchResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FlightSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FlightSearchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Etrip.Types", "FlightSearch"), Types.Etrip.FlightSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfResult"));
        oper.setReturnClass(Types.Etrip.Result[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "FlightSearchResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AllHotelsSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "AllHotelsSearchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Etrip.Types", "AllHotelsSearch"), Types.Etrip.AllHotelsSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfResult"));
        oper.setReturnClass(Types.Etrip.Result[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "AllHotelsSearchResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetHotels");
        oper.setReturnType(new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfHotel"));
        oper.setReturnClass(Types.Etrip.Hotel[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "GetHotelsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGeography");
        oper.setReturnType(new javax.xml.namespace.QName("urn:Etrip.Types", "Geography"));
        oper.setReturnClass(Types.Etrip.Geography.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "GetGeographyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPackages");
        oper.setReturnType(new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfPackageInfo"));
        oper.setReturnClass(Types.Etrip.PackageInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "GetPackagesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Book");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "BookRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Etrip.Types", "BookRequest"), Types.Etrip.BookRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Etrip.Types", "Booking"));
        oper.setReturnClass(Types.Etrip.Booking.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "BookResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBooking");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "BookingRef"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Etrip.Types", "Booking"));
        oper.setReturnClass(Types.Etrip.Booking.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "GetBookingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SelectResult");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ResultIndex"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Etrip.Types", "Result"));
        oper.setReturnClass(Types.Etrip.Result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConfirmBooking");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "BookingRef"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Etrip.Types", "Booking"));
        oper.setReturnClass(Types.Etrip.Booking.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ConfirmBookingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDestinations");
        oper.setReturnType(new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfDestination"));
        oper.setReturnClass(Types.Etrip.Destination[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "GetDestinationsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

    }

    public EtripWSBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public EtripWSBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public EtripWSBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "AirlineCabin");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.AirlineCabin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "AllHotelsResult");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.AllHotelsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "AllHotelsSearch");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.AllHotelsSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "AllocationType");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.AllocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfBookingItem");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.BookingItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "BookingItem");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfDateTime");
            cachedSerQNames.add(qName);
            cls = java.util.Calendar[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfDestination");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.Destination[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "Destination");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfDetailedDescription");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.DetailedDescription[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "DetailedDescription");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfDiscountInfo");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.DiscountInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "DiscountInfo");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfExtraComponent");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.ExtraComponent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "ExtraComponent");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfFareRule");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.FareRule[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "FareRule");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfFileInfo");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.FileInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "FileInfo");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfGeography");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.Geography[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "Geography");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfHotel");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.Hotel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "Hotel");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfInt");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfJourney");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.Journey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "Journey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfLeg");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.Leg[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "Leg");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfMealPlan");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.MealPlan[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "MealPlan");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfPackageInfo");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.PackageInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "PackageInfo");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfPaxInfo");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.PaxInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "PaxInfo");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfPriceSet");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.PriceSet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "PriceSet");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfResult");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.Result[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "Result");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfRoom");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.Room[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "Room");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfRoomCategory");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.RoomCategory[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "RoomCategory");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfRoomInfo");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.RoomInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "RoomInfo");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfRoomPax");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.RoomPax[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "RoomPax");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfSpecialOffer");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.SpecialOffer[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "SpecialOffer");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "Booking");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.Booking.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "BookingItem");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.BookingItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "BookingItemStatus");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.BookingItemStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "BookingItemType");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.BookingItemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "BookOptionFlight");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.BookOptionFlight.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "BookOptionHotel");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.BookOptionHotel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "BookOptionPackage");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.BookOptionPackage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "BookRequest");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.BookRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "BookRequestStatus");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.BookRequestStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "BusResult");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.BusResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "Client");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.Client.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "Destination");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.Destination.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "DetailedDescription");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.DetailedDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "DiscountInfo");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.DiscountInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "ExtraComponent");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.ExtraComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "FareRule");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.FareRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "FileInfo");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.FileInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "FlightResult");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.FlightResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "FlightSearch");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.FlightSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "Gender");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.Gender.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "Geography");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.Geography.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "Hotel");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.Hotel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "HotelResult");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.HotelResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "HotelSearch");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.HotelSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "Journey");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.Journey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "Leg");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.Leg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "MealPlan");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.MealPlan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "PackageInfo");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.PackageInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "PackageResult");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.PackageResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "PackageSearch");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.PackageSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "PaxInfo");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.PaxInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "PaxType");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.PaxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "PriceInfo");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.PriceInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "PriceSet");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.PriceSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "Result");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "Room");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.Room.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "RoomCategory");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.RoomCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "RoomInfo");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.RoomInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "RoomPax");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.RoomPax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "SearchLeg");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.SearchLeg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "SpecialOffer");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.SpecialOffer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Etrip.Types", "TransferResult");
            cachedSerQNames.add(qName);
            cls = Types.Etrip.TransferResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public Types.Etrip.Result[] packageSearch(Types.Etrip.PackageSearch packageSearchRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:EtripWS#PackageSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:EtripWS", "PackageSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {packageSearchRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Types.Etrip.Result[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (Types.Etrip.Result[]) org.apache.axis.utils.JavaUtils.convert(_resp, Types.Etrip.Result[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Types.Etrip.Result[] hotelSearch(Types.Etrip.HotelSearch hotelSearchRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:EtripWS#HotelSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:EtripWS", "HotelSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {hotelSearchRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Types.Etrip.Result[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (Types.Etrip.Result[]) org.apache.axis.utils.JavaUtils.convert(_resp, Types.Etrip.Result[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Types.Etrip.Result[] flightSearch(Types.Etrip.FlightSearch flightSearchRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:EtripWS#FlightSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:EtripWS", "FlightSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {flightSearchRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Types.Etrip.Result[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (Types.Etrip.Result[]) org.apache.axis.utils.JavaUtils.convert(_resp, Types.Etrip.Result[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Types.Etrip.Result[] allHotelsSearch(Types.Etrip.AllHotelsSearch allHotelsSearchRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:EtripWS#AllHotelsSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:EtripWS", "AllHotelsSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {allHotelsSearchRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Types.Etrip.Result[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (Types.Etrip.Result[]) org.apache.axis.utils.JavaUtils.convert(_resp, Types.Etrip.Result[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Types.Etrip.Hotel[] getHotels() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:EtripWS#GetHotels");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:EtripWS", "GetHotels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Types.Etrip.Hotel[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (Types.Etrip.Hotel[]) org.apache.axis.utils.JavaUtils.convert(_resp, Types.Etrip.Hotel[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Types.Etrip.Geography getGeography() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:EtripWS#GetGeography");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:EtripWS", "GetGeography"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Types.Etrip.Geography) _resp;
            } catch (java.lang.Exception _exception) {
                return (Types.Etrip.Geography) org.apache.axis.utils.JavaUtils.convert(_resp, Types.Etrip.Geography.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Types.Etrip.PackageInfo[] getPackages() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:EtripWS#GetPackages");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:EtripWS", "GetPackages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Types.Etrip.PackageInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (Types.Etrip.PackageInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, Types.Etrip.PackageInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Types.Etrip.Booking book(Types.Etrip.BookRequest bookRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:EtripWS#Book");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:EtripWS", "Book"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bookRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Types.Etrip.Booking) _resp;
            } catch (java.lang.Exception _exception) {
                return (Types.Etrip.Booking) org.apache.axis.utils.JavaUtils.convert(_resp, Types.Etrip.Booking.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Types.Etrip.Booking getBooking(int bookingRef) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:EtripWS#GetBooking");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:EtripWS", "GetBooking"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(bookingRef)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Types.Etrip.Booking) _resp;
            } catch (java.lang.Exception _exception) {
                return (Types.Etrip.Booking) org.apache.axis.utils.JavaUtils.convert(_resp, Types.Etrip.Booking.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Types.Etrip.Result selectResult(int resultIndex) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:EtripWS#SelectResult");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:EtripWS", "SelectResult"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(resultIndex)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Types.Etrip.Result) _resp;
            } catch (java.lang.Exception _exception) {
                return (Types.Etrip.Result) org.apache.axis.utils.JavaUtils.convert(_resp, Types.Etrip.Result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Types.Etrip.Booking confirmBooking(int bookingRef) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:EtripWS#ConfirmBooking");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:EtripWS", "ConfirmBooking"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(bookingRef)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Types.Etrip.Booking) _resp;
            } catch (java.lang.Exception _exception) {
                return (Types.Etrip.Booking) org.apache.axis.utils.JavaUtils.convert(_resp, Types.Etrip.Booking.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Types.Etrip.Destination[] getDestinations() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:EtripWS#GetDestinations");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:EtripWS", "GetDestinations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Types.Etrip.Destination[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (Types.Etrip.Destination[]) org.apache.axis.utils.JavaUtils.convert(_resp, Types.Etrip.Destination[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
