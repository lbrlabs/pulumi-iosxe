// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.GetRadiusServerAttributeAttribute31Parameter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRadiusServerAttribute {
    private Boolean accessRequestInclude;
    private List<GetRadiusServerAttributeAttribute31Parameter> attribute31Parameters;
    private String number;
    private List<String> sendAttributes;

    private GetRadiusServerAttribute() {}
    public Boolean accessRequestInclude() {
        return this.accessRequestInclude;
    }
    public List<GetRadiusServerAttributeAttribute31Parameter> attribute31Parameters() {
        return this.attribute31Parameters;
    }
    public String number() {
        return this.number;
    }
    public List<String> sendAttributes() {
        return this.sendAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRadiusServerAttribute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean accessRequestInclude;
        private List<GetRadiusServerAttributeAttribute31Parameter> attribute31Parameters;
        private String number;
        private List<String> sendAttributes;
        public Builder() {}
        public Builder(GetRadiusServerAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessRequestInclude = defaults.accessRequestInclude;
    	      this.attribute31Parameters = defaults.attribute31Parameters;
    	      this.number = defaults.number;
    	      this.sendAttributes = defaults.sendAttributes;
        }

        @CustomType.Setter
        public Builder accessRequestInclude(Boolean accessRequestInclude) {
            this.accessRequestInclude = Objects.requireNonNull(accessRequestInclude);
            return this;
        }
        @CustomType.Setter
        public Builder attribute31Parameters(List<GetRadiusServerAttributeAttribute31Parameter> attribute31Parameters) {
            this.attribute31Parameters = Objects.requireNonNull(attribute31Parameters);
            return this;
        }
        public Builder attribute31Parameters(GetRadiusServerAttributeAttribute31Parameter... attribute31Parameters) {
            return attribute31Parameters(List.of(attribute31Parameters));
        }
        @CustomType.Setter
        public Builder number(String number) {
            this.number = Objects.requireNonNull(number);
            return this;
        }
        @CustomType.Setter
        public Builder sendAttributes(List<String> sendAttributes) {
            this.sendAttributes = Objects.requireNonNull(sendAttributes);
            return this;
        }
        public Builder sendAttributes(String... sendAttributes) {
            return sendAttributes(List.of(sendAttributes));
        }
        public GetRadiusServerAttribute build() {
            final var o = new GetRadiusServerAttribute();
            o.accessRequestInclude = accessRequestInclude;
            o.attribute31Parameters = attribute31Parameters;
            o.number = number;
            o.sendAttributes = sendAttributes;
            return o;
        }
    }
}