// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBfdIpv4BothVrf {
    /**
     * @return Destination IP prefix/len
     * 
     */
    private String destIp;
    /**
     * @return Destination VRF instance name
     * 
     */
    private String dstVrf;
    /**
     * @return Source IP prefix/len
     * 
     */
    private String srcIp;
    /**
     * @return source VRF instance name
     * 
     */
    private String srcVrf;
    /**
     * @return BFD template name
     * 
     */
    private String templateName;

    private GetBfdIpv4BothVrf() {}
    /**
     * @return Destination IP prefix/len
     * 
     */
    public String destIp() {
        return this.destIp;
    }
    /**
     * @return Destination VRF instance name
     * 
     */
    public String dstVrf() {
        return this.dstVrf;
    }
    /**
     * @return Source IP prefix/len
     * 
     */
    public String srcIp() {
        return this.srcIp;
    }
    /**
     * @return source VRF instance name
     * 
     */
    public String srcVrf() {
        return this.srcVrf;
    }
    /**
     * @return BFD template name
     * 
     */
    public String templateName() {
        return this.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBfdIpv4BothVrf defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String destIp;
        private String dstVrf;
        private String srcIp;
        private String srcVrf;
        private String templateName;
        public Builder() {}
        public Builder(GetBfdIpv4BothVrf defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destIp = defaults.destIp;
    	      this.dstVrf = defaults.dstVrf;
    	      this.srcIp = defaults.srcIp;
    	      this.srcVrf = defaults.srcVrf;
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
        public Builder srcVrf(String srcVrf) {
            this.srcVrf = Objects.requireNonNull(srcVrf);
            return this;
        }
        @CustomType.Setter
        public Builder templateName(String templateName) {
            this.templateName = Objects.requireNonNull(templateName);
            return this;
        }
        public GetBfdIpv4BothVrf build() {
            final var o = new GetBfdIpv4BothVrf();
            o.destIp = destIp;
            o.dstVrf = dstVrf;
            o.srcIp = srcIp;
            o.srcVrf = srcVrf;
            o.templateName = templateName;
            return o;
        }
    }
}
