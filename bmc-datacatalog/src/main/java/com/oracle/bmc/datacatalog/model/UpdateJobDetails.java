/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Job properties that can be updated.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UpdateJobDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateJobDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scheduleCronExpression")
        private String scheduleCronExpression;

        public Builder scheduleCronExpression(String scheduleCronExpression) {
            this.scheduleCronExpression = scheduleCronExpression;
            this.__explicitlySet__.add("scheduleCronExpression");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduleBegin")
        private java.util.Date timeScheduleBegin;

        public Builder timeScheduleBegin(java.util.Date timeScheduleBegin) {
            this.timeScheduleBegin = timeScheduleBegin;
            this.__explicitlySet__.add("timeScheduleBegin");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduleEnd")
        private java.util.Date timeScheduleEnd;

        public Builder timeScheduleEnd(java.util.Date timeScheduleEnd) {
            this.timeScheduleEnd = timeScheduleEnd;
            this.__explicitlySet__.add("timeScheduleEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionKey")
        private String connectionKey;

        public Builder connectionKey(String connectionKey) {
            this.connectionKey = connectionKey;
            this.__explicitlySet__.add("connectionKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateJobDetails build() {
            UpdateJobDetails __instance__ =
                    new UpdateJobDetails(
                            displayName,
                            description,
                            scheduleCronExpression,
                            timeScheduleBegin,
                            timeScheduleEnd,
                            connectionKey);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateJobDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .scheduleCronExpression(o.getScheduleCronExpression())
                            .timeScheduleBegin(o.getTimeScheduleBegin())
                            .timeScheduleEnd(o.getTimeScheduleEnd())
                            .connectionKey(o.getConnectionKey());

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
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Detailed description of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Schedule specified in the cron expression format that has seven fields for second, minute, hour, day-of-month, month, day-of-week, year.
     * It can also include special characters like * for all and ? for any. There are also pre-defined schedules that can be specified using
     * special strings. For example, @hourly will run the job every hour.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleCronExpression")
    String scheduleCronExpression;

    /**
     * Date that the schedule should be operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduleBegin")
    java.util.Date timeScheduleBegin;

    /**
     * Date that the schedule should end from being operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduleEnd")
    java.util.Date timeScheduleEnd;

    /**
     * The key of the connection resource that is used for the harvest by this job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionKey")
    String connectionKey;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
