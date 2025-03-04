/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Command descriptor for querylanguage GEOSTATS command.  This is similiar to STATS with some built in functions for City, State and Country by Coordinates.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GeoStatsCommandDescriptor.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "name"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class GeoStatsCommandDescriptor extends AbstractCommandDescriptor {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayQueryString")
        private String displayQueryString;

        public Builder displayQueryString(String displayQueryString) {
            this.displayQueryString = displayQueryString;
            this.__explicitlySet__.add("displayQueryString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("internalQueryString")
        private String internalQueryString;

        public Builder internalQueryString(String internalQueryString) {
            this.internalQueryString = internalQueryString;
            this.__explicitlySet__.add("internalQueryString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referencedFields")
        private java.util.List<AbstractField> referencedFields;

        public Builder referencedFields(java.util.List<AbstractField> referencedFields) {
            this.referencedFields = referencedFields;
            this.__explicitlySet__.add("referencedFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("declaredFields")
        private java.util.List<AbstractField> declaredFields;

        public Builder declaredFields(java.util.List<AbstractField> declaredFields) {
            this.declaredFields = declaredFields;
            this.__explicitlySet__.add("declaredFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("include")
        private Include include;

        public Builder include(Include include) {
            this.include = include;
            this.__explicitlySet__.add("include");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("groupByFields")
        private java.util.List<AbstractField> groupByFields;

        public Builder groupByFields(java.util.List<AbstractField> groupByFields) {
            this.groupByFields = groupByFields;
            this.__explicitlySet__.add("groupByFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("functions")
        private java.util.List<FunctionField> functions;

        public Builder functions(java.util.List<FunctionField> functions) {
            this.functions = functions;
            this.__explicitlySet__.add("functions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GeoStatsCommandDescriptor build() {
            GeoStatsCommandDescriptor __instance__ =
                    new GeoStatsCommandDescriptor(
                            displayQueryString,
                            internalQueryString,
                            category,
                            referencedFields,
                            declaredFields,
                            include,
                            groupByFields,
                            functions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GeoStatsCommandDescriptor o) {
            Builder copiedBuilder =
                    displayQueryString(o.getDisplayQueryString())
                            .internalQueryString(o.getInternalQueryString())
                            .category(o.getCategory())
                            .referencedFields(o.getReferencedFields())
                            .declaredFields(o.getDeclaredFields())
                            .include(o.getInclude())
                            .groupByFields(o.getGroupByFields())
                            .functions(o.getFunctions());

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

    @Deprecated
    public GeoStatsCommandDescriptor(
            String displayQueryString,
            String internalQueryString,
            String category,
            java.util.List<AbstractField> referencedFields,
            java.util.List<AbstractField> declaredFields,
            Include include,
            java.util.List<AbstractField> groupByFields,
            java.util.List<FunctionField> functions) {
        super(displayQueryString, internalQueryString, category, referencedFields, declaredFields);
        this.include = include;
        this.groupByFields = groupByFields;
        this.functions = functions;
    }

    /**
     * Indicates which coordinates to show.  Either client, server or both.  Defaults to client.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Include {
        Client("CLIENT"),
        Server("SERVER"),
        ClientAndServer("CLIENT_AND_SERVER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Include> map;

        static {
            map = new java.util.HashMap<>();
            for (Include v : Include.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Include(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Include create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Include', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates which coordinates to show.  Either client, server or both.  Defaults to client.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("include")
    Include include;

    /**
     * Group by fields if specified in the query string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupByFields")
    java.util.List<AbstractField> groupByFields;

    /**
     * Statistical functions specified in the query string. Atleast 1 is required for a GEOSTATS command.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("functions")
    java.util.List<FunctionField> functions;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
