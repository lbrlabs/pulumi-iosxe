// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.GetLoggingIpv6HostVrfTransportTransportTcpPort;
import com.pulumi.iosxe.iosxe.outputs.GetLoggingIpv6HostVrfTransportTransportTlsPort;
import com.pulumi.iosxe.iosxe.outputs.GetLoggingIpv6HostVrfTransportTransportUdpPort;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLoggingIpv6HostVrfTransportResult {
    /**
     * @return A device name from the provider configuration.
     * 
     */
    private @Nullable String device;
    /**
     * @return The path of the retrieved object.
     * 
     */
    private String id;
    private String ipv6Host;
    /**
     * @return Port Number List
     * 
     */
    private List<GetLoggingIpv6HostVrfTransportTransportTcpPort> transportTcpPorts;
    /**
     * @return Port Number List
     * 
     */
    private List<GetLoggingIpv6HostVrfTransportTransportTlsPort> transportTlsPorts;
    /**
     * @return Port Number List
     * 
     */
    private List<GetLoggingIpv6HostVrfTransportTransportUdpPort> transportUdpPorts;
    /**
     * @return Set VRF option
     * 
     */
    private String vrf;

    private GetLoggingIpv6HostVrfTransportResult() {}
    /**
     * @return A device name from the provider configuration.
     * 
     */
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }
    /**
     * @return The path of the retrieved object.
     * 
     */
    public String id() {
        return this.id;
    }
    public String ipv6Host() {
        return this.ipv6Host;
    }
    /**
     * @return Port Number List
     * 
     */
    public List<GetLoggingIpv6HostVrfTransportTransportTcpPort> transportTcpPorts() {
        return this.transportTcpPorts;
    }
    /**
     * @return Port Number List
     * 
     */
    public List<GetLoggingIpv6HostVrfTransportTransportTlsPort> transportTlsPorts() {
        return this.transportTlsPorts;
    }
    /**
     * @return Port Number List
     * 
     */
    public List<GetLoggingIpv6HostVrfTransportTransportUdpPort> transportUdpPorts() {
        return this.transportUdpPorts;
    }
    /**
     * @return Set VRF option
     * 
     */
    public String vrf() {
        return this.vrf;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoggingIpv6HostVrfTransportResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String device;
        private String id;
        private String ipv6Host;
        private List<GetLoggingIpv6HostVrfTransportTransportTcpPort> transportTcpPorts;
        private List<GetLoggingIpv6HostVrfTransportTransportTlsPort> transportTlsPorts;
        private List<GetLoggingIpv6HostVrfTransportTransportUdpPort> transportUdpPorts;
        private String vrf;
        public Builder() {}
        public Builder(GetLoggingIpv6HostVrfTransportResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.device = defaults.device;
    	      this.id = defaults.id;
    	      this.ipv6Host = defaults.ipv6Host;
    	      this.transportTcpPorts = defaults.transportTcpPorts;
    	      this.transportTlsPorts = defaults.transportTlsPorts;
    	      this.transportUdpPorts = defaults.transportUdpPorts;
    	      this.vrf = defaults.vrf;
        }

        @CustomType.Setter
        public Builder device(@Nullable String device) {
            this.device = device;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6Host(String ipv6Host) {
            this.ipv6Host = Objects.requireNonNull(ipv6Host);
            return this;
        }
        @CustomType.Setter
        public Builder transportTcpPorts(List<GetLoggingIpv6HostVrfTransportTransportTcpPort> transportTcpPorts) {
            this.transportTcpPorts = Objects.requireNonNull(transportTcpPorts);
            return this;
        }
        public Builder transportTcpPorts(GetLoggingIpv6HostVrfTransportTransportTcpPort... transportTcpPorts) {
            return transportTcpPorts(List.of(transportTcpPorts));
        }
        @CustomType.Setter
        public Builder transportTlsPorts(List<GetLoggingIpv6HostVrfTransportTransportTlsPort> transportTlsPorts) {
            this.transportTlsPorts = Objects.requireNonNull(transportTlsPorts);
            return this;
        }
        public Builder transportTlsPorts(GetLoggingIpv6HostVrfTransportTransportTlsPort... transportTlsPorts) {
            return transportTlsPorts(List.of(transportTlsPorts));
        }
        @CustomType.Setter
        public Builder transportUdpPorts(List<GetLoggingIpv6HostVrfTransportTransportUdpPort> transportUdpPorts) {
            this.transportUdpPorts = Objects.requireNonNull(transportUdpPorts);
            return this;
        }
        public Builder transportUdpPorts(GetLoggingIpv6HostVrfTransportTransportUdpPort... transportUdpPorts) {
            return transportUdpPorts(List.of(transportUdpPorts));
        }
        @CustomType.Setter
        public Builder vrf(String vrf) {
            this.vrf = Objects.requireNonNull(vrf);
            return this;
        }
        public GetLoggingIpv6HostVrfTransportResult build() {
            final var o = new GetLoggingIpv6HostVrfTransportResult();
            o.device = device;
            o.id = id;
            o.ipv6Host = ipv6Host;
            o.transportTcpPorts = transportTcpPorts;
            o.transportTlsPorts = transportTlsPorts;
            o.transportUdpPorts = transportUdpPorts;
            o.vrf = vrf;
            return o;
        }
    }
}
