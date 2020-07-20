package tr.havelsan.ueransim.ngap0.ies.sequences;

import tr.havelsan.ueransim.ngap0.core.*;
import tr.havelsan.ueransim.ngap0.ies.choices.*;
import tr.havelsan.ueransim.ngap0.ies.enumerations.*;

public class NGAP_QosFlowLevelQosParameters extends NGAP_Sequence {

    public NGAP_QosCharacteristics qosCharacteristics;
    public NGAP_AllocationAndRetentionPriority allocationAndRetentionPriority;
    public NGAP_GBR_QosInformation gBR_QosInformation;
    public NGAP_ReflectiveQosAttribute reflectiveQosAttribute;
    public NGAP_AdditionalQosFlowInformation additionalQosFlowInformation;

    @Override
    public String getAsnName() {
        return "QosFlowLevelQosParameters";
    }

    @Override
    public String getXmlTagName() {
        return "QosFlowLevelQosParameters";
    }

    @Override
    public String[] getMemberNames() {
        return new String[]{"qosCharacteristics", "allocationAndRetentionPriority", "gBR-QosInformation", "reflectiveQosAttribute", "additionalQosFlowInformation"};
    }

    @Override
    public String[] getMemberIdentifiers() {
        return new String[]{"qosCharacteristics", "allocationAndRetentionPriority", "gBR_QosInformation", "reflectiveQosAttribute", "additionalQosFlowInformation"};
    }
}
