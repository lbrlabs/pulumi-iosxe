// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPimVrfArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPimVrfArgs Empty = new GetPimVrfArgs();

    @Import(name="device")
    private @Nullable Output<String> device;

    public Optional<Output<String>> device() {
        return Optional.ofNullable(this.device);
    }

    @Import(name="vrf", required=true)
    private Output<String> vrf;

    public Output<String> vrf() {
        return this.vrf;
    }

    private GetPimVrfArgs() {}

    private GetPimVrfArgs(GetPimVrfArgs $) {
        this.device = $.device;
        this.vrf = $.vrf;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPimVrfArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPimVrfArgs $;

        public Builder() {
            $ = new GetPimVrfArgs();
        }

        public Builder(GetPimVrfArgs defaults) {
            $ = new GetPimVrfArgs(Objects.requireNonNull(defaults));
        }

        public Builder device(@Nullable Output<String> device) {
            $.device = device;
            return this;
        }

        public Builder device(String device) {
            return device(Output.of(device));
        }

        public Builder vrf(Output<String> vrf) {
            $.vrf = vrf;
            return this;
        }

        public Builder vrf(String vrf) {
            return vrf(Output.of(vrf));
        }

        public GetPimVrfArgs build() {
            $.vrf = Objects.requireNonNull($.vrf, "expected parameter 'vrf' to be non-null");
            return $;
        }
    }

}