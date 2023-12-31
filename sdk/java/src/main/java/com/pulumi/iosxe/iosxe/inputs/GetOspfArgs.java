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


public final class GetOspfArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOspfArgs Empty = new GetOspfArgs();

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
     * Process ID
     * 
     */
    @Import(name="processId", required=true)
    private Output<Integer> processId;

    /**
     * @return Process ID
     * 
     */
    public Output<Integer> processId() {
        return this.processId;
    }

    private GetOspfArgs() {}

    private GetOspfArgs(GetOspfArgs $) {
        this.device = $.device;
        this.processId = $.processId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOspfArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOspfArgs $;

        public Builder() {
            $ = new GetOspfArgs();
        }

        public Builder(GetOspfArgs defaults) {
            $ = new GetOspfArgs(Objects.requireNonNull(defaults));
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
         * @param processId Process ID
         * 
         * @return builder
         * 
         */
        public Builder processId(Output<Integer> processId) {
            $.processId = processId;
            return this;
        }

        /**
         * @param processId Process ID
         * 
         * @return builder
         * 
         */
        public Builder processId(Integer processId) {
            return processId(Output.of(processId));
        }

        public GetOspfArgs build() {
            $.processId = Objects.requireNonNull($.processId, "expected parameter 'processId' to be non-null");
            return $;
        }
    }

}
