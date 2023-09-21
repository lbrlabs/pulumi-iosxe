// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVlanArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVlanArgs Empty = new GetVlanArgs();

    @Import(name="device")
    private @Nullable Output<String> device;

    public Optional<Output<String>> device() {
        return Optional.ofNullable(this.device);
    }

    @Import(name="vlanId", required=true)
    private Output<Integer> vlanId;

    public Output<Integer> vlanId() {
        return this.vlanId;
    }

    private GetVlanArgs() {}

    private GetVlanArgs(GetVlanArgs $) {
        this.device = $.device;
        this.vlanId = $.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVlanArgs $;

        public Builder() {
            $ = new GetVlanArgs();
        }

        public Builder(GetVlanArgs defaults) {
            $ = new GetVlanArgs(Objects.requireNonNull(defaults));
        }

        public Builder device(@Nullable Output<String> device) {
            $.device = device;
            return this;
        }

        public Builder device(String device) {
            return device(Output.of(device));
        }

        public Builder vlanId(Output<Integer> vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        public Builder vlanId(Integer vlanId) {
            return vlanId(Output.of(vlanId));
        }

        public GetVlanArgs build() {
            $.vlanId = Objects.requireNonNull($.vlanId, "expected parameter 'vlanId' to be non-null");
            return $;
        }
    }

}
