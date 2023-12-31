// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TemplateDeviceTrackingAttachPolicy {
    private String policyName;
    private @Nullable String vlanRange;

    private TemplateDeviceTrackingAttachPolicy() {}
    public String policyName() {
        return this.policyName;
    }
    public Optional<String> vlanRange() {
        return Optional.ofNullable(this.vlanRange);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateDeviceTrackingAttachPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String policyName;
        private @Nullable String vlanRange;
        public Builder() {}
        public Builder(TemplateDeviceTrackingAttachPolicy defaults) {
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
        public Builder vlanRange(@Nullable String vlanRange) {
            this.vlanRange = vlanRange;
            return this;
        }
        public TemplateDeviceTrackingAttachPolicy build() {
            final var o = new TemplateDeviceTrackingAttachPolicy();
            o.policyName = policyName;
            o.vlanRange = vlanRange;
            return o;
        }
    }
}
