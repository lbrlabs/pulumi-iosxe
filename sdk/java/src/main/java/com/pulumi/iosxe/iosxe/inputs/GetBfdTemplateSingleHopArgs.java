// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBfdTemplateSingleHopArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBfdTemplateSingleHopArgs Empty = new GetBfdTemplateSingleHopArgs();

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

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private GetBfdTemplateSingleHopArgs() {}

    private GetBfdTemplateSingleHopArgs(GetBfdTemplateSingleHopArgs $) {
        this.device = $.device;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBfdTemplateSingleHopArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBfdTemplateSingleHopArgs $;

        public Builder() {
            $ = new GetBfdTemplateSingleHopArgs();
        }

        public Builder(GetBfdTemplateSingleHopArgs defaults) {
            $ = new GetBfdTemplateSingleHopArgs(Objects.requireNonNull(defaults));
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

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetBfdTemplateSingleHopArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
