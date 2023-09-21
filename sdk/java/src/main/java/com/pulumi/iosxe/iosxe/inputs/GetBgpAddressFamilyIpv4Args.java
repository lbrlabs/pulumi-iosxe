// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBgpAddressFamilyIpv4Args extends com.pulumi.resources.InvokeArgs {

    public static final GetBgpAddressFamilyIpv4Args Empty = new GetBgpAddressFamilyIpv4Args();

    @Import(name="afName", required=true)
    private Output<String> afName;

    public Output<String> afName() {
        return this.afName;
    }

    @Import(name="asn", required=true)
    private Output<String> asn;

    public Output<String> asn() {
        return this.asn;
    }

    /**
     * A device name from the provider configuration.
     * 
     */
    @Import(name="device")
    private @Nullable Output<String> device;

    /**
     * @return A device name from the provider configuration.
     * 
     */
    public Optional<Output<String>> device() {
        return Optional.ofNullable(this.device);
    }

    private GetBgpAddressFamilyIpv4Args() {}

    private GetBgpAddressFamilyIpv4Args(GetBgpAddressFamilyIpv4Args $) {
        this.afName = $.afName;
        this.asn = $.asn;
        this.device = $.device;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBgpAddressFamilyIpv4Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBgpAddressFamilyIpv4Args $;

        public Builder() {
            $ = new GetBgpAddressFamilyIpv4Args();
        }

        public Builder(GetBgpAddressFamilyIpv4Args defaults) {
            $ = new GetBgpAddressFamilyIpv4Args(Objects.requireNonNull(defaults));
        }

        public Builder afName(Output<String> afName) {
            $.afName = afName;
            return this;
        }

        public Builder afName(String afName) {
            return afName(Output.of(afName));
        }

        public Builder asn(Output<String> asn) {
            $.asn = asn;
            return this;
        }

        public Builder asn(String asn) {
            return asn(Output.of(asn));
        }

        /**
         * @param device A device name from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder device(@Nullable Output<String> device) {
            $.device = device;
            return this;
        }

        /**
         * @param device A device name from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder device(String device) {
            return device(Output.of(device));
        }

        public GetBgpAddressFamilyIpv4Args build() {
            $.afName = Objects.requireNonNull($.afName, "expected parameter 'afName' to be non-null");
            $.asn = Objects.requireNonNull($.asn, "expected parameter 'asn' to be non-null");
            return $;
        }
    }

}
