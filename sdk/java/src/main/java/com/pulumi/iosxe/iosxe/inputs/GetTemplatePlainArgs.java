// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTemplatePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTemplatePlainArgs Empty = new GetTemplatePlainArgs();

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
     * Template name
     * 
     */
    @Import(name="templateName", required=true)
    private String templateName;

    /**
     * @return Template name
     * 
     */
    public String templateName() {
        return this.templateName;
    }

    private GetTemplatePlainArgs() {}

    private GetTemplatePlainArgs(GetTemplatePlainArgs $) {
        this.device = $.device;
        this.templateName = $.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTemplatePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTemplatePlainArgs $;

        public Builder() {
            $ = new GetTemplatePlainArgs();
        }

        public Builder(GetTemplatePlainArgs defaults) {
            $ = new GetTemplatePlainArgs(Objects.requireNonNull(defaults));
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
         * @param templateName Template name
         * 
         * @return builder
         * 
         */
        public Builder templateName(String templateName) {
            $.templateName = templateName;
            return this;
        }

        public GetTemplatePlainArgs build() {
            $.templateName = Objects.requireNonNull($.templateName, "expected parameter 'templateName' to be non-null");
            return $;
        }
    }

}
