// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.iosxe.iosxe.inputs.LoggingIpv4HostVrfTransportTransportTcpPortArgs;
import com.pulumi.iosxe.iosxe.inputs.LoggingIpv4HostVrfTransportTransportTlsPortArgs;
import com.pulumi.iosxe.iosxe.inputs.LoggingIpv4HostVrfTransportTransportUdpPortArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoggingIpv4HostVrfTransportArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoggingIpv4HostVrfTransportArgs Empty = new LoggingIpv4HostVrfTransportArgs();

    /**
     * Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
     * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
     * Default value is `all`. - Choices: `all`, `attributes`
     * 
     */
    @Import(name="deleteMode")
    private @Nullable Output<String> deleteMode;

    /**
     * @return Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
     * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
     * Default value is `all`. - Choices: `all`, `attributes`
     * 
     */
    public Optional<Output<String>> deleteMode() {
        return Optional.ofNullable(this.deleteMode);
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

    @Import(name="ipv4Host", required=true)
    private Output<String> ipv4Host;

    public Output<String> ipv4Host() {
        return this.ipv4Host;
    }

    /**
     * Port Number List
     * 
     */
    @Import(name="transportTcpPorts")
    private @Nullable Output<List<LoggingIpv4HostVrfTransportTransportTcpPortArgs>> transportTcpPorts;

    /**
     * @return Port Number List
     * 
     */
    public Optional<Output<List<LoggingIpv4HostVrfTransportTransportTcpPortArgs>>> transportTcpPorts() {
        return Optional.ofNullable(this.transportTcpPorts);
    }

    /**
     * Port Number List
     * 
     */
    @Import(name="transportTlsPorts")
    private @Nullable Output<List<LoggingIpv4HostVrfTransportTransportTlsPortArgs>> transportTlsPorts;

    /**
     * @return Port Number List
     * 
     */
    public Optional<Output<List<LoggingIpv4HostVrfTransportTransportTlsPortArgs>>> transportTlsPorts() {
        return Optional.ofNullable(this.transportTlsPorts);
    }

    /**
     * Port Number List
     * 
     */
    @Import(name="transportUdpPorts")
    private @Nullable Output<List<LoggingIpv4HostVrfTransportTransportUdpPortArgs>> transportUdpPorts;

    /**
     * @return Port Number List
     * 
     */
    public Optional<Output<List<LoggingIpv4HostVrfTransportTransportUdpPortArgs>>> transportUdpPorts() {
        return Optional.ofNullable(this.transportUdpPorts);
    }

    /**
     * Set VRF option
     * 
     */
    @Import(name="vrf", required=true)
    private Output<String> vrf;

    /**
     * @return Set VRF option
     * 
     */
    public Output<String> vrf() {
        return this.vrf;
    }

    private LoggingIpv4HostVrfTransportArgs() {}

    private LoggingIpv4HostVrfTransportArgs(LoggingIpv4HostVrfTransportArgs $) {
        this.deleteMode = $.deleteMode;
        this.device = $.device;
        this.ipv4Host = $.ipv4Host;
        this.transportTcpPorts = $.transportTcpPorts;
        this.transportTlsPorts = $.transportTlsPorts;
        this.transportUdpPorts = $.transportUdpPorts;
        this.vrf = $.vrf;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingIpv4HostVrfTransportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingIpv4HostVrfTransportArgs $;

        public Builder() {
            $ = new LoggingIpv4HostVrfTransportArgs();
        }

        public Builder(LoggingIpv4HostVrfTransportArgs defaults) {
            $ = new LoggingIpv4HostVrfTransportArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deleteMode Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
         * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
         * Default value is `all`. - Choices: `all`, `attributes`
         * 
         * @return builder
         * 
         */
        public Builder deleteMode(@Nullable Output<String> deleteMode) {
            $.deleteMode = deleteMode;
            return this;
        }

        /**
         * @param deleteMode Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
         * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
         * Default value is `all`. - Choices: `all`, `attributes`
         * 
         * @return builder
         * 
         */
        public Builder deleteMode(String deleteMode) {
            return deleteMode(Output.of(deleteMode));
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

        /**
         * @param transportTcpPorts Port Number List
         * 
         * @return builder
         * 
         */
        public Builder transportTcpPorts(@Nullable Output<List<LoggingIpv4HostVrfTransportTransportTcpPortArgs>> transportTcpPorts) {
            $.transportTcpPorts = transportTcpPorts;
            return this;
        }

        /**
         * @param transportTcpPorts Port Number List
         * 
         * @return builder
         * 
         */
        public Builder transportTcpPorts(List<LoggingIpv4HostVrfTransportTransportTcpPortArgs> transportTcpPorts) {
            return transportTcpPorts(Output.of(transportTcpPorts));
        }

        /**
         * @param transportTcpPorts Port Number List
         * 
         * @return builder
         * 
         */
        public Builder transportTcpPorts(LoggingIpv4HostVrfTransportTransportTcpPortArgs... transportTcpPorts) {
            return transportTcpPorts(List.of(transportTcpPorts));
        }

        /**
         * @param transportTlsPorts Port Number List
         * 
         * @return builder
         * 
         */
        public Builder transportTlsPorts(@Nullable Output<List<LoggingIpv4HostVrfTransportTransportTlsPortArgs>> transportTlsPorts) {
            $.transportTlsPorts = transportTlsPorts;
            return this;
        }

        /**
         * @param transportTlsPorts Port Number List
         * 
         * @return builder
         * 
         */
        public Builder transportTlsPorts(List<LoggingIpv4HostVrfTransportTransportTlsPortArgs> transportTlsPorts) {
            return transportTlsPorts(Output.of(transportTlsPorts));
        }

        /**
         * @param transportTlsPorts Port Number List
         * 
         * @return builder
         * 
         */
        public Builder transportTlsPorts(LoggingIpv4HostVrfTransportTransportTlsPortArgs... transportTlsPorts) {
            return transportTlsPorts(List.of(transportTlsPorts));
        }

        /**
         * @param transportUdpPorts Port Number List
         * 
         * @return builder
         * 
         */
        public Builder transportUdpPorts(@Nullable Output<List<LoggingIpv4HostVrfTransportTransportUdpPortArgs>> transportUdpPorts) {
            $.transportUdpPorts = transportUdpPorts;
            return this;
        }

        /**
         * @param transportUdpPorts Port Number List
         * 
         * @return builder
         * 
         */
        public Builder transportUdpPorts(List<LoggingIpv4HostVrfTransportTransportUdpPortArgs> transportUdpPorts) {
            return transportUdpPorts(Output.of(transportUdpPorts));
        }

        /**
         * @param transportUdpPorts Port Number List
         * 
         * @return builder
         * 
         */
        public Builder transportUdpPorts(LoggingIpv4HostVrfTransportTransportUdpPortArgs... transportUdpPorts) {
            return transportUdpPorts(List.of(transportUdpPorts));
        }

        /**
         * @param vrf Set VRF option
         * 
         * @return builder
         * 
         */
        public Builder vrf(Output<String> vrf) {
            $.vrf = vrf;
            return this;
        }

        /**
         * @param vrf Set VRF option
         * 
         * @return builder
         * 
         */
        public Builder vrf(String vrf) {
            return vrf(Output.of(vrf));
        }

        public LoggingIpv4HostVrfTransportArgs build() {
            $.ipv4Host = Objects.requireNonNull($.ipv4Host, "expected parameter 'ipv4Host' to be non-null");
            $.vrf = Objects.requireNonNull($.vrf, "expected parameter 'vrf' to be non-null");
            return $;
        }
    }

}
