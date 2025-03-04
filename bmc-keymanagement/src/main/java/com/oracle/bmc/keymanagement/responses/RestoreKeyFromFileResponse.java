/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.responses;

import com.oracle.bmc.keymanagement.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class RestoreKeyFromFileResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     */
    private String etag;

    /**
     * The base64-encoded MD5 hash value of the request body, as computed
     * by the server.
     *
     */
    private String opcContentMd5;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the work request, used to track the progress of the
     * restore operation.
     *
     */
    private String opcWorkRequestId;

    /**
     * The returned Key instance.
     */
    private com.oracle.bmc.keymanagement.model.Key key;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "opcContentMd5",
        "opcRequestId",
        "opcWorkRequestId",
        "key"
    })
    private RestoreKeyFromFileResponse(
            int __httpStatusCode__,
            String etag,
            String opcContentMd5,
            String opcRequestId,
            String opcWorkRequestId,
            com.oracle.bmc.keymanagement.model.Key key) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcContentMd5 = opcContentMd5;
        this.opcRequestId = opcRequestId;
        this.opcWorkRequestId = opcWorkRequestId;
        this.key = key;
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
        public Builder copy(RestoreKeyFromFileResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcContentMd5(o.getOpcContentMd5());
            opcRequestId(o.getOpcRequestId());
            opcWorkRequestId(o.getOpcWorkRequestId());
            key(o.getKey());

            return this;
        }

        public RestoreKeyFromFileResponse build() {
            return new RestoreKeyFromFileResponse(
                    __httpStatusCode__, etag, opcContentMd5, opcRequestId, opcWorkRequestId, key);
        }
    }
}
