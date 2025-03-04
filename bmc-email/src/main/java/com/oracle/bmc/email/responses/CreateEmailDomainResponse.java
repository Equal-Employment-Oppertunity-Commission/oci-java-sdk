/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.email.responses;

import com.oracle.bmc.email.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class CreateEmailDomainResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The full URI of the resource related to the request
     *
     */
    private String contentLocation;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    /**
     * The full URI of the resource related to the request
     *
     */
    private String location;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query status of the asynchronous operation.
     *
     */
    private String opcWorkRequestId;

    /**
     * The returned EmailDomain instance.
     */
    private com.oracle.bmc.email.model.EmailDomain emailDomain;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "contentLocation",
        "etag",
        "location",
        "opcRequestId",
        "opcWorkRequestId",
        "emailDomain"
    })
    private CreateEmailDomainResponse(
            int __httpStatusCode__,
            String contentLocation,
            String etag,
            String location,
            String opcRequestId,
            String opcWorkRequestId,
            com.oracle.bmc.email.model.EmailDomain emailDomain) {
        super(__httpStatusCode__);
        this.contentLocation = contentLocation;
        this.etag = etag;
        this.location = location;
        this.opcRequestId = opcRequestId;
        this.opcWorkRequestId = opcWorkRequestId;
        this.emailDomain = emailDomain;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateEmailDomainResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            contentLocation(o.getContentLocation());
            etag(o.getEtag());
            location(o.getLocation());
            opcRequestId(o.getOpcRequestId());
            opcWorkRequestId(o.getOpcWorkRequestId());
            emailDomain(o.getEmailDomain());

            return this;
        }

        public CreateEmailDomainResponse build() {
            return new CreateEmailDomainResponse(
                    __httpStatusCode__,
                    contentLocation,
                    etag,
                    location,
                    opcRequestId,
                    opcWorkRequestId,
                    emailDomain);
        }
    }
}
