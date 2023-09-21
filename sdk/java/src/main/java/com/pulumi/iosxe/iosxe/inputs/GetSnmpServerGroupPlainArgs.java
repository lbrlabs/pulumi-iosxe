// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSnmpServerGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSnmpServerGroupPlainArgs Empty = new GetSnmpServerGroupPlainArgs();

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

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    private GetSnmpServerGroupPlainArgs() {}

    private GetSnmpServerGroupPlainArgs(GetSnmpServerGroupPlainArgs $) {
        this.device = $.device;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSnmpServerGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSnmpServerGroupPlainArgs $;

        public Builder() {
            $ = new GetSnmpServerGroupPlainArgs();
        }

        public Builder(GetSnmpServerGroupPlainArgs defaults) {
            $ = new GetSnmpServerGroupPlainArgs(Objects.requireNonNull(defaults));
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

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetSnmpServerGroupPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
