/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.responses;

import com.oracle.bmc.osmanagement.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class CreateSoftwareSourceResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * A link to the created Software Source
     */
    private String location;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    /**
     * The returned SoftwareSource instance.
     */
    private com.oracle.bmc.osmanagement.model.SoftwareSource softwareSource;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "location",
        "opcRequestId",
        "etag",
        "softwareSource"
    })
    private CreateSoftwareSourceResponse(
            int __httpStatusCode__,
            String location,
            String opcRequestId,
            String etag,
            com.oracle.bmc.osmanagement.model.SoftwareSource softwareSource) {
        super(__httpStatusCode__);
        this.location = location;
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.softwareSource = softwareSource;
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
        public Builder copy(CreateSoftwareSourceResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            location(o.getLocation());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            softwareSource(o.getSoftwareSource());

            return this;
        }

        public CreateSoftwareSourceResponse build() {
            return new CreateSoftwareSourceResponse(
                    __httpStatusCode__, location, opcRequestId, etag, softwareSource);
        }
    }
}
