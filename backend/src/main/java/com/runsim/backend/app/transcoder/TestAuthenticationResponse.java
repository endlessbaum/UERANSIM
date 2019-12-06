package com.runsim.backend.app.transcoder;

import com.runsim.backend.app.TranscoderTesting;
import com.runsim.backend.nas.core.messages.NasMessage;
import com.runsim.backend.nas.eap.*;
import com.runsim.backend.nas.impl.enums.EExtendedProtocolDiscriminator;
import com.runsim.backend.nas.impl.enums.EMessageType;
import com.runsim.backend.nas.impl.enums.ESecurityHeaderType;
import com.runsim.backend.nas.impl.ies.IEEapMessage;
import com.runsim.backend.nas.impl.messages.AuthenticationResponse;
import com.runsim.backend.utils.octets.Octet;
import com.runsim.backend.utils.octets.Octet2;
import com.runsim.backend.utils.octets.OctetString;

import java.util.LinkedHashMap;

public class TestAuthenticationResponse extends TranscoderTesting.PduTest {

    @Override
    public String getPdu() {
        return "7e005778003002010030320100000305000864955b0fe729127b00000000000000000b05000069f5f2af9798323126ef3cf8896a8c4b";
    }

    @Override
    public void compare(NasMessage message) {
        assertInstance(message, AuthenticationResponse.class);
        var mes = (AuthenticationResponse) message;
        assertEquals(mes.messageType, EMessageType.AUTHENTICATION_RESPONSE);
        assertEquals(mes.extendedProtocolDiscriminator, EExtendedProtocolDiscriminator.MOBILITY_MANAGEMENT_MESSAGES);
        assertEquals(mes.securityHeaderType, ESecurityHeaderType.NOT_PROTECTED);

        assertNull(mes.authenticationResponseParameter);
        assertNotNull(mes.eapMessage);
        assertNotNull(mes.eapMessage.eap);

        assertInstance(mes.eapMessage.eap, EapAkaPrime.class);
        assertEquals(mes.eapMessage.eap.code, EEapCode.RESPONSE);
        assertEquals(mes.eapMessage.eap.id, 1);
        assertEquals(mes.eapMessage.eap.length, 48);
        assertEquals(mes.eapMessage.eap.EAPType, EEapType.EAP_AKA_PRIME);

        var akaPrime = (EapAkaPrime) mes.eapMessage.eap;
        assertEquals(akaPrime.subType, EEapAkaSubType.AKA_CHALLENGE);
        assertEquals(akaPrime.attributes.size(), 2);
        assertEquals(akaPrime.attributes.get(EEapAkaAttributeType.AT_RES), new OctetString("000864955b0fe729127b0000000000000000"));
        assertEquals(akaPrime.attributes.get(EEapAkaAttributeType.AT_MAC), new OctetString("000069f5f2af9798323126ef3cf8896a8c4b"));
    }

    @Override
    public NasMessage getMessage() {
        var mes = new AuthenticationResponse();
        mes.messageType = EMessageType.AUTHENTICATION_RESPONSE;
        mes.extendedProtocolDiscriminator = EExtendedProtocolDiscriminator.MOBILITY_MANAGEMENT_MESSAGES;
        mes.securityHeaderType = ESecurityHeaderType.NOT_PROTECTED;

        mes.authenticationResponseParameter = null;
        mes.eapMessage = new IEEapMessage();
        var akaPrime = new EapAkaPrime();
        mes.eapMessage.eap = akaPrime;

        akaPrime.code = EEapCode.RESPONSE;
        akaPrime.id = new Octet(1);
        akaPrime.length = new Octet2(48);
        akaPrime.EAPType = EEapType.EAP_AKA_PRIME;
        akaPrime.subType = EEapAkaSubType.AKA_CHALLENGE;
        akaPrime.attributes = new LinkedHashMap<>();
        akaPrime.attributes.put(EEapAkaAttributeType.AT_RES, new OctetString("000864955b0fe729127b0000000000000000"));
        akaPrime.attributes.put(EEapAkaAttributeType.AT_MAC, new OctetString("000069f5f2af9798323126ef3cf8896a8c4b"));

        return mes;
    }
}
