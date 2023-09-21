// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VtpState extends com.pulumi.resources.ResourceArgs {

    public static final VtpState Empty = new VtpState();

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
     * Set the name of the VTP administrative domain.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return Set the name of the VTP administrative domain.
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * Configure IFS filesystem file where VTP configuration is stored.
     * 
     */
    @Import(name="file")
    private @Nullable Output<String> file;

    /**
     * @return Configure IFS filesystem file where VTP configuration is stored.
     * 
     */
    public Optional<Output<String>> file() {
        return Optional.ofNullable(this.file);
    }

    /**
     * The name of the interface providing the VTP updater ID for this device
     * 
     */
    @Import(name="interface")
    private @Nullable Output<String> interface_;

    /**
     * @return The name of the interface providing the VTP updater ID for this device
     * 
     */
    public Optional<Output<String>> interface_() {
        return Optional.ofNullable(this.interface_);
    }

    /**
     * Use only this interface&#39;s IP address as the VTP IP updater address
     * 
     */
    @Import(name="interfaceOnly")
    private @Nullable Output<Boolean> interfaceOnly;

    /**
     * @return Use only this interface&#39;s IP address as the VTP IP updater address
     * 
     */
    public Optional<Output<Boolean>> interfaceOnly() {
        return Optional.ofNullable(this.interfaceOnly);
    }

    /**
     * Set the mode for MST VTP instance
     * 
     */
    @Import(name="modeClientMst")
    private @Nullable Output<Boolean> modeClientMst;

    /**
     * @return Set the mode for MST VTP instance
     * 
     */
    public Optional<Output<Boolean>> modeClientMst() {
        return Optional.ofNullable(this.modeClientMst);
    }

    /**
     * Set the mode for unknown VTP instances
     * 
     */
    @Import(name="modeClientUnknown")
    private @Nullable Output<Boolean> modeClientUnknown;

    /**
     * @return Set the mode for unknown VTP instances
     * 
     */
    public Optional<Output<Boolean>> modeClientUnknown() {
        return Optional.ofNullable(this.modeClientUnknown);
    }

    /**
     * Set the mode for VLAN VTP instance
     * 
     */
    @Import(name="modeClientVlan")
    private @Nullable Output<Boolean> modeClientVlan;

    /**
     * @return Set the mode for VLAN VTP instance
     * 
     */
    public Optional<Output<Boolean>> modeClientVlan() {
        return Optional.ofNullable(this.modeClientVlan);
    }

    /**
     * Set the mode for MST VTP instance
     * 
     */
    @Import(name="modeOffMst")
    private @Nullable Output<Boolean> modeOffMst;

    /**
     * @return Set the mode for MST VTP instance
     * 
     */
    public Optional<Output<Boolean>> modeOffMst() {
        return Optional.ofNullable(this.modeOffMst);
    }

    /**
     * Set the mode for unknown VTP instances
     * 
     */
    @Import(name="modeOffUnknown")
    private @Nullable Output<Boolean> modeOffUnknown;

    /**
     * @return Set the mode for unknown VTP instances
     * 
     */
    public Optional<Output<Boolean>> modeOffUnknown() {
        return Optional.ofNullable(this.modeOffUnknown);
    }

    /**
     * Set the mode for VLAN VTP instance
     * 
     */
    @Import(name="modeOffVlan")
    private @Nullable Output<Boolean> modeOffVlan;

    /**
     * @return Set the mode for VLAN VTP instance
     * 
     */
    public Optional<Output<Boolean>> modeOffVlan() {
        return Optional.ofNullable(this.modeOffVlan);
    }

    /**
     * Set the mode for MST VTP instance
     * 
     */
    @Import(name="modeServerMst")
    private @Nullable Output<Boolean> modeServerMst;

    /**
     * @return Set the mode for MST VTP instance
     * 
     */
    public Optional<Output<Boolean>> modeServerMst() {
        return Optional.ofNullable(this.modeServerMst);
    }

    /**
     * Set the mode for unknown VTP instances
     * 
     */
    @Import(name="modeServerUnknown")
    private @Nullable Output<Boolean> modeServerUnknown;

    /**
     * @return Set the mode for unknown VTP instances
     * 
     */
    public Optional<Output<Boolean>> modeServerUnknown() {
        return Optional.ofNullable(this.modeServerUnknown);
    }

    /**
     * Set the mode for VLAN VTP instance
     * 
     */
    @Import(name="modeServerVlan")
    private @Nullable Output<Boolean> modeServerVlan;

    /**
     * @return Set the mode for VLAN VTP instance
     * 
     */
    public Optional<Output<Boolean>> modeServerVlan() {
        return Optional.ofNullable(this.modeServerVlan);
    }

    /**
     * Set the mode for MST VTP instance
     * 
     */
    @Import(name="modeTransparentMst")
    private @Nullable Output<Boolean> modeTransparentMst;

    /**
     * @return Set the mode for MST VTP instance
     * 
     */
    public Optional<Output<Boolean>> modeTransparentMst() {
        return Optional.ofNullable(this.modeTransparentMst);
    }

    /**
     * Set the mode for unknown VTP instances
     * 
     */
    @Import(name="modeTransparentUnknown")
    private @Nullable Output<Boolean> modeTransparentUnknown;

    /**
     * @return Set the mode for unknown VTP instances
     * 
     */
    public Optional<Output<Boolean>> modeTransparentUnknown() {
        return Optional.ofNullable(this.modeTransparentUnknown);
    }

    /**
     * Set the mode for VLAN VTP instance
     * 
     */
    @Import(name="modeTransparentVlan")
    private @Nullable Output<Boolean> modeTransparentVlan;

    /**
     * @return Set the mode for VLAN VTP instance
     * 
     */
    public Optional<Output<Boolean>> modeTransparentVlan() {
        return Optional.ofNullable(this.modeTransparentVlan);
    }

    /**
     * The ascii password for the VTP administrative domain
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The ascii password for the VTP administrative domain
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Set the VTP password hidden option
     * 
     */
    @Import(name="passwordHidden")
    private @Nullable Output<Boolean> passwordHidden;

    /**
     * @return Set the VTP password hidden option
     * 
     */
    public Optional<Output<Boolean>> passwordHidden() {
        return Optional.ofNullable(this.passwordHidden);
    }

    /**
     * Specify the vtp password in encrypted form
     * 
     */
    @Import(name="passwordSecret")
    private @Nullable Output<Boolean> passwordSecret;

    /**
     * @return Specify the vtp password in encrypted form
     * 
     */
    public Optional<Output<Boolean>> passwordSecret() {
        return Optional.ofNullable(this.passwordSecret);
    }

    /**
     * Set the administrative domain to permit pruning
     * 
     */
    @Import(name="pruning")
    private @Nullable Output<Boolean> pruning;

    /**
     * @return Set the administrative domain to permit pruning
     * 
     */
    public Optional<Output<Boolean>> pruning() {
        return Optional.ofNullable(this.pruning);
    }

    /**
     * Set the administrative domain to VTP version - Range: `1`-`3`
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return Set the administrative domain to VTP version - Range: `1`-`3`
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private VtpState() {}

    private VtpState(VtpState $) {
        this.deleteMode = $.deleteMode;
        this.device = $.device;
        this.domain = $.domain;
        this.file = $.file;
        this.interface_ = $.interface_;
        this.interfaceOnly = $.interfaceOnly;
        this.modeClientMst = $.modeClientMst;
        this.modeClientUnknown = $.modeClientUnknown;
        this.modeClientVlan = $.modeClientVlan;
        this.modeOffMst = $.modeOffMst;
        this.modeOffUnknown = $.modeOffUnknown;
        this.modeOffVlan = $.modeOffVlan;
        this.modeServerMst = $.modeServerMst;
        this.modeServerUnknown = $.modeServerUnknown;
        this.modeServerVlan = $.modeServerVlan;
        this.modeTransparentMst = $.modeTransparentMst;
        this.modeTransparentUnknown = $.modeTransparentUnknown;
        this.modeTransparentVlan = $.modeTransparentVlan;
        this.password = $.password;
        this.passwordHidden = $.passwordHidden;
        this.passwordSecret = $.passwordSecret;
        this.pruning = $.pruning;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VtpState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VtpState $;

        public Builder() {
            $ = new VtpState();
        }

        public Builder(VtpState defaults) {
            $ = new VtpState(Objects.requireNonNull(defaults));
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
         * @param domain Set the name of the VTP administrative domain.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain Set the name of the VTP administrative domain.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param file Configure IFS filesystem file where VTP configuration is stored.
         * 
         * @return builder
         * 
         */
        public Builder file(@Nullable Output<String> file) {
            $.file = file;
            return this;
        }

        /**
         * @param file Configure IFS filesystem file where VTP configuration is stored.
         * 
         * @return builder
         * 
         */
        public Builder file(String file) {
            return file(Output.of(file));
        }

        /**
         * @param interface_ The name of the interface providing the VTP updater ID for this device
         * 
         * @return builder
         * 
         */
        public Builder interface_(@Nullable Output<String> interface_) {
            $.interface_ = interface_;
            return this;
        }

        /**
         * @param interface_ The name of the interface providing the VTP updater ID for this device
         * 
         * @return builder
         * 
         */
        public Builder interface_(String interface_) {
            return interface_(Output.of(interface_));
        }

        /**
         * @param interfaceOnly Use only this interface&#39;s IP address as the VTP IP updater address
         * 
         * @return builder
         * 
         */
        public Builder interfaceOnly(@Nullable Output<Boolean> interfaceOnly) {
            $.interfaceOnly = interfaceOnly;
            return this;
        }

        /**
         * @param interfaceOnly Use only this interface&#39;s IP address as the VTP IP updater address
         * 
         * @return builder
         * 
         */
        public Builder interfaceOnly(Boolean interfaceOnly) {
            return interfaceOnly(Output.of(interfaceOnly));
        }

        /**
         * @param modeClientMst Set the mode for MST VTP instance
         * 
         * @return builder
         * 
         */
        public Builder modeClientMst(@Nullable Output<Boolean> modeClientMst) {
            $.modeClientMst = modeClientMst;
            return this;
        }

        /**
         * @param modeClientMst Set the mode for MST VTP instance
         * 
         * @return builder
         * 
         */
        public Builder modeClientMst(Boolean modeClientMst) {
            return modeClientMst(Output.of(modeClientMst));
        }

        /**
         * @param modeClientUnknown Set the mode for unknown VTP instances
         * 
         * @return builder
         * 
         */
        public Builder modeClientUnknown(@Nullable Output<Boolean> modeClientUnknown) {
            $.modeClientUnknown = modeClientUnknown;
            return this;
        }

        /**
         * @param modeClientUnknown Set the mode for unknown VTP instances
         * 
         * @return builder
         * 
         */
        public Builder modeClientUnknown(Boolean modeClientUnknown) {
            return modeClientUnknown(Output.of(modeClientUnknown));
        }

        /**
         * @param modeClientVlan Set the mode for VLAN VTP instance
         * 
         * @return builder
         * 
         */
        public Builder modeClientVlan(@Nullable Output<Boolean> modeClientVlan) {
            $.modeClientVlan = modeClientVlan;
            return this;
        }

        /**
         * @param modeClientVlan Set the mode for VLAN VTP instance
         * 
         * @return builder
         * 
         */
        public Builder modeClientVlan(Boolean modeClientVlan) {
            return modeClientVlan(Output.of(modeClientVlan));
        }

        /**
         * @param modeOffMst Set the mode for MST VTP instance
         * 
         * @return builder
         * 
         */
        public Builder modeOffMst(@Nullable Output<Boolean> modeOffMst) {
            $.modeOffMst = modeOffMst;
            return this;
        }

        /**
         * @param modeOffMst Set the mode for MST VTP instance
         * 
         * @return builder
         * 
         */
        public Builder modeOffMst(Boolean modeOffMst) {
            return modeOffMst(Output.of(modeOffMst));
        }

        /**
         * @param modeOffUnknown Set the mode for unknown VTP instances
         * 
         * @return builder
         * 
         */
        public Builder modeOffUnknown(@Nullable Output<Boolean> modeOffUnknown) {
            $.modeOffUnknown = modeOffUnknown;
            return this;
        }

        /**
         * @param modeOffUnknown Set the mode for unknown VTP instances
         * 
         * @return builder
         * 
         */
        public Builder modeOffUnknown(Boolean modeOffUnknown) {
            return modeOffUnknown(Output.of(modeOffUnknown));
        }

        /**
         * @param modeOffVlan Set the mode for VLAN VTP instance
         * 
         * @return builder
         * 
         */
        public Builder modeOffVlan(@Nullable Output<Boolean> modeOffVlan) {
            $.modeOffVlan = modeOffVlan;
            return this;
        }

        /**
         * @param modeOffVlan Set the mode for VLAN VTP instance
         * 
         * @return builder
         * 
         */
        public Builder modeOffVlan(Boolean modeOffVlan) {
            return modeOffVlan(Output.of(modeOffVlan));
        }

        /**
         * @param modeServerMst Set the mode for MST VTP instance
         * 
         * @return builder
         * 
         */
        public Builder modeServerMst(@Nullable Output<Boolean> modeServerMst) {
            $.modeServerMst = modeServerMst;
            return this;
        }

        /**
         * @param modeServerMst Set the mode for MST VTP instance
         * 
         * @return builder
         * 
         */
        public Builder modeServerMst(Boolean modeServerMst) {
            return modeServerMst(Output.of(modeServerMst));
        }

        /**
         * @param modeServerUnknown Set the mode for unknown VTP instances
         * 
         * @return builder
         * 
         */
        public Builder modeServerUnknown(@Nullable Output<Boolean> modeServerUnknown) {
            $.modeServerUnknown = modeServerUnknown;
            return this;
        }

        /**
         * @param modeServerUnknown Set the mode for unknown VTP instances
         * 
         * @return builder
         * 
         */
        public Builder modeServerUnknown(Boolean modeServerUnknown) {
            return modeServerUnknown(Output.of(modeServerUnknown));
        }

        /**
         * @param modeServerVlan Set the mode for VLAN VTP instance
         * 
         * @return builder
         * 
         */
        public Builder modeServerVlan(@Nullable Output<Boolean> modeServerVlan) {
            $.modeServerVlan = modeServerVlan;
            return this;
        }

        /**
         * @param modeServerVlan Set the mode for VLAN VTP instance
         * 
         * @return builder
         * 
         */
        public Builder modeServerVlan(Boolean modeServerVlan) {
            return modeServerVlan(Output.of(modeServerVlan));
        }

        /**
         * @param modeTransparentMst Set the mode for MST VTP instance
         * 
         * @return builder
         * 
         */
        public Builder modeTransparentMst(@Nullable Output<Boolean> modeTransparentMst) {
            $.modeTransparentMst = modeTransparentMst;
            return this;
        }

        /**
         * @param modeTransparentMst Set the mode for MST VTP instance
         * 
         * @return builder
         * 
         */
        public Builder modeTransparentMst(Boolean modeTransparentMst) {
            return modeTransparentMst(Output.of(modeTransparentMst));
        }

        /**
         * @param modeTransparentUnknown Set the mode for unknown VTP instances
         * 
         * @return builder
         * 
         */
        public Builder modeTransparentUnknown(@Nullable Output<Boolean> modeTransparentUnknown) {
            $.modeTransparentUnknown = modeTransparentUnknown;
            return this;
        }

        /**
         * @param modeTransparentUnknown Set the mode for unknown VTP instances
         * 
         * @return builder
         * 
         */
        public Builder modeTransparentUnknown(Boolean modeTransparentUnknown) {
            return modeTransparentUnknown(Output.of(modeTransparentUnknown));
        }

        /**
         * @param modeTransparentVlan Set the mode for VLAN VTP instance
         * 
         * @return builder
         * 
         */
        public Builder modeTransparentVlan(@Nullable Output<Boolean> modeTransparentVlan) {
            $.modeTransparentVlan = modeTransparentVlan;
            return this;
        }

        /**
         * @param modeTransparentVlan Set the mode for VLAN VTP instance
         * 
         * @return builder
         * 
         */
        public Builder modeTransparentVlan(Boolean modeTransparentVlan) {
            return modeTransparentVlan(Output.of(modeTransparentVlan));
        }

        /**
         * @param password The ascii password for the VTP administrative domain
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The ascii password for the VTP administrative domain
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param passwordHidden Set the VTP password hidden option
         * 
         * @return builder
         * 
         */
        public Builder passwordHidden(@Nullable Output<Boolean> passwordHidden) {
            $.passwordHidden = passwordHidden;
            return this;
        }

        /**
         * @param passwordHidden Set the VTP password hidden option
         * 
         * @return builder
         * 
         */
        public Builder passwordHidden(Boolean passwordHidden) {
            return passwordHidden(Output.of(passwordHidden));
        }

        /**
         * @param passwordSecret Specify the vtp password in encrypted form
         * 
         * @return builder
         * 
         */
        public Builder passwordSecret(@Nullable Output<Boolean> passwordSecret) {
            $.passwordSecret = passwordSecret;
            return this;
        }

        /**
         * @param passwordSecret Specify the vtp password in encrypted form
         * 
         * @return builder
         * 
         */
        public Builder passwordSecret(Boolean passwordSecret) {
            return passwordSecret(Output.of(passwordSecret));
        }

        /**
         * @param pruning Set the administrative domain to permit pruning
         * 
         * @return builder
         * 
         */
        public Builder pruning(@Nullable Output<Boolean> pruning) {
            $.pruning = pruning;
            return this;
        }

        /**
         * @param pruning Set the administrative domain to permit pruning
         * 
         * @return builder
         * 
         */
        public Builder pruning(Boolean pruning) {
            return pruning(Output.of(pruning));
        }

        /**
         * @param version Set the administrative domain to VTP version - Range: `1`-`3`
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Set the administrative domain to VTP version - Range: `1`-`3`
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public VtpState build() {
            return $;
        }
    }

}
