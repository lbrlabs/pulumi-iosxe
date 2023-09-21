// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBgpAddressFamilyL2vpnPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBgpAddressFamilyL2vpnPlainArgs Empty = new GetBgpAddressFamilyL2vpnPlainArgs();

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

    private GetBgpAddressFamilyL2vpnPlainArgs() {}

    private GetBgpAddressFamilyL2vpnPlainArgs(GetBgpAddressFamilyL2vpnPlainArgs $) {
        this.afName = $.afName;
        this.asn = $.asn;
        this.device = $.device;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBgpAddressFamilyL2vpnPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBgpAddressFamilyL2vpnPlainArgs $;

        public Builder() {
            $ = new GetBgpAddressFamilyL2vpnPlainArgs();
        }

        public Builder(GetBgpAddressFamilyL2vpnPlainArgs defaults) {
            $ = new GetBgpAddressFamilyL2vpnPlainArgs(Objects.requireNonNull(defaults));
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

        public GetBgpAddressFamilyL2vpnPlainArgs build() {
            $.afName = Objects.requireNonNull($.afName, "expected parameter 'afName' to be non-null");
            $.asn = Objects.requireNonNull($.asn, "expected parameter 'asn' to be non-null");
            return $;
        }
    }

}
