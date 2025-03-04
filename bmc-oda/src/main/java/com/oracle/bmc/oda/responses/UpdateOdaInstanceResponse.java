/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.responses;

import com.oracle.bmc.oda.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class UpdateOdaInstanceResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For use in a PUT or DELETE {@code if-match} query parameter for optimistic concurrency control.
     */
    private String etag;

    /**
     * Unique Oracle-assigned identifier for the request. If you contact Oracle
     * about this request, provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned OdaInstance instance.
     */
    private com.oracle.bmc.oda.model.OdaInstance odaInstance;

    @java.beans.ConstructorProperties({"__httpStatusCode__", "etag", "opcRequestId", "odaInstance"})
    private UpdateOdaInstanceResponse(
            int __httpStatusCode__,
            String etag,
            String opcRequestId,
            com.oracle.bmc.oda.model.OdaInstance odaInstance) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.odaInstance = odaInstance;
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
        public Builder copy(UpdateOdaInstanceResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            odaInstance(o.getOdaInstance());

            return this;
        }

        public UpdateOdaInstanceResponse build() {
            return new UpdateOdaInstanceResponse(
                    __httpStatusCode__, etag, opcRequestId, odaInstance);
        }
    }
}
