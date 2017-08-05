/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The workflow filter.
 */
public class WorkflowFilter {
    /**
     * The state of workflows. Possible values include: 'NotSpecified',
     * 'Completed', 'Enabled', 'Disabled', 'Deleted', 'Suspended'.
     */
    @JsonProperty(value = "state")
    private WorkflowState state;

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public WorkflowState state() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set
     * @return the WorkflowFilter object itself.
     */
    public WorkflowFilter withState(WorkflowState state) {
        this.state = state;
        return this;
    }

}