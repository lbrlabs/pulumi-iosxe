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


public final class InterfacePortChannelSubinterfaceIpv6AddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final InterfacePortChannelSubinterfaceIpv6AddressArgs Empty = new InterfacePortChannelSubinterfaceIpv6AddressArgs();

    @Import(name="eui64")
    private @Nullable Output<Boolean> eui64;

    public Optional<Output<Boolean>> eui64() {
        return Optional.ofNullable(this.eui64);
    }

    @Import(name="prefix", required=true)
    private Output<String> prefix;

    public Output<String> prefix() {
        return this.prefix;
    }

    private InterfacePortChannelSubinterfaceIpv6AddressArgs() {}

    private InterfacePortChannelSubinterfaceIpv6AddressArgs(InterfacePortChannelSubinterfaceIpv6AddressArgs $) {
        this.eui64 = $.eui64;
        this.prefix = $.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InterfacePortChannelSubinterfaceIpv6AddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InterfacePortChannelSubinterfaceIpv6AddressArgs $;

        public Builder() {
            $ = new InterfacePortChannelSubinterfaceIpv6AddressArgs();
        }

        public Builder(InterfacePortChannelSubinterfaceIpv6AddressArgs defaults) {
            $ = new InterfacePortChannelSubinterfaceIpv6AddressArgs(Objects.requireNonNull(defaults));
        }

        public Builder eui64(@Nullable Output<Boolean> eui64) {
            $.eui64 = eui64;
            return this;
        }

        public Builder eui64(Boolean eui64) {
            return eui64(Output.of(eui64));
        }

        public Builder prefix(Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public InterfacePortChannelSubinterfaceIpv6AddressArgs build() {
            $.prefix = Objects.requireNonNull($.prefix, "expected parameter 'prefix' to be non-null");
            return $;
        }
    }

}
