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


public final class InterfacePimArgs extends com.pulumi.resources.ResourceArgs {

    public static final InterfacePimArgs Empty = new InterfacePimArgs();

    /**
     * Configure BFD
     * 
     */
    @Import(name="bfd")
    private @Nullable Output<Boolean> bfd;

    /**
     * @return Configure BFD
     * 
     */
    public Optional<Output<Boolean>> bfd() {
        return Optional.ofNullable(this.bfd);
    }

    /**
     * Border of PIM domain
     * 
     */
    @Import(name="border")
    private @Nullable Output<Boolean> border;

    /**
     * @return Border of PIM domain
     * 
     */
    public Optional<Output<Boolean>> border() {
        return Optional.ofNullable(this.border);
    }

    /**
     * Border of PIM domain
     * 
     */
    @Import(name="bsrBorder")
    private @Nullable Output<Boolean> bsrBorder;

    /**
     * @return Border of PIM domain
     * 
     */
    public Optional<Output<Boolean>> bsrBorder() {
        return Optional.ofNullable(this.bsrBorder);
    }

    /**
     * Enable PIM dense-mode operation
     * 
     */
    @Import(name="denseMode")
    private @Nullable Output<Boolean> denseMode;

    /**
     * @return Enable PIM dense-mode operation
     * 
     */
    public Optional<Output<Boolean>> denseMode() {
        return Optional.ofNullable(this.denseMode);
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
     * PIM router DR priority - Range: `0`-`4294967295`
     * 
     */
    @Import(name="drPriority")
    private @Nullable Output<Integer> drPriority;

    /**
     * @return PIM router DR priority - Range: `0`-`4294967295`
     * 
     */
    public Optional<Output<Integer>> drPriority() {
        return Optional.ofNullable(this.drPriority);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Enable PIM passive interface operation
     * 
     */
    @Import(name="passive")
    private @Nullable Output<Boolean> passive;

    /**
     * @return Enable PIM passive interface operation
     * 
     */
    public Optional<Output<Boolean>> passive() {
        return Optional.ofNullable(this.passive);
    }

    /**
     * Enable PIM sparse-dense-mode operation
     * 
     */
    @Import(name="sparseDenseMode")
    private @Nullable Output<Boolean> sparseDenseMode;

    /**
     * @return Enable PIM sparse-dense-mode operation
     * 
     */
    public Optional<Output<Boolean>> sparseDenseMode() {
        return Optional.ofNullable(this.sparseDenseMode);
    }

    /**
     * Enable PIM sparse-mode operation
     * 
     */
    @Import(name="sparseMode")
    private @Nullable Output<Boolean> sparseMode;

    /**
     * @return Enable PIM sparse-mode operation
     * 
     */
    public Optional<Output<Boolean>> sparseMode() {
        return Optional.ofNullable(this.sparseMode);
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

    private InterfacePimArgs() {}

    private InterfacePimArgs(InterfacePimArgs $) {
        this.bfd = $.bfd;
        this.border = $.border;
        this.bsrBorder = $.bsrBorder;
        this.denseMode = $.denseMode;
        this.device = $.device;
        this.drPriority = $.drPriority;
        this.name = $.name;
        this.passive = $.passive;
        this.sparseDenseMode = $.sparseDenseMode;
        this.sparseMode = $.sparseMode;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InterfacePimArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InterfacePimArgs $;

        public Builder() {
            $ = new InterfacePimArgs();
        }

        public Builder(InterfacePimArgs defaults) {
            $ = new InterfacePimArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bfd Configure BFD
         * 
         * @return builder
         * 
         */
        public Builder bfd(@Nullable Output<Boolean> bfd) {
            $.bfd = bfd;
            return this;
        }

        /**
         * @param bfd Configure BFD
         * 
         * @return builder
         * 
         */
        public Builder bfd(Boolean bfd) {
            return bfd(Output.of(bfd));
        }

        /**
         * @param border Border of PIM domain
         * 
         * @return builder
         * 
         */
        public Builder border(@Nullable Output<Boolean> border) {
            $.border = border;
            return this;
        }

        /**
         * @param border Border of PIM domain
         * 
         * @return builder
         * 
         */
        public Builder border(Boolean border) {
            return border(Output.of(border));
        }

        /**
         * @param bsrBorder Border of PIM domain
         * 
         * @return builder
         * 
         */
        public Builder bsrBorder(@Nullable Output<Boolean> bsrBorder) {
            $.bsrBorder = bsrBorder;
            return this;
        }

        /**
         * @param bsrBorder Border of PIM domain
         * 
         * @return builder
         * 
         */
        public Builder bsrBorder(Boolean bsrBorder) {
            return bsrBorder(Output.of(bsrBorder));
        }

        /**
         * @param denseMode Enable PIM dense-mode operation
         * 
         * @return builder
         * 
         */
        public Builder denseMode(@Nullable Output<Boolean> denseMode) {
            $.denseMode = denseMode;
            return this;
        }

        /**
         * @param denseMode Enable PIM dense-mode operation
         * 
         * @return builder
         * 
         */
        public Builder denseMode(Boolean denseMode) {
            return denseMode(Output.of(denseMode));
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
         * @param drPriority PIM router DR priority - Range: `0`-`4294967295`
         * 
         * @return builder
         * 
         */
        public Builder drPriority(@Nullable Output<Integer> drPriority) {
            $.drPriority = drPriority;
            return this;
        }

        /**
         * @param drPriority PIM router DR priority - Range: `0`-`4294967295`
         * 
         * @return builder
         * 
         */
        public Builder drPriority(Integer drPriority) {
            return drPriority(Output.of(drPriority));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param passive Enable PIM passive interface operation
         * 
         * @return builder
         * 
         */
        public Builder passive(@Nullable Output<Boolean> passive) {
            $.passive = passive;
            return this;
        }

        /**
         * @param passive Enable PIM passive interface operation
         * 
         * @return builder
         * 
         */
        public Builder passive(Boolean passive) {
            return passive(Output.of(passive));
        }

        /**
         * @param sparseDenseMode Enable PIM sparse-dense-mode operation
         * 
         * @return builder
         * 
         */
        public Builder sparseDenseMode(@Nullable Output<Boolean> sparseDenseMode) {
            $.sparseDenseMode = sparseDenseMode;
            return this;
        }

        /**
         * @param sparseDenseMode Enable PIM sparse-dense-mode operation
         * 
         * @return builder
         * 
         */
        public Builder sparseDenseMode(Boolean sparseDenseMode) {
            return sparseDenseMode(Output.of(sparseDenseMode));
        }

        /**
         * @param sparseMode Enable PIM sparse-mode operation
         * 
         * @return builder
         * 
         */
        public Builder sparseMode(@Nullable Output<Boolean> sparseMode) {
            $.sparseMode = sparseMode;
            return this;
        }

        /**
         * @param sparseMode Enable PIM sparse-mode operation
         * 
         * @return builder
         * 
         */
        public Builder sparseMode(Boolean sparseMode) {
            return sparseMode(Output.of(sparseMode));
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

        public InterfacePimArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}