// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.iosxe.iosxe.inputs.InterfaceOspfProcessIdAreaArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InterfaceOspfProcessIdArgs extends com.pulumi.resources.ResourceArgs {

    public static final InterfaceOspfProcessIdArgs Empty = new InterfaceOspfProcessIdArgs();

    @Import(name="areas")
    private @Nullable Output<List<InterfaceOspfProcessIdAreaArgs>> areas;

    public Optional<Output<List<InterfaceOspfProcessIdAreaArgs>>> areas() {
        return Optional.ofNullable(this.areas);
    }

    @Import(name="id", required=true)
    private Output<Integer> id;

    public Output<Integer> id() {
        return this.id;
    }

    private InterfaceOspfProcessIdArgs() {}

    private InterfaceOspfProcessIdArgs(InterfaceOspfProcessIdArgs $) {
        this.areas = $.areas;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InterfaceOspfProcessIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InterfaceOspfProcessIdArgs $;

        public Builder() {
            $ = new InterfaceOspfProcessIdArgs();
        }

        public Builder(InterfaceOspfProcessIdArgs defaults) {
            $ = new InterfaceOspfProcessIdArgs(Objects.requireNonNull(defaults));
        }

        public Builder areas(@Nullable Output<List<InterfaceOspfProcessIdAreaArgs>> areas) {
            $.areas = areas;
            return this;
        }

        public Builder areas(List<InterfaceOspfProcessIdAreaArgs> areas) {
            return areas(Output.of(areas));
        }

        public Builder areas(InterfaceOspfProcessIdAreaArgs... areas) {
            return areas(List.of(areas));
        }

        public Builder id(Output<Integer> id) {
            $.id = id;
            return this;
        }

        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        public InterfaceOspfProcessIdArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
