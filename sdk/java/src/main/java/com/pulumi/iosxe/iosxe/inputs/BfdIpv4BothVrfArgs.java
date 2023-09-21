// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BfdIpv4BothVrfArgs extends com.pulumi.resources.ResourceArgs {

    public static final BfdIpv4BothVrfArgs Empty = new BfdIpv4BothVrfArgs();

    @Import(name="destIp", required=true)
    private Output<String> destIp;

    public Output<String> destIp() {
        return this.destIp;
    }

    @Import(name="dstVrf", required=true)
    private Output<String> dstVrf;

    public Output<String> dstVrf() {
        return this.dstVrf;
    }

    @Import(name="srcIp", required=true)
    private Output<String> srcIp;

    public Output<String> srcIp() {
        return this.srcIp;
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

    private BfdIpv4BothVrfArgs() {}

    private BfdIpv4BothVrfArgs(BfdIpv4BothVrfArgs $) {
        this.destIp = $.destIp;
        this.dstVrf = $.dstVrf;
        this.srcIp = $.srcIp;
        this.srcVrf = $.srcVrf;
        this.templateName = $.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BfdIpv4BothVrfArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BfdIpv4BothVrfArgs $;

        public Builder() {
            $ = new BfdIpv4BothVrfArgs();
        }

        public Builder(BfdIpv4BothVrfArgs defaults) {
            $ = new BfdIpv4BothVrfArgs(Objects.requireNonNull(defaults));
        }

        public Builder destIp(Output<String> destIp) {
            $.destIp = destIp;
            return this;
        }

        public Builder destIp(String destIp) {
            return destIp(Output.of(destIp));
        }

        public Builder dstVrf(Output<String> dstVrf) {
            $.dstVrf = dstVrf;
            return this;
        }

        public Builder dstVrf(String dstVrf) {
            return dstVrf(Output.of(dstVrf));
        }

        public Builder srcIp(Output<String> srcIp) {
            $.srcIp = srcIp;
            return this;
        }

        public Builder srcIp(String srcIp) {
            return srcIp(Output.of(srcIp));
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

        public BfdIpv4BothVrfArgs build() {
            $.destIp = Objects.requireNonNull($.destIp, "expected parameter 'destIp' to be non-null");
            $.dstVrf = Objects.requireNonNull($.dstVrf, "expected parameter 'dstVrf' to be non-null");
            $.srcIp = Objects.requireNonNull($.srcIp, "expected parameter 'srcIp' to be non-null");
            $.srcVrf = Objects.requireNonNull($.srcVrf, "expected parameter 'srcVrf' to be non-null");
            $.templateName = Objects.requireNonNull($.templateName, "expected parameter 'templateName' to be non-null");
            return $;
        }
    }

}
