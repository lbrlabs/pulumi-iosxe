// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ArpInspectionFilterVlanArgs extends com.pulumi.resources.ResourceArgs {

    public static final ArpInspectionFilterVlanArgs Empty = new ArpInspectionFilterVlanArgs();

    @Import(name="static")
    private @Nullable Output<Boolean> static_;

    public Optional<Output<Boolean>> static_() {
        return Optional.ofNullable(this.static_);
    }

    @Import(name="vlanRange", required=true)
    private Output<String> vlanRange;

    public Output<String> vlanRange() {
        return this.vlanRange;
    }

    private ArpInspectionFilterVlanArgs() {}

    private ArpInspectionFilterVlanArgs(ArpInspectionFilterVlanArgs $) {
        this.static_ = $.static_;
        this.vlanRange = $.vlanRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ArpInspectionFilterVlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ArpInspectionFilterVlanArgs $;

        public Builder() {
            $ = new ArpInspectionFilterVlanArgs();
        }

        public Builder(ArpInspectionFilterVlanArgs defaults) {
            $ = new ArpInspectionFilterVlanArgs(Objects.requireNonNull(defaults));
        }

        public Builder static_(@Nullable Output<Boolean> static_) {
            $.static_ = static_;
            return this;
        }

        public Builder static_(Boolean static_) {
            return static_(Output.of(static_));
        }

        public Builder vlanRange(Output<String> vlanRange) {
            $.vlanRange = vlanRange;
            return this;
        }

        public Builder vlanRange(String vlanRange) {
            return vlanRange(Output.of(vlanRange));
        }

        public ArpInspectionFilterVlanArgs build() {
            $.vlanRange = Objects.requireNonNull($.vlanRange, "expected parameter 'vlanRange' to be non-null");
            return $;
        }
    }

}