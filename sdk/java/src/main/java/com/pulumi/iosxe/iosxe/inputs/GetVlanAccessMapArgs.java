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


public final class GetVlanAccessMapArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVlanAccessMapArgs Empty = new GetVlanAccessMapArgs();

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
     * Vlan access map tag
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Vlan access map tag
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Sequence to insert to/delete from existing vlan access-map entry
     * 
     */
    @Import(name="sequence", required=true)
    private Output<Integer> sequence;

    /**
     * @return Sequence to insert to/delete from existing vlan access-map entry
     * 
     */
    public Output<Integer> sequence() {
        return this.sequence;
    }

    private GetVlanAccessMapArgs() {}

    private GetVlanAccessMapArgs(GetVlanAccessMapArgs $) {
        this.device = $.device;
        this.name = $.name;
        this.sequence = $.sequence;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVlanAccessMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVlanAccessMapArgs $;

        public Builder() {
            $ = new GetVlanAccessMapArgs();
        }

        public Builder(GetVlanAccessMapArgs defaults) {
            $ = new GetVlanAccessMapArgs(Objects.requireNonNull(defaults));
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
         * @param name Vlan access map tag
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Vlan access map tag
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sequence Sequence to insert to/delete from existing vlan access-map entry
         * 
         * @return builder
         * 
         */
        public Builder sequence(Output<Integer> sequence) {
            $.sequence = sequence;
            return this;
        }

        /**
         * @param sequence Sequence to insert to/delete from existing vlan access-map entry
         * 
         * @return builder
         * 
         */
        public Builder sequence(Integer sequence) {
            return sequence(Output.of(sequence));
        }

        public GetVlanAccessMapArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.sequence = Objects.requireNonNull($.sequence, "expected parameter 'sequence' to be non-null");
            return $;
        }
    }

}
