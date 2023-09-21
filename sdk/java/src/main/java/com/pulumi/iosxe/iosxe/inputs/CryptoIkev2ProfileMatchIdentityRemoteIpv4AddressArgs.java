// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CryptoIkev2ProfileMatchIdentityRemoteIpv4AddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final CryptoIkev2ProfileMatchIdentityRemoteIpv4AddressArgs Empty = new CryptoIkev2ProfileMatchIdentityRemoteIpv4AddressArgs();

    @Import(name="address", required=true)
    private Output<String> address;

    public Output<String> address() {
        return this.address;
    }

    @Import(name="mask")
    private @Nullable Output<String> mask;

    public Optional<Output<String>> mask() {
        return Optional.ofNullable(this.mask);
    }

    private CryptoIkev2ProfileMatchIdentityRemoteIpv4AddressArgs() {}

    private CryptoIkev2ProfileMatchIdentityRemoteIpv4AddressArgs(CryptoIkev2ProfileMatchIdentityRemoteIpv4AddressArgs $) {
        this.address = $.address;
        this.mask = $.mask;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CryptoIkev2ProfileMatchIdentityRemoteIpv4AddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CryptoIkev2ProfileMatchIdentityRemoteIpv4AddressArgs $;

        public Builder() {
            $ = new CryptoIkev2ProfileMatchIdentityRemoteIpv4AddressArgs();
        }

        public Builder(CryptoIkev2ProfileMatchIdentityRemoteIpv4AddressArgs defaults) {
            $ = new CryptoIkev2ProfileMatchIdentityRemoteIpv4AddressArgs(Objects.requireNonNull(defaults));
        }

        public Builder address(Output<String> address) {
            $.address = address;
            return this;
        }

        public Builder address(String address) {
            return address(Output.of(address));
        }

        public Builder mask(@Nullable Output<String> mask) {
            $.mask = mask;
            return this;
        }

        public Builder mask(String mask) {
            return mask(Output.of(mask));
        }

        public CryptoIkev2ProfileMatchIdentityRemoteIpv4AddressArgs build() {
            $.address = Objects.requireNonNull($.address, "expected parameter 'address' to be non-null");
            return $;
        }
    }

}
