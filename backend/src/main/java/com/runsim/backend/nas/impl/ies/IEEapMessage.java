package com.runsim.backend.nas.impl.ies;

import com.runsim.backend.nas.EapDecoder;
import com.runsim.backend.nas.EapEncoder;
import com.runsim.backend.nas.core.ies.InformationElement6;
import com.runsim.backend.nas.eap.Eap;
import com.runsim.backend.utils.OctetInputStream;
import com.runsim.backend.utils.OctetOutputStream;

public class IEEapMessage extends InformationElement6 {
    public Eap eap;

    public IEEapMessage() {
    }

    public IEEapMessage(Eap eap) {
        this.eap = eap;
    }

    @Override
    protected IEEapMessage decodeIE6(OctetInputStream stream, int length) {
        var res = new IEEapMessage();
        res.eap = EapDecoder.eapPdu(stream);
        return res;
    }

    @Override
    public void encodeIE6(OctetOutputStream stream) {
        EapEncoder.eapPdu(stream, eap);
    }
}
