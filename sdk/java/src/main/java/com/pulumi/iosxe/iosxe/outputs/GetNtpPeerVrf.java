// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.GetNtpPeerVrfPeer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNtpPeerVrf {
    private String name;
    private List<GetNtpPeerVrfPeer> peers;

    private GetNtpPeerVrf() {}
    public String name() {
        return this.name;
    }
    public List<GetNtpPeerVrfPeer> peers() {
        return this.peers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNtpPeerVrf defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private List<GetNtpPeerVrfPeer> peers;
        public Builder() {}
        public Builder(GetNtpPeerVrf defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.peers = defaults.peers;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder peers(List<GetNtpPeerVrfPeer> peers) {
            this.peers = Objects.requireNonNull(peers);
            return this;
        }
        public Builder peers(GetNtpPeerVrfPeer... peers) {
            return peers(List.of(peers));
        }
        public GetNtpPeerVrf build() {
            final var o = new GetNtpPeerVrf();
            o.name = name;
            o.peers = peers;
            return o;
        }
    }
}
