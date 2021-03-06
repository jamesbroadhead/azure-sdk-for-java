/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of the meter detail.
 */
public class MeterDetails {
    /**
     * The name of the meter, within the given meter category.
     */
    @JsonProperty(value = "meterName", access = JsonProperty.Access.WRITE_ONLY)
    private String meterName;

    /**
     * The category of the meter, for example, 'Cloud services', 'Networking',
     * etc..
     */
    @JsonProperty(value = "meterCategory", access = JsonProperty.Access.WRITE_ONLY)
    private String meterCategory;

    /**
     * The subcategory of the meter, for example, 'A6 Cloud services',
     * 'ExpressRoute (IXP)', etc..
     */
    @JsonProperty(value = "meterSubCategory", access = JsonProperty.Access.WRITE_ONLY)
    private String meterSubCategory;

    /**
     * The unit in which the meter consumption is charged, for example,
     * 'Hours', 'GB', etc.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private String unit;

    /**
     * The location in which the Azure service is available.
     */
    @JsonProperty(value = "meterLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String meterLocation;

    /**
     * The total included quantity associated with the offer.
     */
    @JsonProperty(value = "totalIncludedQuantity", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal totalIncludedQuantity;

    /**
     * The pretax listing price.
     */
    @JsonProperty(value = "pretaxStandardRate", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal pretaxStandardRate;

    /**
     * Get the meterName value.
     *
     * @return the meterName value
     */
    public String meterName() {
        return this.meterName;
    }

    /**
     * Get the meterCategory value.
     *
     * @return the meterCategory value
     */
    public String meterCategory() {
        return this.meterCategory;
    }

    /**
     * Get the meterSubCategory value.
     *
     * @return the meterSubCategory value
     */
    public String meterSubCategory() {
        return this.meterSubCategory;
    }

    /**
     * Get the unit value.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Get the meterLocation value.
     *
     * @return the meterLocation value
     */
    public String meterLocation() {
        return this.meterLocation;
    }

    /**
     * Get the totalIncludedQuantity value.
     *
     * @return the totalIncludedQuantity value
     */
    public BigDecimal totalIncludedQuantity() {
        return this.totalIncludedQuantity;
    }

    /**
     * Get the pretaxStandardRate value.
     *
     * @return the pretaxStandardRate value
     */
    public BigDecimal pretaxStandardRate() {
        return this.pretaxStandardRate;
    }

}
