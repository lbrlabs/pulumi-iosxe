// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BfdIpv6WithBothVrfArgs extends com.pulumi.resources.ResourceArgs {

    public static final BfdIpv6WithBothVrfArgs Empty = new BfdIpv6WithBothVrfArgs();

    @Import(name="destIpv6", required=true)
    private Output<String> destIpv6;

    public Output<String> destIpv6() {
        return this.destIpv6;
    }

    @Import(name="dstVrf", required=true)
    private Output<String> dstVrf;

    public Output<String> dstVrf() {
        return this.dstVrf;
    }

    @Import(name="srcIpv6", required=true)
    private Output<String> srcIpv6;

    public Output<String> srcIpv6() {
        return this.srcIpv6;
    }

    @Import(name="srcVrf", required=true)
    private Output<String> srcVrf;

    public Output<String> srcVrf() {
        return this.srcVrf;
    }

    @Import(name="templateName", required=true)
    private Output<String> templateName;

    public Output<String> templateName() {
        return this.templateName;
    }

    private BfdIpv6WithBothVrfArgs() {}

    private BfdIpv6WithBothVrfArgs(BfdIpv6WithBothVrfArgs $) {
        this.destIpv6 = $.destIpv6;
        this.dstVrf = $.dstVrf;
        this.srcIpv6 = $.srcIpv6;
        this.srcVrf = $.srcVrf;
        this.templateName = $.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BfdIpv6WithBothVrfArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BfdIpv6WithBothVrfArgs $;

        public Builder() {
            $ = new BfdIpv6WithBothVrfArgs();
        }

        public Builder(BfdIpv6WithBothVrfArgs defaults) {
            $ = new BfdIpv6WithBothVrfArgs(Objects.requireNonNull(defaults));
        }

        public Builder destIpv6(Output<String> destIpv6) {
            $.destIpv6 = destIpv6;
            return this;
        }

        public Builder destIpv6(String destIpv6) {
            return destIpv6(Output.of(destIpv6));
        }

        public Builder dstVrf(Output<String> dstVrf) {
            $.dstVrf = dstVrf;
            return this;
        }

        public Builder dstVrf(String dstVrf) {
            return dstVrf(Output.of(dstVrf));
        }

        public Builder srcIpv6(Output<String> srcIpv6) {
            $.srcIpv6 = srcIpv6;
            return this;
        }

        public Builder srcIpv6(String srcIpv6) {
            return srcIpv6(Output.of(srcIpv6));
        }

        public Builder srcVrf(Output<String> srcVrf) {
            $.srcVrf = srcVrf;
            return this;
        }

        public Builder srcVrf(String srcVrf) {
            return srcVrf(Output.of(srcVrf));
        }

        public Builder templateName(Output<String> templateName) {
            $.templateName = templateName;
            return this;
        }

        public Builder templateName(String templateName) {
            return templateName(Output.of(templateName));
        }

        public BfdIpv6WithBothVrfArgs build() {
            $.destIpv6 = Objects.requireNonNull($.destIpv6, "expected parameter 'destIpv6' to be non-null");
            $.dstVrf = Objects.requireNonNull($.dstVrf, "expected parameter 'dstVrf' to be non-null");
            $.srcIpv6 = Objects.requireNonNull($.srcIpv6, "expected parameter 'srcIpv6' to be non-null");
            $.srcVrf = Objects.requireNonNull($.srcVrf, "expected parameter 'srcVrf' to be non-null");
            $.templateName = Objects.requireNonNull($.templateName, "expected parameter 'templateName' to be non-null");
            return $;
        }
    }

}
