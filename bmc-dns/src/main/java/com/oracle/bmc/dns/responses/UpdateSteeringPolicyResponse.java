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
public class UpdateSteeringPolicyResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The current version of the resource, ending with a
     * representation-specific suffix. This value may be used in If-Match
     * and If-None-Match headers for later requests of the same resource.
     *
     */
    private String eTag;

    /**
     * The returned SteeringPolicy instance.
     */
    private com.oracle.bmc.dns.model.SteeringPolicy steeringPolicy;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "eTag",
        "steeringPolicy"
    })
    private UpdateSteeringPolicyResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String eTag,
            com.oracle.bmc.dns.model.SteeringPolicy steeringPolicy) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.eTag = eTag;
        this.steeringPolicy = steeringPolicy;
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
        public Builder copy(UpdateSteeringPolicyResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            eTag(o.getETag());
            steeringPolicy(o.getSteeringPolicy());

            return this;
        }

        public UpdateSteeringPolicyResponse build() {
            return new UpdateSteeringPolicyResponse(
                    __httpStatusCode__, opcRequestId, eTag, steeringPolicy);
        }
    }
}
