// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BfdIpv4WithDstVrf {
    private String destIp;
    private String dstVrf;
    private String srcIp;
    private String templateName;

    private BfdIpv4WithDstVrf() {}
    public String destIp() {
        return this.destIp;
    }
    public String dstVrf() {
        return this.dstVrf;
    }
    public String srcIp() {
        return this.srcIp;
    }
    public String templateName() {
        return this.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BfdIpv4WithDstVrf defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String destIp;
        private String dstVrf;
        private String srcIp;
        private String templateName;
        public Builder() {}
        public Builder(BfdIpv4WithDstVrf defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destIp = defaults.destIp;
    	      this.dstVrf = defaults.dstVrf;
    	      this.srcIp = defaults.srcIp;
    	      this.templateName = defaults.templateName;
        }

        @CustomType.Setter
        public Builder destIp(String destIp) {
            this.destIp = Objects.requireNonNull(destIp);
            return this;
        }
        @CustomType.Setter
        public Builder dstVrf(String dstVrf) {
            this.dstVrf = Objects.requireNonNull(dstVrf);
            return this;
        }
        @CustomType.Setter
        public Builder srcIp(String srcIp) {
            this.srcIp = Objects.requireNonNull(srcIp);
            return this;
        }
        @CustomType.Setter
        public Builder templateName(String templateName) {
            this.templateName = Objects.requireNonNull(templateName);
            return this;
        }
        public BfdIpv4WithDstVrf build() {
            final var o = new BfdIpv4WithDstVrf();
            o.destIp = destIp;
            o.dstVrf = dstVrf;
            o.srcIp = srcIp;
            o.templateName = templateName;
            return o;
        }
    }
}