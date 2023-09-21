// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.GetMsdpPassword;
import com.pulumi.iosxe.iosxe.outputs.GetMsdpPeer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMsdpResult {
    private @Nullable String device;
    private String id;
    private String originatorId;
    private List<GetMsdpPassword> passwords;
    private List<GetMsdpPeer> peers;

    private GetMsdpResult() {}
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }
    public String id() {
        return this.id;
    }
    public String originatorId() {
        return this.originatorId;
    }
    public List<GetMsdpPassword> passwords() {
        return this.passwords;
    }
    public List<GetMsdpPeer> peers() {
        return this.peers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMsdpResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String device;
        private String id;
        private String originatorId;
        private List<GetMsdpPassword> passwords;
        private List<GetMsdpPeer> peers;
        public Builder() {}
        public Builder(GetMsdpResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.device = defaults.device;
    	      this.id = defaults.id;
    	      this.originatorId = defaults.originatorId;
    	      this.passwords = defaults.passwords;
    	      this.peers = defaults.peers;
        }

        @CustomType.Setter
        public Builder device(@Nullable String device) {
            this.device = device;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder originatorId(String originatorId) {
            this.originatorId = Objects.requireNonNull(originatorId);
            return this;
        }
        @CustomType.Setter
        public Builder passwords(List<GetMsdpPassword> passwords) {
            this.passwords = Objects.requireNonNull(passwords);
            return this;
        }
        public Builder passwords(GetMsdpPassword... passwords) {
            return passwords(List.of(passwords));
        }
        @CustomType.Setter
        public Builder peers(List<GetMsdpPeer> peers) {
            this.peers = Objects.requireNonNull(peers);
            return this;
        }
        public Builder peers(GetMsdpPeer... peers) {
            return peers(List.of(peers));
        }
        public GetMsdpResult build() {
            final var o = new GetMsdpResult();
            o.device = device;
            o.id = id;
            o.originatorId = originatorId;
            o.passwords = passwords;
            o.peers = peers;
            return o;
        }
    }
}