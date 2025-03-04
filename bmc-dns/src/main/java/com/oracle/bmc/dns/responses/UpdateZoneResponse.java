/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.responses;

import com.oracle.bmc.dns.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class UpdateZoneResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The current version of the resource, ending with a
     * representation-specific suffix. This value may be used in If-Match
     * and If-None-Match headers for later requests of the same resource.
     *
     */
    private String eTag;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the asynchronous request.
     * You can use this to query status of the asynchronous operation.
     *
     */
    private String opcWorkRequestId;

    /**
     * The returned Zone instance.
     */
    private com.oracle.bmc.dns.model.Zone zone;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "eTag",
        "opcRequestId",
        "opcWorkRequestId",
        "zone"
    })
    private UpdateZoneResponse(
            int __httpStatusCode__,
            String eTag,
            String opcRequestId,
            String opcWorkRequestId,
            com.oracle.bmc.dns.model.Zone zone) {
        super(__httpStatusCode__);
        this.eTag = eTag;
        this.opcRequestId = opcRequestId;
        this.opcWorkRequestId = opcWorkRequestId;
        this.zone = zone;
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
        public Builder copy(UpdateZoneResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            eTag(o.getETag());
            opcRequestId(o.getOpcRequestId());
            opcWorkRequestId(o.getOpcWorkRequestId());
            zone(o.getZone());

            return this;
        }

        public UpdateZoneResponse build() {
            return new UpdateZoneResponse(
                    __httpStatusCode__, eTag, opcRequestId, opcWorkRequestId, zone);
        }
    }
}
