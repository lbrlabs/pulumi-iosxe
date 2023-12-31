// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InterfaceOspfMessageDigestKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final InterfaceOspfMessageDigestKeyArgs Empty = new InterfaceOspfMessageDigestKeyArgs();

    @Import(name="id", required=true)
    private Output<Integer> id;

    public Output<Integer> id() {
        return this.id;
    }

    @Import(name="md5AuthKey")
    private @Nullable Output<String> md5AuthKey;

    public Optional<Output<String>> md5AuthKey() {
        return Optional.ofNullable(this.md5AuthKey);
    }

    @Import(name="md5AuthType")
    private @Nullable Output<Integer> md5AuthType;

    public Optional<Output<Integer>> md5AuthType() {
        return Optional.ofNullable(this.md5AuthType);
    }

    private InterfaceOspfMessageDigestKeyArgs() {}

    private InterfaceOspfMessageDigestKeyArgs(InterfaceOspfMessageDigestKeyArgs $) {
        this.id = $.id;
        this.md5AuthKey = $.md5AuthKey;
        this.md5AuthType = $.md5AuthType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InterfaceOspfMessageDigestKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InterfaceOspfMessageDigestKeyArgs $;

        public Builder() {
            $ = new InterfaceOspfMessageDigestKeyArgs();
        }

        public Builder(InterfaceOspfMessageDigestKeyArgs defaults) {
            $ = new InterfaceOspfMessageDigestKeyArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(Output<Integer> id) {
            $.id = id;
            return this;
        }

        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        public Builder md5AuthKey(@Nullable Output<String> md5AuthKey) {
            $.md5AuthKey = md5AuthKey;
            return this;
        }

        public Builder md5AuthKey(String md5AuthKey) {
            return md5AuthKey(Output.of(md5AuthKey));
        }

        public Builder md5AuthType(@Nullable Output<Integer> md5AuthType) {
            $.md5AuthType = md5AuthType;
            return this;
        }

        public Builder md5AuthType(Integer md5AuthType) {
            return md5AuthType(Output.of(md5AuthType));
        }

        public InterfaceOspfMessageDigestKeyArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
