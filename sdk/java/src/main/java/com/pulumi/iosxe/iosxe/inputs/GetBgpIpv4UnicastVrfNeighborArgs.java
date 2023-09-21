// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBgpIpv4UnicastVrfNeighborArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBgpIpv4UnicastVrfNeighborArgs Empty = new GetBgpIpv4UnicastVrfNeighborArgs();

    @Import(name="asn", required=true)
    private Output<String> asn;

    public Output<String> asn() {
        return this.asn;
    }

    @Import(name="device")
    private @Nullable Output<String> device;

    public Optional<Output<String>> device() {
        return Optional.ofNullable(this.device);
    }

    @Import(name="ip", required=true)
    private Output<String> ip;

    public Output<String> ip() {
        return this.ip;
    }

    @Import(name="vrf", required=true)
    private Output<String> vrf;

    public Output<String> vrf() {
        return this.vrf;
    }

    private GetBgpIpv4UnicastVrfNeighborArgs() {}

    private GetBgpIpv4UnicastVrfNeighborArgs(GetBgpIpv4UnicastVrfNeighborArgs $) {
        this.asn = $.asn;
        this.device = $.device;
        this.ip = $.ip;
        this.vrf = $.vrf;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBgpIpv4UnicastVrfNeighborArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBgpIpv4UnicastVrfNeighborArgs $;

        public Builder() {
            $ = new GetBgpIpv4UnicastVrfNeighborArgs();
        }

        public Builder(GetBgpIpv4UnicastVrfNeighborArgs defaults) {
            $ = new GetBgpIpv4UnicastVrfNeighborArgs(Objects.requireNonNull(defaults));
        }

        public Builder asn(Output<String> asn) {
            $.asn = asn;
            return this;
        }

        public Builder asn(String asn) {
            return asn(Output.of(asn));
        }

        public Builder device(@Nullable Output<String> device) {
            $.device = device;
            return this;
        }

        public Builder device(String device) {
            return device(Output.of(device));
        }

        public Builder ip(Output<String> ip) {
            $.ip = ip;
            return this;
        }

        public Builder ip(String ip) {
            return ip(Output.of(ip));
        }

        public Builder vrf(Output<String> vrf) {
            $.vrf = vrf;
            return this;
        }

        public Builder vrf(String vrf) {
            return vrf(Output.of(vrf));
        }

        public GetBgpIpv4UnicastVrfNeighborArgs build() {
            $.asn = Objects.requireNonNull($.asn, "expected parameter 'asn' to be non-null");
            $.ip = Objects.requireNonNull($.ip, "expected parameter 'ip' to be non-null");
            $.vrf = Objects.requireNonNull($.vrf, "expected parameter 'vrf' to be non-null");
            return $;
        }
    }

}
