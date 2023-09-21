// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPolicyMapPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPolicyMapPlainArgs Empty = new GetPolicyMapPlainArgs();

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

    private GetPolicyMapPlainArgs() {}

    private GetPolicyMapPlainArgs(GetPolicyMapPlainArgs $) {
        this.device = $.device;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPolicyMapPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPolicyMapPlainArgs $;

        public Builder() {
            $ = new GetPolicyMapPlainArgs();
        }

        public Builder(GetPolicyMapPlainArgs defaults) {
            $ = new GetPolicyMapPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder device(@Nullable String device) {
            $.device = device;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetPolicyMapPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
