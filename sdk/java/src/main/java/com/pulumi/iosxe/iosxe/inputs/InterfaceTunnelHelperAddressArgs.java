// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InterfaceTunnelHelperAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final InterfaceTunnelHelperAddressArgs Empty = new InterfaceTunnelHelperAddressArgs();

    @Import(name="address", required=true)
    private Output<String> address;

    public Output<String> address() {
        return this.address;
    }

    @Import(name="global")
    private @Nullable Output<Boolean> global;

    public Optional<Output<Boolean>> global() {
        return Optional.ofNullable(this.global);
    }

    @Import(name="vrf")
    private @Nullable Output<String> vrf;

    public Optional<Output<String>> vrf() {
        return Optional.ofNullable(this.vrf);
    }

    private InterfaceTunnelHelperAddressArgs() {}

    private InterfaceTunnelHelperAddressArgs(InterfaceTunnelHelperAddressArgs $) {
        this.address = $.address;
        this.global = $.global;
        this.vrf = $.vrf;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InterfaceTunnelHelperAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InterfaceTunnelHelperAddressArgs $;

        public Builder() {
            $ = new InterfaceTunnelHelperAddressArgs();
        }

        public Builder(InterfaceTunnelHelperAddressArgs defaults) {
            $ = new InterfaceTunnelHelperAddressArgs(Objects.requireNonNull(defaults));
        }

        public Builder address(Output<String> address) {
            $.address = address;
            return this;
        }

        public Builder address(String address) {
            return address(Output.of(address));
        }

        public Builder global(@Nullable Output<Boolean> global) {
            $.global = global;
            return this;
        }

        public Builder global(Boolean global) {
            return global(Output.of(global));
        }

        public Builder vrf(@Nullable Output<String> vrf) {
            $.vrf = vrf;
            return this;
        }

        public Builder vrf(String vrf) {
            return vrf(Output.of(vrf));
        }

        public InterfaceTunnelHelperAddressArgs build() {
            $.address = Objects.requireNonNull($.address, "expected parameter 'address' to be non-null");
            return $;
        }
    }

}
