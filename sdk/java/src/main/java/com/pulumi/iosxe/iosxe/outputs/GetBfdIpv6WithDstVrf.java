// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBfdIpv6WithDstVrf {
    private String destIpv6;
    private String dstVrf;
    private String srcIpv6;
    private String templateName;

    private GetBfdIpv6WithDstVrf() {}
    public String destIpv6() {
        return this.destIpv6;
    }
    public String dstVrf() {
        return this.dstVrf;
    }
    public String srcIpv6() {
        return this.srcIpv6;
    }
    public String templateName() {
        return this.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBfdIpv6WithDstVrf defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String destIpv6;
        private String dstVrf;
        private String srcIpv6;
        private String templateName;
        public Builder() {}
        public Builder(GetBfdIpv6WithDstVrf defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destIpv6 = defaults.destIpv6;
    	      this.dstVrf = defaults.dstVrf;
    	      this.srcIpv6 = defaults.srcIpv6;
    	      this.templateName = defaults.templateName;
        }

        @CustomType.Setter
        public Builder destIpv6(String destIpv6) {
            this.destIpv6 = Objects.requireNonNull(destIpv6);
            return this;
        }
        @CustomType.Setter
        public Builder dstVrf(String dstVrf) {
            this.dstVrf = Objects.requireNonNull(dstVrf);
            return this;
        }
        @CustomType.Setter
        public Builder srcIpv6(String srcIpv6) {
            this.srcIpv6 = Objects.requireNonNull(srcIpv6);
            return this;
        }
        @CustomType.Setter
        public Builder templateName(String templateName) {
            this.templateName = Objects.requireNonNull(templateName);
            return this;
        }
        public GetBfdIpv6WithDstVrf build() {
            final var o = new GetBfdIpv6WithDstVrf();
            o.destIpv6 = destIpv6;
            o.dstVrf = dstVrf;
            o.srcIpv6 = srcIpv6;
            o.templateName = templateName;
            return o;
        }
    }
}