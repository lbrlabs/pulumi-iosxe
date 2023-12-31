// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.iosxe.iosxe.inputs.NtpAuthenticationKeyArgs;
import com.pulumi.iosxe.iosxe.inputs.NtpPeerArgs;
import com.pulumi.iosxe.iosxe.inputs.NtpPeerVrfArgs;
import com.pulumi.iosxe.iosxe.inputs.NtpServerArgs;
import com.pulumi.iosxe.iosxe.inputs.NtpServerVrfArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NtpArgs extends com.pulumi.resources.ResourceArgs {

    public static final NtpArgs Empty = new NtpArgs();

    @Import(name="accessGroupPeerAcl")
    private @Nullable Output<String> accessGroupPeerAcl;

    public Optional<Output<String>> accessGroupPeerAcl() {
        return Optional.ofNullable(this.accessGroupPeerAcl);
    }

    @Import(name="accessGroupQueryOnlyAcl")
    private @Nullable Output<String> accessGroupQueryOnlyAcl;

    public Optional<Output<String>> accessGroupQueryOnlyAcl() {
        return Optional.ofNullable(this.accessGroupQueryOnlyAcl);
    }

    @Import(name="accessGroupServeAcl")
    private @Nullable Output<String> accessGroupServeAcl;

    public Optional<Output<String>> accessGroupServeAcl() {
        return Optional.ofNullable(this.accessGroupServeAcl);
    }

    @Import(name="accessGroupServeOnlyAcl")
    private @Nullable Output<String> accessGroupServeOnlyAcl;

    public Optional<Output<String>> accessGroupServeOnlyAcl() {
        return Optional.ofNullable(this.accessGroupServeOnlyAcl);
    }

    /**
     * Authenticate time sources
     * 
     */
    @Import(name="authenticate")
    private @Nullable Output<Boolean> authenticate;

    /**
     * @return Authenticate time sources
     * 
     */
    public Optional<Output<Boolean>> authenticate() {
        return Optional.ofNullable(this.authenticate);
    }

    /**
     * Authentication key for trusted time sources
     * 
     */
    @Import(name="authenticationKeys")
    private @Nullable Output<List<NtpAuthenticationKeyArgs>> authenticationKeys;

    /**
     * @return Authentication key for trusted time sources
     * 
     */
    public Optional<Output<List<NtpAuthenticationKeyArgs>>> authenticationKeys() {
        return Optional.ofNullable(this.authenticationKeys);
    }

    /**
     * Length of hardware clock tick - Range: `0`-`4294967295`
     * 
     */
    @Import(name="clockPeriod")
    private @Nullable Output<Integer> clockPeriod;

    /**
     * @return Length of hardware clock tick - Range: `0`-`4294967295`
     * 
     */
    public Optional<Output<Integer>> clockPeriod() {
        return Optional.ofNullable(this.clockPeriod);
    }

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

    /**
     * Enable NTP message logging
     * 
     */
    @Import(name="logging")
    private @Nullable Output<Boolean> logging;

    /**
     * @return Enable NTP message logging
     * 
     */
    public Optional<Output<Boolean>> logging() {
        return Optional.ofNullable(this.logging);
    }

    /**
     * Act as NTP master clock
     * 
     */
    @Import(name="master")
    private @Nullable Output<Boolean> master;

    /**
     * @return Act as NTP master clock
     * 
     */
    public Optional<Output<Boolean>> master() {
        return Optional.ofNullable(this.master);
    }

    /**
     * - Range: `1`-`15`
     * 
     */
    @Import(name="masterStratum")
    private @Nullable Output<Integer> masterStratum;

    /**
     * @return - Range: `1`-`15`
     * 
     */
    public Optional<Output<Integer>> masterStratum() {
        return Optional.ofNullable(this.masterStratum);
    }

    /**
     * NTP passive mode
     * 
     */
    @Import(name="passive")
    private @Nullable Output<Boolean> passive;

    /**
     * @return NTP passive mode
     * 
     */
    public Optional<Output<Boolean>> passive() {
        return Optional.ofNullable(this.passive);
    }

    /**
     * VPN Routing/Forwarding Information
     * 
     */
    @Import(name="peerVrfs")
    private @Nullable Output<List<NtpPeerVrfArgs>> peerVrfs;

    /**
     * @return VPN Routing/Forwarding Information
     * 
     */
    public Optional<Output<List<NtpPeerVrfArgs>>> peerVrfs() {
        return Optional.ofNullable(this.peerVrfs);
    }

    @Import(name="peers")
    private @Nullable Output<List<NtpPeerArgs>> peers;

    public Optional<Output<List<NtpPeerArgs>>> peers() {
        return Optional.ofNullable(this.peers);
    }

    /**
     * VPN Routing/Forwarding Information
     * 
     */
    @Import(name="serverVrfs")
    private @Nullable Output<List<NtpServerVrfArgs>> serverVrfs;

    /**
     * @return VPN Routing/Forwarding Information
     * 
     */
    public Optional<Output<List<NtpServerVrfArgs>>> serverVrfs() {
        return Optional.ofNullable(this.serverVrfs);
    }

    @Import(name="servers")
    private @Nullable Output<List<NtpServerArgs>> servers;

    public Optional<Output<List<NtpServerArgs>>> servers() {
        return Optional.ofNullable(this.servers);
    }

    /**
     * Forty GigabitEthernet
     * 
     */
    @Import(name="trapSourceFortyGigabitEthernet")
    private @Nullable Output<String> trapSourceFortyGigabitEthernet;

    /**
     * @return Forty GigabitEthernet
     * 
     */
    public Optional<Output<String>> trapSourceFortyGigabitEthernet() {
        return Optional.ofNullable(this.trapSourceFortyGigabitEthernet);
    }

    /**
     * GigabitEthernet IEEE 802.3z
     * 
     */
    @Import(name="trapSourceGigabitEthernet")
    private @Nullable Output<String> trapSourceGigabitEthernet;

    /**
     * @return GigabitEthernet IEEE 802.3z
     * 
     */
    public Optional<Output<String>> trapSourceGigabitEthernet() {
        return Optional.ofNullable(this.trapSourceGigabitEthernet);
    }

    /**
     * Hundred GigabitEthernet
     * 
     */
    @Import(name="trapSourceHundredGigE")
    private @Nullable Output<String> trapSourceHundredGigE;

    /**
     * @return Hundred GigabitEthernet
     * 
     */
    public Optional<Output<String>> trapSourceHundredGigE() {
        return Optional.ofNullable(this.trapSourceHundredGigE);
    }

    /**
     * Loopback interface - Range: `0`-`2147483647`
     * 
     */
    @Import(name="trapSourceLoopback")
    private @Nullable Output<Integer> trapSourceLoopback;

    /**
     * @return Loopback interface - Range: `0`-`2147483647`
     * 
     */
    public Optional<Output<Integer>> trapSourceLoopback() {
        return Optional.ofNullable(this.trapSourceLoopback);
    }

    /**
     * Ethernet Channel of interfaces - Range: `0`-`4294967295`
     * 
     */
    @Import(name="trapSourcePortChannel")
    private @Nullable Output<Integer> trapSourcePortChannel;

    /**
     * @return Ethernet Channel of interfaces - Range: `0`-`4294967295`
     * 
     */
    public Optional<Output<Integer>> trapSourcePortChannel() {
        return Optional.ofNullable(this.trapSourcePortChannel);
    }

    @Import(name="trapSourcePortChannelSubinterface")
    private @Nullable Output<String> trapSourcePortChannelSubinterface;

    public Optional<Output<String>> trapSourcePortChannelSubinterface() {
        return Optional.ofNullable(this.trapSourcePortChannelSubinterface);
    }

    /**
     * Ten Gigabit Ethernet
     * 
     */
    @Import(name="trapSourceTenGigabitEthernet")
    private @Nullable Output<String> trapSourceTenGigabitEthernet;

    /**
     * @return Ten Gigabit Ethernet
     * 
     */
    public Optional<Output<String>> trapSourceTenGigabitEthernet() {
        return Optional.ofNullable(this.trapSourceTenGigabitEthernet);
    }

    /**
     * Iosxr Vlans - Range: `0`-`65535`
     * 
     */
    @Import(name="trapSourceVlan")
    private @Nullable Output<Integer> trapSourceVlan;

    /**
     * @return Iosxr Vlans - Range: `0`-`65535`
     * 
     */
    public Optional<Output<Integer>> trapSourceVlan() {
        return Optional.ofNullable(this.trapSourceVlan);
    }

    /**
     * Periodically update calendar with NTP time
     * 
     */
    @Import(name="updateCalendar")
    private @Nullable Output<Boolean> updateCalendar;

    /**
     * @return Periodically update calendar with NTP time
     * 
     */
    public Optional<Output<Boolean>> updateCalendar() {
        return Optional.ofNullable(this.updateCalendar);
    }

    private NtpArgs() {}

    private NtpArgs(NtpArgs $) {
        this.accessGroupPeerAcl = $.accessGroupPeerAcl;
        this.accessGroupQueryOnlyAcl = $.accessGroupQueryOnlyAcl;
        this.accessGroupServeAcl = $.accessGroupServeAcl;
        this.accessGroupServeOnlyAcl = $.accessGroupServeOnlyAcl;
        this.authenticate = $.authenticate;
        this.authenticationKeys = $.authenticationKeys;
        this.clockPeriod = $.clockPeriod;
        this.deleteMode = $.deleteMode;
        this.device = $.device;
        this.logging = $.logging;
        this.master = $.master;
        this.masterStratum = $.masterStratum;
        this.passive = $.passive;
        this.peerVrfs = $.peerVrfs;
        this.peers = $.peers;
        this.serverVrfs = $.serverVrfs;
        this.servers = $.servers;
        this.trapSourceFortyGigabitEthernet = $.trapSourceFortyGigabitEthernet;
        this.trapSourceGigabitEthernet = $.trapSourceGigabitEthernet;
        this.trapSourceHundredGigE = $.trapSourceHundredGigE;
        this.trapSourceLoopback = $.trapSourceLoopback;
        this.trapSourcePortChannel = $.trapSourcePortChannel;
        this.trapSourcePortChannelSubinterface = $.trapSourcePortChannelSubinterface;
        this.trapSourceTenGigabitEthernet = $.trapSourceTenGigabitEthernet;
        this.trapSourceVlan = $.trapSourceVlan;
        this.updateCalendar = $.updateCalendar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NtpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NtpArgs $;

        public Builder() {
            $ = new NtpArgs();
        }

        public Builder(NtpArgs defaults) {
            $ = new NtpArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessGroupPeerAcl(@Nullable Output<String> accessGroupPeerAcl) {
            $.accessGroupPeerAcl = accessGroupPeerAcl;
            return this;
        }

        public Builder accessGroupPeerAcl(String accessGroupPeerAcl) {
            return accessGroupPeerAcl(Output.of(accessGroupPeerAcl));
        }

        public Builder accessGroupQueryOnlyAcl(@Nullable Output<String> accessGroupQueryOnlyAcl) {
            $.accessGroupQueryOnlyAcl = accessGroupQueryOnlyAcl;
            return this;
        }

        public Builder accessGroupQueryOnlyAcl(String accessGroupQueryOnlyAcl) {
            return accessGroupQueryOnlyAcl(Output.of(accessGroupQueryOnlyAcl));
        }

        public Builder accessGroupServeAcl(@Nullable Output<String> accessGroupServeAcl) {
            $.accessGroupServeAcl = accessGroupServeAcl;
            return this;
        }

        public Builder accessGroupServeAcl(String accessGroupServeAcl) {
            return accessGroupServeAcl(Output.of(accessGroupServeAcl));
        }

        public Builder accessGroupServeOnlyAcl(@Nullable Output<String> accessGroupServeOnlyAcl) {
            $.accessGroupServeOnlyAcl = accessGroupServeOnlyAcl;
            return this;
        }

        public Builder accessGroupServeOnlyAcl(String accessGroupServeOnlyAcl) {
            return accessGroupServeOnlyAcl(Output.of(accessGroupServeOnlyAcl));
        }

        /**
         * @param authenticate Authenticate time sources
         * 
         * @return builder
         * 
         */
        public Builder authenticate(@Nullable Output<Boolean> authenticate) {
            $.authenticate = authenticate;
            return this;
        }

        /**
         * @param authenticate Authenticate time sources
         * 
         * @return builder
         * 
         */
        public Builder authenticate(Boolean authenticate) {
            return authenticate(Output.of(authenticate));
        }

        /**
         * @param authenticationKeys Authentication key for trusted time sources
         * 
         * @return builder
         * 
         */
        public Builder authenticationKeys(@Nullable Output<List<NtpAuthenticationKeyArgs>> authenticationKeys) {
            $.authenticationKeys = authenticationKeys;
            return this;
        }

        /**
         * @param authenticationKeys Authentication key for trusted time sources
         * 
         * @return builder
         * 
         */
        public Builder authenticationKeys(List<NtpAuthenticationKeyArgs> authenticationKeys) {
            return authenticationKeys(Output.of(authenticationKeys));
        }

        /**
         * @param authenticationKeys Authentication key for trusted time sources
         * 
         * @return builder
         * 
         */
        public Builder authenticationKeys(NtpAuthenticationKeyArgs... authenticationKeys) {
            return authenticationKeys(List.of(authenticationKeys));
        }

        /**
         * @param clockPeriod Length of hardware clock tick - Range: `0`-`4294967295`
         * 
         * @return builder
         * 
         */
        public Builder clockPeriod(@Nullable Output<Integer> clockPeriod) {
            $.clockPeriod = clockPeriod;
            return this;
        }

        /**
         * @param clockPeriod Length of hardware clock tick - Range: `0`-`4294967295`
         * 
         * @return builder
         * 
         */
        public Builder clockPeriod(Integer clockPeriod) {
            return clockPeriod(Output.of(clockPeriod));
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

        /**
         * @param logging Enable NTP message logging
         * 
         * @return builder
         * 
         */
        public Builder logging(@Nullable Output<Boolean> logging) {
            $.logging = logging;
            return this;
        }

        /**
         * @param logging Enable NTP message logging
         * 
         * @return builder
         * 
         */
        public Builder logging(Boolean logging) {
            return logging(Output.of(logging));
        }

        /**
         * @param master Act as NTP master clock
         * 
         * @return builder
         * 
         */
        public Builder master(@Nullable Output<Boolean> master) {
            $.master = master;
            return this;
        }

        /**
         * @param master Act as NTP master clock
         * 
         * @return builder
         * 
         */
        public Builder master(Boolean master) {
            return master(Output.of(master));
        }

        /**
         * @param masterStratum - Range: `1`-`15`
         * 
         * @return builder
         * 
         */
        public Builder masterStratum(@Nullable Output<Integer> masterStratum) {
            $.masterStratum = masterStratum;
            return this;
        }

        /**
         * @param masterStratum - Range: `1`-`15`
         * 
         * @return builder
         * 
         */
        public Builder masterStratum(Integer masterStratum) {
            return masterStratum(Output.of(masterStratum));
        }

        /**
         * @param passive NTP passive mode
         * 
         * @return builder
         * 
         */
        public Builder passive(@Nullable Output<Boolean> passive) {
            $.passive = passive;
            return this;
        }

        /**
         * @param passive NTP passive mode
         * 
         * @return builder
         * 
         */
        public Builder passive(Boolean passive) {
            return passive(Output.of(passive));
        }

        /**
         * @param peerVrfs VPN Routing/Forwarding Information
         * 
         * @return builder
         * 
         */
        public Builder peerVrfs(@Nullable Output<List<NtpPeerVrfArgs>> peerVrfs) {
            $.peerVrfs = peerVrfs;
            return this;
        }

        /**
         * @param peerVrfs VPN Routing/Forwarding Information
         * 
         * @return builder
         * 
         */
        public Builder peerVrfs(List<NtpPeerVrfArgs> peerVrfs) {
            return peerVrfs(Output.of(peerVrfs));
        }

        /**
         * @param peerVrfs VPN Routing/Forwarding Information
         * 
         * @return builder
         * 
         */
        public Builder peerVrfs(NtpPeerVrfArgs... peerVrfs) {
            return peerVrfs(List.of(peerVrfs));
        }

        public Builder peers(@Nullable Output<List<NtpPeerArgs>> peers) {
            $.peers = peers;
            return this;
        }

        public Builder peers(List<NtpPeerArgs> peers) {
            return peers(Output.of(peers));
        }

        public Builder peers(NtpPeerArgs... peers) {
            return peers(List.of(peers));
        }

        /**
         * @param serverVrfs VPN Routing/Forwarding Information
         * 
         * @return builder
         * 
         */
        public Builder serverVrfs(@Nullable Output<List<NtpServerVrfArgs>> serverVrfs) {
            $.serverVrfs = serverVrfs;
            return this;
        }

        /**
         * @param serverVrfs VPN Routing/Forwarding Information
         * 
         * @return builder
         * 
         */
        public Builder serverVrfs(List<NtpServerVrfArgs> serverVrfs) {
            return serverVrfs(Output.of(serverVrfs));
        }

        /**
         * @param serverVrfs VPN Routing/Forwarding Information
         * 
         * @return builder
         * 
         */
        public Builder serverVrfs(NtpServerVrfArgs... serverVrfs) {
            return serverVrfs(List.of(serverVrfs));
        }

        public Builder servers(@Nullable Output<List<NtpServerArgs>> servers) {
            $.servers = servers;
            return this;
        }

        public Builder servers(List<NtpServerArgs> servers) {
            return servers(Output.of(servers));
        }

        public Builder servers(NtpServerArgs... servers) {
            return servers(List.of(servers));
        }

        /**
         * @param trapSourceFortyGigabitEthernet Forty GigabitEthernet
         * 
         * @return builder
         * 
         */
        public Builder trapSourceFortyGigabitEthernet(@Nullable Output<String> trapSourceFortyGigabitEthernet) {
            $.trapSourceFortyGigabitEthernet = trapSourceFortyGigabitEthernet;
            return this;
        }

        /**
         * @param trapSourceFortyGigabitEthernet Forty GigabitEthernet
         * 
         * @return builder
         * 
         */
        public Builder trapSourceFortyGigabitEthernet(String trapSourceFortyGigabitEthernet) {
            return trapSourceFortyGigabitEthernet(Output.of(trapSourceFortyGigabitEthernet));
        }

        /**
         * @param trapSourceGigabitEthernet GigabitEthernet IEEE 802.3z
         * 
         * @return builder
         * 
         */
        public Builder trapSourceGigabitEthernet(@Nullable Output<String> trapSourceGigabitEthernet) {
            $.trapSourceGigabitEthernet = trapSourceGigabitEthernet;
            return this;
        }

        /**
         * @param trapSourceGigabitEthernet GigabitEthernet IEEE 802.3z
         * 
         * @return builder
         * 
         */
        public Builder trapSourceGigabitEthernet(String trapSourceGigabitEthernet) {
            return trapSourceGigabitEthernet(Output.of(trapSourceGigabitEthernet));
        }

        /**
         * @param trapSourceHundredGigE Hundred GigabitEthernet
         * 
         * @return builder
         * 
         */
        public Builder trapSourceHundredGigE(@Nullable Output<String> trapSourceHundredGigE) {
            $.trapSourceHundredGigE = trapSourceHundredGigE;
            return this;
        }

        /**
         * @param trapSourceHundredGigE Hundred GigabitEthernet
         * 
         * @return builder
         * 
         */
        public Builder trapSourceHundredGigE(String trapSourceHundredGigE) {
            return trapSourceHundredGigE(Output.of(trapSourceHundredGigE));
        }

        /**
         * @param trapSourceLoopback Loopback interface - Range: `0`-`2147483647`
         * 
         * @return builder
         * 
         */
        public Builder trapSourceLoopback(@Nullable Output<Integer> trapSourceLoopback) {
            $.trapSourceLoopback = trapSourceLoopback;
            return this;
        }

        /**
         * @param trapSourceLoopback Loopback interface - Range: `0`-`2147483647`
         * 
         * @return builder
         * 
         */
        public Builder trapSourceLoopback(Integer trapSourceLoopback) {
            return trapSourceLoopback(Output.of(trapSourceLoopback));
        }

        /**
         * @param trapSourcePortChannel Ethernet Channel of interfaces - Range: `0`-`4294967295`
         * 
         * @return builder
         * 
         */
        public Builder trapSourcePortChannel(@Nullable Output<Integer> trapSourcePortChannel) {
            $.trapSourcePortChannel = trapSourcePortChannel;
            return this;
        }

        /**
         * @param trapSourcePortChannel Ethernet Channel of interfaces - Range: `0`-`4294967295`
         * 
         * @return builder
         * 
         */
        public Builder trapSourcePortChannel(Integer trapSourcePortChannel) {
            return trapSourcePortChannel(Output.of(trapSourcePortChannel));
        }

        public Builder trapSourcePortChannelSubinterface(@Nullable Output<String> trapSourcePortChannelSubinterface) {
            $.trapSourcePortChannelSubinterface = trapSourcePortChannelSubinterface;
            return this;
        }

        public Builder trapSourcePortChannelSubinterface(String trapSourcePortChannelSubinterface) {
            return trapSourcePortChannelSubinterface(Output.of(trapSourcePortChannelSubinterface));
        }

        /**
         * @param trapSourceTenGigabitEthernet Ten Gigabit Ethernet
         * 
         * @return builder
         * 
         */
        public Builder trapSourceTenGigabitEthernet(@Nullable Output<String> trapSourceTenGigabitEthernet) {
            $.trapSourceTenGigabitEthernet = trapSourceTenGigabitEthernet;
            return this;
        }

        /**
         * @param trapSourceTenGigabitEthernet Ten Gigabit Ethernet
         * 
         * @return builder
         * 
         */
        public Builder trapSourceTenGigabitEthernet(String trapSourceTenGigabitEthernet) {
            return trapSourceTenGigabitEthernet(Output.of(trapSourceTenGigabitEthernet));
        }

        /**
         * @param trapSourceVlan Iosxr Vlans - Range: `0`-`65535`
         * 
         * @return builder
         * 
         */
        public Builder trapSourceVlan(@Nullable Output<Integer> trapSourceVlan) {
            $.trapSourceVlan = trapSourceVlan;
            return this;
        }

        /**
         * @param trapSourceVlan Iosxr Vlans - Range: `0`-`65535`
         * 
         * @return builder
         * 
         */
        public Builder trapSourceVlan(Integer trapSourceVlan) {
            return trapSourceVlan(Output.of(trapSourceVlan));
        }

        /**
         * @param updateCalendar Periodically update calendar with NTP time
         * 
         * @return builder
         * 
         */
        public Builder updateCalendar(@Nullable Output<Boolean> updateCalendar) {
            $.updateCalendar = updateCalendar;
            return this;
        }

        /**
         * @param updateCalendar Periodically update calendar with NTP time
         * 
         * @return builder
         * 
         */
        public Builder updateCalendar(Boolean updateCalendar) {
            return updateCalendar(Output.of(updateCalendar));
        }

        public NtpArgs build() {
            return $;
        }
    }

}
