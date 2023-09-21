// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.iosxe.iosxe.inputs.PimRpAddressArgs;
import com.pulumi.iosxe.iosxe.inputs.PimRpCandidateArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PimArgs extends com.pulumi.resources.ResourceArgs {

    public static final PimArgs Empty = new PimArgs();

    /**
     * Configure AutoRP global operations
     * 
     */
    @Import(name="autorp")
    private @Nullable Output<Boolean> autorp;

    /**
     * @return Configure AutoRP global operations
     * 
     */
    public Optional<Output<Boolean>> autorp() {
        return Optional.ofNullable(this.autorp);
    }

    /**
     * Allow AutoRP packets across sparse mode interface
     * 
     */
    @Import(name="autorpListener")
    private @Nullable Output<Boolean> autorpListener;

    /**
     * @return Allow AutoRP packets across sparse mode interface
     * 
     */
    public Optional<Output<Boolean>> autorpListener() {
        return Optional.ofNullable(this.autorpListener);
    }

    /**
     * BSR RP candidate filter
     * 
     */
    @Import(name="bsrCandidateAcceptRpCandidate")
    private @Nullable Output<String> bsrCandidateAcceptRpCandidate;

    /**
     * @return BSR RP candidate filter
     * 
     */
    public Optional<Output<String>> bsrCandidateAcceptRpCandidate() {
        return Optional.ofNullable(this.bsrCandidateAcceptRpCandidate);
    }

    /**
     * Loopback interface - Range: `0`-`2147483647`
     * 
     */
    @Import(name="bsrCandidateLoopback")
    private @Nullable Output<Integer> bsrCandidateLoopback;

    /**
     * @return Loopback interface - Range: `0`-`2147483647`
     * 
     */
    public Optional<Output<Integer>> bsrCandidateLoopback() {
        return Optional.ofNullable(this.bsrCandidateLoopback);
    }

    /**
     * Hash Mask length for RP selection - Range: `0`-`32`
     * 
     */
    @Import(name="bsrCandidateMask")
    private @Nullable Output<Integer> bsrCandidateMask;

    /**
     * @return Hash Mask length for RP selection - Range: `0`-`32`
     * 
     */
    public Optional<Output<Integer>> bsrCandidateMask() {
        return Optional.ofNullable(this.bsrCandidateMask);
    }

    /**
     * Priority value for candidate bootstrap router - Range: `0`-`255`
     * 
     */
    @Import(name="bsrCandidatePriority")
    private @Nullable Output<Integer> bsrCandidatePriority;

    /**
     * @return Priority value for candidate bootstrap router - Range: `0`-`255`
     * 
     */
    public Optional<Output<Integer>> bsrCandidatePriority() {
        return Optional.ofNullable(this.bsrCandidatePriority);
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
     * IP address of Rendezvous-point for group
     * 
     */
    @Import(name="rpAddress")
    private @Nullable Output<String> rpAddress;

    /**
     * @return IP address of Rendezvous-point for group
     * 
     */
    public Optional<Output<String>> rpAddress() {
        return Optional.ofNullable(this.rpAddress);
    }

    /**
     * Group range treated in bidirectional shared-tree mode
     * 
     */
    @Import(name="rpAddressBidir")
    private @Nullable Output<Boolean> rpAddressBidir;

    /**
     * @return Group range treated in bidirectional shared-tree mode
     * 
     */
    public Optional<Output<Boolean>> rpAddressBidir() {
        return Optional.ofNullable(this.rpAddressBidir);
    }

    /**
     * Overrides dynamically learnt RP mappings
     * 
     */
    @Import(name="rpAddressOverride")
    private @Nullable Output<Boolean> rpAddressOverride;

    /**
     * @return Overrides dynamically learnt RP mappings
     * 
     */
    public Optional<Output<Boolean>> rpAddressOverride() {
        return Optional.ofNullable(this.rpAddressOverride);
    }

    /**
     * PIM RP-address (Rendezvous Point)
     * 
     */
    @Import(name="rpAddresses")
    private @Nullable Output<List<PimRpAddressArgs>> rpAddresses;

    /**
     * @return PIM RP-address (Rendezvous Point)
     * 
     */
    public Optional<Output<List<PimRpAddressArgs>>> rpAddresses() {
        return Optional.ofNullable(this.rpAddresses);
    }

    /**
     * To be a PIM version 2 RP candidate
     * 
     */
    @Import(name="rpCandidates")
    private @Nullable Output<List<PimRpCandidateArgs>> rpCandidates;

    /**
     * @return To be a PIM version 2 RP candidate
     * 
     */
    public Optional<Output<List<PimRpCandidateArgs>>> rpCandidates() {
        return Optional.ofNullable(this.rpCandidates);
    }

    /**
     * Use 232/8 group range for SSM
     * 
     */
    @Import(name="ssmDefault")
    private @Nullable Output<Boolean> ssmDefault;

    /**
     * @return Use 232/8 group range for SSM
     * 
     */
    public Optional<Output<Boolean>> ssmDefault() {
        return Optional.ofNullable(this.ssmDefault);
    }

    /**
     * ACL for group range to be used for SSM
     * 
     */
    @Import(name="ssmRange")
    private @Nullable Output<String> ssmRange;

    /**
     * @return ACL for group range to be used for SSM
     * 
     */
    public Optional<Output<String>> ssmRange() {
        return Optional.ofNullable(this.ssmRange);
    }

    private PimArgs() {}

    private PimArgs(PimArgs $) {
        this.autorp = $.autorp;
        this.autorpListener = $.autorpListener;
        this.bsrCandidateAcceptRpCandidate = $.bsrCandidateAcceptRpCandidate;
        this.bsrCandidateLoopback = $.bsrCandidateLoopback;
        this.bsrCandidateMask = $.bsrCandidateMask;
        this.bsrCandidatePriority = $.bsrCandidatePriority;
        this.deleteMode = $.deleteMode;
        this.device = $.device;
        this.rpAddress = $.rpAddress;
        this.rpAddressBidir = $.rpAddressBidir;
        this.rpAddressOverride = $.rpAddressOverride;
        this.rpAddresses = $.rpAddresses;
        this.rpCandidates = $.rpCandidates;
        this.ssmDefault = $.ssmDefault;
        this.ssmRange = $.ssmRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PimArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PimArgs $;

        public Builder() {
            $ = new PimArgs();
        }

        public Builder(PimArgs defaults) {
            $ = new PimArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autorp Configure AutoRP global operations
         * 
         * @return builder
         * 
         */
        public Builder autorp(@Nullable Output<Boolean> autorp) {
            $.autorp = autorp;
            return this;
        }

        /**
         * @param autorp Configure AutoRP global operations
         * 
         * @return builder
         * 
         */
        public Builder autorp(Boolean autorp) {
            return autorp(Output.of(autorp));
        }

        /**
         * @param autorpListener Allow AutoRP packets across sparse mode interface
         * 
         * @return builder
         * 
         */
        public Builder autorpListener(@Nullable Output<Boolean> autorpListener) {
            $.autorpListener = autorpListener;
            return this;
        }

        /**
         * @param autorpListener Allow AutoRP packets across sparse mode interface
         * 
         * @return builder
         * 
         */
        public Builder autorpListener(Boolean autorpListener) {
            return autorpListener(Output.of(autorpListener));
        }

        /**
         * @param bsrCandidateAcceptRpCandidate BSR RP candidate filter
         * 
         * @return builder
         * 
         */
        public Builder bsrCandidateAcceptRpCandidate(@Nullable Output<String> bsrCandidateAcceptRpCandidate) {
            $.bsrCandidateAcceptRpCandidate = bsrCandidateAcceptRpCandidate;
            return this;
        }

        /**
         * @param bsrCandidateAcceptRpCandidate BSR RP candidate filter
         * 
         * @return builder
         * 
         */
        public Builder bsrCandidateAcceptRpCandidate(String bsrCandidateAcceptRpCandidate) {
            return bsrCandidateAcceptRpCandidate(Output.of(bsrCandidateAcceptRpCandidate));
        }

        /**
         * @param bsrCandidateLoopback Loopback interface - Range: `0`-`2147483647`
         * 
         * @return builder
         * 
         */
        public Builder bsrCandidateLoopback(@Nullable Output<Integer> bsrCandidateLoopback) {
            $.bsrCandidateLoopback = bsrCandidateLoopback;
            return this;
        }

        /**
         * @param bsrCandidateLoopback Loopback interface - Range: `0`-`2147483647`
         * 
         * @return builder
         * 
         */
        public Builder bsrCandidateLoopback(Integer bsrCandidateLoopback) {
            return bsrCandidateLoopback(Output.of(bsrCandidateLoopback));
        }

        /**
         * @param bsrCandidateMask Hash Mask length for RP selection - Range: `0`-`32`
         * 
         * @return builder
         * 
         */
        public Builder bsrCandidateMask(@Nullable Output<Integer> bsrCandidateMask) {
            $.bsrCandidateMask = bsrCandidateMask;
            return this;
        }

        /**
         * @param bsrCandidateMask Hash Mask length for RP selection - Range: `0`-`32`
         * 
         * @return builder
         * 
         */
        public Builder bsrCandidateMask(Integer bsrCandidateMask) {
            return bsrCandidateMask(Output.of(bsrCandidateMask));
        }

        /**
         * @param bsrCandidatePriority Priority value for candidate bootstrap router - Range: `0`-`255`
         * 
         * @return builder
         * 
         */
        public Builder bsrCandidatePriority(@Nullable Output<Integer> bsrCandidatePriority) {
            $.bsrCandidatePriority = bsrCandidatePriority;
            return this;
        }

        /**
         * @param bsrCandidatePriority Priority value for candidate bootstrap router - Range: `0`-`255`
         * 
         * @return builder
         * 
         */
        public Builder bsrCandidatePriority(Integer bsrCandidatePriority) {
            return bsrCandidatePriority(Output.of(bsrCandidatePriority));
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
         * @param rpAddress IP address of Rendezvous-point for group
         * 
         * @return builder
         * 
         */
        public Builder rpAddress(@Nullable Output<String> rpAddress) {
            $.rpAddress = rpAddress;
            return this;
        }

        /**
         * @param rpAddress IP address of Rendezvous-point for group
         * 
         * @return builder
         * 
         */
        public Builder rpAddress(String rpAddress) {
            return rpAddress(Output.of(rpAddress));
        }

        /**
         * @param rpAddressBidir Group range treated in bidirectional shared-tree mode
         * 
         * @return builder
         * 
         */
        public Builder rpAddressBidir(@Nullable Output<Boolean> rpAddressBidir) {
            $.rpAddressBidir = rpAddressBidir;
            return this;
        }

        /**
         * @param rpAddressBidir Group range treated in bidirectional shared-tree mode
         * 
         * @return builder
         * 
         */
        public Builder rpAddressBidir(Boolean rpAddressBidir) {
            return rpAddressBidir(Output.of(rpAddressBidir));
        }

        /**
         * @param rpAddressOverride Overrides dynamically learnt RP mappings
         * 
         * @return builder
         * 
         */
        public Builder rpAddressOverride(@Nullable Output<Boolean> rpAddressOverride) {
            $.rpAddressOverride = rpAddressOverride;
            return this;
        }

        /**
         * @param rpAddressOverride Overrides dynamically learnt RP mappings
         * 
         * @return builder
         * 
         */
        public Builder rpAddressOverride(Boolean rpAddressOverride) {
            return rpAddressOverride(Output.of(rpAddressOverride));
        }

        /**
         * @param rpAddresses PIM RP-address (Rendezvous Point)
         * 
         * @return builder
         * 
         */
        public Builder rpAddresses(@Nullable Output<List<PimRpAddressArgs>> rpAddresses) {
            $.rpAddresses = rpAddresses;
            return this;
        }

        /**
         * @param rpAddresses PIM RP-address (Rendezvous Point)
         * 
         * @return builder
         * 
         */
        public Builder rpAddresses(List<PimRpAddressArgs> rpAddresses) {
            return rpAddresses(Output.of(rpAddresses));
        }

        /**
         * @param rpAddresses PIM RP-address (Rendezvous Point)
         * 
         * @return builder
         * 
         */
        public Builder rpAddresses(PimRpAddressArgs... rpAddresses) {
            return rpAddresses(List.of(rpAddresses));
        }

        /**
         * @param rpCandidates To be a PIM version 2 RP candidate
         * 
         * @return builder
         * 
         */
        public Builder rpCandidates(@Nullable Output<List<PimRpCandidateArgs>> rpCandidates) {
            $.rpCandidates = rpCandidates;
            return this;
        }

        /**
         * @param rpCandidates To be a PIM version 2 RP candidate
         * 
         * @return builder
         * 
         */
        public Builder rpCandidates(List<PimRpCandidateArgs> rpCandidates) {
            return rpCandidates(Output.of(rpCandidates));
        }

        /**
         * @param rpCandidates To be a PIM version 2 RP candidate
         * 
         * @return builder
         * 
         */
        public Builder rpCandidates(PimRpCandidateArgs... rpCandidates) {
            return rpCandidates(List.of(rpCandidates));
        }

        /**
         * @param ssmDefault Use 232/8 group range for SSM
         * 
         * @return builder
         * 
         */
        public Builder ssmDefault(@Nullable Output<Boolean> ssmDefault) {
            $.ssmDefault = ssmDefault;
            return this;
        }

        /**
         * @param ssmDefault Use 232/8 group range for SSM
         * 
         * @return builder
         * 
         */
        public Builder ssmDefault(Boolean ssmDefault) {
            return ssmDefault(Output.of(ssmDefault));
        }

        /**
         * @param ssmRange ACL for group range to be used for SSM
         * 
         * @return builder
         * 
         */
        public Builder ssmRange(@Nullable Output<String> ssmRange) {
            $.ssmRange = ssmRange;
            return this;
        }

        /**
         * @param ssmRange ACL for group range to be used for SSM
         * 
         * @return builder
         * 
         */
        public Builder ssmRange(String ssmRange) {
            return ssmRange(Output.of(ssmRange));
        }

        public PimArgs build() {
            return $;
        }
    }

}
