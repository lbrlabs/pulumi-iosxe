// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLoggingIpv4HostTransportArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLoggingIpv4HostTransportArgs Empty = new GetLoggingIpv4HostTransportArgs();

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

    @Import(name="ipv4Host", required=true)
    private Output<String> ipv4Host;

    public Output<String> ipv4Host() {
        return this.ipv4Host;
    }

    private GetLoggingIpv4HostTransportArgs() {}

    private GetLoggingIpv4HostTransportArgs(GetLoggingIpv4HostTransportArgs $) {
        this.device = $.device;
        this.ipv4Host = $.ipv4Host;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLoggingIpv4HostTransportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLoggingIpv4HostTransportArgs $;

        public Builder() {
            $ = new GetLoggingIpv4HostTransportArgs();
        }

        public Builder(GetLoggingIpv4HostTransportArgs defaults) {
            $ = new GetLoggingIpv4HostTransportArgs(Objects.requireNonNull(defaults));
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

        public Builder ipv4Host(Output<String> ipv4Host) {
            $.ipv4Host = ipv4Host;
            return this;
        }

        public Builder ipv4Host(String ipv4Host) {
            return ipv4Host(Output.of(ipv4Host));
        }

        public GetLoggingIpv4HostTransportArgs build() {
            $.ipv4Host = Objects.requireNonNull($.ipv4Host, "expected parameter 'ipv4Host' to be non-null");
            return $;
        }
    }

}
