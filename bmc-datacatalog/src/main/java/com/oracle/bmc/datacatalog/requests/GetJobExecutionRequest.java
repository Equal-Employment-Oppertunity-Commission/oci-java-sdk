/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class GetJobExecutionRequest extends com.oracle.bmc.requests.BmcRequest {

    /**
     * Unique catalog identifier.
     */
    private String catalogId;

    /**
     * Unique job key.
     */
    private String jobKey;

    /**
     * The key of the job execution.
     */
    private String jobExecutionKey;

    /**
     * Specifies the fields to return in a job execution response.
     *
     */
    private java.util.List<Fields> fields;

    /**
     * Specifies the fields to return in a job execution response.
     *
     **/
    public enum Fields {
        Key("key"),
        JobKey("jobKey"),
        JobType("jobType"),
        SubType("subType"),
        ParentKey("parentKey"),
        ScheduleInstanceKey("scheduleInstanceKey"),
        LifecycleState("lifecycleState"),
        TimeCreated("timeCreated"),
        TimeStarted("timeStarted"),
        TimeEnded("timeEnded"),
        ErrorCode("errorCode"),
        ErrorMessage("errorMessage"),
        ProcessKey("processKey"),
        ExternalUrl("externalUrl"),
        EventKey("eventKey"),
        DataEntityKey("dataEntityKey"),
        CreatedById("createdById"),
        UpdatedById("updatedById"),
        Properties("properties"),
        Uri("uri"),
        ;

        private final String value;
        private static java.util.Map<String, Fields> map;

        static {
            map = new java.util.HashMap<>();
            for (Fields v : Fields.values()) {
                map.put(v.getValue(), v);
            }
        }

        Fields(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Fields create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new RuntimeException("Invalid Fields: " + key);
        }
    };

    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public static class Builder {
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
        public Builder copy(GetJobExecutionRequest o) {
            catalogId(o.getCatalogId());
            jobKey(o.getJobKey());
            jobExecutionKey(o.getJobExecutionKey());
            fields(o.getFields());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetJobExecutionRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetJobExecutionRequest
         */
        public GetJobExecutionRequest build() {
            GetJobExecutionRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
