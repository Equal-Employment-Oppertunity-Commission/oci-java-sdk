/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * The IP rate limiting configuration. Defines the amount of allowed requests from a unique IP address and the resulting block response code when that threshold is exceeded.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AddressRateLimiting.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AddressRateLimiting {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allowedRatePerAddress")
        private Integer allowedRatePerAddress;

        public Builder allowedRatePerAddress(Integer allowedRatePerAddress) {
            this.allowedRatePerAddress = allowedRatePerAddress;
            this.__explicitlySet__.add("allowedRatePerAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxDelayedCountPerAddress")
        private Integer maxDelayedCountPerAddress;

        public Builder maxDelayedCountPerAddress(Integer maxDelayedCountPerAddress) {
            this.maxDelayedCountPerAddress = maxDelayedCountPerAddress;
            this.__explicitlySet__.add("maxDelayedCountPerAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockResponseCode")
        private Integer blockResponseCode;

        public Builder blockResponseCode(Integer blockResponseCode) {
            this.blockResponseCode = blockResponseCode;
            this.__explicitlySet__.add("blockResponseCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddressRateLimiting build() {
            AddressRateLimiting __instance__ =
                    new AddressRateLimiting(
                            isEnabled,
                            allowedRatePerAddress,
                            maxDelayedCountPerAddress,
                            blockResponseCode);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddressRateLimiting o) {
            Builder copiedBuilder =
                    isEnabled(o.getIsEnabled())
                            .allowedRatePerAddress(o.getAllowedRatePerAddress())
                            .maxDelayedCountPerAddress(o.getMaxDelayedCountPerAddress())
                            .blockResponseCode(o.getBlockResponseCode());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Enables or disables the address rate limiting Web Application Firewall feature.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    Boolean isEnabled;

    /**
     * The number of allowed requests per second from one IP address. If unspecified, defaults to {@code 1}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedRatePerAddress")
    Integer allowedRatePerAddress;

    /**
     * The maximum number of requests allowed to be queued before subsequent requests are dropped. If unspecified, defaults to {@code 10}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxDelayedCountPerAddress")
    Integer maxDelayedCountPerAddress;

    /**
     * The response status code returned when a request is blocked. If unspecified, defaults to {@code 503}. The list of available response codes: {@code 400}, {@code 401}, {@code 403}, {@code 404}, {@code 405}, {@code 408}, {@code 409}, {@code 411}, {@code 412}, {@code 413}, {@code 414}, {@code 415}, {@code 416}, {@code 422}, {@code 494}, {@code 495}, {@code 496}, {@code 497}, {@code 499}, {@code 500}, {@code 501}, {@code 502}, {@code 503}, {@code 504}, {@code 507}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockResponseCode")
    Integer blockResponseCode;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
