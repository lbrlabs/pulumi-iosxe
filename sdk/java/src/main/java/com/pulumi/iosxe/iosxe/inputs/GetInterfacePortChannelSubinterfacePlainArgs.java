// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInterfacePortChannelSubinterfacePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInterfacePortChannelSubinterfacePlainArgs Empty = new GetInterfacePortChannelSubinterfacePlainArgs();

    @Import(name="device")
    private @Nullable String device;

    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    private GetInterfacePortChannelSubinterfacePlainArgs() {}

    private GetInterfacePortChannelSubinterfacePlainArgs(GetInterfacePortChannelSubinterfacePlainArgs $) {
        this.device = $.device;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInterfacePortChannelSubinterfacePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInterfacePortChannelSubinterfacePlainArgs $;

        public Builder() {
            $ = new GetInterfacePortChannelSubinterfacePlainArgs();
        }

        public Builder(GetInterfacePortChannelSubinterfacePlainArgs defaults) {
            $ = new GetInterfacePortChannelSubinterfacePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder device(@Nullable String device) {
            $.device = device;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetInterfacePortChannelSubinterfacePlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}