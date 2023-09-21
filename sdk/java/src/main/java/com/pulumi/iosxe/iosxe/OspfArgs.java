// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.iosxe.iosxe.inputs.OspfAreaArgs;
import com.pulumi.iosxe.iosxe.inputs.OspfNeighborArgs;
import com.pulumi.iosxe.iosxe.inputs.OspfNetworkArgs;
import com.pulumi.iosxe.iosxe.inputs.OspfSummaryAddressArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OspfArgs extends com.pulumi.resources.ResourceArgs {

    public static final OspfArgs Empty = new OspfArgs();

    /**
     * OSPF area parameters
     * 
     */
    @Import(name="areas")
    private @Nullable Output<List<OspfAreaArgs>> areas;

    /**
     * @return OSPF area parameters
     * 
     */
    public Optional<Output<List<OspfAreaArgs>>> areas() {
        return Optional.ofNullable(this.areas);
    }

    /**
     * Enable BFD on all interfaces
     * 
     */
    @Import(name="bfdAllInterfaces")
    private @Nullable Output<Boolean> bfdAllInterfaces;

    /**
     * @return Enable BFD on all interfaces
     * 
     */
    public Optional<Output<Boolean>> bfdAllInterfaces() {
        return Optional.ofNullable(this.bfdAllInterfaces);
    }

    /**
     * Distribute a default route
     * 
     */
    @Import(name="defaultInformationOriginate")
    private @Nullable Output<Boolean> defaultInformationOriginate;

    /**
     * @return Distribute a default route
     * 
     */
    public Optional<Output<Boolean>> defaultInformationOriginate() {
        return Optional.ofNullable(this.defaultInformationOriginate);
    }

    /**
     * Always advertise default route
     * 
     */
    @Import(name="defaultInformationOriginateAlways")
    private @Nullable Output<Boolean> defaultInformationOriginateAlways;

    /**
     * @return Always advertise default route
     * 
     */
    public Optional<Output<Boolean>> defaultInformationOriginateAlways() {
        return Optional.ofNullable(this.defaultInformationOriginateAlways);
    }

    /**
     * Set metric of redistributed routes - Range: `1`-`16777214`
     * 
     */
    @Import(name="defaultMetric")
    private @Nullable Output<Integer> defaultMetric;

    /**
     * @return Set metric of redistributed routes - Range: `1`-`16777214`
     * 
     */
    public Optional<Output<Integer>> defaultMetric() {
        return Optional.ofNullable(this.defaultMetric);
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
     * Administrative distance - Range: `1`-`255`
     * 
     */
    @Import(name="distance")
    private @Nullable Output<Integer> distance;

    /**
     * @return Administrative distance - Range: `1`-`255`
     * 
     */
    public Optional<Output<Integer>> distance() {
        return Optional.ofNullable(this.distance);
    }

    /**
     * OSPF domain-tag - Range: `1`-`4294967295`
     * 
     */
    @Import(name="domainTag")
    private @Nullable Output<Integer> domainTag;

    /**
     * @return OSPF domain-tag - Range: `1`-`4294967295`
     * 
     */
    public Optional<Output<Integer>> domainTag() {
        return Optional.ofNullable(this.domainTag);
    }

    /**
     * Configure LDP automatic configuration
     * 
     */
    @Import(name="mplsLdpAutoconfig")
    private @Nullable Output<Boolean> mplsLdpAutoconfig;

    /**
     * @return Configure LDP automatic configuration
     * 
     */
    public Optional<Output<Boolean>> mplsLdpAutoconfig() {
        return Optional.ofNullable(this.mplsLdpAutoconfig);
    }

    /**
     * Configure LDP-IGP Synchronization
     * 
     */
    @Import(name="mplsLdpSync")
    private @Nullable Output<Boolean> mplsLdpSync;

    /**
     * @return Configure LDP-IGP Synchronization
     * 
     */
    public Optional<Output<Boolean>> mplsLdpSync() {
        return Optional.ofNullable(this.mplsLdpSync);
    }

    /**
     * Specify a neighbor router
     * 
     */
    @Import(name="neighbors")
    private @Nullable Output<List<OspfNeighborArgs>> neighbors;

    /**
     * @return Specify a neighbor router
     * 
     */
    public Optional<Output<List<OspfNeighborArgs>>> neighbors() {
        return Optional.ofNullable(this.neighbors);
    }

    /**
     * Enable routing on an IP network
     * 
     */
    @Import(name="networks")
    private @Nullable Output<List<OspfNetworkArgs>> networks;

    /**
     * @return Enable routing on an IP network
     * 
     */
    public Optional<Output<List<OspfNetworkArgs>>> networks() {
        return Optional.ofNullable(this.networks);
    }

    /**
     * Suppress routing updates on all interfaces
     * 
     */
    @Import(name="passiveInterfaceDefault")
    private @Nullable Output<Boolean> passiveInterfaceDefault;

    /**
     * @return Suppress routing updates on all interfaces
     * 
     */
    public Optional<Output<Boolean>> passiveInterfaceDefault() {
        return Optional.ofNullable(this.passiveInterfaceDefault);
    }

    /**
     * OSPF topology priority - Range: `0`-`127`
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return OSPF topology priority - Range: `0`-`127`
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * Process ID - Range: `1`-`65535`
     * 
     */
    @Import(name="processId", required=true)
    private Output<Integer> processId;

    /**
     * @return Process ID - Range: `1`-`65535`
     * 
     */
    public Output<Integer> processId() {
        return this.processId;
    }

    /**
     * Override configured router identifier (peers will reset)
     * 
     */
    @Import(name="routerId")
    private @Nullable Output<String> routerId;

    /**
     * @return Override configured router identifier (peers will reset)
     * 
     */
    public Optional<Output<String>> routerId() {
        return Optional.ofNullable(this.routerId);
    }

    /**
     * Shutdown the OSPF protocol under the current instance
     * 
     */
    @Import(name="shutdown")
    private @Nullable Output<Boolean> shutdown;

    /**
     * @return Shutdown the OSPF protocol under the current instance
     * 
     */
    public Optional<Output<Boolean>> shutdown() {
        return Optional.ofNullable(this.shutdown);
    }

    /**
     * Configure IP address summaries
     * 
     */
    @Import(name="summaryAddresses")
    private @Nullable Output<List<OspfSummaryAddressArgs>> summaryAddresses;

    /**
     * @return Configure IP address summaries
     * 
     */
    public Optional<Output<List<OspfSummaryAddressArgs>>> summaryAddresses() {
        return Optional.ofNullable(this.summaryAddresses);
    }

    private OspfArgs() {}

    private OspfArgs(OspfArgs $) {
        this.areas = $.areas;
        this.bfdAllInterfaces = $.bfdAllInterfaces;
        this.defaultInformationOriginate = $.defaultInformationOriginate;
        this.defaultInformationOriginateAlways = $.defaultInformationOriginateAlways;
        this.defaultMetric = $.defaultMetric;
        this.deleteMode = $.deleteMode;
        this.device = $.device;
        this.distance = $.distance;
        this.domainTag = $.domainTag;
        this.mplsLdpAutoconfig = $.mplsLdpAutoconfig;
        this.mplsLdpSync = $.mplsLdpSync;
        this.neighbors = $.neighbors;
        this.networks = $.networks;
        this.passiveInterfaceDefault = $.passiveInterfaceDefault;
        this.priority = $.priority;
        this.processId = $.processId;
        this.routerId = $.routerId;
        this.shutdown = $.shutdown;
        this.summaryAddresses = $.summaryAddresses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OspfArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OspfArgs $;

        public Builder() {
            $ = new OspfArgs();
        }

        public Builder(OspfArgs defaults) {
            $ = new OspfArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param areas OSPF area parameters
         * 
         * @return builder
         * 
         */
        public Builder areas(@Nullable Output<List<OspfAreaArgs>> areas) {
            $.areas = areas;
            return this;
        }

        /**
         * @param areas OSPF area parameters
         * 
         * @return builder
         * 
         */
        public Builder areas(List<OspfAreaArgs> areas) {
            return areas(Output.of(areas));
        }

        /**
         * @param areas OSPF area parameters
         * 
         * @return builder
         * 
         */
        public Builder areas(OspfAreaArgs... areas) {
            return areas(List.of(areas));
        }

        /**
         * @param bfdAllInterfaces Enable BFD on all interfaces
         * 
         * @return builder
         * 
         */
        public Builder bfdAllInterfaces(@Nullable Output<Boolean> bfdAllInterfaces) {
            $.bfdAllInterfaces = bfdAllInterfaces;
            return this;
        }

        /**
         * @param bfdAllInterfaces Enable BFD on all interfaces
         * 
         * @return builder
         * 
         */
        public Builder bfdAllInterfaces(Boolean bfdAllInterfaces) {
            return bfdAllInterfaces(Output.of(bfdAllInterfaces));
        }

        /**
         * @param defaultInformationOriginate Distribute a default route
         * 
         * @return builder
         * 
         */
        public Builder defaultInformationOriginate(@Nullable Output<Boolean> defaultInformationOriginate) {
            $.defaultInformationOriginate = defaultInformationOriginate;
            return this;
        }

        /**
         * @param defaultInformationOriginate Distribute a default route
         * 
         * @return builder
         * 
         */
        public Builder defaultInformationOriginate(Boolean defaultInformationOriginate) {
            return defaultInformationOriginate(Output.of(defaultInformationOriginate));
        }

        /**
         * @param defaultInformationOriginateAlways Always advertise default route
         * 
         * @return builder
         * 
         */
        public Builder defaultInformationOriginateAlways(@Nullable Output<Boolean> defaultInformationOriginateAlways) {
            $.defaultInformationOriginateAlways = defaultInformationOriginateAlways;
            return this;
        }

        /**
         * @param defaultInformationOriginateAlways Always advertise default route
         * 
         * @return builder
         * 
         */
        public Builder defaultInformationOriginateAlways(Boolean defaultInformationOriginateAlways) {
            return defaultInformationOriginateAlways(Output.of(defaultInformationOriginateAlways));
        }

        /**
         * @param defaultMetric Set metric of redistributed routes - Range: `1`-`16777214`
         * 
         * @return builder
         * 
         */
        public Builder defaultMetric(@Nullable Output<Integer> defaultMetric) {
            $.defaultMetric = defaultMetric;
            return this;
        }

        /**
         * @param defaultMetric Set metric of redistributed routes - Range: `1`-`16777214`
         * 
         * @return builder
         * 
         */
        public Builder defaultMetric(Integer defaultMetric) {
            return defaultMetric(Output.of(defaultMetric));
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
         * @param distance Administrative distance - Range: `1`-`255`
         * 
         * @return builder
         * 
         */
        public Builder distance(@Nullable Output<Integer> distance) {
            $.distance = distance;
            return this;
        }

        /**
         * @param distance Administrative distance - Range: `1`-`255`
         * 
         * @return builder
         * 
         */
        public Builder distance(Integer distance) {
            return distance(Output.of(distance));
        }

        /**
         * @param domainTag OSPF domain-tag - Range: `1`-`4294967295`
         * 
         * @return builder
         * 
         */
        public Builder domainTag(@Nullable Output<Integer> domainTag) {
            $.domainTag = domainTag;
            return this;
        }

        /**
         * @param domainTag OSPF domain-tag - Range: `1`-`4294967295`
         * 
         * @return builder
         * 
         */
        public Builder domainTag(Integer domainTag) {
            return domainTag(Output.of(domainTag));
        }

        /**
         * @param mplsLdpAutoconfig Configure LDP automatic configuration
         * 
         * @return builder
         * 
         */
        public Builder mplsLdpAutoconfig(@Nullable Output<Boolean> mplsLdpAutoconfig) {
            $.mplsLdpAutoconfig = mplsLdpAutoconfig;
            return this;
        }

        /**
         * @param mplsLdpAutoconfig Configure LDP automatic configuration
         * 
         * @return builder
         * 
         */
        public Builder mplsLdpAutoconfig(Boolean mplsLdpAutoconfig) {
            return mplsLdpAutoconfig(Output.of(mplsLdpAutoconfig));
        }

        /**
         * @param mplsLdpSync Configure LDP-IGP Synchronization
         * 
         * @return builder
         * 
         */
        public Builder mplsLdpSync(@Nullable Output<Boolean> mplsLdpSync) {
            $.mplsLdpSync = mplsLdpSync;
            return this;
        }

        /**
         * @param mplsLdpSync Configure LDP-IGP Synchronization
         * 
         * @return builder
         * 
         */
        public Builder mplsLdpSync(Boolean mplsLdpSync) {
            return mplsLdpSync(Output.of(mplsLdpSync));
        }

        /**
         * @param neighbors Specify a neighbor router
         * 
         * @return builder
         * 
         */
        public Builder neighbors(@Nullable Output<List<OspfNeighborArgs>> neighbors) {
            $.neighbors = neighbors;
            return this;
        }

        /**
         * @param neighbors Specify a neighbor router
         * 
         * @return builder
         * 
         */
        public Builder neighbors(List<OspfNeighborArgs> neighbors) {
            return neighbors(Output.of(neighbors));
        }

        /**
         * @param neighbors Specify a neighbor router
         * 
         * @return builder
         * 
         */
        public Builder neighbors(OspfNeighborArgs... neighbors) {
            return neighbors(List.of(neighbors));
        }

        /**
         * @param networks Enable routing on an IP network
         * 
         * @return builder
         * 
         */
        public Builder networks(@Nullable Output<List<OspfNetworkArgs>> networks) {
            $.networks = networks;
            return this;
        }

        /**
         * @param networks Enable routing on an IP network
         * 
         * @return builder
         * 
         */
        public Builder networks(List<OspfNetworkArgs> networks) {
            return networks(Output.of(networks));
        }

        /**
         * @param networks Enable routing on an IP network
         * 
         * @return builder
         * 
         */
        public Builder networks(OspfNetworkArgs... networks) {
            return networks(List.of(networks));
        }

        /**
         * @param passiveInterfaceDefault Suppress routing updates on all interfaces
         * 
         * @return builder
         * 
         */
        public Builder passiveInterfaceDefault(@Nullable Output<Boolean> passiveInterfaceDefault) {
            $.passiveInterfaceDefault = passiveInterfaceDefault;
            return this;
        }

        /**
         * @param passiveInterfaceDefault Suppress routing updates on all interfaces
         * 
         * @return builder
         * 
         */
        public Builder passiveInterfaceDefault(Boolean passiveInterfaceDefault) {
            return passiveInterfaceDefault(Output.of(passiveInterfaceDefault));
        }

        /**
         * @param priority OSPF topology priority - Range: `0`-`127`
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority OSPF topology priority - Range: `0`-`127`
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param processId Process ID - Range: `1`-`65535`
         * 
         * @return builder
         * 
         */
        public Builder processId(Output<Integer> processId) {
            $.processId = processId;
            return this;
        }

        /**
         * @param processId Process ID - Range: `1`-`65535`
         * 
         * @return builder
         * 
         */
        public Builder processId(Integer processId) {
            return processId(Output.of(processId));
        }

        /**
         * @param routerId Override configured router identifier (peers will reset)
         * 
         * @return builder
         * 
         */
        public Builder routerId(@Nullable Output<String> routerId) {
            $.routerId = routerId;
            return this;
        }

        /**
         * @param routerId Override configured router identifier (peers will reset)
         * 
         * @return builder
         * 
         */
        public Builder routerId(String routerId) {
            return routerId(Output.of(routerId));
        }

        /**
         * @param shutdown Shutdown the OSPF protocol under the current instance
         * 
         * @return builder
         * 
         */
        public Builder shutdown(@Nullable Output<Boolean> shutdown) {
            $.shutdown = shutdown;
            return this;
        }

        /**
         * @param shutdown Shutdown the OSPF protocol under the current instance
         * 
         * @return builder
         * 
         */
        public Builder shutdown(Boolean shutdown) {
            return shutdown(Output.of(shutdown));
        }

        /**
         * @param summaryAddresses Configure IP address summaries
         * 
         * @return builder
         * 
         */
        public Builder summaryAddresses(@Nullable Output<List<OspfSummaryAddressArgs>> summaryAddresses) {
            $.summaryAddresses = summaryAddresses;
            return this;
        }

        /**
         * @param summaryAddresses Configure IP address summaries
         * 
         * @return builder
         * 
         */
        public Builder summaryAddresses(List<OspfSummaryAddressArgs> summaryAddresses) {
            return summaryAddresses(Output.of(summaryAddresses));
        }

        /**
         * @param summaryAddresses Configure IP address summaries
         * 
         * @return builder
         * 
         */
        public Builder summaryAddresses(OspfSummaryAddressArgs... summaryAddresses) {
            return summaryAddresses(List.of(summaryAddresses));
        }

        public OspfArgs build() {
            $.processId = Objects.requireNonNull($.processId, "expected parameter 'processId' to be non-null");
            return $;
        }
    }

}