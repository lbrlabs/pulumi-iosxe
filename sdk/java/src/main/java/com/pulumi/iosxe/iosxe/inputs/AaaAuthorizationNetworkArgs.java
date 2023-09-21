// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AaaAuthorizationNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final AaaAuthorizationNetworkArgs Empty = new AaaAuthorizationNetworkArgs();

    @Import(name="a1Group")
    private @Nullable Output<String> a1Group;

    public Optional<Output<String>> a1Group() {
        return Optional.ofNullable(this.a1Group);
    }

    @Import(name="id", required=true)
    private Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    private AaaAuthorizationNetworkArgs() {}

    private AaaAuthorizationNetworkArgs(AaaAuthorizationNetworkArgs $) {
        this.a1Group = $.a1Group;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AaaAuthorizationNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AaaAuthorizationNetworkArgs $;

        public Builder() {
            $ = new AaaAuthorizationNetworkArgs();
        }

        public Builder(AaaAuthorizationNetworkArgs defaults) {
            $ = new AaaAuthorizationNetworkArgs(Objects.requireNonNull(defaults));
        }

        public Builder a1Group(@Nullable Output<String> a1Group) {
            $.a1Group = a1Group;
            return this;
        }

        public Builder a1Group(String a1Group) {
            return a1Group(Output.of(a1Group));
        }

        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public AaaAuthorizationNetworkArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}