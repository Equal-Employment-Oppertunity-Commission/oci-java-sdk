/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.autoscaling.responses;

import com.oracle.bmc.autoscaling.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ChangeAutoScalingConfigurationCompartmentResponse {

    /**
     * The resulting etag of the autoscaling configuration affected by this operation.
     * For optimistic concurrency control. See `if-match`.
     *
     */
    private String etag;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ChangeAutoScalingConfigurationCompartmentResponse o) {
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());

            return this;
        }
    }
}
