package tr.havelsan.ueransim.core;

import tr.havelsan.ueransim.nas.impl.ies.IE5gGutiMobileIdentity;
import tr.havelsan.ueransim.nas.impl.ies.IESuciMobileIdentity;
import tr.havelsan.ueransim.utils.octets.OctetString;

public class UeData {
    public String snn;
    public OctetString key;
    public OctetString op;
    public OctetString amf;
    public String imei;
    public Supi supi;

    public OctetString sqn;

    public IESuciMobileIdentity storedSuci;
    public IE5gGutiMobileIdentity storedGuti;
}
