package tr.havelsan.ueransim.ngap0.ies.choices;

import tr.havelsan.ueransim.ngap0.core.*;
import tr.havelsan.ueransim.ngap0.pdu.*;
import tr.havelsan.ueransim.utils.bits.*;
import tr.havelsan.ueransim.utils.octets.*;
import tr.havelsan.ueransim.ngap0.ies.bit_strings.*;
import tr.havelsan.ueransim.ngap0.ies.octet_strings.*;
import tr.havelsan.ueransim.ngap0.ies.printable_strings.*;
import tr.havelsan.ueransim.ngap0.ies.sequences.*;
import tr.havelsan.ueransim.ngap0.ies.sequence_ofs.*;
import tr.havelsan.ueransim.ngap0.ies.choices.*;
import tr.havelsan.ueransim.ngap0.ies.integers.*;
import tr.havelsan.ueransim.ngap0.ies.enumerations.*;

import java.util.List;

public class NGAP_UEIdentityIndexValue extends NGAP_Choice {

    public NGAP_BitString indexLength10;

    @Override
    public String getAsnName() {
        return "UEIdentityIndexValue";
    }

    @Override
    public String getXmlTagName() {
        return "UEIdentityIndexValue";
    }

    @Override
    public String[] getMemberNames() {
        return new String[]{"indexLength10"};
    }

    @Override
    public String[] getMemberIdentifiers() {
        return new String[]{"indexLength10"};
    }
}
