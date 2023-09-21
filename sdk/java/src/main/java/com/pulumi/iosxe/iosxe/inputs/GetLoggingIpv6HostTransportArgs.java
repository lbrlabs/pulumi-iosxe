// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLoggingIpv6HostTransportArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLoggingIpv6HostTransportArgs Empty = new GetLoggingIpv6HostTransportArgs();

    @Import(name="device")
    private @Nullable Output<String> device;

    public Optional<Output<String>> device() {
        return Optional.ofNullable(this.device);
    }

    @Import(name="ipv6Host", required=true)
    private Output<String> ipv6Host;

    public Output<String> ipv6Host() {
        return this.ipv6Host;
    }

    private GetLoggingIpv6HostTransportArgs() {}

    private GetLoggingIpv6HostTransportArgs(GetLoggingIpv6HostTransportArgs $) {
        this.device = $.device;
        this.ipv6Host = $.ipv6Host;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLoggingIpv6HostTransportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLoggingIpv6HostTransportArgs $;

        public Builder() {
            $ = new GetLoggingIpv6HostTransportArgs();
        }

        public Builder(GetLoggingIpv6HostTransportArgs defaults) {
            $ = new GetLoggingIpv6HostTransportArgs(Objects.requireNonNull(defaults));
        }

        public Builder device(@Nullable Output<String> device) {
            $.device = device;
            return this;
        }

        public Builder device(String device) {
            return device(Output.of(device));
        }

        public Builder ipv6Host(Output<String> ipv6Host) {
            $.ipv6Host = ipv6Host;
            return this;
        }

        public Builder ipv6Host(String ipv6Host) {
            return ipv6Host(Output.of(ipv6Host));
        }

        public GetLoggingIpv6HostTransportArgs build() {
            $.ipv6Host = Objects.requireNonNull($.ipv6Host, "expected parameter 'ipv6Host' to be non-null");
            return $;
        }
    }

}