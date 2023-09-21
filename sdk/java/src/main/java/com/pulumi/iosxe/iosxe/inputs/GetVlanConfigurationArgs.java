// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVlanConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVlanConfigurationArgs Empty = new GetVlanConfigurationArgs();

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
     * VLAN ID List Eg. 1-10,15
     * 
     */
    @Import(name="vlanId", required=true)
    private Output<Integer> vlanId;

    /**
     * @return VLAN ID List Eg. 1-10,15
     * 
     */
    public Output<Integer> vlanId() {
        return this.vlanId;
    }

    private GetVlanConfigurationArgs() {}

    private GetVlanConfigurationArgs(GetVlanConfigurationArgs $) {
        this.device = $.device;
        this.vlanId = $.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVlanConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVlanConfigurationArgs $;

        public Builder() {
            $ = new GetVlanConfigurationArgs();
        }

        public Builder(GetVlanConfigurationArgs defaults) {
            $ = new GetVlanConfigurationArgs(Objects.requireNonNull(defaults));
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
         * @param vlanId VLAN ID List Eg. 1-10,15
         * 
         * @return builder
         * 
         */
        public Builder vlanId(Output<Integer> vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        /**
         * @param vlanId VLAN ID List Eg. 1-10,15
         * 
         * @return builder
         * 
         */
        public Builder vlanId(Integer vlanId) {
            return vlanId(Output.of(vlanId));
        }

        public GetVlanConfigurationArgs build() {
            $.vlanId = Objects.requireNonNull($.vlanId, "expected parameter 'vlanId' to be non-null");
            return $;
        }
    }

}
