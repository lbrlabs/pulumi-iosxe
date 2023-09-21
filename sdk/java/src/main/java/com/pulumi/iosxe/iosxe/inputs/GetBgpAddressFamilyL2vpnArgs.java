// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBgpAddressFamilyL2vpnArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBgpAddressFamilyL2vpnArgs Empty = new GetBgpAddressFamilyL2vpnArgs();

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

    private GetBgpAddressFamilyL2vpnArgs() {}

    private GetBgpAddressFamilyL2vpnArgs(GetBgpAddressFamilyL2vpnArgs $) {
        this.afName = $.afName;
        this.asn = $.asn;
        this.device = $.device;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBgpAddressFamilyL2vpnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBgpAddressFamilyL2vpnArgs $;

        public Builder() {
            $ = new GetBgpAddressFamilyL2vpnArgs();
        }

        public Builder(GetBgpAddressFamilyL2vpnArgs defaults) {
            $ = new GetBgpAddressFamilyL2vpnArgs(Objects.requireNonNull(defaults));
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

        public GetBgpAddressFamilyL2vpnArgs build() {
            $.afName = Objects.requireNonNull($.afName, "expected parameter 'afName' to be non-null");
            $.asn = Objects.requireNonNull($.asn, "expected parameter 'asn' to be non-null");
            return $;
        }
    }

}
