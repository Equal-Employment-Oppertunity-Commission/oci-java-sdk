/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListRetentionRulesResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
     * request, provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     */
    private String opcClientRequestId;

    /**
     * Paginating a list of retention rules.
     * If the {@code opc-next-page} header appears in the response, it indicates that this is a partial list
     * of retention rules and there are additional rules to get. Include the value of this header as
     * the {@code page} parameter in a subsequent GET request to get the next set of retention rules.
     * Repeat this process to retrieve the entire list of retention rules.
     * <p>
     * For more details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    /**
     * The returned RetentionRuleCollection instance.
     */
    private com.oracle.bmc.objectstorage.model.RetentionRuleCollection retentionRuleCollection;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcClientRequestId",
        "opcNextPage",
        "retentionRuleCollection"
    })
    private ListRetentionRulesResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcClientRequestId,
            String opcNextPage,
            com.oracle.bmc.objectstorage.model.RetentionRuleCollection retentionRuleCollection) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcClientRequestId = opcClientRequestId;
        this.opcNextPage = opcNextPage;
        this.retentionRuleCollection = retentionRuleCollection;
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
        public Builder copy(ListRetentionRulesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcClientRequestId(o.getOpcClientRequestId());
            opcNextPage(o.getOpcNextPage());
            retentionRuleCollection(o.getRetentionRuleCollection());

            return this;
        }

        public ListRetentionRulesResponse build() {
            return new ListRetentionRulesResponse(
                    __httpStatusCode__,
                    opcRequestId,
                    opcClientRequestId,
                    opcNextPage,
                    retentionRuleCollection);
        }
    }
}
