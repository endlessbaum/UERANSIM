package tr.havelsan.ueransim.ngap0.msg;

import tr.havelsan.ueransim.ngap0.core.*;
import tr.havelsan.ueransim.ngap0.NgapMessageType;
import tr.havelsan.ueransim.ngap0.ies.choices.*;
import tr.havelsan.ueransim.ngap0.ies.integers.*;

public class NGAP_HandoverNotify extends NGAP_BaseMessage {

    public NGAP_HandoverNotify() {

    }

    @Override
    public NgapMessageType getMessageType() {
        return NgapMessageType.HandoverNotify;
    }

    @Override
    public int getCriticality() {
        return 1;
    }

    @Override
    public int getProcedureCode() {
        return 11;
    }

    @Override
    public int getPduType() {
        return 0;
    }

    @Override
    public int[] getIeId() {
        return new int[]{10, 85, 121};
    }

    @Override
    public int[] getIeCriticality() {
        return new int[]{0, 0, 1};
    }

    @Override
    public Class<? extends NGAP_Value>[] getIeTypes() {
        return new Class[]{NGAP_AMF_UE_NGAP_ID.class, NGAP_RAN_UE_NGAP_ID.class, NGAP_UserLocationInformation.class};
    }

    @Override
    public int[] getIePresence() {
        return new int[]{2, 2, 0};
    }

    @Override
    public String[] getMemberIdentifiers() {
        return new String[]{"protocolIEs"};
    }

    @Override
    public String[] getMemberNames() {
        return new String[]{"protocolIEs"};
    }

    @Override
    public String getAsnName() {
        return "HandoverNotify";
    }

    @Override
    public String getXmlTagName() {
        return "HandoverNotify";
    }

}
