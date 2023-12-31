// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NtpServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final NtpServerArgs Empty = new NtpServerArgs();

    @Import(name="ipAddress", required=true)
    private Output<String> ipAddress;

    public Output<String> ipAddress() {
        return this.ipAddress;
    }

    @Import(name="key")
    private @Nullable Output<Integer> key;

    public Optional<Output<Integer>> key() {
        return Optional.ofNullable(this.key);
    }

    @Import(name="prefer")
    private @Nullable Output<Boolean> prefer;

    public Optional<Output<Boolean>> prefer() {
        return Optional.ofNullable(this.prefer);
    }

    @Import(name="source")
    private @Nullable Output<String> source;

    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    @Import(name="version")
    private @Nullable Output<Integer> version;

    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private NtpServerArgs() {}

    private NtpServerArgs(NtpServerArgs $) {
        this.ipAddress = $.ipAddress;
        this.key = $.key;
        this.prefer = $.prefer;
        this.source = $.source;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NtpServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NtpServerArgs $;

        public Builder() {
            $ = new NtpServerArgs();
        }

        public Builder(NtpServerArgs defaults) {
            $ = new NtpServerArgs(Objects.requireNonNull(defaults));
        }

        public Builder ipAddress(Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        public Builder key(@Nullable Output<Integer> key) {
            $.key = key;
            return this;
        }

        public Builder key(Integer key) {
            return key(Output.of(key));
        }

        public Builder prefer(@Nullable Output<Boolean> prefer) {
            $.prefer = prefer;
            return this;
        }

        public Builder prefer(Boolean prefer) {
            return prefer(Output.of(prefer));
        }

        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        public Builder source(String source) {
            return source(Output.of(source));
        }

        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public NtpServerArgs build() {
            $.ipAddress = Objects.requireNonNull($.ipAddress, "expected parameter 'ipAddress' to be non-null");
            return $;
        }
    }

}
