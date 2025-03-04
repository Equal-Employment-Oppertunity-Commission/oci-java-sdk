/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Phase Two Parameters
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DefaultPhaseTwoParameters.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DefaultPhaseTwoParameters {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("defaultEncryptionAlgorithms")
        private java.util.List<String> defaultEncryptionAlgorithms;

        public Builder defaultEncryptionAlgorithms(
                java.util.List<String> defaultEncryptionAlgorithms) {
            this.defaultEncryptionAlgorithms = defaultEncryptionAlgorithms;
            this.__explicitlySet__.add("defaultEncryptionAlgorithms");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultAuthenticationAlgorithms")
        private java.util.List<String> defaultAuthenticationAlgorithms;

        public Builder defaultAuthenticationAlgorithms(
                java.util.List<String> defaultAuthenticationAlgorithms) {
            this.defaultAuthenticationAlgorithms = defaultAuthenticationAlgorithms;
            this.__explicitlySet__.add("defaultAuthenticationAlgorithms");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultPfsDhGroup")
        private String defaultPfsDhGroup;

        public Builder defaultPfsDhGroup(String defaultPfsDhGroup) {
            this.defaultPfsDhGroup = defaultPfsDhGroup;
            this.__explicitlySet__.add("defaultPfsDhGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DefaultPhaseTwoParameters build() {
            DefaultPhaseTwoParameters __instance__ =
                    new DefaultPhaseTwoParameters(
                            defaultEncryptionAlgorithms,
                            defaultAuthenticationAlgorithms,
                            defaultPfsDhGroup);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DefaultPhaseTwoParameters o) {
            Builder copiedBuilder =
                    defaultEncryptionAlgorithms(o.getDefaultEncryptionAlgorithms())
                            .defaultAuthenticationAlgorithms(o.getDefaultAuthenticationAlgorithms())
                            .defaultPfsDhGroup(o.getDefaultPfsDhGroup());

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
     * Default Phase Two Encryption Algorithms
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultEncryptionAlgorithms")
    java.util.List<String> defaultEncryptionAlgorithms;

    /**
     * Default Phase Two Authentication Algorithms
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultAuthenticationAlgorithms")
    java.util.List<String> defaultAuthenticationAlgorithms;

    /**
     * Default PFS DH Group
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultPfsDhGroup")
    String defaultPfsDhGroup;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
