// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceTemplatePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceTemplatePlainArgs Empty = new GetServiceTemplatePlainArgs();

    /**
     * A device name from the provider configuration.
     * 
     */
    @Import(name="device")
    private @Nullable String device;

    /**
     * @return A device name from the provider configuration.
     * 
     */
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }

    /**
     * Specify a template name (maximum 48 characters)
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Specify a template name (maximum 48 characters)
     * 
     */
    public String name() {
        return this.name;
    }

    private GetServiceTemplatePlainArgs() {}

    private GetServiceTemplatePlainArgs(GetServiceTemplatePlainArgs $) {
        this.device = $.device;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceTemplatePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceTemplatePlainArgs $;

        public Builder() {
            $ = new GetServiceTemplatePlainArgs();
        }

        public Builder(GetServiceTemplatePlainArgs defaults) {
            $ = new GetServiceTemplatePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param device A device name from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder device(@Nullable String device) {
            $.device = device;
            return this;
        }

        /**
         * @param name Specify a template name (maximum 48 characters)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetServiceTemplatePlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
