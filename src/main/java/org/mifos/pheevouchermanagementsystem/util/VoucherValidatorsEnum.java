package org.mifos.pheevouchermanagementsystem.util;

import org.mifos.connector.common.exception.PaymentHubErrorCategory;
import org.mifos.connector.common.validation.ValidationCodeType;

public enum VoucherValidatorsEnum implements ValidationCodeType {

    VOUCHER_HEADER_VALIDATION_ERROR("error.msg.header.validation.errors", "The headers are invalid"), VOUCHER_SCHEMA_VALIDATION_ERROR(
            "error.msg.schema.validation.errors",
            "The request is invalid"), INVALID_CALLBACK_URL("error.msg.schema.callback.url.cannot.be.null.or.empty",
                    "Callback URL cannot be null or empty"), INVALID_REGISTERING_INSTITUTION_ID(
                            "error.msg.schema.registering.institution.id.cannot.be.null.or.empty",
                            "Registering Institution Id cannot be null or empty"), INVALID_REQUEST_ID(
                                    "error.msg.schema.request.id.cannot.be.null.or.empty",
                                    "Request Id cannot be null or empty"), INVALID_REQUEST_ID_LENGTH(
                                            "error.msg.schema.request.id.length.is.invalid",
                                            "Request Id length is invalid"), INVALID_BATCH_ID(
                                                    "error.msg.schema.batch.id.cannot.be.null.or.empty",
                                                    "Batch Id cannot be null or empty"), INVALID_BATCH_ID_LENGTH(
                                                            "error.msg.schema.batch.id.length.is.invalid", "Batch Id length is invalid"),

    INVALID_VOUCHER_INSTRUCTIONS("error.msg.schema.voucher.instructions.cannot.be.null.or.empty",
            "Voucher instructions cannot be null or empty"), INVALID_INSTRUCTION_ID(
                    "error.msg.schema.instruction.id.cannot.be.null.or.empty",
                    "Instruction ID cannot be null or empty"), INVALID_INSTRUCTION_ID_LENGTH(
                            "error.msg.schema.instruction.id.length.is.invalid", "Instruction ID length is invalid"),

    INVALID_GROUP_CODE("error.msg.schema.group.code.cannot.be.null.or.empty",
            "Group Code cannot be null or empty"), INVALID_GROUP_CODE_LENGTH("error.msg.schema.group.code.length.is.invalid",
                    "Group Code length is invalid"),

    INVALID_CURRENCY("error.msg.schema.currency.cannot.be.null.or.empty", "Currency cannot be null or empty"), INVALID_CURRENCY_LENGTH(
            "error.msg.schema.currency.length.is.invalid", "Currency length is invalid"),

    INVALID_AMOUNT("error.msg.schema.amount.cannot.be.null.or.empty", "Amount cannot be null or empty"), INVALID_NEGATIVE_AMOUNT(
            "error.msg.schema.amount.cannot.be.negative",
            "Amount cannot be negative"), INVALID_PAYEE_FUNCTIONAL_ID("error.msg.schema.payee.functional.id.cannot.be.null.or.empty",
                    "PayeeFunctional ID cannot be null or empty"), INVALID_PAYEE_FUNCTIONAL_ID_LENGTH(
                            "error.msg.schema.payee.functional.id.length.is.invalid",
                            "PayeeFunctional ID length is invalid"), INVALID_NARRATION_LENGTH(
                                    "error.msg.schema.narration.length.is.invalid", "Narration is invalid"), INVALID_LENGTH(
                                            "error.msg.schema.length.is.invalid", "Length is invalid"), INVALID_LIST(
                                                    "error.msg.schema.list.is.invalid", "List is invalid"), INVALID_MAX_LENGTH(
                                                            "error.msg.schema.max.length.cannot.exceed.50.words", "Cannot exceed 50 words");

    private final String code;
    private final String category;
    private final String message;

    VoucherValidatorsEnum(String code, String message) {
        this.code = code;
        this.category = PaymentHubErrorCategory.Validation.toString();
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public String getCategory() {
        return this.category;
    }

    public String getMessage() {
        return message;
    }
}
