// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.iosxe.iosxe.inputs.AaaGroupServerTacacsplusServerNameArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AaaGroupServerTacacsplusArgs extends com.pulumi.resources.ResourceArgs {

    public static final AaaGroupServerTacacsplusArgs Empty = new AaaGroupServerTacacsplusArgs();

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="serverNames")
    private @Nullable Output<List<AaaGroupServerTacacsplusServerNameArgs>> serverNames;

    public Optional<Output<List<AaaGroupServerTacacsplusServerNameArgs>>> serverNames() {
        return Optional.ofNullable(this.serverNames);
    }

    private AaaGroupServerTacacsplusArgs() {}

    private AaaGroupServerTacacsplusArgs(AaaGroupServerTacacsplusArgs $) {
        this.name = $.name;
        this.serverNames = $.serverNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AaaGroupServerTacacsplusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AaaGroupServerTacacsplusArgs $;

        public Builder() {
            $ = new AaaGroupServerTacacsplusArgs();
        }

        public Builder(AaaGroupServerTacacsplusArgs defaults) {
            $ = new AaaGroupServerTacacsplusArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder serverNames(@Nullable Output<List<AaaGroupServerTacacsplusServerNameArgs>> serverNames) {
            $.serverNames = serverNames;
            return this;
        }

        public Builder serverNames(List<AaaGroupServerTacacsplusServerNameArgs> serverNames) {
            return serverNames(Output.of(serverNames));
        }

        public Builder serverNames(AaaGroupServerTacacsplusServerNameArgs... serverNames) {
            return serverNames(List.of(serverNames));
        }

        public AaaGroupServerTacacsplusArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
