/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Optional Pre-Migration advisor settings.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AdvisorSettings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AdvisorSettings {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isSkipAdvisor")
        private Boolean isSkipAdvisor;

        public Builder isSkipAdvisor(Boolean isSkipAdvisor) {
            this.isSkipAdvisor = isSkipAdvisor;
            this.__explicitlySet__.add("isSkipAdvisor");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isIgnoreErrors")
        private Boolean isIgnoreErrors;

        public Builder isIgnoreErrors(Boolean isIgnoreErrors) {
            this.isIgnoreErrors = isIgnoreErrors;
            this.__explicitlySet__.add("isIgnoreErrors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdvisorSettings build() {
            AdvisorSettings __instance__ = new AdvisorSettings(isSkipAdvisor, isIgnoreErrors);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdvisorSettings o) {
            Builder copiedBuilder =
                    isSkipAdvisor(o.getIsSkipAdvisor()).isIgnoreErrors(o.getIsIgnoreErrors());

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
     * True to skip the Pre-Migration Advisor execution. Default is false.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSkipAdvisor")
    Boolean isSkipAdvisor;

    /**
     * True to not interrupt migration execution due to Pre-Migration Advisor errors. Default is false.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIgnoreErrors")
    Boolean isIgnoreErrors;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
