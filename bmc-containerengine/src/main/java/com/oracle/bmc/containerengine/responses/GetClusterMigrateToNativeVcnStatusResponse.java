/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.responses;

import com.oracle.bmc.containerengine.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetClusterMigrateToNativeVcnStatusResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     */
    private String etag;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned ClusterMigrateToNativeVcnStatus instance.
     */
    private com.oracle.bmc.containerengine.model.ClusterMigrateToNativeVcnStatus
            clusterMigrateToNativeVcnStatus;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "opcRequestId",
        "clusterMigrateToNativeVcnStatus"
    })
    private GetClusterMigrateToNativeVcnStatusResponse(
            int __httpStatusCode__,
            String etag,
            String opcRequestId,
            com.oracle.bmc.containerengine.model.ClusterMigrateToNativeVcnStatus
                    clusterMigrateToNativeVcnStatus) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.clusterMigrateToNativeVcnStatus = clusterMigrateToNativeVcnStatus;
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
        public Builder copy(GetClusterMigrateToNativeVcnStatusResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            clusterMigrateToNativeVcnStatus(o.getClusterMigrateToNativeVcnStatus());

            return this;
        }

        public GetClusterMigrateToNativeVcnStatusResponse build() {
            return new GetClusterMigrateToNativeVcnStatusResponse(
                    __httpStatusCode__, etag, opcRequestId, clusterMigrateToNativeVcnStatus);
        }
    }
}
