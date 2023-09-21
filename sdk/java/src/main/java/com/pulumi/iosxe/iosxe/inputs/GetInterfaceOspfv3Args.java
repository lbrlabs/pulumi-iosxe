// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInterfaceOspfv3Args extends com.pulumi.resources.InvokeArgs {

    public static final GetInterfaceOspfv3Args Empty = new GetInterfaceOspfv3Args();

    @Import(name="device")
    private @Nullable Output<String> device;

    public Optional<Output<String>> device() {
        return Optional.ofNullable(this.device);
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private GetInterfaceOspfv3Args() {}

    private GetInterfaceOspfv3Args(GetInterfaceOspfv3Args $) {
        this.device = $.device;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInterfaceOspfv3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInterfaceOspfv3Args $;

        public Builder() {
            $ = new GetInterfaceOspfv3Args();
        }

        public Builder(GetInterfaceOspfv3Args defaults) {
            $ = new GetInterfaceOspfv3Args(Objects.requireNonNull(defaults));
        }

        public Builder device(@Nullable Output<String> device) {
            $.device = device;
            return this;
        }

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

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public GetInterfaceOspfv3Args build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
