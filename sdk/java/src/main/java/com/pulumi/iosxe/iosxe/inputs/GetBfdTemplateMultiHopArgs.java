// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBfdTemplateMultiHopArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBfdTemplateMultiHopArgs Empty = new GetBfdTemplateMultiHopArgs();

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

    private GetBfdTemplateMultiHopArgs() {}

    private GetBfdTemplateMultiHopArgs(GetBfdTemplateMultiHopArgs $) {
        this.device = $.device;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBfdTemplateMultiHopArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBfdTemplateMultiHopArgs $;

        public Builder() {
            $ = new GetBfdTemplateMultiHopArgs();
        }

        public Builder(GetBfdTemplateMultiHopArgs defaults) {
            $ = new GetBfdTemplateMultiHopArgs(Objects.requireNonNull(defaults));
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

        public GetBfdTemplateMultiHopArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
