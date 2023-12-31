// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.iosxe.iosxe.inputs.SystemMulticastRoutingVrfArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SystemState extends com.pulumi.resources.ResourceArgs {

    public static final SystemState Empty = new SystemState();

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
     * Set system&#39;s network name
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return Set system&#39;s network name
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * Enable IP Domain Name System hostname translation
     * 
     */
    @Import(name="ipDomainLookup")
    private @Nullable Output<Boolean> ipDomainLookup;

    /**
     * @return Enable IP Domain Name System hostname translation
     * 
     */
    public Optional<Output<Boolean>> ipDomainLookup() {
        return Optional.ofNullable(this.ipDomainLookup);
    }

    /**
     * Define the default domain name
     * 
     */
    @Import(name="ipDomainName")
    private @Nullable Output<String> ipDomainName;

    /**
     * @return Define the default domain name
     * 
     */
    public Optional<Output<String>> ipDomainName() {
        return Optional.ofNullable(this.ipDomainName);
    }

    /**
     * Enable IP multicast forwarding
     * 
     */
    @Import(name="ipMulticastRouting")
    private @Nullable Output<Boolean> ipMulticastRouting;

    /**
     * @return Enable IP multicast forwarding
     * 
     */
    public Optional<Output<Boolean>> ipMulticastRouting() {
        return Optional.ofNullable(this.ipMulticastRouting);
    }

    /**
     * Distributed multicast switching
     * 
     */
    @Import(name="ipMulticastRoutingDistributed")
    private @Nullable Output<Boolean> ipMulticastRoutingDistributed;

    /**
     * @return Distributed multicast switching
     * 
     */
    public Optional<Output<Boolean>> ipMulticastRoutingDistributed() {
        return Optional.ofNullable(this.ipMulticastRoutingDistributed);
    }

    /**
     * Enable or disable IP routing
     * 
     */
    @Import(name="ipRouting")
    private @Nullable Output<Boolean> ipRouting;

    /**
     * @return Enable or disable IP routing
     * 
     */
    public Optional<Output<Boolean>> ipRouting() {
        return Optional.ofNullable(this.ipRouting);
    }

    /**
     * Process packets with source routing header options
     * 
     */
    @Import(name="ipSourceRoute")
    private @Nullable Output<Boolean> ipSourceRoute;

    /**
     * @return Process packets with source routing header options
     * 
     */
    public Optional<Output<Boolean>> ipSourceRoute() {
        return Optional.ofNullable(this.ipSourceRoute);
    }

    /**
     * Enable unicast routing
     * 
     */
    @Import(name="ipv6UnicastRouting")
    private @Nullable Output<Boolean> ipv6UnicastRouting;

    /**
     * @return Enable unicast routing
     * 
     */
    public Optional<Output<Boolean>> ipv6UnicastRouting() {
        return Optional.ofNullable(this.ipv6UnicastRouting);
    }

    /**
     * Set delay between successive fail login - Range: `1`-`10`
     * 
     */
    @Import(name="loginDelay")
    private @Nullable Output<Integer> loginDelay;

    /**
     * @return Set delay between successive fail login - Range: `1`-`10`
     * 
     */
    public Optional<Output<Integer>> loginDelay() {
        return Optional.ofNullable(this.loginDelay);
    }

    /**
     * Set options for failed login attempt
     * 
     */
    @Import(name="loginOnFailure")
    private @Nullable Output<Boolean> loginOnFailure;

    /**
     * @return Set options for failed login attempt
     * 
     */
    public Optional<Output<Boolean>> loginOnFailure() {
        return Optional.ofNullable(this.loginOnFailure);
    }

    /**
     * Generate syslogs on failure logins
     * 
     */
    @Import(name="loginOnFailureLog")
    private @Nullable Output<Boolean> loginOnFailureLog;

    /**
     * @return Generate syslogs on failure logins
     * 
     */
    public Optional<Output<Boolean>> loginOnFailureLog() {
        return Optional.ofNullable(this.loginOnFailureLog);
    }

    /**
     * Set options for successful login attempt
     * 
     */
    @Import(name="loginOnSuccess")
    private @Nullable Output<Boolean> loginOnSuccess;

    /**
     * @return Set options for successful login attempt
     * 
     */
    public Optional<Output<Boolean>> loginOnSuccess() {
        return Optional.ofNullable(this.loginOnSuccess);
    }

    /**
     * Generate syslogs on successful logins
     * 
     */
    @Import(name="loginOnSuccessLog")
    private @Nullable Output<Boolean> loginOnSuccessLog;

    /**
     * @return Generate syslogs on successful logins
     * 
     */
    public Optional<Output<Boolean>> loginOnSuccessLog() {
        return Optional.ofNullable(this.loginOnSuccessLog);
    }

    /**
     * - Range: `1500`-`9198`
     * 
     */
    @Import(name="mtu")
    private @Nullable Output<Integer> mtu;

    /**
     * @return - Range: `1500`-`9198`
     * 
     */
    public Optional<Output<Integer>> mtu() {
        return Optional.ofNullable(this.mtu);
    }

    /**
     * Enable IP multicast forwarding, some XE devices use this option instead of `multicast_routing`.
     * 
     */
    @Import(name="multicastRoutingSwitch")
    private @Nullable Output<Boolean> multicastRoutingSwitch;

    /**
     * @return Enable IP multicast forwarding, some XE devices use this option instead of `multicast_routing`.
     * 
     */
    public Optional<Output<Boolean>> multicastRoutingSwitch() {
        return Optional.ofNullable(this.multicastRoutingSwitch);
    }

    /**
     * Select VPN Routing/Forwarding instance
     * 
     */
    @Import(name="multicastRoutingVrfs")
    private @Nullable Output<List<SystemMulticastRoutingVrfArgs>> multicastRoutingVrfs;

    /**
     * @return Select VPN Routing/Forwarding instance
     * 
     */
    public Optional<Output<List<SystemMulticastRoutingVrfArgs>>> multicastRoutingVrfs() {
        return Optional.ofNullable(this.multicastRoutingVrfs);
    }

    private SystemState() {}

    private SystemState(SystemState $) {
        this.device = $.device;
        this.hostname = $.hostname;
        this.ipDomainLookup = $.ipDomainLookup;
        this.ipDomainName = $.ipDomainName;
        this.ipMulticastRouting = $.ipMulticastRouting;
        this.ipMulticastRoutingDistributed = $.ipMulticastRoutingDistributed;
        this.ipRouting = $.ipRouting;
        this.ipSourceRoute = $.ipSourceRoute;
        this.ipv6UnicastRouting = $.ipv6UnicastRouting;
        this.loginDelay = $.loginDelay;
        this.loginOnFailure = $.loginOnFailure;
        this.loginOnFailureLog = $.loginOnFailureLog;
        this.loginOnSuccess = $.loginOnSuccess;
        this.loginOnSuccessLog = $.loginOnSuccessLog;
        this.mtu = $.mtu;
        this.multicastRoutingSwitch = $.multicastRoutingSwitch;
        this.multicastRoutingVrfs = $.multicastRoutingVrfs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SystemState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SystemState $;

        public Builder() {
            $ = new SystemState();
        }

        public Builder(SystemState defaults) {
            $ = new SystemState(Objects.requireNonNull(defaults));
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
         * @param hostname Set system&#39;s network name
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname Set system&#39;s network name
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param ipDomainLookup Enable IP Domain Name System hostname translation
         * 
         * @return builder
         * 
         */
        public Builder ipDomainLookup(@Nullable Output<Boolean> ipDomainLookup) {
            $.ipDomainLookup = ipDomainLookup;
            return this;
        }

        /**
         * @param ipDomainLookup Enable IP Domain Name System hostname translation
         * 
         * @return builder
         * 
         */
        public Builder ipDomainLookup(Boolean ipDomainLookup) {
            return ipDomainLookup(Output.of(ipDomainLookup));
        }

        /**
         * @param ipDomainName Define the default domain name
         * 
         * @return builder
         * 
         */
        public Builder ipDomainName(@Nullable Output<String> ipDomainName) {
            $.ipDomainName = ipDomainName;
            return this;
        }

        /**
         * @param ipDomainName Define the default domain name
         * 
         * @return builder
         * 
         */
        public Builder ipDomainName(String ipDomainName) {
            return ipDomainName(Output.of(ipDomainName));
        }

        /**
         * @param ipMulticastRouting Enable IP multicast forwarding
         * 
         * @return builder
         * 
         */
        public Builder ipMulticastRouting(@Nullable Output<Boolean> ipMulticastRouting) {
            $.ipMulticastRouting = ipMulticastRouting;
            return this;
        }

        /**
         * @param ipMulticastRouting Enable IP multicast forwarding
         * 
         * @return builder
         * 
         */
        public Builder ipMulticastRouting(Boolean ipMulticastRouting) {
            return ipMulticastRouting(Output.of(ipMulticastRouting));
        }

        /**
         * @param ipMulticastRoutingDistributed Distributed multicast switching
         * 
         * @return builder
         * 
         */
        public Builder ipMulticastRoutingDistributed(@Nullable Output<Boolean> ipMulticastRoutingDistributed) {
            $.ipMulticastRoutingDistributed = ipMulticastRoutingDistributed;
            return this;
        }

        /**
         * @param ipMulticastRoutingDistributed Distributed multicast switching
         * 
         * @return builder
         * 
         */
        public Builder ipMulticastRoutingDistributed(Boolean ipMulticastRoutingDistributed) {
            return ipMulticastRoutingDistributed(Output.of(ipMulticastRoutingDistributed));
        }

        /**
         * @param ipRouting Enable or disable IP routing
         * 
         * @return builder
         * 
         */
        public Builder ipRouting(@Nullable Output<Boolean> ipRouting) {
            $.ipRouting = ipRouting;
            return this;
        }

        /**
         * @param ipRouting Enable or disable IP routing
         * 
         * @return builder
         * 
         */
        public Builder ipRouting(Boolean ipRouting) {
            return ipRouting(Output.of(ipRouting));
        }

        /**
         * @param ipSourceRoute Process packets with source routing header options
         * 
         * @return builder
         * 
         */
        public Builder ipSourceRoute(@Nullable Output<Boolean> ipSourceRoute) {
            $.ipSourceRoute = ipSourceRoute;
            return this;
        }

        /**
         * @param ipSourceRoute Process packets with source routing header options
         * 
         * @return builder
         * 
         */
        public Builder ipSourceRoute(Boolean ipSourceRoute) {
            return ipSourceRoute(Output.of(ipSourceRoute));
        }

        /**
         * @param ipv6UnicastRouting Enable unicast routing
         * 
         * @return builder
         * 
         */
        public Builder ipv6UnicastRouting(@Nullable Output<Boolean> ipv6UnicastRouting) {
            $.ipv6UnicastRouting = ipv6UnicastRouting;
            return this;
        }

        /**
         * @param ipv6UnicastRouting Enable unicast routing
         * 
         * @return builder
         * 
         */
        public Builder ipv6UnicastRouting(Boolean ipv6UnicastRouting) {
            return ipv6UnicastRouting(Output.of(ipv6UnicastRouting));
        }

        /**
         * @param loginDelay Set delay between successive fail login - Range: `1`-`10`
         * 
         * @return builder
         * 
         */
        public Builder loginDelay(@Nullable Output<Integer> loginDelay) {
            $.loginDelay = loginDelay;
            return this;
        }

        /**
         * @param loginDelay Set delay between successive fail login - Range: `1`-`10`
         * 
         * @return builder
         * 
         */
        public Builder loginDelay(Integer loginDelay) {
            return loginDelay(Output.of(loginDelay));
        }

        /**
         * @param loginOnFailure Set options for failed login attempt
         * 
         * @return builder
         * 
         */
        public Builder loginOnFailure(@Nullable Output<Boolean> loginOnFailure) {
            $.loginOnFailure = loginOnFailure;
            return this;
        }

        /**
         * @param loginOnFailure Set options for failed login attempt
         * 
         * @return builder
         * 
         */
        public Builder loginOnFailure(Boolean loginOnFailure) {
            return loginOnFailure(Output.of(loginOnFailure));
        }

        /**
         * @param loginOnFailureLog Generate syslogs on failure logins
         * 
         * @return builder
         * 
         */
        public Builder loginOnFailureLog(@Nullable Output<Boolean> loginOnFailureLog) {
            $.loginOnFailureLog = loginOnFailureLog;
            return this;
        }

        /**
         * @param loginOnFailureLog Generate syslogs on failure logins
         * 
         * @return builder
         * 
         */
        public Builder loginOnFailureLog(Boolean loginOnFailureLog) {
            return loginOnFailureLog(Output.of(loginOnFailureLog));
        }

        /**
         * @param loginOnSuccess Set options for successful login attempt
         * 
         * @return builder
         * 
         */
        public Builder loginOnSuccess(@Nullable Output<Boolean> loginOnSuccess) {
            $.loginOnSuccess = loginOnSuccess;
            return this;
        }

        /**
         * @param loginOnSuccess Set options for successful login attempt
         * 
         * @return builder
         * 
         */
        public Builder loginOnSuccess(Boolean loginOnSuccess) {
            return loginOnSuccess(Output.of(loginOnSuccess));
        }

        /**
         * @param loginOnSuccessLog Generate syslogs on successful logins
         * 
         * @return builder
         * 
         */
        public Builder loginOnSuccessLog(@Nullable Output<Boolean> loginOnSuccessLog) {
            $.loginOnSuccessLog = loginOnSuccessLog;
            return this;
        }

        /**
         * @param loginOnSuccessLog Generate syslogs on successful logins
         * 
         * @return builder
         * 
         */
        public Builder loginOnSuccessLog(Boolean loginOnSuccessLog) {
            return loginOnSuccessLog(Output.of(loginOnSuccessLog));
        }

        /**
         * @param mtu - Range: `1500`-`9198`
         * 
         * @return builder
         * 
         */
        public Builder mtu(@Nullable Output<Integer> mtu) {
            $.mtu = mtu;
            return this;
        }

        /**
         * @param mtu - Range: `1500`-`9198`
         * 
         * @return builder
         * 
         */
        public Builder mtu(Integer mtu) {
            return mtu(Output.of(mtu));
        }

        /**
         * @param multicastRoutingSwitch Enable IP multicast forwarding, some XE devices use this option instead of `multicast_routing`.
         * 
         * @return builder
         * 
         */
        public Builder multicastRoutingSwitch(@Nullable Output<Boolean> multicastRoutingSwitch) {
            $.multicastRoutingSwitch = multicastRoutingSwitch;
            return this;
        }

        /**
         * @param multicastRoutingSwitch Enable IP multicast forwarding, some XE devices use this option instead of `multicast_routing`.
         * 
         * @return builder
         * 
         */
        public Builder multicastRoutingSwitch(Boolean multicastRoutingSwitch) {
            return multicastRoutingSwitch(Output.of(multicastRoutingSwitch));
        }

        /**
         * @param multicastRoutingVrfs Select VPN Routing/Forwarding instance
         * 
         * @return builder
         * 
         */
        public Builder multicastRoutingVrfs(@Nullable Output<List<SystemMulticastRoutingVrfArgs>> multicastRoutingVrfs) {
            $.multicastRoutingVrfs = multicastRoutingVrfs;
            return this;
        }

        /**
         * @param multicastRoutingVrfs Select VPN Routing/Forwarding instance
         * 
         * @return builder
         * 
         */
        public Builder multicastRoutingVrfs(List<SystemMulticastRoutingVrfArgs> multicastRoutingVrfs) {
            return multicastRoutingVrfs(Output.of(multicastRoutingVrfs));
        }

        /**
         * @param multicastRoutingVrfs Select VPN Routing/Forwarding instance
         * 
         * @return builder
         * 
         */
        public Builder multicastRoutingVrfs(SystemMulticastRoutingVrfArgs... multicastRoutingVrfs) {
            return multicastRoutingVrfs(List.of(multicastRoutingVrfs));
        }

        public SystemState build() {
            return $;
        }
    }

}
