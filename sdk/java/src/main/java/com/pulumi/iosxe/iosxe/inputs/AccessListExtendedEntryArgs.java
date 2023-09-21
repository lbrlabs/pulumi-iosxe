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


public final class AccessListExtendedEntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessListExtendedEntryArgs Empty = new AccessListExtendedEntryArgs();

    @Import(name="aceRuleAction")
    private @Nullable Output<String> aceRuleAction;

    public Optional<Output<String>> aceRuleAction() {
        return Optional.ofNullable(this.aceRuleAction);
    }

    @Import(name="aceRuleProtocol")
    private @Nullable Output<String> aceRuleProtocol;

    public Optional<Output<String>> aceRuleProtocol() {
        return Optional.ofNullable(this.aceRuleProtocol);
    }

    @Import(name="ack")
    private @Nullable Output<Boolean> ack;

    public Optional<Output<Boolean>> ack() {
        return Optional.ofNullable(this.ack);
    }

    @Import(name="destinationAny")
    private @Nullable Output<Boolean> destinationAny;

    public Optional<Output<Boolean>> destinationAny() {
        return Optional.ofNullable(this.destinationAny);
    }

    @Import(name="destinationHost")
    private @Nullable Output<String> destinationHost;

    public Optional<Output<String>> destinationHost() {
        return Optional.ofNullable(this.destinationHost);
    }

    @Import(name="destinationObjectGroup")
    private @Nullable Output<String> destinationObjectGroup;

    public Optional<Output<String>> destinationObjectGroup() {
        return Optional.ofNullable(this.destinationObjectGroup);
    }

    @Import(name="destinationPortEqual")
    private @Nullable Output<String> destinationPortEqual;

    public Optional<Output<String>> destinationPortEqual() {
        return Optional.ofNullable(this.destinationPortEqual);
    }

    @Import(name="destinationPortGreaterThan")
    private @Nullable Output<String> destinationPortGreaterThan;

    public Optional<Output<String>> destinationPortGreaterThan() {
        return Optional.ofNullable(this.destinationPortGreaterThan);
    }

    @Import(name="destinationPortLesserThan")
    private @Nullable Output<String> destinationPortLesserThan;

    public Optional<Output<String>> destinationPortLesserThan() {
        return Optional.ofNullable(this.destinationPortLesserThan);
    }

    @Import(name="destinationPortRangeFrom")
    private @Nullable Output<String> destinationPortRangeFrom;

    public Optional<Output<String>> destinationPortRangeFrom() {
        return Optional.ofNullable(this.destinationPortRangeFrom);
    }

    @Import(name="destinationPortRangeTo")
    private @Nullable Output<String> destinationPortRangeTo;

    public Optional<Output<String>> destinationPortRangeTo() {
        return Optional.ofNullable(this.destinationPortRangeTo);
    }

    @Import(name="destinationPrefix")
    private @Nullable Output<String> destinationPrefix;

    public Optional<Output<String>> destinationPrefix() {
        return Optional.ofNullable(this.destinationPrefix);
    }

    @Import(name="destinationPrefixMask")
    private @Nullable Output<String> destinationPrefixMask;

    public Optional<Output<String>> destinationPrefixMask() {
        return Optional.ofNullable(this.destinationPrefixMask);
    }

    @Import(name="dscp")
    private @Nullable Output<String> dscp;

    public Optional<Output<String>> dscp() {
        return Optional.ofNullable(this.dscp);
    }

    @Import(name="established")
    private @Nullable Output<Boolean> established;

    public Optional<Output<Boolean>> established() {
        return Optional.ofNullable(this.established);
    }

    @Import(name="fin")
    private @Nullable Output<Boolean> fin;

    public Optional<Output<Boolean>> fin() {
        return Optional.ofNullable(this.fin);
    }

    @Import(name="fragments")
    private @Nullable Output<Boolean> fragments;

    public Optional<Output<Boolean>> fragments() {
        return Optional.ofNullable(this.fragments);
    }

    @Import(name="log")
    private @Nullable Output<Boolean> log;

    public Optional<Output<Boolean>> log() {
        return Optional.ofNullable(this.log);
    }

    @Import(name="logInput")
    private @Nullable Output<Boolean> logInput;

    public Optional<Output<Boolean>> logInput() {
        return Optional.ofNullable(this.logInput);
    }

    @Import(name="precedence")
    private @Nullable Output<String> precedence;

    public Optional<Output<String>> precedence() {
        return Optional.ofNullable(this.precedence);
    }

    @Import(name="psh")
    private @Nullable Output<Boolean> psh;

    public Optional<Output<Boolean>> psh() {
        return Optional.ofNullable(this.psh);
    }

    @Import(name="remark")
    private @Nullable Output<String> remark;

    public Optional<Output<String>> remark() {
        return Optional.ofNullable(this.remark);
    }

    @Import(name="rst")
    private @Nullable Output<Boolean> rst;

    public Optional<Output<Boolean>> rst() {
        return Optional.ofNullable(this.rst);
    }

    @Import(name="sequence", required=true)
    private Output<Integer> sequence;

    public Output<Integer> sequence() {
        return this.sequence;
    }

    @Import(name="serviceObjectGroup")
    private @Nullable Output<String> serviceObjectGroup;

    public Optional<Output<String>> serviceObjectGroup() {
        return Optional.ofNullable(this.serviceObjectGroup);
    }

    @Import(name="sourceAny")
    private @Nullable Output<Boolean> sourceAny;

    public Optional<Output<Boolean>> sourceAny() {
        return Optional.ofNullable(this.sourceAny);
    }

    @Import(name="sourceHost")
    private @Nullable Output<String> sourceHost;

    public Optional<Output<String>> sourceHost() {
        return Optional.ofNullable(this.sourceHost);
    }

    @Import(name="sourceObjectGroup")
    private @Nullable Output<String> sourceObjectGroup;

    public Optional<Output<String>> sourceObjectGroup() {
        return Optional.ofNullable(this.sourceObjectGroup);
    }

    @Import(name="sourcePortEqual")
    private @Nullable Output<String> sourcePortEqual;

    public Optional<Output<String>> sourcePortEqual() {
        return Optional.ofNullable(this.sourcePortEqual);
    }

    @Import(name="sourcePortGreaterThan")
    private @Nullable Output<String> sourcePortGreaterThan;

    public Optional<Output<String>> sourcePortGreaterThan() {
        return Optional.ofNullable(this.sourcePortGreaterThan);
    }

    @Import(name="sourcePortLesserThan")
    private @Nullable Output<String> sourcePortLesserThan;

    public Optional<Output<String>> sourcePortLesserThan() {
        return Optional.ofNullable(this.sourcePortLesserThan);
    }

    @Import(name="sourcePortRangeFrom")
    private @Nullable Output<String> sourcePortRangeFrom;

    public Optional<Output<String>> sourcePortRangeFrom() {
        return Optional.ofNullable(this.sourcePortRangeFrom);
    }

    @Import(name="sourcePortRangeTo")
    private @Nullable Output<String> sourcePortRangeTo;

    public Optional<Output<String>> sourcePortRangeTo() {
        return Optional.ofNullable(this.sourcePortRangeTo);
    }

    @Import(name="sourcePrefix")
    private @Nullable Output<String> sourcePrefix;

    public Optional<Output<String>> sourcePrefix() {
        return Optional.ofNullable(this.sourcePrefix);
    }

    @Import(name="sourcePrefixMask")
    private @Nullable Output<String> sourcePrefixMask;

    public Optional<Output<String>> sourcePrefixMask() {
        return Optional.ofNullable(this.sourcePrefixMask);
    }

    @Import(name="syn")
    private @Nullable Output<Boolean> syn;

    public Optional<Output<Boolean>> syn() {
        return Optional.ofNullable(this.syn);
    }

    @Import(name="tos")
    private @Nullable Output<String> tos;

    public Optional<Output<String>> tos() {
        return Optional.ofNullable(this.tos);
    }

    @Import(name="urg")
    private @Nullable Output<Boolean> urg;

    public Optional<Output<Boolean>> urg() {
        return Optional.ofNullable(this.urg);
    }

    private AccessListExtendedEntryArgs() {}

    private AccessListExtendedEntryArgs(AccessListExtendedEntryArgs $) {
        this.aceRuleAction = $.aceRuleAction;
        this.aceRuleProtocol = $.aceRuleProtocol;
        this.ack = $.ack;
        this.destinationAny = $.destinationAny;
        this.destinationHost = $.destinationHost;
        this.destinationObjectGroup = $.destinationObjectGroup;
        this.destinationPortEqual = $.destinationPortEqual;
        this.destinationPortGreaterThan = $.destinationPortGreaterThan;
        this.destinationPortLesserThan = $.destinationPortLesserThan;
        this.destinationPortRangeFrom = $.destinationPortRangeFrom;
        this.destinationPortRangeTo = $.destinationPortRangeTo;
        this.destinationPrefix = $.destinationPrefix;
        this.destinationPrefixMask = $.destinationPrefixMask;
        this.dscp = $.dscp;
        this.established = $.established;
        this.fin = $.fin;
        this.fragments = $.fragments;
        this.log = $.log;
        this.logInput = $.logInput;
        this.precedence = $.precedence;
        this.psh = $.psh;
        this.remark = $.remark;
        this.rst = $.rst;
        this.sequence = $.sequence;
        this.serviceObjectGroup = $.serviceObjectGroup;
        this.sourceAny = $.sourceAny;
        this.sourceHost = $.sourceHost;
        this.sourceObjectGroup = $.sourceObjectGroup;
        this.sourcePortEqual = $.sourcePortEqual;
        this.sourcePortGreaterThan = $.sourcePortGreaterThan;
        this.sourcePortLesserThan = $.sourcePortLesserThan;
        this.sourcePortRangeFrom = $.sourcePortRangeFrom;
        this.sourcePortRangeTo = $.sourcePortRangeTo;
        this.sourcePrefix = $.sourcePrefix;
        this.sourcePrefixMask = $.sourcePrefixMask;
        this.syn = $.syn;
        this.tos = $.tos;
        this.urg = $.urg;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessListExtendedEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessListExtendedEntryArgs $;

        public Builder() {
            $ = new AccessListExtendedEntryArgs();
        }

        public Builder(AccessListExtendedEntryArgs defaults) {
            $ = new AccessListExtendedEntryArgs(Objects.requireNonNull(defaults));
        }

        public Builder aceRuleAction(@Nullable Output<String> aceRuleAction) {
            $.aceRuleAction = aceRuleAction;
            return this;
        }

        public Builder aceRuleAction(String aceRuleAction) {
            return aceRuleAction(Output.of(aceRuleAction));
        }

        public Builder aceRuleProtocol(@Nullable Output<String> aceRuleProtocol) {
            $.aceRuleProtocol = aceRuleProtocol;
            return this;
        }

        public Builder aceRuleProtocol(String aceRuleProtocol) {
            return aceRuleProtocol(Output.of(aceRuleProtocol));
        }

        public Builder ack(@Nullable Output<Boolean> ack) {
            $.ack = ack;
            return this;
        }

        public Builder ack(Boolean ack) {
            return ack(Output.of(ack));
        }

        public Builder destinationAny(@Nullable Output<Boolean> destinationAny) {
            $.destinationAny = destinationAny;
            return this;
        }

        public Builder destinationAny(Boolean destinationAny) {
            return destinationAny(Output.of(destinationAny));
        }

        public Builder destinationHost(@Nullable Output<String> destinationHost) {
            $.destinationHost = destinationHost;
            return this;
        }

        public Builder destinationHost(String destinationHost) {
            return destinationHost(Output.of(destinationHost));
        }

        public Builder destinationObjectGroup(@Nullable Output<String> destinationObjectGroup) {
            $.destinationObjectGroup = destinationObjectGroup;
            return this;
        }

        public Builder destinationObjectGroup(String destinationObjectGroup) {
            return destinationObjectGroup(Output.of(destinationObjectGroup));
        }

        public Builder destinationPortEqual(@Nullable Output<String> destinationPortEqual) {
            $.destinationPortEqual = destinationPortEqual;
            return this;
        }

        public Builder destinationPortEqual(String destinationPortEqual) {
            return destinationPortEqual(Output.of(destinationPortEqual));
        }

        public Builder destinationPortGreaterThan(@Nullable Output<String> destinationPortGreaterThan) {
            $.destinationPortGreaterThan = destinationPortGreaterThan;
            return this;
        }

        public Builder destinationPortGreaterThan(String destinationPortGreaterThan) {
            return destinationPortGreaterThan(Output.of(destinationPortGreaterThan));
        }

        public Builder destinationPortLesserThan(@Nullable Output<String> destinationPortLesserThan) {
            $.destinationPortLesserThan = destinationPortLesserThan;
            return this;
        }

        public Builder destinationPortLesserThan(String destinationPortLesserThan) {
            return destinationPortLesserThan(Output.of(destinationPortLesserThan));
        }

        public Builder destinationPortRangeFrom(@Nullable Output<String> destinationPortRangeFrom) {
            $.destinationPortRangeFrom = destinationPortRangeFrom;
            return this;
        }

        public Builder destinationPortRangeFrom(String destinationPortRangeFrom) {
            return destinationPortRangeFrom(Output.of(destinationPortRangeFrom));
        }

        public Builder destinationPortRangeTo(@Nullable Output<String> destinationPortRangeTo) {
            $.destinationPortRangeTo = destinationPortRangeTo;
            return this;
        }

        public Builder destinationPortRangeTo(String destinationPortRangeTo) {
            return destinationPortRangeTo(Output.of(destinationPortRangeTo));
        }

        public Builder destinationPrefix(@Nullable Output<String> destinationPrefix) {
            $.destinationPrefix = destinationPrefix;
            return this;
        }

        public Builder destinationPrefix(String destinationPrefix) {
            return destinationPrefix(Output.of(destinationPrefix));
        }

        public Builder destinationPrefixMask(@Nullable Output<String> destinationPrefixMask) {
            $.destinationPrefixMask = destinationPrefixMask;
            return this;
        }

        public Builder destinationPrefixMask(String destinationPrefixMask) {
            return destinationPrefixMask(Output.of(destinationPrefixMask));
        }

        public Builder dscp(@Nullable Output<String> dscp) {
            $.dscp = dscp;
            return this;
        }

        public Builder dscp(String dscp) {
            return dscp(Output.of(dscp));
        }

        public Builder established(@Nullable Output<Boolean> established) {
            $.established = established;
            return this;
        }

        public Builder established(Boolean established) {
            return established(Output.of(established));
        }

        public Builder fin(@Nullable Output<Boolean> fin) {
            $.fin = fin;
            return this;
        }

        public Builder fin(Boolean fin) {
            return fin(Output.of(fin));
        }

        public Builder fragments(@Nullable Output<Boolean> fragments) {
            $.fragments = fragments;
            return this;
        }

        public Builder fragments(Boolean fragments) {
            return fragments(Output.of(fragments));
        }

        public Builder log(@Nullable Output<Boolean> log) {
            $.log = log;
            return this;
        }

        public Builder log(Boolean log) {
            return log(Output.of(log));
        }

        public Builder logInput(@Nullable Output<Boolean> logInput) {
            $.logInput = logInput;
            return this;
        }

        public Builder logInput(Boolean logInput) {
            return logInput(Output.of(logInput));
        }

        public Builder precedence(@Nullable Output<String> precedence) {
            $.precedence = precedence;
            return this;
        }

        public Builder precedence(String precedence) {
            return precedence(Output.of(precedence));
        }

        public Builder psh(@Nullable Output<Boolean> psh) {
            $.psh = psh;
            return this;
        }

        public Builder psh(Boolean psh) {
            return psh(Output.of(psh));
        }

        public Builder remark(@Nullable Output<String> remark) {
            $.remark = remark;
            return this;
        }

        public Builder remark(String remark) {
            return remark(Output.of(remark));
        }

        public Builder rst(@Nullable Output<Boolean> rst) {
            $.rst = rst;
            return this;
        }

        public Builder rst(Boolean rst) {
            return rst(Output.of(rst));
        }

        public Builder sequence(Output<Integer> sequence) {
            $.sequence = sequence;
            return this;
        }

        public Builder sequence(Integer sequence) {
            return sequence(Output.of(sequence));
        }

        public Builder serviceObjectGroup(@Nullable Output<String> serviceObjectGroup) {
            $.serviceObjectGroup = serviceObjectGroup;
            return this;
        }

        public Builder serviceObjectGroup(String serviceObjectGroup) {
            return serviceObjectGroup(Output.of(serviceObjectGroup));
        }

        public Builder sourceAny(@Nullable Output<Boolean> sourceAny) {
            $.sourceAny = sourceAny;
            return this;
        }

        public Builder sourceAny(Boolean sourceAny) {
            return sourceAny(Output.of(sourceAny));
        }

        public Builder sourceHost(@Nullable Output<String> sourceHost) {
            $.sourceHost = sourceHost;
            return this;
        }

        public Builder sourceHost(String sourceHost) {
            return sourceHost(Output.of(sourceHost));
        }

        public Builder sourceObjectGroup(@Nullable Output<String> sourceObjectGroup) {
            $.sourceObjectGroup = sourceObjectGroup;
            return this;
        }

        public Builder sourceObjectGroup(String sourceObjectGroup) {
            return sourceObjectGroup(Output.of(sourceObjectGroup));
        }

        public Builder sourcePortEqual(@Nullable Output<String> sourcePortEqual) {
            $.sourcePortEqual = sourcePortEqual;
            return this;
        }

        public Builder sourcePortEqual(String sourcePortEqual) {
            return sourcePortEqual(Output.of(sourcePortEqual));
        }

        public Builder sourcePortGreaterThan(@Nullable Output<String> sourcePortGreaterThan) {
            $.sourcePortGreaterThan = sourcePortGreaterThan;
            return this;
        }

        public Builder sourcePortGreaterThan(String sourcePortGreaterThan) {
            return sourcePortGreaterThan(Output.of(sourcePortGreaterThan));
        }

        public Builder sourcePortLesserThan(@Nullable Output<String> sourcePortLesserThan) {
            $.sourcePortLesserThan = sourcePortLesserThan;
            return this;
        }

        public Builder sourcePortLesserThan(String sourcePortLesserThan) {
            return sourcePortLesserThan(Output.of(sourcePortLesserThan));
        }

        public Builder sourcePortRangeFrom(@Nullable Output<String> sourcePortRangeFrom) {
            $.sourcePortRangeFrom = sourcePortRangeFrom;
            return this;
        }

        public Builder sourcePortRangeFrom(String sourcePortRangeFrom) {
            return sourcePortRangeFrom(Output.of(sourcePortRangeFrom));
        }

        public Builder sourcePortRangeTo(@Nullable Output<String> sourcePortRangeTo) {
            $.sourcePortRangeTo = sourcePortRangeTo;
            return this;
        }

        public Builder sourcePortRangeTo(String sourcePortRangeTo) {
            return sourcePortRangeTo(Output.of(sourcePortRangeTo));
        }

        public Builder sourcePrefix(@Nullable Output<String> sourcePrefix) {
            $.sourcePrefix = sourcePrefix;
            return this;
        }

        public Builder sourcePrefix(String sourcePrefix) {
            return sourcePrefix(Output.of(sourcePrefix));
        }

        public Builder sourcePrefixMask(@Nullable Output<String> sourcePrefixMask) {
            $.sourcePrefixMask = sourcePrefixMask;
            return this;
        }

        public Builder sourcePrefixMask(String sourcePrefixMask) {
            return sourcePrefixMask(Output.of(sourcePrefixMask));
        }

        public Builder syn(@Nullable Output<Boolean> syn) {
            $.syn = syn;
            return this;
        }

        public Builder syn(Boolean syn) {
            return syn(Output.of(syn));
        }

        public Builder tos(@Nullable Output<String> tos) {
            $.tos = tos;
            return this;
        }

        public Builder tos(String tos) {
            return tos(Output.of(tos));
        }

        public Builder urg(@Nullable Output<Boolean> urg) {
            $.urg = urg;
            return this;
        }

        public Builder urg(Boolean urg) {
            return urg(Output.of(urg));
        }

        public AccessListExtendedEntryArgs build() {
            $.sequence = Objects.requireNonNull($.sequence, "expected parameter 'sequence' to be non-null");
            return $;
        }
    }

}
