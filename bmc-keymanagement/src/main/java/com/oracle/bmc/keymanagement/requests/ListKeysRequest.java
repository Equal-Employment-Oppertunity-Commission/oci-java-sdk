/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.requests;

import com.oracle.bmc.keymanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/ListKeysExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListKeysRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListKeysRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the compartment.
     */
    private String compartmentId;

    /**
     * The maximum number of items to return in a paginated "List" call.
     *
     */
    private Integer limit;

    /**
     * The value of the {@code opc-next-page} response header
     * from the previous "List" call.
     *
     */
    private String page;

    /**
     * Unique identifier for the request. If provided, the returned request ID
     * will include this value. Otherwise, a random request ID will be
     * generated by the service.
     *
     */
    private String opcRequestId;

    /**
     * The field to sort by. You can specify only one sort order. The default
     * order for {@code TIMECREATED} is descending. The default order for {@code DISPLAYNAME}
     * is ascending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can specify only one sort order. The default
     * order for {@code TIMECREATED} is descending. The default order for {@code DISPLAYNAME}
     * is ascending.
     *
     **/
    public enum SortBy {
        Timecreated("TIMECREATED"),
        Displayname("DISPLAYNAME"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };
    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     **/
    public enum SortOrder {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };
    /**
     * A key's protection mode indicates how the key persists and where cryptographic operations that use the key are performed. A
     * protection mode of {@code HSM} means that the key persists on a hardware security module (HSM) and all cryptographic operations are
     * performed inside the HSM. A protection mode of {@code SOFTWARE} means that the key persists on the server, protected by the vault's
     * RSA wrapping key which persists on the HSM. All cryptographic operations that use a key with a protection mode of
     * {@code SOFTWARE} are performed on the server.
     *
     */
    private ProtectionMode protectionMode;

    /**
     * A key's protection mode indicates how the key persists and where cryptographic operations that use the key are performed. A
     * protection mode of {@code HSM} means that the key persists on a hardware security module (HSM) and all cryptographic operations are
     * performed inside the HSM. A protection mode of {@code SOFTWARE} means that the key persists on the server, protected by the vault's
     * RSA wrapping key which persists on the HSM. All cryptographic operations that use a key with a protection mode of
     * {@code SOFTWARE} are performed on the server.
     *
     **/
    public enum ProtectionMode {
        Hsm("HSM"),
        Software("SOFTWARE"),
        ;

        private final String value;
        private static java.util.Map<String, ProtectionMode> map;

        static {
            map = new java.util.HashMap<>();
            for (ProtectionMode v : ProtectionMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        ProtectionMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ProtectionMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ProtectionMode: " + key);
        }
    };
    /**
     * The algorithm used by a key's key versions to encrypt or decrypt data. Currently, support includes AES, RSA, and ECDSA algorithms.
     *
     */
    private Algorithm algorithm;

    /**
     * The algorithm used by a key's key versions to encrypt or decrypt data. Currently, support includes AES, RSA, and ECDSA algorithms.
     *
     **/
    public enum Algorithm {
        Aes("AES"),
        Rsa("RSA"),
        Ecdsa("ECDSA"),
        ;

        private final String value;
        private static java.util.Map<String, Algorithm> map;

        static {
            map = new java.util.HashMap<>();
            for (Algorithm v : Algorithm.values()) {
                map.put(v.getValue(), v);
            }
        }

        Algorithm(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Algorithm create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Algorithm: " + key);
        }
    };
    /**
     * The length of the key in bytes, expressed as an integer. Supported values include 16, 24, or 32.
     *
     */
    private Integer length;

    /**
     * The curve ID of the keys. (This pertains only to ECDSA keys.)
     *
     */
    private CurveId curveId;

    /**
     * The curve ID of the keys. (This pertains only to ECDSA keys.)
     *
     **/
    public enum CurveId {
        NistP256("NIST_P256"),
        NistP384("NIST_P384"),
        NistP521("NIST_P521"),
        ;

        private final String value;
        private static java.util.Map<String, CurveId> map;

        static {
            map = new java.util.HashMap<>();
            for (CurveId v : CurveId.values()) {
                map.put(v.getValue(), v);
            }
        }

        CurveId(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CurveId create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid CurveId: " + key);
        }
    };

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<ListKeysRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListKeysRequest o) {
            compartmentId(o.getCompartmentId());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            protectionMode(o.getProtectionMode());
            algorithm(o.getAlgorithm());
            length(o.getLength());
            curveId(o.getCurveId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListKeysRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListKeysRequest
         */
        public ListKeysRequest build() {
            ListKeysRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
