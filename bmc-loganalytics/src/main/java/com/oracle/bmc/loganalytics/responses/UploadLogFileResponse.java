/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.responses;

import com.oracle.bmc.loganalytics.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class UploadLogFileResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The base-64 encoded MD5 hash of the request body as computed by the server.
     */
    private String opcContentMd5;

    /**
     * Unique Oracle-assigned identifier for log data.
     */
    private String opcObjectId;

    /**
     * The returned Upload instance.
     */
    private com.oracle.bmc.loganalytics.model.Upload upload;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcContentMd5",
        "opcObjectId",
        "upload"
    })
    private UploadLogFileResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcContentMd5,
            String opcObjectId,
            com.oracle.bmc.loganalytics.model.Upload upload) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcContentMd5 = opcContentMd5;
        this.opcObjectId = opcObjectId;
        this.upload = upload;
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
        public Builder copy(UploadLogFileResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcContentMd5(o.getOpcContentMd5());
            opcObjectId(o.getOpcObjectId());
            upload(o.getUpload());

            return this;
        }

        public UploadLogFileResponse build() {
            return new UploadLogFileResponse(
                    __httpStatusCode__, opcRequestId, opcContentMd5, opcObjectId, upload);
        }
    }
}
