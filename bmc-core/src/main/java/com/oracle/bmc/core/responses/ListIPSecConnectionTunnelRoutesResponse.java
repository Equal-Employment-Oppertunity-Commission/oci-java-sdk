/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.responses;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListIPSecConnectionTunnelRoutesResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For list pagination. When this header appears in the response, additional pages
     * of results remain. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For list pagination. A pagination token to get the total number of results available.
     *
     */
    private Integer opcTotalItems;

    /**
     * A list of com.oracle.bmc.core.model.TunnelRouteSummary instances.
     */
    private java.util.List<com.oracle.bmc.core.model.TunnelRouteSummary> items;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcNextPage",
        "opcRequestId",
        "opcTotalItems",
        "items"
    })
    private ListIPSecConnectionTunnelRoutesResponse(
            int __httpStatusCode__,
            String opcNextPage,
            String opcRequestId,
            Integer opcTotalItems,
            java.util.List<com.oracle.bmc.core.model.TunnelRouteSummary> items) {
        super(__httpStatusCode__);
        this.opcNextPage = opcNextPage;
        this.opcRequestId = opcRequestId;
        this.opcTotalItems = opcTotalItems;
        this.items = items;
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
        public Builder copy(ListIPSecConnectionTunnelRoutesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcNextPage(o.getOpcNextPage());
            opcRequestId(o.getOpcRequestId());
            opcTotalItems(o.getOpcTotalItems());
            items(o.getItems());

            return this;
        }

        public ListIPSecConnectionTunnelRoutesResponse build() {
            return new ListIPSecConnectionTunnelRoutesResponse(
                    __httpStatusCode__, opcNextPage, opcRequestId, opcTotalItems, items);
        }
    }
}
