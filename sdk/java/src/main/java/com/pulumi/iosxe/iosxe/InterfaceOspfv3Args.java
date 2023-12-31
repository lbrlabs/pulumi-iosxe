// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InterfaceOspfv3Args extends com.pulumi.resources.ResourceArgs {

    public static final InterfaceOspfv3Args Empty = new InterfaceOspfv3Args();

    /**
     * Static route cost value of the interface - Range: `1`-`65535`
     * 
     */
    @Import(name="cost")
    private @Nullable Output<Integer> cost;

    /**
     * @return Static route cost value of the interface - Range: `1`-`65535`
     * 
     */
    public Optional<Output<Integer>> cost() {
        return Optional.ofNullable(this.cost);
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

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specify OSPF broadcast multi-access network
     * 
     */
    @Import(name="networkTypeBroadcast")
    private @Nullable Output<Boolean> networkTypeBroadcast;

    /**
     * @return Specify OSPF broadcast multi-access network
     * 
     */
    public Optional<Output<Boolean>> networkTypeBroadcast() {
        return Optional.ofNullable(this.networkTypeBroadcast);
    }

    /**
     * Specify OSPF NBMA network
     * 
     */
    @Import(name="networkTypeNonBroadcast")
    private @Nullable Output<Boolean> networkTypeNonBroadcast;

    /**
     * @return Specify OSPF NBMA network
     * 
     */
    public Optional<Output<Boolean>> networkTypeNonBroadcast() {
        return Optional.ofNullable(this.networkTypeNonBroadcast);
    }

    /**
     * Specify OSPF point-to-multipoint network
     * 
     */
    @Import(name="networkTypePointToMultipoint")
    private @Nullable Output<Boolean> networkTypePointToMultipoint;

    /**
     * @return Specify OSPF point-to-multipoint network
     * 
     */
    public Optional<Output<Boolean>> networkTypePointToMultipoint() {
        return Optional.ofNullable(this.networkTypePointToMultipoint);
    }

    /**
     * Specify OSPF point-to-point network
     * 
     */
    @Import(name="networkTypePointToPoint")
    private @Nullable Output<Boolean> networkTypePointToPoint;

    /**
     * @return Specify OSPF point-to-point network
     * 
     */
    public Optional<Output<Boolean>> networkTypePointToPoint() {
        return Optional.ofNullable(this.networkTypePointToPoint);
    }

    /**
     * Interface type - Choices: `GigabitEthernet`, `TwoGigabitEthernet`, `FiveGigabitEthernet`, `TenGigabitEthernet`,
     * `TwentyFiveGigE`, `FortyGigabitEthernet`, `HundredGigE`, `TwoHundredGigE`, `FourHundredGigE`, `Loopback`, `Vlan`,
     * `Port-channel`
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Interface type - Choices: `GigabitEthernet`, `TwoGigabitEthernet`, `FiveGigabitEthernet`, `TenGigabitEthernet`,
     * `TwentyFiveGigE`, `FortyGigabitEthernet`, `HundredGigE`, `TwoHundredGigE`, `FourHundredGigE`, `Loopback`, `Vlan`,
     * `Port-channel`
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private InterfaceOspfv3Args() {}

    private InterfaceOspfv3Args(InterfaceOspfv3Args $) {
        this.cost = $.cost;
        this.deleteMode = $.deleteMode;
        this.device = $.device;
        this.name = $.name;
        this.networkTypeBroadcast = $.networkTypeBroadcast;
        this.networkTypeNonBroadcast = $.networkTypeNonBroadcast;
        this.networkTypePointToMultipoint = $.networkTypePointToMultipoint;
        this.networkTypePointToPoint = $.networkTypePointToPoint;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InterfaceOspfv3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InterfaceOspfv3Args $;

        public Builder() {
            $ = new InterfaceOspfv3Args();
        }

        public Builder(InterfaceOspfv3Args defaults) {
            $ = new InterfaceOspfv3Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param cost Static route cost value of the interface - Range: `1`-`65535`
         * 
         * @return builder
         * 
         */
        public Builder cost(@Nullable Output<Integer> cost) {
            $.cost = cost;
            return this;
        }

        /**
         * @param cost Static route cost value of the interface - Range: `1`-`65535`
         * 
         * @return builder
         * 
         */
        public Builder cost(Integer cost) {
            return cost(Output.of(cost));
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

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkTypeBroadcast Specify OSPF broadcast multi-access network
         * 
         * @return builder
         * 
         */
        public Builder networkTypeBroadcast(@Nullable Output<Boolean> networkTypeBroadcast) {
            $.networkTypeBroadcast = networkTypeBroadcast;
            return this;
        }

        /**
         * @param networkTypeBroadcast Specify OSPF broadcast multi-access network
         * 
         * @return builder
         * 
         */
        public Builder networkTypeBroadcast(Boolean networkTypeBroadcast) {
            return networkTypeBroadcast(Output.of(networkTypeBroadcast));
        }

        /**
         * @param networkTypeNonBroadcast Specify OSPF NBMA network
         * 
         * @return builder
         * 
         */
        public Builder networkTypeNonBroadcast(@Nullable Output<Boolean> networkTypeNonBroadcast) {
            $.networkTypeNonBroadcast = networkTypeNonBroadcast;
            return this;
        }

        /**
         * @param networkTypeNonBroadcast Specify OSPF NBMA network
         * 
         * @return builder
         * 
         */
        public Builder networkTypeNonBroadcast(Boolean networkTypeNonBroadcast) {
            return networkTypeNonBroadcast(Output.of(networkTypeNonBroadcast));
        }

        /**
         * @param networkTypePointToMultipoint Specify OSPF point-to-multipoint network
         * 
         * @return builder
         * 
         */
        public Builder networkTypePointToMultipoint(@Nullable Output<Boolean> networkTypePointToMultipoint) {
            $.networkTypePointToMultipoint = networkTypePointToMultipoint;
            return this;
        }

        /**
         * @param networkTypePointToMultipoint Specify OSPF point-to-multipoint network
         * 
         * @return builder
         * 
         */
        public Builder networkTypePointToMultipoint(Boolean networkTypePointToMultipoint) {
            return networkTypePointToMultipoint(Output.of(networkTypePointToMultipoint));
        }

        /**
         * @param networkTypePointToPoint Specify OSPF point-to-point network
         * 
         * @return builder
         * 
         */
        public Builder networkTypePointToPoint(@Nullable Output<Boolean> networkTypePointToPoint) {
            $.networkTypePointToPoint = networkTypePointToPoint;
            return this;
        }

        /**
         * @param networkTypePointToPoint Specify OSPF point-to-point network
         * 
         * @return builder
         * 
         */
        public Builder networkTypePointToPoint(Boolean networkTypePointToPoint) {
            return networkTypePointToPoint(Output.of(networkTypePointToPoint));
        }

        /**
         * @param type Interface type - Choices: `GigabitEthernet`, `TwoGigabitEthernet`, `FiveGigabitEthernet`, `TenGigabitEthernet`,
         * `TwentyFiveGigE`, `FortyGigabitEthernet`, `HundredGigE`, `TwoHundredGigE`, `FourHundredGigE`, `Loopback`, `Vlan`,
         * `Port-channel`
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Interface type - Choices: `GigabitEthernet`, `TwoGigabitEthernet`, `FiveGigabitEthernet`, `TenGigabitEthernet`,
         * `TwentyFiveGigE`, `FortyGigabitEthernet`, `HundredGigE`, `TwoHundredGigE`, `FourHundredGigE`, `Loopback`, `Vlan`,
         * `Port-channel`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public InterfaceOspfv3Args build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
