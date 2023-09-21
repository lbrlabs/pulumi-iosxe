// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.RadiusServerAttributeAttribute31Parameter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RadiusServerAttribute {
    private @Nullable Boolean accessRequestInclude;
    private @Nullable List<RadiusServerAttributeAttribute31Parameter> attribute31Parameters;
    private String number;
    private @Nullable List<String> sendAttributes;

    private RadiusServerAttribute() {}
    public Optional<Boolean> accessRequestInclude() {
        return Optional.ofNullable(this.accessRequestInclude);
    }
    public List<RadiusServerAttributeAttribute31Parameter> attribute31Parameters() {
        return this.attribute31Parameters == null ? List.of() : this.attribute31Parameters;
    }
    public String number() {
        return this.number;
    }
    public List<String> sendAttributes() {
        return this.sendAttributes == null ? List.of() : this.sendAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RadiusServerAttribute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean accessRequestInclude;
        private @Nullable List<RadiusServerAttributeAttribute31Parameter> attribute31Parameters;
        private String number;
        private @Nullable List<String> sendAttributes;
        public Builder() {}
        public Builder(RadiusServerAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessRequestInclude = defaults.accessRequestInclude;
    	      this.attribute31Parameters = defaults.attribute31Parameters;
    	      this.number = defaults.number;
    	      this.sendAttributes = defaults.sendAttributes;
        }

        @CustomType.Setter
        public Builder accessRequestInclude(@Nullable Boolean accessRequestInclude) {
            this.accessRequestInclude = accessRequestInclude;
            return this;
        }
        @CustomType.Setter
        public Builder attribute31Parameters(@Nullable List<RadiusServerAttributeAttribute31Parameter> attribute31Parameters) {
            this.attribute31Parameters = attribute31Parameters;
            return this;
        }
        public Builder attribute31Parameters(RadiusServerAttributeAttribute31Parameter... attribute31Parameters) {
            return attribute31Parameters(List.of(attribute31Parameters));
        }
        @CustomType.Setter
        public Builder number(String number) {
            this.number = Objects.requireNonNull(number);
            return this;
        }
        @CustomType.Setter
        public Builder sendAttributes(@Nullable List<String> sendAttributes) {
            this.sendAttributes = sendAttributes;
            return this;
        }
        public Builder sendAttributes(String... sendAttributes) {
            return sendAttributes(List.of(sendAttributes));
        }
        public RadiusServerAttribute build() {
            final var o = new RadiusServerAttribute();
            o.accessRequestInclude = accessRequestInclude;
            o.attribute31Parameters = attribute31Parameters;
            o.number = number;
            o.sendAttributes = sendAttributes;
            return o;
        }
    }
}
