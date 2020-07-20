/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "NGAP-IEs"
 * 	found in "asn/NGAP-IEs.asn"
 * 	`asn1c -fcompound-names -findirect-choice -fno-include-deps -gen-PER -no-gen-OER -no-gen-example -D ngap -pdu=all`
 */

#include "NGAP_MultipleTNLInformation.h"

#include "NGAP_ProtocolExtensionContainer.h"
asn_TYPE_member_t asn_MBR_NGAP_MultipleTNLInformation_1[] = {
	{ ATF_NOFLAGS, 0, offsetof(struct NGAP_MultipleTNLInformation, tNLInformationList),
		(ASN_TAG_CLASS_CONTEXT | (0 << 2)),
		-1,	/* IMPLICIT tag at current level */
		&asn_DEF_NGAP_TNLInformationList,
		0,
		{ 0, 0, 0 },
		0, 0, /* No default value */
		"tNLInformationList"
		},
	{ ATF_POINTER, 1, offsetof(struct NGAP_MultipleTNLInformation, iE_Extensions),
		(ASN_TAG_CLASS_CONTEXT | (1 << 2)),
		-1,	/* IMPLICIT tag at current level */
		&asn_DEF_NGAP_ProtocolExtensionContainer_176P70,
		0,
		{ 0, 0, 0 },
		0, 0, /* No default value */
		"iE-Extensions"
		},
};
static const int asn_MAP_NGAP_MultipleTNLInformation_oms_1[] = { 1 };
static const ber_tlv_tag_t asn_DEF_NGAP_MultipleTNLInformation_tags_1[] = {
	(ASN_TAG_CLASS_UNIVERSAL | (16 << 2))
};
static const asn_TYPE_tag2member_t asn_MAP_NGAP_MultipleTNLInformation_tag2el_1[] = {
    { (ASN_TAG_CLASS_CONTEXT | (0 << 2)), 0, 0, 0 }, /* tNLInformationList */
    { (ASN_TAG_CLASS_CONTEXT | (1 << 2)), 1, 0, 0 } /* iE-Extensions */
};
asn_SEQUENCE_specifics_t asn_SPC_NGAP_MultipleTNLInformation_specs_1 = {
	sizeof(struct NGAP_MultipleTNLInformation),
	offsetof(struct NGAP_MultipleTNLInformation, _asn_ctx),
	asn_MAP_NGAP_MultipleTNLInformation_tag2el_1,
	2,	/* Count of tags in the map */
	asn_MAP_NGAP_MultipleTNLInformation_oms_1,	/* Optional members */
	1, 0,	/* Root/Additions */
	2,	/* First extension addition */
};
asn_TYPE_descriptor_t asn_DEF_NGAP_MultipleTNLInformation = {
	"MultipleTNLInformation",
	"MultipleTNLInformation",
	&asn_OP_SEQUENCE,
	asn_DEF_NGAP_MultipleTNLInformation_tags_1,
	sizeof(asn_DEF_NGAP_MultipleTNLInformation_tags_1)
		/sizeof(asn_DEF_NGAP_MultipleTNLInformation_tags_1[0]), /* 1 */
	asn_DEF_NGAP_MultipleTNLInformation_tags_1,	/* Same as above */
	sizeof(asn_DEF_NGAP_MultipleTNLInformation_tags_1)
		/sizeof(asn_DEF_NGAP_MultipleTNLInformation_tags_1[0]), /* 1 */
	{ 0, 0, SEQUENCE_constraint },
	asn_MBR_NGAP_MultipleTNLInformation_1,
	2,	/* Elements count */
	&asn_SPC_NGAP_MultipleTNLInformation_specs_1	/* Additional specs */
};

