// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.iosxe.iosxe.inputs.ArpInspectionFilterArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ArpArgs extends com.pulumi.resources.ResourceArgs {

    public static final ArpArgs Empty = new ArpArgs();

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
     * Maximum learn entry limit - Range: `255`-`512000`
     * 
     */
    @Import(name="entryLearn")
    private @Nullable Output<Integer> entryLearn;

    /**
     * @return Maximum learn entry limit - Range: `255`-`512000`
     * 
     */
    public Optional<Output<Integer>> entryLearn() {
        return Optional.ofNullable(this.entryLearn);
    }

    /**
     * Specify the number of IP addresses to resolve - Range: `1`-`2147483647`
     * 
     */
    @Import(name="incompleteEntries")
    private @Nullable Output<Integer> incompleteEntries;

    /**
     * @return Specify the number of IP addresses to resolve - Range: `1`-`2147483647`
     * 
     */
    public Optional<Output<Integer>> incompleteEntries() {
        return Optional.ofNullable(this.incompleteEntries);
    }

    /**
     * Specify ARP acl to be applied
     * 
     */
    @Import(name="inspectionFilters")
    private @Nullable Output<List<ArpInspectionFilterArgs>> inspectionFilters;

    /**
     * @return Specify ARP acl to be applied
     * 
     */
    public Optional<Output<List<ArpInspectionFilterArgs>>> inspectionFilters() {
        return Optional.ofNullable(this.inspectionFilters);
    }

    /**
     * Number of entries for log buffer - Range: `0`-`1024`
     * 
     */
    @Import(name="inspectionLogBufferEntries")
    private @Nullable Output<Integer> inspectionLogBufferEntries;

    /**
     * @return Number of entries for log buffer - Range: `0`-`1024`
     * 
     */
    public Optional<Output<Integer>> inspectionLogBufferEntries() {
        return Optional.ofNullable(this.inspectionLogBufferEntries);
    }

    /**
     * Number of entries for log buffer - Range: `0`-`1024`
     * 
     */
    @Import(name="inspectionLogBufferLogsEntries")
    private @Nullable Output<Integer> inspectionLogBufferLogsEntries;

    /**
     * @return Number of entries for log buffer - Range: `0`-`1024`
     * 
     */
    public Optional<Output<Integer>> inspectionLogBufferLogsEntries() {
        return Optional.ofNullable(this.inspectionLogBufferLogsEntries);
    }

    /**
     * Interval for controlling logging rate - Range: `0`-`86400`
     * 
     */
    @Import(name="inspectionLogBufferLogsInterval")
    private @Nullable Output<Integer> inspectionLogBufferLogsInterval;

    /**
     * @return Interval for controlling logging rate - Range: `0`-`86400`
     * 
     */
    public Optional<Output<Integer>> inspectionLogBufferLogsInterval() {
        return Optional.ofNullable(this.inspectionLogBufferLogsInterval);
    }

    /**
     * Allow 0.0.0.0 sender IP address
     * 
     */
    @Import(name="inspectionValidateAllowZeros")
    private @Nullable Output<Boolean> inspectionValidateAllowZeros;

    /**
     * @return Allow 0.0.0.0 sender IP address
     * 
     */
    public Optional<Output<Boolean>> inspectionValidateAllowZeros() {
        return Optional.ofNullable(this.inspectionValidateAllowZeros);
    }

    /**
     * Validate destination MAC address
     * 
     */
    @Import(name="inspectionValidateDstMac")
    private @Nullable Output<Boolean> inspectionValidateDstMac;

    /**
     * @return Validate destination MAC address
     * 
     */
    public Optional<Output<Boolean>> inspectionValidateDstMac() {
        return Optional.ofNullable(this.inspectionValidateDstMac);
    }

    /**
     * Validate IP addresses
     * 
     */
    @Import(name="inspectionValidateIp")
    private @Nullable Output<Boolean> inspectionValidateIp;

    /**
     * @return Validate IP addresses
     * 
     */
    public Optional<Output<Boolean>> inspectionValidateIp() {
        return Optional.ofNullable(this.inspectionValidateIp);
    }

    /**
     * Validate source MAC address
     * 
     */
    @Import(name="inspectionValidateSrcMac")
    private @Nullable Output<Boolean> inspectionValidateSrcMac;

    /**
     * @return Validate source MAC address
     * 
     */
    public Optional<Output<Boolean>> inspectionValidateSrcMac() {
        return Optional.ofNullable(this.inspectionValidateSrcMac);
    }

    /**
     * Enable/Disable ARP Inspection on vlans
     * 
     */
    @Import(name="inspectionVlan")
    private @Nullable Output<String> inspectionVlan;

    /**
     * @return Enable/Disable ARP Inspection on vlans
     * 
     */
    public Optional<Output<String>> inspectionVlan() {
        return Optional.ofNullable(this.inspectionVlan);
    }

    /**
     * Disable proxy ARP on all interfaces
     * 
     */
    @Import(name="proxyDisable")
    private @Nullable Output<Boolean> proxyDisable;

    /**
     * @return Disable proxy ARP on all interfaces
     * 
     */
    public Optional<Output<Boolean>> proxyDisable() {
        return Optional.ofNullable(this.proxyDisable);
    }

    private ArpArgs() {}

    private ArpArgs(ArpArgs $) {
        this.deleteMode = $.deleteMode;
        this.device = $.device;
        this.entryLearn = $.entryLearn;
        this.incompleteEntries = $.incompleteEntries;
        this.inspectionFilters = $.inspectionFilters;
        this.inspectionLogBufferEntries = $.inspectionLogBufferEntries;
        this.inspectionLogBufferLogsEntries = $.inspectionLogBufferLogsEntries;
        this.inspectionLogBufferLogsInterval = $.inspectionLogBufferLogsInterval;
        this.inspectionValidateAllowZeros = $.inspectionValidateAllowZeros;
        this.inspectionValidateDstMac = $.inspectionValidateDstMac;
        this.inspectionValidateIp = $.inspectionValidateIp;
        this.inspectionValidateSrcMac = $.inspectionValidateSrcMac;
        this.inspectionVlan = $.inspectionVlan;
        this.proxyDisable = $.proxyDisable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ArpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ArpArgs $;

        public Builder() {
            $ = new ArpArgs();
        }

        public Builder(ArpArgs defaults) {
            $ = new ArpArgs(Objects.requireNonNull(defaults));
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
         * @param entryLearn Maximum learn entry limit - Range: `255`-`512000`
         * 
         * @return builder
         * 
         */
        public Builder entryLearn(@Nullable Output<Integer> entryLearn) {
            $.entryLearn = entryLearn;
            return this;
        }

        /**
         * @param entryLearn Maximum learn entry limit - Range: `255`-`512000`
         * 
         * @return builder
         * 
         */
        public Builder entryLearn(Integer entryLearn) {
            return entryLearn(Output.of(entryLearn));
        }

        /**
         * @param incompleteEntries Specify the number of IP addresses to resolve - Range: `1`-`2147483647`
         * 
         * @return builder
         * 
         */
        public Builder incompleteEntries(@Nullable Output<Integer> incompleteEntries) {
            $.incompleteEntries = incompleteEntries;
            return this;
        }

        /**
         * @param incompleteEntries Specify the number of IP addresses to resolve - Range: `1`-`2147483647`
         * 
         * @return builder
         * 
         */
        public Builder incompleteEntries(Integer incompleteEntries) {
            return incompleteEntries(Output.of(incompleteEntries));
        }

        /**
         * @param inspectionFilters Specify ARP acl to be applied
         * 
         * @return builder
         * 
         */
        public Builder inspectionFilters(@Nullable Output<List<ArpInspectionFilterArgs>> inspectionFilters) {
            $.inspectionFilters = inspectionFilters;
            return this;
        }

        /**
         * @param inspectionFilters Specify ARP acl to be applied
         * 
         * @return builder
         * 
         */
        public Builder inspectionFilters(List<ArpInspectionFilterArgs> inspectionFilters) {
            return inspectionFilters(Output.of(inspectionFilters));
        }

        /**
         * @param inspectionFilters Specify ARP acl to be applied
         * 
         * @return builder
         * 
         */
        public Builder inspectionFilters(ArpInspectionFilterArgs... inspectionFilters) {
            return inspectionFilters(List.of(inspectionFilters));
        }

        /**
         * @param inspectionLogBufferEntries Number of entries for log buffer - Range: `0`-`1024`
         * 
         * @return builder
         * 
         */
        public Builder inspectionLogBufferEntries(@Nullable Output<Integer> inspectionLogBufferEntries) {
            $.inspectionLogBufferEntries = inspectionLogBufferEntries;
            return this;
        }

        /**
         * @param inspectionLogBufferEntries Number of entries for log buffer - Range: `0`-`1024`
         * 
         * @return builder
         * 
         */
        public Builder inspectionLogBufferEntries(Integer inspectionLogBufferEntries) {
            return inspectionLogBufferEntries(Output.of(inspectionLogBufferEntries));
        }

        /**
         * @param inspectionLogBufferLogsEntries Number of entries for log buffer - Range: `0`-`1024`
         * 
         * @return builder
         * 
         */
        public Builder inspectionLogBufferLogsEntries(@Nullable Output<Integer> inspectionLogBufferLogsEntries) {
            $.inspectionLogBufferLogsEntries = inspectionLogBufferLogsEntries;
            return this;
        }

        /**
         * @param inspectionLogBufferLogsEntries Number of entries for log buffer - Range: `0`-`1024`
         * 
         * @return builder
         * 
         */
        public Builder inspectionLogBufferLogsEntries(Integer inspectionLogBufferLogsEntries) {
            return inspectionLogBufferLogsEntries(Output.of(inspectionLogBufferLogsEntries));
        }

        /**
         * @param inspectionLogBufferLogsInterval Interval for controlling logging rate - Range: `0`-`86400`
         * 
         * @return builder
         * 
         */
        public Builder inspectionLogBufferLogsInterval(@Nullable Output<Integer> inspectionLogBufferLogsInterval) {
            $.inspectionLogBufferLogsInterval = inspectionLogBufferLogsInterval;
            return this;
        }

        /**
         * @param inspectionLogBufferLogsInterval Interval for controlling logging rate - Range: `0`-`86400`
         * 
         * @return builder
         * 
         */
        public Builder inspectionLogBufferLogsInterval(Integer inspectionLogBufferLogsInterval) {
            return inspectionLogBufferLogsInterval(Output.of(inspectionLogBufferLogsInterval));
        }

        /**
         * @param inspectionValidateAllowZeros Allow 0.0.0.0 sender IP address
         * 
         * @return builder
         * 
         */
        public Builder inspectionValidateAllowZeros(@Nullable Output<Boolean> inspectionValidateAllowZeros) {
            $.inspectionValidateAllowZeros = inspectionValidateAllowZeros;
            return this;
        }

        /**
         * @param inspectionValidateAllowZeros Allow 0.0.0.0 sender IP address
         * 
         * @return builder
         * 
         */
        public Builder inspectionValidateAllowZeros(Boolean inspectionValidateAllowZeros) {
            return inspectionValidateAllowZeros(Output.of(inspectionValidateAllowZeros));
        }

        /**
         * @param inspectionValidateDstMac Validate destination MAC address
         * 
         * @return builder
         * 
         */
        public Builder inspectionValidateDstMac(@Nullable Output<Boolean> inspectionValidateDstMac) {
            $.inspectionValidateDstMac = inspectionValidateDstMac;
            return this;
        }

        /**
         * @param inspectionValidateDstMac Validate destination MAC address
         * 
         * @return builder
         * 
         */
        public Builder inspectionValidateDstMac(Boolean inspectionValidateDstMac) {
            return inspectionValidateDstMac(Output.of(inspectionValidateDstMac));
        }

        /**
         * @param inspectionValidateIp Validate IP addresses
         * 
         * @return builder
         * 
         */
        public Builder inspectionValidateIp(@Nullable Output<Boolean> inspectionValidateIp) {
            $.inspectionValidateIp = inspectionValidateIp;
            return this;
        }

        /**
         * @param inspectionValidateIp Validate IP addresses
         * 
         * @return builder
         * 
         */
        public Builder inspectionValidateIp(Boolean inspectionValidateIp) {
            return inspectionValidateIp(Output.of(inspectionValidateIp));
        }

        /**
         * @param inspectionValidateSrcMac Validate source MAC address
         * 
         * @return builder
         * 
         */
        public Builder inspectionValidateSrcMac(@Nullable Output<Boolean> inspectionValidateSrcMac) {
            $.inspectionValidateSrcMac = inspectionValidateSrcMac;
            return this;
        }

        /**
         * @param inspectionValidateSrcMac Validate source MAC address
         * 
         * @return builder
         * 
         */
        public Builder inspectionValidateSrcMac(Boolean inspectionValidateSrcMac) {
            return inspectionValidateSrcMac(Output.of(inspectionValidateSrcMac));
        }

        /**
         * @param inspectionVlan Enable/Disable ARP Inspection on vlans
         * 
         * @return builder
         * 
         */
        public Builder inspectionVlan(@Nullable Output<String> inspectionVlan) {
            $.inspectionVlan = inspectionVlan;
            return this;
        }

        /**
         * @param inspectionVlan Enable/Disable ARP Inspection on vlans
         * 
         * @return builder
         * 
         */
        public Builder inspectionVlan(String inspectionVlan) {
            return inspectionVlan(Output.of(inspectionVlan));
        }

        /**
         * @param proxyDisable Disable proxy ARP on all interfaces
         * 
         * @return builder
         * 
         */
        public Builder proxyDisable(@Nullable Output<Boolean> proxyDisable) {
            $.proxyDisable = proxyDisable;
            return this;
        }

        /**
         * @param proxyDisable Disable proxy ARP on all interfaces
         * 
         * @return builder
         * 
         */
        public Builder proxyDisable(Boolean proxyDisable) {
            return proxyDisable(Output.of(proxyDisable));
        }

        public ArpArgs build() {
            return $;
        }
    }

}
