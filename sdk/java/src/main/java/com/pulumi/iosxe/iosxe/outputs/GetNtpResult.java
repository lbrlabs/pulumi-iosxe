// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.GetNtpAuthenticationKey;
import com.pulumi.iosxe.iosxe.outputs.GetNtpPeer;
import com.pulumi.iosxe.iosxe.outputs.GetNtpPeerVrf;
import com.pulumi.iosxe.iosxe.outputs.GetNtpServer;
import com.pulumi.iosxe.iosxe.outputs.GetNtpServerVrf;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNtpResult {
    private String accessGroupPeerAcl;
    private String accessGroupQueryOnlyAcl;
    private String accessGroupServeAcl;
    private String accessGroupServeOnlyAcl;
    /**
     * @return Authenticate time sources
     * 
     */
    private Boolean authenticate;
    /**
     * @return Authentication key for trusted time sources
     * 
     */
    private List<GetNtpAuthenticationKey> authenticationKeys;
    /**
     * @return Length of hardware clock tick
     * 
     */
    private Integer clockPeriod;
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
    /**
     * @return Enable NTP message logging
     * 
     */
    private Boolean logging;
    /**
     * @return Act as NTP master clock
     * 
     */
    private Boolean master;
    private Integer masterStratum;
    /**
     * @return NTP passive mode
     * 
     */
    private Boolean passive;
    /**
     * @return VPN Routing/Forwarding Information
     * 
     */
    private List<GetNtpPeerVrf> peerVrfs;
    private List<GetNtpPeer> peers;
    /**
     * @return VPN Routing/Forwarding Information
     * 
     */
    private List<GetNtpServerVrf> serverVrfs;
    private List<GetNtpServer> servers;
    /**
     * @return Forty GigabitEthernet
     * 
     */
    private String trapSourceFortyGigabitEthernet;
    /**
     * @return GigabitEthernet IEEE 802.3z
     * 
     */
    private String trapSourceGigabitEthernet;
    /**
     * @return Hundred GigabitEthernet
     * 
     */
    private String trapSourceHundredGigE;
    /**
     * @return Loopback interface
     * 
     */
    private Integer trapSourceLoopback;
    /**
     * @return Ethernet Channel of interfaces
     * 
     */
    private Integer trapSourcePortChannel;
    private String trapSourcePortChannelSubinterface;
    /**
     * @return Ten Gigabit Ethernet
     * 
     */
    private String trapSourceTenGigabitEthernet;
    /**
     * @return Iosxr Vlans
     * 
     */
    private Integer trapSourceVlan;
    /**
     * @return Periodically update calendar with NTP time
     * 
     */
    private Boolean updateCalendar;

    private GetNtpResult() {}
    public String accessGroupPeerAcl() {
        return this.accessGroupPeerAcl;
    }
    public String accessGroupQueryOnlyAcl() {
        return this.accessGroupQueryOnlyAcl;
    }
    public String accessGroupServeAcl() {
        return this.accessGroupServeAcl;
    }
    public String accessGroupServeOnlyAcl() {
        return this.accessGroupServeOnlyAcl;
    }
    /**
     * @return Authenticate time sources
     * 
     */
    public Boolean authenticate() {
        return this.authenticate;
    }
    /**
     * @return Authentication key for trusted time sources
     * 
     */
    public List<GetNtpAuthenticationKey> authenticationKeys() {
        return this.authenticationKeys;
    }
    /**
     * @return Length of hardware clock tick
     * 
     */
    public Integer clockPeriod() {
        return this.clockPeriod;
    }
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
    /**
     * @return Enable NTP message logging
     * 
     */
    public Boolean logging() {
        return this.logging;
    }
    /**
     * @return Act as NTP master clock
     * 
     */
    public Boolean master() {
        return this.master;
    }
    public Integer masterStratum() {
        return this.masterStratum;
    }
    /**
     * @return NTP passive mode
     * 
     */
    public Boolean passive() {
        return this.passive;
    }
    /**
     * @return VPN Routing/Forwarding Information
     * 
     */
    public List<GetNtpPeerVrf> peerVrfs() {
        return this.peerVrfs;
    }
    public List<GetNtpPeer> peers() {
        return this.peers;
    }
    /**
     * @return VPN Routing/Forwarding Information
     * 
     */
    public List<GetNtpServerVrf> serverVrfs() {
        return this.serverVrfs;
    }
    public List<GetNtpServer> servers() {
        return this.servers;
    }
    /**
     * @return Forty GigabitEthernet
     * 
     */
    public String trapSourceFortyGigabitEthernet() {
        return this.trapSourceFortyGigabitEthernet;
    }
    /**
     * @return GigabitEthernet IEEE 802.3z
     * 
     */
    public String trapSourceGigabitEthernet() {
        return this.trapSourceGigabitEthernet;
    }
    /**
     * @return Hundred GigabitEthernet
     * 
     */
    public String trapSourceHundredGigE() {
        return this.trapSourceHundredGigE;
    }
    /**
     * @return Loopback interface
     * 
     */
    public Integer trapSourceLoopback() {
        return this.trapSourceLoopback;
    }
    /**
     * @return Ethernet Channel of interfaces
     * 
     */
    public Integer trapSourcePortChannel() {
        return this.trapSourcePortChannel;
    }
    public String trapSourcePortChannelSubinterface() {
        return this.trapSourcePortChannelSubinterface;
    }
    /**
     * @return Ten Gigabit Ethernet
     * 
     */
    public String trapSourceTenGigabitEthernet() {
        return this.trapSourceTenGigabitEthernet;
    }
    /**
     * @return Iosxr Vlans
     * 
     */
    public Integer trapSourceVlan() {
        return this.trapSourceVlan;
    }
    /**
     * @return Periodically update calendar with NTP time
     * 
     */
    public Boolean updateCalendar() {
        return this.updateCalendar;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNtpResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessGroupPeerAcl;
        private String accessGroupQueryOnlyAcl;
        private String accessGroupServeAcl;
        private String accessGroupServeOnlyAcl;
        private Boolean authenticate;
        private List<GetNtpAuthenticationKey> authenticationKeys;
        private Integer clockPeriod;
        private @Nullable String device;
        private String id;
        private Boolean logging;
        private Boolean master;
        private Integer masterStratum;
        private Boolean passive;
        private List<GetNtpPeerVrf> peerVrfs;
        private List<GetNtpPeer> peers;
        private List<GetNtpServerVrf> serverVrfs;
        private List<GetNtpServer> servers;
        private String trapSourceFortyGigabitEthernet;
        private String trapSourceGigabitEthernet;
        private String trapSourceHundredGigE;
        private Integer trapSourceLoopback;
        private Integer trapSourcePortChannel;
        private String trapSourcePortChannelSubinterface;
        private String trapSourceTenGigabitEthernet;
        private Integer trapSourceVlan;
        private Boolean updateCalendar;
        public Builder() {}
        public Builder(GetNtpResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessGroupPeerAcl = defaults.accessGroupPeerAcl;
    	      this.accessGroupQueryOnlyAcl = defaults.accessGroupQueryOnlyAcl;
    	      this.accessGroupServeAcl = defaults.accessGroupServeAcl;
    	      this.accessGroupServeOnlyAcl = defaults.accessGroupServeOnlyAcl;
    	      this.authenticate = defaults.authenticate;
    	      this.authenticationKeys = defaults.authenticationKeys;
    	      this.clockPeriod = defaults.clockPeriod;
    	      this.device = defaults.device;
    	      this.id = defaults.id;
    	      this.logging = defaults.logging;
    	      this.master = defaults.master;
    	      this.masterStratum = defaults.masterStratum;
    	      this.passive = defaults.passive;
    	      this.peerVrfs = defaults.peerVrfs;
    	      this.peers = defaults.peers;
    	      this.serverVrfs = defaults.serverVrfs;
    	      this.servers = defaults.servers;
    	      this.trapSourceFortyGigabitEthernet = defaults.trapSourceFortyGigabitEthernet;
    	      this.trapSourceGigabitEthernet = defaults.trapSourceGigabitEthernet;
    	      this.trapSourceHundredGigE = defaults.trapSourceHundredGigE;
    	      this.trapSourceLoopback = defaults.trapSourceLoopback;
    	      this.trapSourcePortChannel = defaults.trapSourcePortChannel;
    	      this.trapSourcePortChannelSubinterface = defaults.trapSourcePortChannelSubinterface;
    	      this.trapSourceTenGigabitEthernet = defaults.trapSourceTenGigabitEthernet;
    	      this.trapSourceVlan = defaults.trapSourceVlan;
    	      this.updateCalendar = defaults.updateCalendar;
        }

        @CustomType.Setter
        public Builder accessGroupPeerAcl(String accessGroupPeerAcl) {
            this.accessGroupPeerAcl = Objects.requireNonNull(accessGroupPeerAcl);
            return this;
        }
        @CustomType.Setter
        public Builder accessGroupQueryOnlyAcl(String accessGroupQueryOnlyAcl) {
            this.accessGroupQueryOnlyAcl = Objects.requireNonNull(accessGroupQueryOnlyAcl);
            return this;
        }
        @CustomType.Setter
        public Builder accessGroupServeAcl(String accessGroupServeAcl) {
            this.accessGroupServeAcl = Objects.requireNonNull(accessGroupServeAcl);
            return this;
        }
        @CustomType.Setter
        public Builder accessGroupServeOnlyAcl(String accessGroupServeOnlyAcl) {
            this.accessGroupServeOnlyAcl = Objects.requireNonNull(accessGroupServeOnlyAcl);
            return this;
        }
        @CustomType.Setter
        public Builder authenticate(Boolean authenticate) {
            this.authenticate = Objects.requireNonNull(authenticate);
            return this;
        }
        @CustomType.Setter
        public Builder authenticationKeys(List<GetNtpAuthenticationKey> authenticationKeys) {
            this.authenticationKeys = Objects.requireNonNull(authenticationKeys);
            return this;
        }
        public Builder authenticationKeys(GetNtpAuthenticationKey... authenticationKeys) {
            return authenticationKeys(List.of(authenticationKeys));
        }
        @CustomType.Setter
        public Builder clockPeriod(Integer clockPeriod) {
            this.clockPeriod = Objects.requireNonNull(clockPeriod);
            return this;
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
        public Builder logging(Boolean logging) {
            this.logging = Objects.requireNonNull(logging);
            return this;
        }
        @CustomType.Setter
        public Builder master(Boolean master) {
            this.master = Objects.requireNonNull(master);
            return this;
        }
        @CustomType.Setter
        public Builder masterStratum(Integer masterStratum) {
            this.masterStratum = Objects.requireNonNull(masterStratum);
            return this;
        }
        @CustomType.Setter
        public Builder passive(Boolean passive) {
            this.passive = Objects.requireNonNull(passive);
            return this;
        }
        @CustomType.Setter
        public Builder peerVrfs(List<GetNtpPeerVrf> peerVrfs) {
            this.peerVrfs = Objects.requireNonNull(peerVrfs);
            return this;
        }
        public Builder peerVrfs(GetNtpPeerVrf... peerVrfs) {
            return peerVrfs(List.of(peerVrfs));
        }
        @CustomType.Setter
        public Builder peers(List<GetNtpPeer> peers) {
            this.peers = Objects.requireNonNull(peers);
            return this;
        }
        public Builder peers(GetNtpPeer... peers) {
            return peers(List.of(peers));
        }
        @CustomType.Setter
        public Builder serverVrfs(List<GetNtpServerVrf> serverVrfs) {
            this.serverVrfs = Objects.requireNonNull(serverVrfs);
            return this;
        }
        public Builder serverVrfs(GetNtpServerVrf... serverVrfs) {
            return serverVrfs(List.of(serverVrfs));
        }
        @CustomType.Setter
        public Builder servers(List<GetNtpServer> servers) {
            this.servers = Objects.requireNonNull(servers);
            return this;
        }
        public Builder servers(GetNtpServer... servers) {
            return servers(List.of(servers));
        }
        @CustomType.Setter
        public Builder trapSourceFortyGigabitEthernet(String trapSourceFortyGigabitEthernet) {
            this.trapSourceFortyGigabitEthernet = Objects.requireNonNull(trapSourceFortyGigabitEthernet);
            return this;
        }
        @CustomType.Setter
        public Builder trapSourceGigabitEthernet(String trapSourceGigabitEthernet) {
            this.trapSourceGigabitEthernet = Objects.requireNonNull(trapSourceGigabitEthernet);
            return this;
        }
        @CustomType.Setter
        public Builder trapSourceHundredGigE(String trapSourceHundredGigE) {
            this.trapSourceHundredGigE = Objects.requireNonNull(trapSourceHundredGigE);
            return this;
        }
        @CustomType.Setter
        public Builder trapSourceLoopback(Integer trapSourceLoopback) {
            this.trapSourceLoopback = Objects.requireNonNull(trapSourceLoopback);
            return this;
        }
        @CustomType.Setter
        public Builder trapSourcePortChannel(Integer trapSourcePortChannel) {
            this.trapSourcePortChannel = Objects.requireNonNull(trapSourcePortChannel);
            return this;
        }
        @CustomType.Setter
        public Builder trapSourcePortChannelSubinterface(String trapSourcePortChannelSubinterface) {
            this.trapSourcePortChannelSubinterface = Objects.requireNonNull(trapSourcePortChannelSubinterface);
            return this;
        }
        @CustomType.Setter
        public Builder trapSourceTenGigabitEthernet(String trapSourceTenGigabitEthernet) {
            this.trapSourceTenGigabitEthernet = Objects.requireNonNull(trapSourceTenGigabitEthernet);
            return this;
        }
        @CustomType.Setter
        public Builder trapSourceVlan(Integer trapSourceVlan) {
            this.trapSourceVlan = Objects.requireNonNull(trapSourceVlan);
            return this;
        }
        @CustomType.Setter
        public Builder updateCalendar(Boolean updateCalendar) {
            this.updateCalendar = Objects.requireNonNull(updateCalendar);
            return this;
        }
        public GetNtpResult build() {
            final var o = new GetNtpResult();
            o.accessGroupPeerAcl = accessGroupPeerAcl;
            o.accessGroupQueryOnlyAcl = accessGroupQueryOnlyAcl;
            o.accessGroupServeAcl = accessGroupServeAcl;
            o.accessGroupServeOnlyAcl = accessGroupServeOnlyAcl;
            o.authenticate = authenticate;
            o.authenticationKeys = authenticationKeys;
            o.clockPeriod = clockPeriod;
            o.device = device;
            o.id = id;
            o.logging = logging;
            o.master = master;
            o.masterStratum = masterStratum;
            o.passive = passive;
            o.peerVrfs = peerVrfs;
            o.peers = peers;
            o.serverVrfs = serverVrfs;
            o.servers = servers;
            o.trapSourceFortyGigabitEthernet = trapSourceFortyGigabitEthernet;
            o.trapSourceGigabitEthernet = trapSourceGigabitEthernet;
            o.trapSourceHundredGigE = trapSourceHundredGigE;
            o.trapSourceLoopback = trapSourceLoopback;
            o.trapSourcePortChannel = trapSourcePortChannel;
            o.trapSourcePortChannelSubinterface = trapSourcePortChannelSubinterface;
            o.trapSourceTenGigabitEthernet = trapSourceTenGigabitEthernet;
            o.trapSourceVlan = trapSourceVlan;
            o.updateCalendar = updateCalendar;
            return o;
        }
    }
}
