package tr.havelsan.ueransim.ngap0.msg;

import tr.havelsan.ueransim.ngap0.core.*;
import tr.havelsan.ueransim.ngap0.NgapMessageType;
import tr.havelsan.ueransim.ngap0.ies.octet_strings.*;

public class NGAP_DownlinkNonUEAssociatedNRPPaTransport extends NGAP_BaseMessage {

    public NGAP_DownlinkNonUEAssociatedNRPPaTransport() {

    }

    @Override
    public NgapMessageType getMessageType() {
        return NgapMessageType.DownlinkNonUEAssociatedNRPPaTransport;
    }

    @Override
    public int getCriticality() {
        return 1;
    }

    @Override
    public int getProcedureCode() {
        return 5;
    }

    @Override
    public int getPduType() {
        return 0;
    }

    @Override
    public int[] getIeId() {
        return new int[]{89, 46};
    }

    @Override
    public int[] getIeCriticality() {
        return new int[]{0, 0};
    }

    @Override
    public Class<? extends NGAP_Value>[] getIeTypes() {
        return new Class[]{NGAP_RoutingID.class, NGAP_NRPPa_PDU.class};
    }

    @Override
    public int[] getIePresence() {
        return new int[]{2, 2};
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
        return "DownlinkNonUEAssociatedNRPPaTransport";
    }

    @Override
    public String getXmlTagName() {
        return "DownlinkNonUEAssociatedNRPPaTransport";
    }

}
