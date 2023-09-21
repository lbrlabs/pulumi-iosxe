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


public final class InterfaceEthernetIpv6LinkLocalAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final InterfaceEthernetIpv6LinkLocalAddressArgs Empty = new InterfaceEthernetIpv6LinkLocalAddressArgs();

    @Import(name="address", required=true)
    private Output<String> address;

    public Output<String> address() {
        return this.address;
    }

    @Import(name="linkLocal")
    private @Nullable Output<Boolean> linkLocal;

    public Optional<Output<Boolean>> linkLocal() {
        return Optional.ofNullable(this.linkLocal);
    }

    private InterfaceEthernetIpv6LinkLocalAddressArgs() {}

    private InterfaceEthernetIpv6LinkLocalAddressArgs(InterfaceEthernetIpv6LinkLocalAddressArgs $) {
        this.address = $.address;
        this.linkLocal = $.linkLocal;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InterfaceEthernetIpv6LinkLocalAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InterfaceEthernetIpv6LinkLocalAddressArgs $;

        public Builder() {
            $ = new InterfaceEthernetIpv6LinkLocalAddressArgs();
        }

        public Builder(InterfaceEthernetIpv6LinkLocalAddressArgs defaults) {
            $ = new InterfaceEthernetIpv6LinkLocalAddressArgs(Objects.requireNonNull(defaults));
        }

        public Builder address(Output<String> address) {
            $.address = address;
            return this;
        }

        public Builder address(String address) {
            return address(Output.of(address));
        }

        public Builder linkLocal(@Nullable Output<Boolean> linkLocal) {
            $.linkLocal = linkLocal;
            return this;
        }

        public Builder linkLocal(Boolean linkLocal) {
            return linkLocal(Output.of(linkLocal));
        }

        public InterfaceEthernetIpv6LinkLocalAddressArgs build() {
            $.address = Objects.requireNonNull($.address, "expected parameter 'address' to be non-null");
            return $;
        }
    }

}