// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBgpAddressFamilyIpv6VrfPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBgpAddressFamilyIpv6VrfPlainArgs Empty = new GetBgpAddressFamilyIpv6VrfPlainArgs();

    @Import(name="afName", required=true)
    private String afName;

    public String afName() {
        return this.afName;
    }

    @Import(name="asn", required=true)
    private String asn;

    public String asn() {
        return this.asn;
    }

    /**
     * A device name from the provider configuration.
     * 
     */
    @Import(name="device")
    private @Nullable String device;

    /**
     * @return A device name from the provider configuration.
     * 
     */
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }

    private GetBgpAddressFamilyIpv6VrfPlainArgs() {}

    private GetBgpAddressFamilyIpv6VrfPlainArgs(GetBgpAddressFamilyIpv6VrfPlainArgs $) {
        this.afName = $.afName;
        this.asn = $.asn;
        this.device = $.device;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBgpAddressFamilyIpv6VrfPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBgpAddressFamilyIpv6VrfPlainArgs $;

        public Builder() {
            $ = new GetBgpAddressFamilyIpv6VrfPlainArgs();
        }

        public Builder(GetBgpAddressFamilyIpv6VrfPlainArgs defaults) {
            $ = new GetBgpAddressFamilyIpv6VrfPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder afName(String afName) {
            $.afName = afName;
            return this;
        }

        public Builder asn(String asn) {
            $.asn = asn;
            return this;
        }

        /**
         * @param device A device name from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder device(@Nullable String device) {
            $.device = device;
            return this;
        }

        public GetBgpAddressFamilyIpv6VrfPlainArgs build() {
            $.afName = Objects.requireNonNull($.afName, "expected parameter 'afName' to be non-null");
            $.asn = Objects.requireNonNull($.asn, "expected parameter 'asn' to be non-null");
            return $;
        }
    }

}
