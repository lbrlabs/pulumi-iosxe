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


public final class LineVtyAccessClassArgs extends com.pulumi.resources.ResourceArgs {

    public static final LineVtyAccessClassArgs Empty = new LineVtyAccessClassArgs();

    @Import(name="accessList", required=true)
    private Output<String> accessList;

    public Output<String> accessList() {
        return this.accessList;
    }

    @Import(name="direction", required=true)
    private Output<String> direction;

    public Output<String> direction() {
        return this.direction;
    }

    @Import(name="vrfAlso")
    private @Nullable Output<Boolean> vrfAlso;

    public Optional<Output<Boolean>> vrfAlso() {
        return Optional.ofNullable(this.vrfAlso);
    }

    private LineVtyAccessClassArgs() {}

    private LineVtyAccessClassArgs(LineVtyAccessClassArgs $) {
        this.accessList = $.accessList;
        this.direction = $.direction;
        this.vrfAlso = $.vrfAlso;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LineVtyAccessClassArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LineVtyAccessClassArgs $;

        public Builder() {
            $ = new LineVtyAccessClassArgs();
        }

        public Builder(LineVtyAccessClassArgs defaults) {
            $ = new LineVtyAccessClassArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessList(Output<String> accessList) {
            $.accessList = accessList;
            return this;
        }

        public Builder accessList(String accessList) {
            return accessList(Output.of(accessList));
        }

        public Builder direction(Output<String> direction) {
            $.direction = direction;
            return this;
        }

        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        public Builder vrfAlso(@Nullable Output<Boolean> vrfAlso) {
            $.vrfAlso = vrfAlso;
            return this;
        }

        public Builder vrfAlso(Boolean vrfAlso) {
            return vrfAlso(Output.of(vrfAlso));
        }

        public LineVtyAccessClassArgs build() {
            $.accessList = Objects.requireNonNull($.accessList, "expected parameter 'accessList' to be non-null");
            $.direction = Objects.requireNonNull($.direction, "expected parameter 'direction' to be non-null");
            return $;
        }
    }

}