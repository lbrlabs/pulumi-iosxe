// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVlanAccessMapPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVlanAccessMapPlainArgs Empty = new GetVlanAccessMapPlainArgs();

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

    @Import(name="sequence", required=true)
    private Integer sequence;

    public Integer sequence() {
        return this.sequence;
    }

    private GetVlanAccessMapPlainArgs() {}

    private GetVlanAccessMapPlainArgs(GetVlanAccessMapPlainArgs $) {
        this.device = $.device;
        this.name = $.name;
        this.sequence = $.sequence;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVlanAccessMapPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVlanAccessMapPlainArgs $;

        public Builder() {
            $ = new GetVlanAccessMapPlainArgs();
        }

        public Builder(GetVlanAccessMapPlainArgs defaults) {
            $ = new GetVlanAccessMapPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder device(@Nullable String device) {
            $.device = device;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder sequence(Integer sequence) {
            $.sequence = sequence;
            return this;
        }

        public GetVlanAccessMapPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.sequence = Objects.requireNonNull($.sequence, "expected parameter 'sequence' to be non-null");
            return $;
        }
    }

}
