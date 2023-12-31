// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BfdIpv4WithSrcVrfArgs extends com.pulumi.resources.ResourceArgs {

    public static final BfdIpv4WithSrcVrfArgs Empty = new BfdIpv4WithSrcVrfArgs();

    @Import(name="destIp", required=true)
    private Output<String> destIp;

    public Output<String> destIp() {
        return this.destIp;
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

    private BfdIpv4WithSrcVrfArgs() {}

    private BfdIpv4WithSrcVrfArgs(BfdIpv4WithSrcVrfArgs $) {
        this.destIp = $.destIp;
        this.srcIp = $.srcIp;
        this.srcVrf = $.srcVrf;
        this.templateName = $.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BfdIpv4WithSrcVrfArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BfdIpv4WithSrcVrfArgs $;

        public Builder() {
            $ = new BfdIpv4WithSrcVrfArgs();
        }

        public Builder(BfdIpv4WithSrcVrfArgs defaults) {
            $ = new BfdIpv4WithSrcVrfArgs(Objects.requireNonNull(defaults));
        }

        public Builder destIp(Output<String> destIp) {
            $.destIp = destIp;
            return this;
        }

        public Builder destIp(String destIp) {
            return destIp(Output.of(destIp));
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

        public BfdIpv4WithSrcVrfArgs build() {
            $.destIp = Objects.requireNonNull($.destIp, "expected parameter 'destIp' to be non-null");
            $.srcIp = Objects.requireNonNull($.srcIp, "expected parameter 'srcIp' to be non-null");
            $.srcVrf = Objects.requireNonNull($.srcVrf, "expected parameter 'srcVrf' to be non-null");
            $.templateName = Objects.requireNonNull($.templateName, "expected parameter 'templateName' to be non-null");
            return $;
        }
    }

}
