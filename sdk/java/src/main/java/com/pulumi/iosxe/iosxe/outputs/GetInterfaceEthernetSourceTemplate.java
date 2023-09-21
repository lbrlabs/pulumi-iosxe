// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInterfaceEthernetSourceTemplate {
    private Boolean merge;
    private String templateName;

    private GetInterfaceEthernetSourceTemplate() {}
    public Boolean merge() {
        return this.merge;
    }
    public String templateName() {
        return this.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInterfaceEthernetSourceTemplate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean merge;
        private String templateName;
        public Builder() {}
        public Builder(GetInterfaceEthernetSourceTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.merge = defaults.merge;
    	      this.templateName = defaults.templateName;
        }

        @CustomType.Setter
        public Builder merge(Boolean merge) {
            this.merge = Objects.requireNonNull(merge);
            return this;
        }
        @CustomType.Setter
        public Builder templateName(String templateName) {
            this.templateName = Objects.requireNonNull(templateName);
            return this;
        }
        public GetInterfaceEthernetSourceTemplate build() {
            final var o = new GetInterfaceEthernetSourceTemplate();
            o.merge = merge;
            o.templateName = templateName;
            return o;
        }
    }
}
