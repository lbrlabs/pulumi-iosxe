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


public final class AccessListStandardEntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessListStandardEntryArgs Empty = new AccessListStandardEntryArgs();

    @Import(name="denyAny")
    private @Nullable Output<Boolean> denyAny;

    public Optional<Output<Boolean>> denyAny() {
        return Optional.ofNullable(this.denyAny);
    }

    @Import(name="denyHost")
    private @Nullable Output<String> denyHost;

    public Optional<Output<String>> denyHost() {
        return Optional.ofNullable(this.denyHost);
    }

    @Import(name="denyLog")
    private @Nullable Output<Boolean> denyLog;

    public Optional<Output<Boolean>> denyLog() {
        return Optional.ofNullable(this.denyLog);
    }

    @Import(name="denyPrefix")
    private @Nullable Output<String> denyPrefix;

    public Optional<Output<String>> denyPrefix() {
        return Optional.ofNullable(this.denyPrefix);
    }

    @Import(name="denyPrefixMask")
    private @Nullable Output<String> denyPrefixMask;

    public Optional<Output<String>> denyPrefixMask() {
        return Optional.ofNullable(this.denyPrefixMask);
    }

    @Import(name="permitAny")
    private @Nullable Output<Boolean> permitAny;

    public Optional<Output<Boolean>> permitAny() {
        return Optional.ofNullable(this.permitAny);
    }

    @Import(name="permitHost")
    private @Nullable Output<String> permitHost;

    public Optional<Output<String>> permitHost() {
        return Optional.ofNullable(this.permitHost);
    }

    @Import(name="permitLog")
    private @Nullable Output<Boolean> permitLog;

    public Optional<Output<Boolean>> permitLog() {
        return Optional.ofNullable(this.permitLog);
    }

    @Import(name="permitPrefix")
    private @Nullable Output<String> permitPrefix;

    public Optional<Output<String>> permitPrefix() {
        return Optional.ofNullable(this.permitPrefix);
    }

    @Import(name="permitPrefixMask")
    private @Nullable Output<String> permitPrefixMask;

    public Optional<Output<String>> permitPrefixMask() {
        return Optional.ofNullable(this.permitPrefixMask);
    }

    @Import(name="remark")
    private @Nullable Output<String> remark;

    public Optional<Output<String>> remark() {
        return Optional.ofNullable(this.remark);
    }

    @Import(name="sequence", required=true)
    private Output<Integer> sequence;

    public Output<Integer> sequence() {
        return this.sequence;
    }

    private AccessListStandardEntryArgs() {}

    private AccessListStandardEntryArgs(AccessListStandardEntryArgs $) {
        this.denyAny = $.denyAny;
        this.denyHost = $.denyHost;
        this.denyLog = $.denyLog;
        this.denyPrefix = $.denyPrefix;
        this.denyPrefixMask = $.denyPrefixMask;
        this.permitAny = $.permitAny;
        this.permitHost = $.permitHost;
        this.permitLog = $.permitLog;
        this.permitPrefix = $.permitPrefix;
        this.permitPrefixMask = $.permitPrefixMask;
        this.remark = $.remark;
        this.sequence = $.sequence;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessListStandardEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessListStandardEntryArgs $;

        public Builder() {
            $ = new AccessListStandardEntryArgs();
        }

        public Builder(AccessListStandardEntryArgs defaults) {
            $ = new AccessListStandardEntryArgs(Objects.requireNonNull(defaults));
        }

        public Builder denyAny(@Nullable Output<Boolean> denyAny) {
            $.denyAny = denyAny;
            return this;
        }

        public Builder denyAny(Boolean denyAny) {
            return denyAny(Output.of(denyAny));
        }

        public Builder denyHost(@Nullable Output<String> denyHost) {
            $.denyHost = denyHost;
            return this;
        }

        public Builder denyHost(String denyHost) {
            return denyHost(Output.of(denyHost));
        }

        public Builder denyLog(@Nullable Output<Boolean> denyLog) {
            $.denyLog = denyLog;
            return this;
        }

        public Builder denyLog(Boolean denyLog) {
            return denyLog(Output.of(denyLog));
        }

        public Builder denyPrefix(@Nullable Output<String> denyPrefix) {
            $.denyPrefix = denyPrefix;
            return this;
        }

        public Builder denyPrefix(String denyPrefix) {
            return denyPrefix(Output.of(denyPrefix));
        }

        public Builder denyPrefixMask(@Nullable Output<String> denyPrefixMask) {
            $.denyPrefixMask = denyPrefixMask;
            return this;
        }

        public Builder denyPrefixMask(String denyPrefixMask) {
            return denyPrefixMask(Output.of(denyPrefixMask));
        }

        public Builder permitAny(@Nullable Output<Boolean> permitAny) {
            $.permitAny = permitAny;
            return this;
        }

        public Builder permitAny(Boolean permitAny) {
            return permitAny(Output.of(permitAny));
        }

        public Builder permitHost(@Nullable Output<String> permitHost) {
            $.permitHost = permitHost;
            return this;
        }

        public Builder permitHost(String permitHost) {
            return permitHost(Output.of(permitHost));
        }

        public Builder permitLog(@Nullable Output<Boolean> permitLog) {
            $.permitLog = permitLog;
            return this;
        }

        public Builder permitLog(Boolean permitLog) {
            return permitLog(Output.of(permitLog));
        }

        public Builder permitPrefix(@Nullable Output<String> permitPrefix) {
            $.permitPrefix = permitPrefix;
            return this;
        }

        public Builder permitPrefix(String permitPrefix) {
            return permitPrefix(Output.of(permitPrefix));
        }

        public Builder permitPrefixMask(@Nullable Output<String> permitPrefixMask) {
            $.permitPrefixMask = permitPrefixMask;
            return this;
        }

        public Builder permitPrefixMask(String permitPrefixMask) {
            return permitPrefixMask(Output.of(permitPrefixMask));
        }

        public Builder remark(@Nullable Output<String> remark) {
            $.remark = remark;
            return this;
        }

        public Builder remark(String remark) {
            return remark(Output.of(remark));
        }

        public Builder sequence(Output<Integer> sequence) {
            $.sequence = sequence;
            return this;
        }

        public Builder sequence(Integer sequence) {
            return sequence(Output.of(sequence));
        }

        public AccessListStandardEntryArgs build() {
            $.sequence = Objects.requireNonNull($.sequence, "expected parameter 'sequence' to be non-null");
            return $;
        }
    }

}
