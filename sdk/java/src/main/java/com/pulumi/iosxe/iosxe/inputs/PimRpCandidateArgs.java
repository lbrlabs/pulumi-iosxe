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


public final class PimRpCandidateArgs extends com.pulumi.resources.ResourceArgs {

    public static final PimRpCandidateArgs Empty = new PimRpCandidateArgs();

    @Import(name="bidir")
    private @Nullable Output<Boolean> bidir;

    public Optional<Output<Boolean>> bidir() {
        return Optional.ofNullable(this.bidir);
    }

    @Import(name="groupList")
    private @Nullable Output<String> groupList;

    public Optional<Output<String>> groupList() {
        return Optional.ofNullable(this.groupList);
    }

    @Import(name="interface", required=true)
    private Output<String> interface_;

    public Output<String> interface_() {
        return this.interface_;
    }

    @Import(name="interval")
    private @Nullable Output<Integer> interval;

    public Optional<Output<Integer>> interval() {
        return Optional.ofNullable(this.interval);
    }

    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    private PimRpCandidateArgs() {}

    private PimRpCandidateArgs(PimRpCandidateArgs $) {
        this.bidir = $.bidir;
        this.groupList = $.groupList;
        this.interface_ = $.interface_;
        this.interval = $.interval;
        this.priority = $.priority;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PimRpCandidateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PimRpCandidateArgs $;

        public Builder() {
            $ = new PimRpCandidateArgs();
        }

        public Builder(PimRpCandidateArgs defaults) {
            $ = new PimRpCandidateArgs(Objects.requireNonNull(defaults));
        }

        public Builder bidir(@Nullable Output<Boolean> bidir) {
            $.bidir = bidir;
            return this;
        }

        public Builder bidir(Boolean bidir) {
            return bidir(Output.of(bidir));
        }

        public Builder groupList(@Nullable Output<String> groupList) {
            $.groupList = groupList;
            return this;
        }

        public Builder groupList(String groupList) {
            return groupList(Output.of(groupList));
        }

        public Builder interface_(Output<String> interface_) {
            $.interface_ = interface_;
            return this;
        }

        public Builder interface_(String interface_) {
            return interface_(Output.of(interface_));
        }

        public Builder interval(@Nullable Output<Integer> interval) {
            $.interval = interval;
            return this;
        }

        public Builder interval(Integer interval) {
            return interval(Output.of(interval));
        }

        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public PimRpCandidateArgs build() {
            $.interface_ = Objects.requireNonNull($.interface_, "expected parameter 'interface' to be non-null");
            return $;
        }
    }

}
