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
public class GetQueryResultResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then additional items may be available on the next page of the list. Include this value as the {@code page} parameter for the
     * subsequent request to get the next batch of items.
     *
     */
    private String opcNextPage;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then additional items may be available on the previous page of the list. Include this value as the {@code page} parameter for the
     * subsequent request to get the previous batch of items.
     *
     */
    private String opcPrevPage;

    /**
     * A decimal number representing the number of seconds the client should wait before polling this endpoint again.
     */
    private Float retryAfter;

    /**
     * The returned QueryAggregation instance.
     */
    private com.oracle.bmc.loganalytics.model.QueryAggregation queryAggregation;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcNextPage",
        "opcPrevPage",
        "retryAfter",
        "queryAggregation"
    })
    private GetQueryResultResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcNextPage,
            String opcPrevPage,
            Float retryAfter,
            com.oracle.bmc.loganalytics.model.QueryAggregation queryAggregation) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.opcPrevPage = opcPrevPage;
        this.retryAfter = retryAfter;
        this.queryAggregation = queryAggregation;
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
        public Builder copy(GetQueryResultResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            opcPrevPage(o.getOpcPrevPage());
            retryAfter(o.getRetryAfter());
            queryAggregation(o.getQueryAggregation());

            return this;
        }

        public GetQueryResultResponse build() {
            return new GetQueryResultResponse(
                    __httpStatusCode__,
                    opcRequestId,
                    opcNextPage,
                    opcPrevPage,
                    retryAfter,
                    queryAggregation);
        }
    }
}
