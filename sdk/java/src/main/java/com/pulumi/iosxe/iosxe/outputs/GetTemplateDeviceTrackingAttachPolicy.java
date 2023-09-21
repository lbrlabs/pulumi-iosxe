// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTemplateDeviceTrackingAttachPolicy {
    private String policyName;
    private String vlanRange;

    private GetTemplateDeviceTrackingAttachPolicy() {}
    public String policyName() {
        return this.policyName;
    }
    public String vlanRange() {
        return this.vlanRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTemplateDeviceTrackingAttachPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String policyName;
        private String vlanRange;
        public Builder() {}
        public Builder(GetTemplateDeviceTrackingAttachPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyName = defaults.policyName;
    	      this.vlanRange = defaults.vlanRange;
        }

        @CustomType.Setter
        public Builder policyName(String policyName) {
            this.policyName = Objects.requireNonNull(policyName);
            return this;
        }
        @CustomType.Setter
        public Builder vlanRange(String vlanRange) {
            this.vlanRange = Objects.requireNonNull(vlanRange);
            return this;
        }
        public GetTemplateDeviceTrackingAttachPolicy build() {
            final var o = new GetTemplateDeviceTrackingAttachPolicy();
            o.policyName = policyName;
            o.vlanRange = vlanRange;
            return o;
        }
    }
}
