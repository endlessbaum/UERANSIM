/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "NGAP-IEs"
 * 	found in "asn/NGAP-IEs.asn"
 * 	`asn1c -fcompound-names -findirect-choice -fno-include-deps -gen-PER -no-gen-OER -no-gen-example -D ngap -pdu=all`
 */

#ifndef	_NGAP_AssistanceDataForPaging_H_
#define	_NGAP_AssistanceDataForPaging_H_


#include <asn_application.h>

/* Including external dependencies */
#include <constr_SEQUENCE.h>

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct NGAP_AssistanceDataForRecommendedCells;
struct NGAP_PagingAttemptInformation;
struct NGAP_ProtocolExtensionContainer;

/* NGAP_AssistanceDataForPaging */
typedef struct NGAP_AssistanceDataForPaging {
	struct NGAP_AssistanceDataForRecommendedCells	*assistanceDataForRecommendedCells;	/* OPTIONAL */
	struct NGAP_PagingAttemptInformation	*pagingAttemptInformation;	/* OPTIONAL */
	struct NGAP_ProtocolExtensionContainer	*iE_Extensions;	/* OPTIONAL */
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} NGAP_AssistanceDataForPaging_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_NGAP_AssistanceDataForPaging;
extern asn_SEQUENCE_specifics_t asn_SPC_NGAP_AssistanceDataForPaging_specs_1;
extern asn_TYPE_member_t asn_MBR_NGAP_AssistanceDataForPaging_1[3];

#ifdef __cplusplus
}
#endif

#endif	/* _NGAP_AssistanceDataForPaging_H_ */
#include <asn_internal.h>
