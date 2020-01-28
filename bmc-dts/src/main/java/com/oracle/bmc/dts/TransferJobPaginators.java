/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dts;

import com.oracle.bmc.dts.requests.*;
import com.oracle.bmc.dts.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of TransferJob where multiple pages of data may be fetched.
 * Two styles of iteration are supported:
 *
 * <ul>
 *   <li>Iterating over the Response objects returned by the list operation. These are referred to as ResponseIterators, and the methods are suffixed with ResponseIterator. For example: <i>listUsersResponseIterator</i></li>
 *   <li>Iterating over the resources/records being listed. These are referred to as RecordIterators, and the methods are suffixed with RecordIterator. For example: <i>listUsersRecordIterator</i></li>
 * </ul>
 *
 * These iterables abstract away the need to write code to manually handle pagination via looping and using the page tokens.
 * They will automatically fetch more data from the service when required.
 *
 * As an example, if we were using the ListUsers operation in IdentityService, then the {@link java.lang.Iterable} returned by calling a
 * ResponseIterator method would iterate over the ListUsersResponse objects returned by each ListUsers call, whereas the {@link java.lang.Iterable}
 * returned by calling a RecordIterator method would iterate over the User records and we don't have to deal with ListUsersResponse objects at all.
 * In either case, pagination will be automatically handled so we can iterate until there are no more responses or no more resources/records available.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.014")
@lombok.RequiredArgsConstructor
public class TransferJobPaginators {
    private final TransferJob client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listTransferJobs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTransferJobsResponse> listTransferJobsResponseIterator(
            final ListTransferJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTransferJobsRequest.Builder, ListTransferJobsRequest, ListTransferJobsResponse>(
                new com.google.common.base.Supplier<ListTransferJobsRequest.Builder>() {
                    @Override
                    public ListTransferJobsRequest.Builder get() {
                        return ListTransferJobsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTransferJobsResponse, String>() {
                    @Override
                    public String apply(ListTransferJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTransferJobsRequest.Builder>,
                        ListTransferJobsRequest>() {
                    @Override
                    public ListTransferJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTransferJobsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListTransferJobsRequest, ListTransferJobsResponse>() {
                    @Override
                    public ListTransferJobsResponse apply(ListTransferJobsRequest request) {
                        return client.listTransferJobs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dts.model.TransferJobSummary} objects
     * contained in responses from the listTransferJobs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dts.model.TransferJobSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dts.model.TransferJobSummary> listTransferJobsRecordIterator(
            final ListTransferJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTransferJobsRequest.Builder, ListTransferJobsRequest, ListTransferJobsResponse,
                com.oracle.bmc.dts.model.TransferJobSummary>(
                new com.google.common.base.Supplier<ListTransferJobsRequest.Builder>() {
                    @Override
                    public ListTransferJobsRequest.Builder get() {
                        return ListTransferJobsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTransferJobsResponse, String>() {
                    @Override
                    public String apply(ListTransferJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTransferJobsRequest.Builder>,
                        ListTransferJobsRequest>() {
                    @Override
                    public ListTransferJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTransferJobsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListTransferJobsRequest, ListTransferJobsResponse>() {
                    @Override
                    public ListTransferJobsResponse apply(ListTransferJobsRequest request) {
                        return client.listTransferJobs(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTransferJobsResponse,
                        java.util.List<com.oracle.bmc.dts.model.TransferJobSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dts.model.TransferJobSummary> apply(
                            ListTransferJobsResponse response) {
                        return response.getItems();
                    }
                });
    }
}
