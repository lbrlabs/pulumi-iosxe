// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBgpL2vpnEvpnNeighborPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBgpL2vpnEvpnNeighborPlainArgs Empty = new GetBgpL2vpnEvpnNeighborPlainArgs();

    @Import(name="asn", required=true)
    private String asn;

    public String asn() {
        return this.asn;
    }

    @Import(name="device")
    private @Nullable String device;

    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }

    @Import(name="ip", required=true)
    private String ip;

    public String ip() {
        return this.ip;
    }

    private GetBgpL2vpnEvpnNeighborPlainArgs() {}

    private GetBgpL2vpnEvpnNeighborPlainArgs(GetBgpL2vpnEvpnNeighborPlainArgs $) {
        this.asn = $.asn;
        this.device = $.device;
        this.ip = $.ip;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBgpL2vpnEvpnNeighborPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBgpL2vpnEvpnNeighborPlainArgs $;

        public Builder() {
            $ = new GetBgpL2vpnEvpnNeighborPlainArgs();
        }

        public Builder(GetBgpL2vpnEvpnNeighborPlainArgs defaults) {
            $ = new GetBgpL2vpnEvpnNeighborPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder asn(String asn) {
            $.asn = asn;
            return this;
        }

        public Builder device(@Nullable String device) {
            $.device = device;
            return this;
        }

        public Builder ip(String ip) {
            $.ip = ip;
            return this;
        }

        public GetBgpL2vpnEvpnNeighborPlainArgs build() {
            $.asn = Objects.requireNonNull($.asn, "expected parameter 'asn' to be non-null");
            $.ip = Objects.requireNonNull($.ip, "expected parameter 'ip' to be non-null");
            return $;
        }
    }

}
