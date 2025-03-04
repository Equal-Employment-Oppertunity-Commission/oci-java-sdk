/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * An attribute within a key, the attribute property is being deprecated.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = KeyAttribute.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class KeyAttribute {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("position")
        private Integer position;

        public Builder position(Integer position) {
            this.position = position;
            this.__explicitlySet__.add("position");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shapeField")
        private ShapeField shapeField;

        public Builder shapeField(ShapeField shapeField) {
            this.shapeField = shapeField;
            this.__explicitlySet__.add("shapeField");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("attribute")
        private ShapeField attribute;

        public Builder attribute(ShapeField attribute) {
            this.attribute = attribute;
            this.__explicitlySet__.add("attribute");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KeyAttribute build() {
            KeyAttribute __instance__ = new KeyAttribute(position, shapeField, attribute);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KeyAttribute o) {
            Builder copiedBuilder =
                    position(o.getPosition())
                            .shapeField(o.getShapeField())
                            .attribute(o.getAttribute());

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
     * The position of the attribute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("position")
    Integer position;

    @com.fasterxml.jackson.annotation.JsonProperty("shapeField")
    ShapeField shapeField;

    @com.fasterxml.jackson.annotation.JsonProperty("attribute")
    ShapeField attribute;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
