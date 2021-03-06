/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.customerinsights;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for CompletionOperationTypes.
 */
public enum CompletionOperationTypes {
    /** Enum value DoNothing. */
    DO_NOTHING("DoNothing"),

    /** Enum value DeleteFile. */
    DELETE_FILE("DeleteFile"),

    /** Enum value MoveFile. */
    MOVE_FILE("MoveFile");

    /** The actual serialized value for a CompletionOperationTypes instance. */
    private String value;

    CompletionOperationTypes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CompletionOperationTypes instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed CompletionOperationTypes object, or null if unable to parse.
     */
    @JsonCreator
    public static CompletionOperationTypes fromString(String value) {
        CompletionOperationTypes[] items = CompletionOperationTypes.values();
        for (CompletionOperationTypes item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
