// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetOspfVrfArea {
    /**
     * @return OSPF area ID
     * 
     */
    private String areaId;
    /**
     * @return Use message-digest authentication
     * 
     */
    private Boolean authenticationMessageDigest;
    /**
     * @return Specify a NSSA area
     * 
     */
    private Boolean nssa;
    /**
     * @return Originate Type 7 default into NSSA area
     * 
     */
    private Boolean nssaDefaultInformationOriginate;
    /**
     * @return OSPF default metric
     * 
     */
    private Integer nssaDefaultInformationOriginateMetric;
    /**
     * @return OSPF metric type for default routes
     * 
     */
    private Integer nssaDefaultInformationOriginateMetricType;
    /**
     * @return No redistribution into this NSSA area
     * 
     */
    private Boolean nssaNoRedistribution;
    /**
     * @return Do not send summary LSA into NSSA
     * 
     */
    private Boolean nssaNoSummary;

    private GetOspfVrfArea() {}
    /**
     * @return OSPF area ID
     * 
     */
    public String areaId() {
        return this.areaId;
    }
    /**
     * @return Use message-digest authentication
     * 
     */
    public Boolean authenticationMessageDigest() {
        return this.authenticationMessageDigest;
    }
    /**
     * @return Specify a NSSA area
     * 
     */
    public Boolean nssa() {
        return this.nssa;
    }
    /**
     * @return Originate Type 7 default into NSSA area
     * 
     */
    public Boolean nssaDefaultInformationOriginate() {
        return this.nssaDefaultInformationOriginate;
    }
    /**
     * @return OSPF default metric
     * 
     */
    public Integer nssaDefaultInformationOriginateMetric() {
        return this.nssaDefaultInformationOriginateMetric;
    }
    /**
     * @return OSPF metric type for default routes
     * 
     */
    public Integer nssaDefaultInformationOriginateMetricType() {
        return this.nssaDefaultInformationOriginateMetricType;
    }
    /**
     * @return No redistribution into this NSSA area
     * 
     */
    public Boolean nssaNoRedistribution() {
        return this.nssaNoRedistribution;
    }
    /**
     * @return Do not send summary LSA into NSSA
     * 
     */
    public Boolean nssaNoSummary() {
        return this.nssaNoSummary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOspfVrfArea defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String areaId;
        private Boolean authenticationMessageDigest;
        private Boolean nssa;
        private Boolean nssaDefaultInformationOriginate;
        private Integer nssaDefaultInformationOriginateMetric;
        private Integer nssaDefaultInformationOriginateMetricType;
        private Boolean nssaNoRedistribution;
        private Boolean nssaNoSummary;
        public Builder() {}
        public Builder(GetOspfVrfArea defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.areaId = defaults.areaId;
    	      this.authenticationMessageDigest = defaults.authenticationMessageDigest;
    	      this.nssa = defaults.nssa;
    	      this.nssaDefaultInformationOriginate = defaults.nssaDefaultInformationOriginate;
    	      this.nssaDefaultInformationOriginateMetric = defaults.nssaDefaultInformationOriginateMetric;
    	      this.nssaDefaultInformationOriginateMetricType = defaults.nssaDefaultInformationOriginateMetricType;
    	      this.nssaNoRedistribution = defaults.nssaNoRedistribution;
    	      this.nssaNoSummary = defaults.nssaNoSummary;
        }

        @CustomType.Setter
        public Builder areaId(String areaId) {
            this.areaId = Objects.requireNonNull(areaId);
            return this;
        }
        @CustomType.Setter
        public Builder authenticationMessageDigest(Boolean authenticationMessageDigest) {
            this.authenticationMessageDigest = Objects.requireNonNull(authenticationMessageDigest);
            return this;
        }
        @CustomType.Setter
        public Builder nssa(Boolean nssa) {
            this.nssa = Objects.requireNonNull(nssa);
            return this;
        }
        @CustomType.Setter
        public Builder nssaDefaultInformationOriginate(Boolean nssaDefaultInformationOriginate) {
            this.nssaDefaultInformationOriginate = Objects.requireNonNull(nssaDefaultInformationOriginate);
            return this;
        }
        @CustomType.Setter
        public Builder nssaDefaultInformationOriginateMetric(Integer nssaDefaultInformationOriginateMetric) {
            this.nssaDefaultInformationOriginateMetric = Objects.requireNonNull(nssaDefaultInformationOriginateMetric);
            return this;
        }
        @CustomType.Setter
        public Builder nssaDefaultInformationOriginateMetricType(Integer nssaDefaultInformationOriginateMetricType) {
            this.nssaDefaultInformationOriginateMetricType = Objects.requireNonNull(nssaDefaultInformationOriginateMetricType);
            return this;
        }
        @CustomType.Setter
        public Builder nssaNoRedistribution(Boolean nssaNoRedistribution) {
            this.nssaNoRedistribution = Objects.requireNonNull(nssaNoRedistribution);
            return this;
        }
        @CustomType.Setter
        public Builder nssaNoSummary(Boolean nssaNoSummary) {
            this.nssaNoSummary = Objects.requireNonNull(nssaNoSummary);
            return this;
        }
        public GetOspfVrfArea build() {
            final var o = new GetOspfVrfArea();
            o.areaId = areaId;
            o.authenticationMessageDigest = authenticationMessageDigest;
            o.nssa = nssa;
            o.nssaDefaultInformationOriginate = nssaDefaultInformationOriginate;
            o.nssaDefaultInformationOriginateMetric = nssaDefaultInformationOriginateMetric;
            o.nssaDefaultInformationOriginateMetricType = nssaDefaultInformationOriginateMetricType;
            o.nssaNoRedistribution = nssaNoRedistribution;
            o.nssaNoSummary = nssaNoSummary;
            return o;
        }
    }
}
