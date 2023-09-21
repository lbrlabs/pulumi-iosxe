// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRadiusServerAttributeAttribute31Parameter {
    private String callingStationId;
    private String idMacFormat;
    private String idMacLuCase;
    private Boolean idSendMacOnly;
    private Boolean idSendNasPortDetail;

    private GetRadiusServerAttributeAttribute31Parameter() {}
    public String callingStationId() {
        return this.callingStationId;
    }
    public String idMacFormat() {
        return this.idMacFormat;
    }
    public String idMacLuCase() {
        return this.idMacLuCase;
    }
    public Boolean idSendMacOnly() {
        return this.idSendMacOnly;
    }
    public Boolean idSendNasPortDetail() {
        return this.idSendNasPortDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRadiusServerAttributeAttribute31Parameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String callingStationId;
        private String idMacFormat;
        private String idMacLuCase;
        private Boolean idSendMacOnly;
        private Boolean idSendNasPortDetail;
        public Builder() {}
        public Builder(GetRadiusServerAttributeAttribute31Parameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callingStationId = defaults.callingStationId;
    	      this.idMacFormat = defaults.idMacFormat;
    	      this.idMacLuCase = defaults.idMacLuCase;
    	      this.idSendMacOnly = defaults.idSendMacOnly;
    	      this.idSendNasPortDetail = defaults.idSendNasPortDetail;
        }

        @CustomType.Setter
        public Builder callingStationId(String callingStationId) {
            this.callingStationId = Objects.requireNonNull(callingStationId);
            return this;
        }
        @CustomType.Setter
        public Builder idMacFormat(String idMacFormat) {
            this.idMacFormat = Objects.requireNonNull(idMacFormat);
            return this;
        }
        @CustomType.Setter
        public Builder idMacLuCase(String idMacLuCase) {
            this.idMacLuCase = Objects.requireNonNull(idMacLuCase);
            return this;
        }
        @CustomType.Setter
        public Builder idSendMacOnly(Boolean idSendMacOnly) {
            this.idSendMacOnly = Objects.requireNonNull(idSendMacOnly);
            return this;
        }
        @CustomType.Setter
        public Builder idSendNasPortDetail(Boolean idSendNasPortDetail) {
            this.idSendNasPortDetail = Objects.requireNonNull(idSendNasPortDetail);
            return this;
        }
        public GetRadiusServerAttributeAttribute31Parameter build() {
            final var o = new GetRadiusServerAttributeAttribute31Parameter();
            o.callingStationId = callingStationId;
            o.idMacFormat = idMacFormat;
            o.idMacLuCase = idMacLuCase;
            o.idSendMacOnly = idSendMacOnly;
            o.idSendNasPortDetail = idSendNasPortDetail;
            return o;
        }
    }
}