// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OspfVrfSummaryAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final OspfVrfSummaryAddressArgs Empty = new OspfVrfSummaryAddressArgs();

    @Import(name="ip", required=true)
    private Output<String> ip;

    public Output<String> ip() {
        return this.ip;
    }

    @Import(name="mask")
    private @Nullable Output<String> mask;

    public Optional<Output<String>> mask() {
        return Optional.ofNullable(this.mask);
    }

    private OspfVrfSummaryAddressArgs() {}

    private OspfVrfSummaryAddressArgs(OspfVrfSummaryAddressArgs $) {
        this.ip = $.ip;
        this.mask = $.mask;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OspfVrfSummaryAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OspfVrfSummaryAddressArgs $;

        public Builder() {
            $ = new OspfVrfSummaryAddressArgs();
        }

        public Builder(OspfVrfSummaryAddressArgs defaults) {
            $ = new OspfVrfSummaryAddressArgs(Objects.requireNonNull(defaults));
        }

        public Builder ip(Output<String> ip) {
            $.ip = ip;
            return this;
        }

        public Builder ip(String ip) {
            return ip(Output.of(ip));
        }

        public Builder mask(@Nullable Output<String> mask) {
            $.mask = mask;
            return this;
        }

        public Builder mask(String mask) {
            return mask(Output.of(mask));
        }

        public OspfVrfSummaryAddressArgs build() {
            $.ip = Objects.requireNonNull($.ip, "expected parameter 'ip' to be non-null");
            return $;
        }
    }

}
