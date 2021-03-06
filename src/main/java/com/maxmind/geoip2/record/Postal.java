/**
 *
 */
package com.maxmind.geoip2.record;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <p>
 * Contains data for the postal record associated with an IP address.
 * </p>
 * <p>
 * This record is returned by all the end points except the Country end point.
 * </p>
 */
public final class Postal {
    @JsonProperty
    private String code;

    @JsonProperty
    private Integer confidence;

    /**
     * @return The postal code of the location. Postal codes are not available
     * for all countries. In some countries, this will only contain part
     * of the postal code. This attribute is returned by all end points
     * except the Country end point.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return A value from 0-100 indicating MaxMind's confidence that the
     * postal code is correct. This attribute is only available from the
     * Insights end point.
     */
    public Integer getConfidence() {
        return this.confidence;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return this.code != null ? this.code : "";
    }
}
