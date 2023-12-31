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


public final class SnmpServerGroupV3SecurityArgs extends com.pulumi.resources.ResourceArgs {

    public static final SnmpServerGroupV3SecurityArgs Empty = new SnmpServerGroupV3SecurityArgs();

    @Import(name="accessAclName")
    private @Nullable Output<String> accessAclName;

    public Optional<Output<String>> accessAclName() {
        return Optional.ofNullable(this.accessAclName);
    }

    @Import(name="accessIpv6Acl")
    private @Nullable Output<String> accessIpv6Acl;

    public Optional<Output<String>> accessIpv6Acl() {
        return Optional.ofNullable(this.accessIpv6Acl);
    }

    @Import(name="accessStandardAcl")
    private @Nullable Output<Integer> accessStandardAcl;

    public Optional<Output<Integer>> accessStandardAcl() {
        return Optional.ofNullable(this.accessStandardAcl);
    }

    @Import(name="contextNode")
    private @Nullable Output<String> contextNode;

    public Optional<Output<String>> contextNode() {
        return Optional.ofNullable(this.contextNode);
    }

    @Import(name="matchNode")
    private @Nullable Output<String> matchNode;

    public Optional<Output<String>> matchNode() {
        return Optional.ofNullable(this.matchNode);
    }

    @Import(name="notifyNode")
    private @Nullable Output<String> notifyNode;

    public Optional<Output<String>> notifyNode() {
        return Optional.ofNullable(this.notifyNode);
    }

    @Import(name="readNode")
    private @Nullable Output<String> readNode;

    public Optional<Output<String>> readNode() {
        return Optional.ofNullable(this.readNode);
    }

    @Import(name="securityLevel", required=true)
    private Output<String> securityLevel;

    public Output<String> securityLevel() {
        return this.securityLevel;
    }

    @Import(name="writeNode")
    private @Nullable Output<String> writeNode;

    public Optional<Output<String>> writeNode() {
        return Optional.ofNullable(this.writeNode);
    }

    private SnmpServerGroupV3SecurityArgs() {}

    private SnmpServerGroupV3SecurityArgs(SnmpServerGroupV3SecurityArgs $) {
        this.accessAclName = $.accessAclName;
        this.accessIpv6Acl = $.accessIpv6Acl;
        this.accessStandardAcl = $.accessStandardAcl;
        this.contextNode = $.contextNode;
        this.matchNode = $.matchNode;
        this.notifyNode = $.notifyNode;
        this.readNode = $.readNode;
        this.securityLevel = $.securityLevel;
        this.writeNode = $.writeNode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnmpServerGroupV3SecurityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnmpServerGroupV3SecurityArgs $;

        public Builder() {
            $ = new SnmpServerGroupV3SecurityArgs();
        }

        public Builder(SnmpServerGroupV3SecurityArgs defaults) {
            $ = new SnmpServerGroupV3SecurityArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessAclName(@Nullable Output<String> accessAclName) {
            $.accessAclName = accessAclName;
            return this;
        }

        public Builder accessAclName(String accessAclName) {
            return accessAclName(Output.of(accessAclName));
        }

        public Builder accessIpv6Acl(@Nullable Output<String> accessIpv6Acl) {
            $.accessIpv6Acl = accessIpv6Acl;
            return this;
        }

        public Builder accessIpv6Acl(String accessIpv6Acl) {
            return accessIpv6Acl(Output.of(accessIpv6Acl));
        }

        public Builder accessStandardAcl(@Nullable Output<Integer> accessStandardAcl) {
            $.accessStandardAcl = accessStandardAcl;
            return this;
        }

        public Builder accessStandardAcl(Integer accessStandardAcl) {
            return accessStandardAcl(Output.of(accessStandardAcl));
        }

        public Builder contextNode(@Nullable Output<String> contextNode) {
            $.contextNode = contextNode;
            return this;
        }

        public Builder contextNode(String contextNode) {
            return contextNode(Output.of(contextNode));
        }

        public Builder matchNode(@Nullable Output<String> matchNode) {
            $.matchNode = matchNode;
            return this;
        }

        public Builder matchNode(String matchNode) {
            return matchNode(Output.of(matchNode));
        }

        public Builder notifyNode(@Nullable Output<String> notifyNode) {
            $.notifyNode = notifyNode;
            return this;
        }

        public Builder notifyNode(String notifyNode) {
            return notifyNode(Output.of(notifyNode));
        }

        public Builder readNode(@Nullable Output<String> readNode) {
            $.readNode = readNode;
            return this;
        }

        public Builder readNode(String readNode) {
            return readNode(Output.of(readNode));
        }

        public Builder securityLevel(Output<String> securityLevel) {
            $.securityLevel = securityLevel;
            return this;
        }

        public Builder securityLevel(String securityLevel) {
            return securityLevel(Output.of(securityLevel));
        }

        public Builder writeNode(@Nullable Output<String> writeNode) {
            $.writeNode = writeNode;
            return this;
        }

        public Builder writeNode(String writeNode) {
            return writeNode(Output.of(writeNode));
        }

        public SnmpServerGroupV3SecurityArgs build() {
            $.securityLevel = Objects.requireNonNull($.securityLevel, "expected parameter 'securityLevel' to be non-null");
            return $;
        }
    }

}
