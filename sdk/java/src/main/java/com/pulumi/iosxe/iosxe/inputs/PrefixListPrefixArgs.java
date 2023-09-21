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


public final class PrefixListPrefixArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrefixListPrefixArgs Empty = new PrefixListPrefixArgs();

    @Import(name="action")
    private @Nullable Output<String> action;

    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    @Import(name="ge")
    private @Nullable Output<Integer> ge;

    public Optional<Output<Integer>> ge() {
        return Optional.ofNullable(this.ge);
    }

    @Import(name="ip")
    private @Nullable Output<String> ip;

    public Optional<Output<String>> ip() {
        return Optional.ofNullable(this.ip);
    }

    @Import(name="le")
    private @Nullable Output<Integer> le;

    public Optional<Output<Integer>> le() {
        return Optional.ofNullable(this.le);
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="seq", required=true)
    private Output<Integer> seq;

    public Output<Integer> seq() {
        return this.seq;
    }

    private PrefixListPrefixArgs() {}

    private PrefixListPrefixArgs(PrefixListPrefixArgs $) {
        this.action = $.action;
        this.ge = $.ge;
        this.ip = $.ip;
        this.le = $.le;
        this.name = $.name;
        this.seq = $.seq;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrefixListPrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrefixListPrefixArgs $;

        public Builder() {
            $ = new PrefixListPrefixArgs();
        }

        public Builder(PrefixListPrefixArgs defaults) {
            $ = new PrefixListPrefixArgs(Objects.requireNonNull(defaults));
        }

        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        public Builder action(String action) {
            return action(Output.of(action));
        }

        public Builder ge(@Nullable Output<Integer> ge) {
            $.ge = ge;
            return this;
        }

        public Builder ge(Integer ge) {
            return ge(Output.of(ge));
        }

        public Builder ip(@Nullable Output<String> ip) {
            $.ip = ip;
            return this;
        }

        public Builder ip(String ip) {
            return ip(Output.of(ip));
        }

        public Builder le(@Nullable Output<Integer> le) {
            $.le = le;
            return this;
        }

        public Builder le(Integer le) {
            return le(Output.of(le));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder seq(Output<Integer> seq) {
            $.seq = seq;
            return this;
        }

        public Builder seq(Integer seq) {
            return seq(Output.of(seq));
        }

        public PrefixListPrefixArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.seq = Objects.requireNonNull($.seq, "expected parameter 'seq' to be non-null");
            return $;
        }
    }

}