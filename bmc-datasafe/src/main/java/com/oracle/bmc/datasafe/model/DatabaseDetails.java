/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details of the database for the registration in Data Safe.
 * To choose applicable database type and infrastructure type refer to
 * https://confluence.oci.oraclecorp.com/display/DATASAFE/Target+V2+Design
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "databaseType",
    defaultImpl = DatabaseDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = InstalledDatabaseDetails.class,
        name = "INSTALLED_DATABASE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AutonomousDatabaseDetails.class,
        name = "AUTONOMOUS_DATABASE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DatabaseCloudServiceDetails.class,
        name = "DATABASE_CLOUD_SERVICE"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DatabaseDetails {

    /**
     * The infrastructure type the database is running on.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("infrastructureType")
    InfrastructureType infrastructureType;
}
