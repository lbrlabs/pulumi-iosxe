// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBgpIpv4UnicastNeighborPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBgpIpv4UnicastNeighborPlainArgs Empty = new GetBgpIpv4UnicastNeighborPlainArgs();

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

    @Import(name="ip", required=true)
    private String ip;

    public String ip() {
        return this.ip;
    }

    private GetBgpIpv4UnicastNeighborPlainArgs() {}

    private GetBgpIpv4UnicastNeighborPlainArgs(GetBgpIpv4UnicastNeighborPlainArgs $) {
        this.asn = $.asn;
        this.device = $.device;
        this.ip = $.ip;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBgpIpv4UnicastNeighborPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBgpIpv4UnicastNeighborPlainArgs $;

        public Builder() {
            $ = new GetBgpIpv4UnicastNeighborPlainArgs();
        }

        public Builder(GetBgpIpv4UnicastNeighborPlainArgs defaults) {
            $ = new GetBgpIpv4UnicastNeighborPlainArgs(Objects.requireNonNull(defaults));
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

        public Builder ip(String ip) {
            $.ip = ip;
            return this;
        }

        public GetBgpIpv4UnicastNeighborPlainArgs build() {
            $.asn = Objects.requireNonNull($.asn, "expected parameter 'asn' to be non-null");
            $.ip = Objects.requireNonNull($.ip, "expected parameter 'ip' to be non-null");
            return $;
        }
    }

}
